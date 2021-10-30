/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author alanm
 */
public class BarUtil {
    
    public static void minimizar(JFrame ventana) {
        ventana.setExtendedState(Frame.ICONIFIED);
    }
    
    public static void cerrar(JFrame ventana){
        int dialog = JOptionPane.YES_NO_OPTION;
        int valor = (JOptionPane.showConfirmDialog(null, "¿Seguro que desea salir? ", "Salir", dialog));
        if(valor == 0){
            System.exit(0);
        }
    }
    
}
