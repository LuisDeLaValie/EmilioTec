package proyectoventana;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import static java.awt.Frame.HAND_CURSOR;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import sun.awt.AWTAccessor;

public class Ventana extends JFrame implements ActionListener, KeyListener, MouseListener {

    private JLabel et1, et2, et3, et4;
    private JTextField txtNomServicio1, txtCostoServ, txtIva, txtTotalPagar;
    private JButton btnCalcular;
    private JComboBox combaoxtext;

    public Ventana() {
        inicializar();
        iniControles();
    }

    private void inicializar() {
        this.setVisible(true);
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Taller Mecanico");
        //this.setMinimumSize(new Dimension(800,600));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.decode("#DE0061"));

    }

    private void iniControles() {
        this.setLayout(null);
        et1 = new JLabel();
        et1.setBounds(40, 20, 200, 20);
        et1.setText("Nombre del servicio: ");
        et1.setFont(new Font("Andale Mono", 1, 12));
        this.add(et1);

        et2 = new JLabel();
        et2.setBounds(40, 50, 200, 20);
        et2.setText("Costo del servicio: $");
        et2.setFont(new Font("Andale Mono", 1, 12));
        this.add(et2);

        et3 = new JLabel();
        et3.setBounds(120, 80, 200, 20);
        et3.setText("IVA: $");
        et3.setFont(new Font("Andale Mono", 1, 12));
        this.add(et3);

        et4 = new JLabel();
        et4.setBounds(65, 110, 200, 20);
        et4.setText("Total a pagar: $");
        et4.setFont(new Font("Andale Mono", 1, 12));
        this.add(et4);

        txtNomServicio1 = new JTextField();
        txtNomServicio1.setBounds(160, 20, 100, 20);
        //this.add(txtNomServicio1);

        txtCostoServ = new JTextField();
        txtCostoServ.setBounds(160, 50, 100, 20);
        this.add(txtCostoServ);
        txtCostoServ.addKeyListener(this);

        txtIva = new JTextField();
        txtIva.setBounds(160, 80, 100, 20);
        txtIva.setEditable(false);
        this.add(txtIva);

        txtTotalPagar = new JTextField();
        txtTotalPagar.setBounds(160, 110, 100, 20);
        txtTotalPagar.setEnabled(false);
        txtTotalPagar.setFont(new Font("Andale Mono", 1, 12));
        this.add(txtTotalPagar);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(50, 150, 100, 30);
        btnCalcular.addActionListener(this);
        btnCalcular.setFont(new Font("Andale Mono", 1, 12));
        btnCalcular.setCursor(new Cursor(HAND_CURSOR));
        btnCalcular.setBackground(new Color(255, 255, 255));
        this.add(btnCalcular);
        
        combaoxtext= new JComboBox();
        combaoxtext.setModel(new DefaultComboBoxModel(new String[]{"afinacion","fRENOS","cambio de acenite"}));
        combaoxtext.setBounds(160, 20, 100, 20);
        this.add(combaoxtext);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        try{
            if (ae.getSource() == btnCalcular) {
                String costo = txtCostoServ.getText();
                if(costo.equals("")){
                    JOptionPane.showMessageDialog(null, "campo basio");
                }else{
                    Double.parseDouble(costo);
                    double iva =Integer.parseInt(costo)*0.16;
                    txtIva.setText(""+iva);
                    txtTotalPagar.setText(""+(Integer.parseInt(costo)+iva));
                    System.out.println(costo);
                }
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "solo numeros");
        }        
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        
        char caracter=ke.getKeyChar();
        
        if(((caracter<'0')||(caracter>'9'))
                &&(caracter!=KeyEvent.VK_BACK_SPACE)
                &&(caracter!='.')
                ){
            Toolkit.getDefaultToolkit().beep();
        }
    }

    @Override
    public void keyPressed(KeyEvent ke) {
       
    }

    @Override
    public void keyReleased(KeyEvent ke) {
       
    }
    
    

    @Override
    public void mouseClicked(MouseEvent me) {
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }
    

}
