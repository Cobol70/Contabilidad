/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import DAO.AreasDao;
import DAO.AreasDaoImpl;
import DAO.ConceptosDao;
import DAO.ConceptosDaoImp;
import DAO.ConceptosInstitucionDao;
import DAO.ConceptosInstitucionDaoImpl;
import DAO.InstitucionDao;
import DAO.InstitucionDaoImp;
import DAO.PaqueteDao;
import DAO.PaqueteDaoImpl;
import Tables.TableConceptos;
import Tables.TableConceptosInstitucion;
import Tables.TablePaquetes;
import Utilidades.BarUtil;
import Utilidades.DateUtil;
import Vistas.Menu;
import Vistas.Paquetes;
import clientews.servicio.Areas;
import clientews.servicio.ConceptoPaquete;
import clientews.servicio.Conceptos;
import clientews.servicio.ConceptosInstitucion;
import clientews.servicio.Institucion;
import clientews.servicio.Instrucciones;
import clientews.servicio.Paquete;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author alanm
 */
public class PaquetesController implements ActionListener, MouseListener, KeyListener {

    private Paquetes vista;
    private Areas areaBusqueda;
    private AreasDao modeloAreas;
    private ConceptosDao modeloConceptos;
    private PaqueteDao modeloPaquetes;
    private Conceptos conceptoSeleccionado;
    private Paquete paqueteSeleccionado;
    private InstitucionDao modeloInstituciones;
    private ConceptosInstitucionDao modeloConceptosInstituciones;
    private Institucion particular = new Institucion();

    public PaquetesController(Paquetes vista) {
        this.vista = vista;

        this.vista.btnAgregar.addActionListener(this);
        this.vista.btnQuitar.addActionListener(this);
        this.vista.btnCerrar.addActionListener(this);
        this.vista.btnGuardar.addActionListener(this);
        this.vista.btnMinimizar.addActionListener(this);
        this.vista.btnCerrar.addActionListener(this);
        this.vista.comboAreaBusqueda.addActionListener(this);
        this.vista.btnRegresar.addActionListener(this);

        this.vista.txtBuscarPaquete.addKeyListener(this);
        this.vista.txtBuscarEstudio.addKeyListener(this);
        this.vista.txtNombre.addKeyListener(this);
        this.vista.txtPorcentajeDescuento.addKeyListener(this);
        this.vista.txtPrecioVenta.addKeyListener(this);

        this.vista.tablePaquetes.addMouseListener(this);
        this.vista.tableEstudios.addMouseListener(this);
        this.vista.tableConceptosPaquetes.addMouseListener(this);
    }

    public void iniciar() {
        vista.setTitle("Paquetes");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);

        modeloAreas = new AreasDaoImpl();
        modeloConceptos = new ConceptosDaoImp();
        modeloPaquetes = new PaqueteDaoImpl();
        modeloInstituciones = new InstitucionDaoImp();
        modeloConceptosInstituciones = new ConceptosInstitucionDaoImpl();

        particular.setNombreInstitucion("PARTICULAR");
        particular = modeloInstituciones.encontrarPorNombre(particular);

        vista.txtPrecioReal.setEditable(false);

