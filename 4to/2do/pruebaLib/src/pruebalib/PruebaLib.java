/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebalib;

import burbujas.Burbujas;
import libmensajes.libmensaje;
/**
 *
 * @author tdtx
 */
public class PruebaLib {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//      libmensaje.SaludoPersonalizado("jaldkhadka");
      int[] miareglo={
          1,5,3,7,8,2,
      };
      
      miareglo=Burbujas.burbuja(miareglo);
      
        for (int i : miareglo) {
            System.out.println(""+i);
        }
        
    }
    
}
