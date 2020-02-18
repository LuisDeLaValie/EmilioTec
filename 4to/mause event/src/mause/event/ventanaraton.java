/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mause.event;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author PROGRAMAR
 */
public class ventanaraton extends JFrame implements MouseListener{
    private JButton btnBoton;
    private JLabel et1,et2,et3;
    
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
        btnBoton.addMouseListener(this);
        this.add(btnBoton);
        et3=new JLabel();
        et3.setBackground(Color.WHITE);
        et3.setOpaque(true);
        et3.setVisible(false);
        et3.setBounds(220, 120, 100, 20);
        this.add(et3);
               
        
        
    }

    @Override
    public void mouseClicked(MouseEvent me) {
         if(me.getSource() == btnBoton){
            et1.setText("");
            et1.setText("Click");
        }
    }
    
    //precionar el botonizq
    @Override
    public void mousePressed(MouseEvent me) {
        if(me.getSource() == btnBoton){
            et1.setText("");
            et1.setText("boton mause presionado");
        }
    }

    @Override
    public void mouseReleased(MouseEvent me) {
         if(me.getSource() == btnBoton){
            et1.setText("");
            et1.setText("boton mause liberado");
        }
    }

    @Override
    public void mouseEntered(MouseEvent me) {
         if(me.getSource() == btnBoton){
            et3.setText("");
            et3.setText("boton mause entro");
            et3.setVisible(true);
        }
    }

    @Override
    public void mouseExited(MouseEvent me) {
         if(me.getSource() == btnBoton){
            et3.setText("");
            et3.setText("boton mause salio");
            et3.setVisible(false);
        }
    }
    
}
