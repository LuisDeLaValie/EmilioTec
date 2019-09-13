/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringretrocexo;

import java.util.Scanner;

/**
 *
 * @author PROGRAMAR
 */
public class Stringretrocexo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la palabra");
        String a= leer.nextLine();
        //System.out.println(retro(a, a.length()-1));
        char[] nuevapalabra= new char[a.length()];
        for (int i = a.length()-1; 0<=i; i--) {
            nuevapalabra[i]=a.charAt(i);
        }
        
        for (char c : nuevapalabra) {
            System.out.print(c);
        }
    }
    
    public static String retro(String palabra, int key){
        if(key>=0){
            return palabra.charAt(key)+retro(palabra,key-1);
        }else
            return "";
    }
}
