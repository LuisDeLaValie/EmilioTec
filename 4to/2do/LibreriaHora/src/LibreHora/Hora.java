package LibreHora;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hora {
    
    private Date date2;
    private DateFormat hourFormat;
    private DateFormat dateFormat;
    private DateFormat hourdateFormat;
    //  //  //  //  //  //  //  //  //  //  //  //
    //Profe Forma
    public void Hora2(){
        date2 = new Date();
        hourFormat = new SimpleDateFormat("HH:mm:ss");
         System.out.println("Hora: "+hourFormat.format(date2));
    }
    
    public void Dia2(){
        date2 = new Date();
        dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Fecha: "+dateFormat.format(date2));
    }
    
    public void DiaHora2(){
        date2 = new Date();
        hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        System.out.println("Hora y fecha: "+hourdateFormat.format(date2));
    }
    //  //  //  //  //  //  //  //  //  //  //  //
    //Mi Forma
    
    static Date date = new Date();
    
    public static void Hora(){
        DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Hora: "+hourFormat.format(date));
    }
   
    public static void Dia(){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Fecha: "+dateFormat.format(date));
    }
    
    public static void HoraDia(){
        DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        System.out.println("Hora y fecha: "+hourdateFormat.format(date));
    }
    
}
