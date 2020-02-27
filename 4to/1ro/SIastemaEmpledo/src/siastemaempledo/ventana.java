/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siastemaempledo;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author PROGRAMAR
 */
public class ventana extends JFrame{
    private JLabel Lnombre,Lapellido,Lgenero,Lfacha,Lingreso,Lsalario;
    private JTextField Tnombre,Tapellido,Tgenero,Tfacha,Tingreso,Tsalario;
    private JButton btnsalario,btnedad,btnantiguedad,btnprestaciones,btneditar,btnanterio,btnnext;
    private String[] empleado= new String[5];

    public ventana() {
        iniciar();
        component();
    }
            
    
    
    
    void iniciar(){
     this.setSize(400,500);
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setLayout(null);
     this.setTitle("eventos del raton -MousEvent-");
     this.setResizable(false);
     this.setLocationRelativeTo(null);
     this.getContentPane().setBackground(Color.LIGHT_GRAY);
        
    }
    
    private void component(){
        
        //DATIOS
        Lnombre=new JLabel("nombre");
        Lnombre.setBounds(10, 10, 100, 20);
        this.add(Lnombre);        
        Tnombre=new JTextField();
        Tnombre.setBounds(110, 10, 100, 20);
        this.add(Tnombre);
        
        Lapellido=new JLabel("Apellido");
        Lapellido.setBounds(10, 35, 100, 20);
        this.add(Lapellido);        
        Tapellido=new JTextField();
        Tapellido.setBounds(110, 35, 100, 20);
        this.add(Tapellido);
        
        Lgenero=new JLabel("Genero");
        Lgenero.setBounds(10, 60, 100, 20);
        this.add(Lgenero);        
        Tgenero=new JTextField();
        Tgenero.setBounds(110, 60, 100, 20);
        this.add(Tgenero);
        
        Lfacha=new JLabel("Fecha de nacimiento");
        Lfacha.setBounds(10, 85, 100, 20);
        this.add(Lfacha);        
        Tfacha=new JTextField();
        Tfacha.setBounds(110, 85, 100, 20);
        this.add(Tfacha);
        
        Lingreso=new JLabel("Fecha de ingreso");
        Lingreso.setBounds(10, 110, 100, 20);
        this.add(Lingreso);        
        Tingreso=new JTextField();
        Tingreso.setBounds(110, 110, 100, 20);
        this.add(Tingreso);
        
        Lsalario=new JLabel("SAlario");
        Lsalario.setBounds(10, 135, 100, 20);
        this.add(Lsalario);        
        Tsalario=new JTextField();
        Tsalario.setBounds(110, 135, 100, 20);
        this.add(Tsalario);
        
        btnsalario=new JButton("Modificcar salario");
        btnsalario.setBounds(10, 160, 200, 30);
        this.add(btnsalario);
        
        
        //CAlculos
        JPanel buttonPane = new JPanel();
        buttonPane.setLayout(new BoxLayout(buttonPane, BoxLayout.Y_AXIS));
        buttonPane.setBounds(50, 220, 170, 100);
        
        btnedad=new JButton("Calcular edad");
        btnedad.setSize(170, 20);
        buttonPane.add(btnedad);
        
        btnantiguedad=new JButton("Calcular antiguedad");
        buttonPane.add(btnantiguedad);
        
        btnprestaciones=new JButton("Calcular prestaciones");
        buttonPane.add(btnprestaciones);        
        
        this.add(buttonPane);
        
        //obcioes
        
        JPanel obcioes = new JPanel();
        obcioes.setLayout(new FlowLayout());
        obcioes.setBounds(10, 230, 170, 100); 
        
        btneditar=new JButton("CAmbiar emplea");
        obcioes.add(btneditar);
        obcioes.add(btneditar);
        
        this.add(obcioes);
    }
}
