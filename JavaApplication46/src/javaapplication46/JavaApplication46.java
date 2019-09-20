/*
Un pequeño super mercado dispone en la salida de 3 cajas de pago. En el local hay 25
carritos de compra. Escribir un programa que simule el fucionamiento, siguiendo las
siguientes reglas:
1. Si cuando llega un cliente, no hay ningún carrito dispoible, espera a que lo haya.
2. Ningún cliente se impacienta y abandona el super mercado sin pasar por alguna de
las colas de las cajas.
3. Cuando un cliente finaliza su compra, se coloca en la cola de la caja que hay
menos gente y no se cambia de cola.
4. En el momento en el que un cliente paga en la caja, su carrito de la compra queda
disponible.
 */
package javaapplication46;

import java.util.Scanner;

public class JavaApplication46 {
static int carritos=25,personas=0;
    static int[] caja1=new int[10];
    static int[] caja2=new int[10];
    static int[] caja3=new int[10];
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        boolean continuar=true;
        do {            
            System.out.println("MERCADOS FELIZES !!!!!!!!!!!!!!!!!!!!!!!!\n");
            System.out.println("Actual mente quedan "+carritos+" disponimbre\n"+personas+" personas esperanodo carrito");
            System.out.print("¿Que Paso?:\n Llego nuevo clinete -N    Pagara un clinete -P    Salio un cliente -S     mostar info -F\n>>>");
            String accion= leer.nextLine();
            switch(accion.charAt(0)){
                case 'n': llegoPersona(); break;
                case 'p': pagara();break;
                case 's': salir();break;
                case 'f': info(); break;
            }
        } while (continuar);
    }
    
    public static void llegoPersona(){
        if(carritos==0){
            personas+=1;
        }else{
            if(personas!=0){
                if(personas<carritos){
                    carritos-=personas;
                    personas=0;
                }else{
                    personas-=carritos;
                    carritos=1;
                }
            }
            carritos-=1;
        }
    }
    
    public static void pagara(){
        int dis1=0,dis2=0,dis3=0;
        if(carritos<25){
          for (int i = 0; i < 10; i++) {
            if(caja1[i]==0){
                dis1=i;
                break;
            } 
        }
        for (int i = 0; i < 10; i++) {
            if(caja2[i]==0){
                dis2=i;
                break;
            } 
        }
        for (int i = 0; i < 10; i++) {
            if(caja3[i]==0){
                dis3=i;
                break;
            } 
        }
        
        if(dis1<dis2){
            if(dis1<dis3){
                for (int i = 0; i < 10; i++) {
                     if(caja1[i]==0){
                        caja1[i]=1;
                        break;
                    }
                }
            }else{
                for (int i = 0; i < 10; i++) {
                     if(caja3[i]==0){
                        caja3[i]=1;
                        break;
                    }
                }
            }
        }else{
            if(dis2<dis3){
                for (int i = 0; i < 10; i++) {
                     if(caja2[i]==0){
                        caja2[i]=1;
                        break;
                    }
                }
            }else{
                for (int i = 0; i < 10; i++) {
                     if(caja3[i]==0){
                        caja3[i]=1;
                        break;
                    }
                }
            }
        }   
        }
    }
    
    public static void salir(){
        
        int numero = (int) (Math.random() * 3);
        int[] auxilir;
        
        if(numero==0){
            auxilir= caja1;
            for (int i = 1; i < auxilir.length; i++) {
                auxilir[i-1]=caja1[i];                
            }
            caja1= new int[10];
            caja1=auxilir;
        }else if(numero==1){
            auxilir= caja2;
            for (int i = 1; i < auxilir.length; i++) {
                auxilir[i-1]=caja2[i];                
            }
            caja2= new int[10];
            caja2=auxilir;
        }else if(numero==2){
            auxilir= caja3;
            for (int i = 1; i < auxilir.length; i++) {
                auxilir[i-1]=caja3[i];
            }
            caja3= new int[10];
            caja3=auxilir;
        }
        carritos+=1;
    }

    public static void info(){
        System.out.println("INFO !!!!!!!!!!!!!!!!!!!");
        System.out.println("carritos disponibles: "+carritos+" personas en espera: "+personas);
        System.out.println("Caja1 ::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        for (int i = 0; i < caja1.length; i++) {
            System.out.print("posicion "+i+" :: "+caja1[i]+" ");
        }
        System.out.println("Caja2 ::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        for (int i = 0; i < caja2.length; i++) {
            System.out.print("posicion "+i+" :: "+caja2[i]+" ");
        }
        System.out.println("Caja3 ::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        for (int i = 0; i < caja3.length; i++) {
            System.out.print("posicion "+i+" :: "+caja3[i]+" ");
        }
        
    }
}