        cargarPaquetes();
        cargarAreas();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnMinimizar) {
            BarUtil.minimizar(vista);
        } else if (e.getSource() == vista.btnCerrar) {
            BarUtil.cerrar(vista);
        } else if (e.getSource() == vista.btnRegresar) {
            abrirMenu();
        } else if (e.getSource() == vista.comboAreaBusqueda) {
            if (vista.comboAreaBusqueda.getSelectedIndex() != 0) {
                encontrarAreaBusqueda();
            }
            realizarBusqueda();
        } else if (e.getSource() == vista.btnAgregar) {
            if (vista.tableEstudios.getSelectedRow() != -1) { //Se seleccionó un estudio
                //Si se seleccionó un paquete solamente hay que agregar el registro a la db
                try {
                    if (vista.tablePaquetes.getSelectedRow() != -1) {
                        //Ok, hay seleccionado un paquete, pero, cómo sé que no quiere crear uno nuevo
                        //Comparo el nombre del seleccionado con el actual de la bd
                        if (!paqueteSeleccionado.getIdConcepto().getConceptoTo().equals(vista.txtNombre.getText())) {
                            System.out.println("creo nuevo pauqete a pesar de que se seleccionó uno");
                            //Sé que quiere crear uno nuevo
                            //Esto es para crear un paquete
                            if (nuevoPaquete()) {
                                cargarTablaRelaciones();
                                vista.txtPrecioReal.setText(calcularTotal() + "");

                                descuento(true);

                            }
                        } else {
                            agregarAPaquete(paqueteSeleccionado);
                            cargarTablaRelaciones();
                            vista.txtPrecioReal.setText(calcularTotal() + "");
                            System.out.println("agrego concepto a paquete creado");

                            descuento(true);
                        }

                    } else { //No se ha creado paquete, por lo tanto, hay que crearlo y luego agregarlo
                        //Esto es para crear un paquete
                        if (nuevoPaquete()) {
                            cargarTablaRelaciones();
                            vista.txtPrecioReal.setText(calcularTotal() + "");

                            descuento(true);
                        }
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Ocurrio un error al crear paquete");
                    ex.printStackTrace(System.out);
                }
            }
        } else if (e.getSource() == vista.btnGuardar) {
            if (datosValidos() && paqueteSeleccionado != null && datosMonetariosValidos() && deseaGuardar()) {
                actualizarPaquete();
                limpiar();
            }
        } else if (e.getSource() == vista.btnQuitar) {
            quitar();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == vista.tablePaquetes) { //El id es el 4
            if (vista.tablePaquetes.getSelectedRow() != -1) {
                int fila = vista.tablePaquetes.getSelectedRow();
                Long id = Long.parseLong(vista.tablePaquetes.getValueAt(fila, 1).toString());
                paqueteSeleccionado = modeloPaquetes.encontrarPaquetePorId(id);
                System.out.println(paqueteSeleccionado.getId() + " " + paqueteSeleccionado.getIdConcepto().getConceptoTo());

                cargarCamposObtenidosPaquete();
                cargarTablaRelaciones();
            }
        } else if (e.getSource() == vista.tableEstudios) {
            if (vista.tableEstudios.getSelectedRow() != -1) {
                int fila = vista.tableEstudios.getSelectedRow();
                Long id = Long.parseLong(vista.tableEstudios.getValueAt(fila, 3).toString());
                conceptoSeleccionado = new Conceptos();
                conceptoSeleccionado.setIdTo(id);
                conceptoSeleccionado = modeloConceptos.encontrarConceptoPorId(conceptoSeleccionado);
            }
        } else if (e.getSource() == vista.tableConceptosPaquetes) {
            if (vista.tableConceptosPaquetes.getSelectedRow() != -1) {
                int fila = vista.tableConceptosPaquetes.getSelectedRow();
                Long id = Long.parseLong(vista.tableConceptosPaquetes.getValueAt(fila, 3).toString());
                conceptoSeleccionado = new Conceptos();
                conceptoSeleccionado.setIdTo(id);
                conceptoSeleccionado = modeloConceptos.encontrarConceptoPorId(conceptoSeleccionado);
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == vista.txtBuscarPaquete) {
            cargarTablaPaquetes(vista.txtBuscarPaquete.getText());
        } else if (e.getSource() == vista.txtNombre) {
            vista.txtNombre.setText(vista.txtNombre.getText().toUpperCase());

            //Hay que quitar la selección de la tabla
            vista.tablePaquetes.getSelectionModel().clearSelection();

            //Hay que quitar el contenido de la tabla relación
            cargarTablaRelacionesVacia();

            //Hay que limpiar todo menos el nombre
            limpiarMenosNombre();
        } else if (e.getSource() == vista.txtBuscarEstudio) {
            realizarBusqueda();
        } else if (e.getSource() == vista.txtPorcentajeDescuento) {
            descuento(true);
        } else if (e.getSource() == vista.txtPrecioVenta) {
            descuento(false);
        }
    }

    private void abrirMenu() {
        vista.dispose();
        MenuController menu = new MenuController(new Menu());
        menu.iniciar();
    }

    private void cargarPaquetes() {
        TablePaquetes generador = new TablePaquetes();
        generador.cargarTabla(vista.tablePaquetes, modeloPaquetes.listarPaquetes());
    }

    private void encontrarAreaBusqueda() {
        try {
            areaBusqueda = modeloAreas.encontrarPorNombre(vista.comboAreaBusqueda.getSelectedItem().toString());
            System.out.println(areaBusqueda.getIdA() + " " + areaBusqueda.getNombreA());
        } catch (Exception e) {
            System.out.println("No pude encontrar el área para búsqueda");
        }
    }

    private void cargarAreas() {
        try {
            JComboBox combo = new JComboBox();
            combo.removeAllItems();
            combo.addItem("SELECCIONE UNA OPCIÓN");
            for (Areas areasFor : modeloAreas.listar()) {
                combo.addItem(areasFor.getNombreA());
            }
            vista.comboAreaBusqueda.setModel(combo.getModel());
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    private void realizarBusqueda() {
        if (!vista.txtBuscarEstudio.getText().equals("") && vista.comboAreaBusqueda.getSelectedIndex() != 0) { //Buscar por los dos parámetros
            cargarEstudios(vista.txtBuscarEstudio.getText(), areaBusqueda);
            System.out.println("Buscando por dos parámetros");
        } else if (!vista.txtBuscarEstudio.getText().equals("")) { //Buscar solo por nombre
            cargarEstudios(vista.txtBuscarEstudio.getText());
            System.out.println("Buscando por nombre");
        } else if (vista.comboAreaBusqueda.getSelectedIndex() != 0) { //Buscar por area
            cargarEstudios(areaBusqueda);
            System.out.println("Buscando por área");
        } else {
            cargarEstudios(); //cargar todo
            System.out.println("Cargando todo");
        }
    }

    private void cargarEstudios() {
        TableConceptos generadorTabla = new TableConceptos();
        List<ConceptosInstitucion> query = modeloConceptosInstituciones.obtenerConceptosInstitucionPorIdInstitucion(particular.getIdInstitucion());
        List<Conceptos> conceptos = new ArrayList<>();
        query.forEach(o -> {
            conceptos.add(o.getIdConcepto());
        });
        generadorTabla.cargarTabla(vista.tableEstudios, conceptos);
    }

    private void cargarEstudios(String text) {
        TableConceptosInstitucion generadorTabla = new TableConceptosInstitucion();
        generadorTabla.cargarTabla(vista.tableEstudios, modeloConceptosInstituciones.obtenerConceptosLikeNombrePorPorIdInstitucion(text, particular.getIdInstitucion()));
    }

    private void cargarEstudios(String text, Areas paraBuscar) {
        TableConceptosInstitucion generadorTabla = new TableConceptosInstitucion();
        generadorTabla.cargarTabla(vista.tableEstudios, modeloConceptosInstituciones.obtenerConceptosLikeNombrePorPorIdInstitucionPorArea(text, particular.getIdInstitucion(), paraBuscar.getIdA()));
    }

    private void cargarEstudios(Areas paraBuscar) {
        TableConceptosInstitucion generadorTabla = new TableConceptosInstitucion();
        generadorTabla.cargarTabla(vista.tableEstudios, modeloConceptosInstituciones.obtenerConceptosPorPorIdInstitucionPorArea(particular.getIdInstitucion(), paraBuscar.getIdA()));
    }

    private boolean datosValidos() {
        if (vista.txtNombre.getText().equals("")) {
            return false;
        }
        if (vista.dateInicio.getDate() == null) {
            return false;
        }
        if (vista.dateFin.getDate() == null) {
            return false;
        }
        return true;
    }

    private void cargarTablaPaquetes(String text) {
        TablePaquetes generador = new TablePaquetes();
        generador.cargarTabla(vista.tablePaquetes, modeloPaquetes.obtenerPaquetesLikeNombre(text));
    }

    private Paquete crearPaquete() {

        Conceptos concepto = generarEstudio();
        modeloConceptos.registrarConcepto(concepto);
        concepto = encontrarConceptoEnDb(concepto);

        Paquete paquete = new Paquete();
        paquete.setIdConcepto(concepto);
        paquete.setFechaInicio(DateUtil.dateToString(vista.dateInicio.getDate().getTime()));
        paquete.setFechaFin(DateUtil.dateToString(vista.dateFin.getDate().getTime()));
        paquete.setPorcentajeDescuento(Short.parseShort("0"));
        paquete.setPrecio(0);
        paquete.setPrecioSinDescuento(0);

        System.out.println(paquete.getFechaInicio() + " " + paquete.getFechaFin());

        modeloPaquetes.registrarPaquete(paquete);

        return encontrarPaqueteEnBd(paquete.getIdConcepto().getConceptoTo());
    }

    private Conceptos generarEstudio() {
        Instrucciones instrucciones = new Instrucciones();
        instrucciones.setId(1l);

        Areas paquetes = modeloAreas.encontrarPorNombre("PAQUETES");

        Conceptos estudio = new Conceptos();

        estudio.setAleatorioC("");
        estudio.setCategoriaTo(null); //En rispacs está en null
        estudio.setCodigoBarrasTo(null); //En rispacs está en null
        estudio.setConceptoTo(vista.txtNombre.getText());
        estudio.setCostoTo(0f); //Los costos los voy a manejar en concepto_institucion
        estudio.setDescripcionTo("1"); //Así está en rispacs
        estudio.setDiasEntregaTo(null); //En el rispacs está ene null
        estudio.setDicom(Short.parseShort("0"));

        estudio.setFechaTo(null);//Para qué la quiero 
        estudio.setFormato(null); //Si puedo lo pongo en null, es html

        System.out.println(paquetes.getIdA());
        estudio.setIdAreaTo(paquetes); //El área que se seleccionó

        estudio.setIdBeneficioTo(null);

        estudio.setIdCategoriaTo(null);
        estudio.setIdConvenioTo(1);

        estudio.setIdDepartamentoTo(Short.parseShort("2")); //Así está en el rispacs

        estudio.setIdGrupoTo(null);

        estudio.setIdInstrucciones(instrucciones);

        estudio.setIdMarcaTo(null);
        estudio.setIdMedicamentoG(null);
        estudio.setIdModeloTo(null);
        estudio.setIdPresentacionTo(null);
        estudio.setIdTipoConceptoTo(Short.parseShort("4")); //Así está en el rispacs

        estudio.setIdTo(0l);

        estudio.setIdUmedidaTo(null);
        estudio.setLinkPlmTo(null);
        estudio.setNivelMedTo(null);

        //Dije que los precios los voy a controlar en otra tabla
        estudio.setPrecioM(0);
        estudio.setPrecioMu(0);
        estudio.setPrecioTo(0);
        estudio.setPrecioUrgenciaTo(0);

        estudio.setUsuarioTo(3); //Porque sí

        return estudio;

    }

    private void agregarAPaquete(Paquete paquete) {
        ConceptoPaquete relacion = new ConceptoPaquete();
        relacion.setIdConcepto(conceptoSeleccionado);
        relacion.setIdPaquete(paquete);
        modeloPaquetes.registrarConceptoPaquete(relacion);
    }

    private Paquete encontrarPaqueteEnBd(String nombre) {
        return modeloPaquetes.obtenerPaquetePorNombre(nombre);
    }

    private Conceptos encontrarConceptoEnDb(Conceptos concepto) {
        return modeloConceptos.encontrarConceptoPorNombre(concepto.getConceptoTo());
    }

    private void cargarTablaRelaciones() {
        TableConceptosInstitucion conector = new TableConceptosInstitucion();
        conector.cargarTabla(vista.tableConceptosPaquetes, modeloPaquetes.obtenerConceptosDePaquete(paqueteSeleccionado.getId()));
    }

    private void cargarTablaRelacionesVacia() {
        TableConceptosInstitucion conector = new TableConceptosInstitucion();
        conector.cargarTablaVacia(vista.tableConceptosPaquetes);
    }

    private void cargarCamposObtenidosPaquete() {
        vista.txtNombre.setText(paqueteSeleccionado.getIdConcepto().getConceptoTo());
        vista.dateFin.setDate(DateUtil.dateFromSqlString(paqueteSeleccionado.getFechaFin()));
        vista.dateInicio.setDate(DateUtil.dateFromSqlString(paqueteSeleccionado.getFechaInicio()));
        vista.txtPrecioReal.setText(paqueteSeleccionado.getPrecioSinDescuento()+ "");
        vista.txtPorcentajeDescuento.setText(paqueteSeleccionado.getPorcentajeDescuento() + "");
        vista.txtPrecioVenta.setText(paqueteSeleccionado.getPrecio() + "");
    }

    private void limpiarMenosNombre() {
        vista.txtBuscarEstudio.setText("");
        vista.txtBuscarPaquete.setText("");
        vista.txtPorcentajeDescuento.setText("");
        vista.txtPrecioReal.setText("");
        vista.txtPrecioVenta.setText("");
        vista.dateFin.setDate(null);
        vista.dateInicio.setDate(null);
    }

    private boolean nuevoPaquete() {
        if (datosValidos()) {
            System.out.println("Creando paquete nuevo");
            paqueteSeleccionado = crearPaquete();
            paqueteSeleccionado = encontrarPaqueteEnBd(vista.txtNombre.getText());
            agregarAPaquete(paqueteSeleccionado);
            cargarPaquetes();
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Verifique los datos antes de crear paquete");
        }
        return false;
    }

    private double calcularTotal() {
        double total = 0;
        for (int i = 0; i < vista.tableConceptosPaquetes.getRowCount(); i++) {
            total += Double.parseDouble(vista.tableConceptosPaquetes.getValueAt(i, 2).toString());
        }
        return total;
    }

    private boolean porcentajeDescuentoValido(String porcentaje) {
        int porcentajeInt = 0;

        if (porcentaje.equals("")) {
            vista.txtPrecioVenta.setText("");
            return false;
        }

        if (vista.txtPrecioReal.getText().equals("")) {
            return false;
        }

        try {
            porcentajeInt = Integer.parseInt(porcentaje);
        } catch (Exception e) {
            return false;
        }

        if (porcentajeInt > 100 || porcentajeInt < 0) {
            vista.txtPrecioVenta.setText("");
            return false;
        }

        return true;

    }

    private boolean precioVentaValido(String precio) {
        Double precioVenta = 0d;
        Double precioReal = 0d;

        if (precio.equals("")) {
            vista.txtPorcentajeDescuento.setText("");
            return false;
        }

        if (vista.txtPrecioReal.getText().equals("")) {
            return false;
        }

        try {
            precioVenta = Double.parseDouble(precio);
            precioReal = Double.parseDouble(vista.txtPrecioReal.getText());
        } catch (Exception e) {
            return false;
        }

        if (precioVenta > precioReal) {
            vista.txtPorcentajeDescuento.setText("");
            return false;
        }

        if (precioVenta < 0) {
            vista.txtPorcentajeDescuento.setText("");
            return false;
        }

        return true;

    }

    private void calcularDescuento(String fuente) {
        if (fuente.equals("PORCENTAJE")) { //Hay porcentaje de descuento y no hay precio de venta
            //Aplicar descuento por porcentaje
            int porcentaje = Integer.parseInt(vista.txtPorcentajeDescuento.getText());
            Double precioFinal = Double.parseDouble(vista.txtPrecioReal.getText()) * (100 - porcentaje) / 100;
            vista.txtPrecioVenta.setText(precioFinal + "");
        } else { //Hay puro precio de venta
            //Encontrar qué porcentaje de descuento se está haciendo
            double precioVenta = Double.parseDouble(vista.txtPrecioVenta.getText());
            int porcentaje = 100;

            if (precioVenta != 0) {
                porcentaje = 100 - (int) (100 * precioVenta / Double.parseDouble(vista.txtPrecioReal.getText()));
                if (porcentaje == 100) {
                    --porcentaje;
                }
            }

            vista.txtPorcentajeDescuento.setText(porcentaje + "");
        }

    }

    private void descuento(boolean porPorcentaje) {
        if (porPorcentaje && porcentajeDescuentoValido(vista.txtPorcentajeDescuento.getText())) {
            calcularDescuento("PORCENTAJE");
        } else if (precioVentaValido(vista.txtPrecioVenta.getText())) {
            calcularDescuento("PRECIO");
        }
    }

    private boolean datosMonetariosValidos() {
        if (vista.txtPrecioReal.getText().equals("")) {
            return false;
        }
        if (vista.txtPrecioVenta.getText().equals("")) {
            return false;
        }
        if (vista.txtPorcentajeDescuento.getText().equals("")) {
            return false;
        }
        return true;
    }

    private boolean deseaGuardar() {
        int dialog = JOptionPane.YES_NO_OPTION;
        return (JOptionPane.showConfirmDialog(null, "¿Seguro que desea registrar los cambios? ", "Confirmar", dialog)) == 0;
    }

    private void limpiar() {
        limpiarMenosNombre();
        vista.txtNombre.setText("");
        vista.comboAreaBusqueda.setSelectedIndex(0);
        cargarPaquetes();
        cargarTablaEstudiosVacia();
        cargarTablaRelacionesVacia();
    }

    private void actualizarPaquete() {
        paqueteSeleccionado.setPrecio(Double.parseDouble(vista.txtPrecioVenta.getText()));
        paqueteSeleccionado.setPrecioSinDescuento(Double.parseDouble(vista.txtPrecioReal.getText()));
        paqueteSeleccionado.setPorcentajeDescuento(Short.parseShort(vista.txtPorcentajeDescuento.getText()));

        try {
            System.out.println("real:" +paqueteSeleccionado.getPrecioSinDescuento() +  " porecentaje:" + paqueteSeleccionado.getPorcentajeDescuento() + " venta:" + paqueteSeleccionado.getPrecio());
            modeloPaquetes.modificarPaquete(paqueteSeleccionado);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error");
            e.printStackTrace(System.out);
        }
    }

    private void cargarTablaEstudiosVacia() {
        TableConceptos temp = new TableConceptos();
        temp.cargarTablaVacia(vista.tableEstudios);
    }

    private void quitar() {
        if (vista.tableConceptosPaquetes.getSelectedRow() != -1) {
            if (paqueteSeleccionado != null && conceptoSeleccionado != null) {
                ConceptoPaquete conceptoPaquete = new ConceptoPaquete();
                conceptoPaquete.setIdConcepto(conceptoSeleccionado);
                conceptoPaquete.setIdPaquete(paqueteSeleccionado);

                try {
                    modeloPaquetes.eliminarConceptoPaquete(conceptoPaquete);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "No se pudo quitar el estudio");
                }

                cargarTablaRelaciones();
                calcularTotal();
                descuento(true);
                
                if(vista.tableConceptosPaquetes.getRowCount() == 0){
                    JOptionPane.showMessageDialog(null, "No hay estudios, asegúrese de completar el paquete como corresponde y guardar los cambios");
                    vista.txtPrecioReal.setText("");
                    vista.txtPrecioVenta.setText("");
                    vista.txtPorcentajeDescuento.setText("");
                }
            }
        }
    }

}
