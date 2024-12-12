/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell Core i7
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        btnClaseAbstracta = new javax.swing.JButton();
        lblSubtitulo = new javax.swing.JLabel();
        lblTitulo2 = new javax.swing.JLabel();
        jcbMenuFiguras = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAMensaje = new javax.swing.JTextArea();
        lblEscogerOpcion = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        lblTitulo.setText("UNIDAD 1");

        btnClaseAbstracta.setBackground(new java.awt.Color(255, 204, 255));
        btnClaseAbstracta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClaseAbstracta.setText("Cuadrado");
        btnClaseAbstracta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClaseAbstractaActionPerformed(evt);
            }
        });

        lblSubtitulo.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 30)); // NOI18N
        lblSubtitulo.setForeground(new java.awt.Color(0, 102, 102));
        lblSubtitulo.setText("Figuras Geométricas");

        lblTitulo2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblTitulo2.setForeground(new java.awt.Color(0, 0, 102));
        lblTitulo2.setText("PROGRAMACIÓN ORIENTADA A OBJETOS");

        jcbMenuFiguras.setEditable(true);
        jcbMenuFiguras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--seleccione--", "Rectángulo", "Triángulo", "Cuadrado", "Círculo" }));
        jcbMenuFiguras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMenuFigurasActionPerformed(evt);
            }
        });

        txtAMensaje.setColumns(20);
        txtAMensaje.setRows(5);
        jScrollPane1.setViewportView(txtAMensaje);

        lblEscogerOpcion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEscogerOpcion.setText("Escoja una Figura Geométrica: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 33, Short.MAX_VALUE)
                .addComponent(lblSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(217, 217, 217))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(156, 156, 156)
                            .addComponent(lblTitulo))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(72, 72, 72)
                            .addComponent(lblTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(53, 53, 53)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblEscogerOpcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jcbMenuFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(22, 22, 22))
                                .addComponent(btnClaseAbstracta))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClaseAbstracta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbMenuFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEscogerOpcion))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClaseAbstractaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClaseAbstractaActionPerformed
        // TODO add your handling code here:
        CuadradoForm c1= new CuadradoForm();
        c1.setVisible(true);  //habilitar un formulario --mostrar
        this.dispose();  //cerrar el formulario
        
    }//GEN-LAST:event_btnClaseAbstractaActionPerformed

    private void jcbMenuFigurasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMenuFigurasActionPerformed
            // TODO add your handling code here:
            
        //Muestra un mensaje de la opción escogida    
        String mensaje = "La figura elegida es: ";
        mensaje = mensaje + jcbMenuFiguras.getSelectedItem().toString();
        txtAMensaje.setText(mensaje);
       //Para que muestre otro fromulario segun la seleccion del combo box
        //instancia el objeto cuadrado
        CuadradoForm c1= new CuadradoForm();
        if(jcbMenuFiguras.getSelectedItem().toString().equals("--seleccione--")){
            txtAMensaje.setText("Debe elegir una Figura Geométrica");}
        else
            if(jcbMenuFiguras.getSelectedItem().toString().equals("Cuadrado")){
               c1.setVisible(true);
               this.dispose();}
            else
                txtAMensaje.setText(mensaje);
    
        
        
        
    }//GEN-LAST:event_jcbMenuFigurasActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClaseAbstracta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> jcbMenuFiguras;
    private javax.swing.JLabel lblEscogerOpcion;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JTextArea txtAMensaje;
    // End of variables declaration//GEN-END:variables
}
