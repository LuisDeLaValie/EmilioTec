/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mause.event;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author PROGRAMAR
 */
public class ventanaraton extends JFrame{
    private JButton btnBoton;
    private JLabel et1,et2;
    
    public ventanaraton() {
        configurarVentana();
        iniControlers();
        
    }
     //configurar ventana
    private void  configurarVentana(){
     this.setSize(400,400);
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setLayout(null);
     this.setTitle("eventos del raton -MousEvent-");
     this.setResizable(false);
     this.setLocationRelativeTo(null);
     this.getContentPane().setBackground(Color.LIGHT_GRAY);
    }
    
    //configurar ventana
    private void iniControlers(){
        
        et2=new JLabel("Evento del raton");
        et2.setBounds(90, 280, 100, 20);
        this.add(et2);
        
        
        et1=new JLabel();
        et1.setBackground(Color.WHITE);
        et1.setOpaque(true);
        et1.setBounds(90, 300, 200, 20);
        this.add(et1);
        
        btnBoton = new JButton("aceptar");
        btnBoton.setBounds(140, 100, 100, 80);
        this.add(btnBoton);
               
        
        
    }
    
}
