/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colascirculares;

import java.util.Scanner;

/**
 *
 * @author PROGRAMAR
 */
public class ColasCirculares {
    Scanner leer = new Scanner(System.in);
    char[] cola= new char[10];
    public static void main(String[] args) {
    }

    public char[] deleteCola() {
        return cola;
    }

    public void addCola(char[] cola) {
        for (int i = 0; i < cola.length; i++) {
            int pi, pf;
            if(i>=0){
                if(cola[i-1]!= ' ' && cola[i+1]==' '){
                    
                }
            }
            cola[i]=' ';
                    //leer.nextLine().charAt(0);            
        }
    }
    
}
