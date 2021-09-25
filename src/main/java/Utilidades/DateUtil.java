/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author alanm
 */
public class DateUtil {
    public static String dateToString(Long date) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String strDate = dateFormat.format(date);
        return strDate;
    }
    
    public static String dateTimeToString(long date) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strDate = dateFormat.format(date);
        return strDate;
    }
    
    public static String dateToNaturalDate(Long date) {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String strDate = dateFormat.format(date);
        return strDate;
    }

    public static String stringLegibleDate(String fecha) {
        String anio = "";
        String mes = "";
        String dia = "";
        for(int i=0; i<4; i++){
            anio += fecha.charAt(i);
        }
        for(int i=5; i<7; i++){
            mes += fecha.charAt(i);
        }
        for(int i=8; i<10; i++){
            dia += fecha.charAt(i);
        }
        return dia + "/" + mes + "/" + anio;
    }
}
