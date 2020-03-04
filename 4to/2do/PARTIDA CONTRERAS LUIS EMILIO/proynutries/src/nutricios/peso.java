
package nutricios;

import archivo.Cliente;
import archivo.mipeso;

/// 18460120 PARTIDA CONTRERAS LUIS EMILIO

public class peso extends javax.swing.JFrame {
    
    Cliente pesos;
    mipeso lista;
    int idex=-1;
    int items=0;
   
    public peso() {
        pesos=new Cliente();
        lista= new mipeso();
        lista.leer();
        items=lista.items();
        
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtestatura = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtpeso = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        rbmujer = new javax.swing.JRadioButton();
        rbhombre = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnclear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        rango = new javax.swing.JLabel();
        etPesoideal1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bajopeso = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        sobrepeo1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnCalcular1 = new javax.swing.JButton();
        tbnagregarpeso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(450, 500));
        getContentPane().setLayout(null);

        jLabel1.setText("Nombre ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(22, 32, 110, 15);
        getContentPane().add(txtnombre);
        txtnombre.setBounds(140, 30, 140, 30);

        jLabel2.setText("Estatura(cm)");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 70, 100, 15);
        getContentPane().add(txtestatura);
        txtestatura.setBounds(140, 70, 60, 30);

        jLabel3.setText("peso actual");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 120, 90, 15);

        txtpeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpesoActionPerformed(evt);
            }
        });
        getContentPane().add(txtpeso);
        txtpeso.setBounds(140, 120, 60, 30);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("genero"));
        jPanel2.setToolTipText("genro");
        jPanel2.setLayout(null);

        buttonGroup1.add(rbmujer);
        rbmujer.setSelected(true);
        jPanel2.add(rbmujer);
        rbmujer.setBounds(20, 70, 21, 21);

        buttonGroup1.add(rbhombre);
        rbhombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbhombreActionPerformed(evt);
            }
        });
        jPanel2.add(rbhombre);
        rbhombre.setBounds(93, 70, 30, 23);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Captura1.PNG"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(80, 20, 40, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Captura.PNG"))); // NOI18N
        jLabel6.setText("jLabel5");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 20, 40, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(310, 40, 130, 100);

        btnclear.setText("limpiar");
        getContentPane().add(btnclear);
        btnclear.setBounds(220, 170, 110, 30);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("resultados"));
        jPanel3.setLayout(null);

        jLabel4.setText("sobrepeso");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(20, 50, 80, 15);

        rango.setBackground(new java.awt.Color(255, 255, 255));
        rango.setOpaque(true);
        jPanel3.add(rango);
        rango.setBounds(200, 40, 130, 20);

        etPesoideal1.setBackground(new java.awt.Color(255, 255, 255));
        etPesoideal1.setOpaque(true);
        jPanel3.add(etPesoideal1);
        etPesoideal1.setBounds(120, 20, 60, 20);

        jLabel7.setText("rango");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(210, 20, 80, 15);

        bajopeso.setBackground(new java.awt.Color(255, 255, 255));
        bajopeso.setOpaque(true);
        jPanel3.add(bajopeso);
        bajopeso.setBounds(120, 80, 60, 20);

        jLabel8.setText("bajo peso");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(20, 80, 80, 15);

        jLabel9.setText("Peso ideal ");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(20, 20, 80, 15);

        sobrepeo1.setBackground(new java.awt.Color(255, 255, 255));
        sobrepeo1.setOpaque(true);
        jPanel3.add(sobrepeo1);
        sobrepeo1.setBounds(120, 50, 60, 20);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 230, 350, 110);

        jButton1.setText("<<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 360, 54, 25);

        jButton2.setText(">>");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(240, 360, 54, 25);

        btnCalcular1.setText("Calcular");
        btnCalcular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcular1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular1);
        btnCalcular1.setBounds(20, 170, 120, 30);

        tbnagregarpeso.setText("+");
        tbnagregarpeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnagregarpesoActionPerformed(evt);
            }
        });
        getContentPane().add(tbnagregarpeso);
        tbnagregarpeso.setBounds(110, 360, 44, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpesoActionPerformed

    private void peso(boolean ge,float  ib,int actual){
        etPesoideal1.setText(""+ib);
        float a= (float) (ge?(ib+(ib*0.10)):(ib+(ib*0.15)));
        float b= (float) (ge?(ib-(ib*0.10)):(ib-(ib*0.15)));
        
        pesos.setAlto(a);
        pesos.setBajo(b);
        
        if(idex==-1)
            lista.agregar(pesos);
        else
            lista.editar(pesos);
        
        sobrepeo1.setText(""+a);
        bajopeso.setText(""+b);
    }
    private void rbhombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbhombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbhombreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(idex>0){
            idex--;
            pesos=lista.traercliente(idex);
            txtnombre.setText(pesos.getNombre());
            txtestatura.setText(""+pesos.getEstatura());
            txtpeso.setText(""+pesos.getPeso());
            etPesoideal1.setText(""+pesos.getIdeal());
            sobrepeo1.setText(""+pesos.getAlto());
            bajopeso.setText(""+pesos.getBajo());
            
            if(pesos.isSexo())
                rbmujer.setSelected(true);
            else
                rbhombre.setSelected(true);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(idex<items-1){
            idex++;
            pesos=lista.traercliente(idex);
            txtnombre.setText(pesos.getNombre());
            txtestatura.setText(""+pesos.getEstatura());
            txtpeso.setText(""+pesos.getPeso());
            etPesoideal1.setText(""+pesos.getIdeal());
            sobrepeo1.setText(""+pesos.getAlto());
            bajopeso.setText(""+pesos.getBajo());
            if(pesos.isSexo())
                rbmujer.setSelected(true);
            else
                rbhombre.setSelected(true);
            
                    
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    
    private void btnCalcular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcular1ActionPerformed
        int estatura=Integer.parseInt(txtestatura.getText());
        float actual=Float.parseFloat(txtpeso.getText());
        float idbro =estatura-100;
        pesos.setNombre(txtnombre.getText());
        pesos.setEstatura(estatura);
        pesos.setPeso(actual);
        pesos.setIdeal(idbro);
        pesos.setSexo(rbmujer.isSelected());
        peso(rbhombre.isSelected(), idbro,idex);
    }//GEN-LAST:event_btnCalcular1ActionPerformed

    private void tbnagregarpesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnagregarpesoActionPerformed

        idex=-1;
        txtnombre.setText("");
        txtestatura.setText("");
        txtpeso.setText("");
        etPesoideal1.setText("");
        sobrepeo1.setText("");
        bajopeso.setText("");
        rbmujer.setSelected(true);
        
    }//GEN-LAST:event_tbnagregarpesoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(peso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(peso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(peso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(peso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new peso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bajopeso;
    private javax.swing.JButton btnCalcular1;
    private javax.swing.JButton btnclear;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel etPesoideal1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel rango;
    private javax.swing.JRadioButton rbhombre;
    private javax.swing.JRadioButton rbmujer;
    private javax.swing.JLabel sobrepeo1;
    private javax.swing.JButton tbnagregarpeso;
    private javax.swing.JTextField txtestatura;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpeso;
    // End of variables declaration//GEN-END:variables
}
