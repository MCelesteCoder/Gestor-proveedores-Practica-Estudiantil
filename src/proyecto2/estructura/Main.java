package proyecto2.estructura;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnRegProvedores = new javax.swing.JToggleButton();
        btnEliProveedores = new javax.swing.JToggleButton();
        btnEliJuegos = new javax.swing.JToggleButton();
        btnRegJuegos = new javax.swing.JToggleButton();
        contenedorOpc = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        btnRegProvedores.setBackground(new java.awt.Color(153, 153, 153));
        grupoBotones.add(btnRegProvedores);
        btnRegProvedores.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnRegProvedores.setText("Registro de proveedores");
        btnRegProvedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegProvedoresActionPerformed(evt);
            }
        });

        btnEliProveedores.setBackground(new java.awt.Color(153, 153, 153));
        grupoBotones.add(btnEliProveedores);
        btnEliProveedores.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnEliProveedores.setText("Eliminación de proveedores");
        btnEliProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliProveedoresActionPerformed(evt);
            }
        });

        btnEliJuegos.setBackground(new java.awt.Color(153, 153, 153));
        grupoBotones.add(btnEliJuegos);
        btnEliJuegos.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnEliJuegos.setText("Eliminación de juegos de mesa");
        btnEliJuegos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliJuegosActionPerformed(evt);
            }
        });

        btnRegJuegos.setBackground(new java.awt.Color(153, 153, 153));
        grupoBotones.add(btnRegJuegos);
        btnRegJuegos.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnRegJuegos.setText("Registro de juegos de mesa");
        btnRegJuegos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegJuegosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnRegProvedores, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegJuegos, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliJuegos, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(btnRegProvedores, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(btnRegJuegos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(btnEliJuegos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btnEliProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contenedorOpcLayout = new javax.swing.GroupLayout(contenedorOpc);
        contenedorOpc.setLayout(contenedorOpcLayout);
        contenedorOpcLayout.setHorizontalGroup(
            contenedorOpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 958, Short.MAX_VALUE)
        );
        contenedorOpcLayout.setVerticalGroup(
            contenedorOpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contenedorOpc)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedorOpc)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
RegistroProveedoresFrame rProvee;
    private void btnRegProvedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegProvedoresActionPerformed
        if (rProvee == null) {

            //Se inicailiza la ventana del registro de provedores
            rProvee = new RegistroProveedoresFrame();

            // Se agrega la ventana de registro de provedores al contenedor y se maximiza
            contenedorOpc.getDesktopManager().maximizeFrame(rProvee);

            //Se agrega registro de provedores al contenedorOpc
            contenedorOpc.add(rProvee);

            //Se le da indica que registro de provedores sea visible
            rProvee.setVisible(true);
        } else {
            // Si la ventana de registro ya está abierta solo se maximiza
            contenedorOpc.getDesktopManager().maximizeFrame(rProvee);
        }
    }//GEN-LAST:event_btnRegProvedoresActionPerformed

 
    private void btnEliProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliProveedoresActionPerformed
         //Se inicailiza y declara la ventana de eliminación de proveedores
            EliminacionProveedoresFrame eProveedores = new EliminacionProveedoresFrame();

            // Se agrega la ventana de eliminación de proveedores al contenedor y se maximiza
            contenedorOpc.getDesktopManager().maximizeFrame(eProveedores);

            //Se agrega la ventana de eliminación de proveedores al contenedorOpc
            contenedorOpc.add(eProveedores);

            //Se le da indica que la ventana de eliminación de proveedoressea visible
            eProveedores.setVisible(true);
    }//GEN-LAST:event_btnEliProveedoresActionPerformed

    
    private void btnEliJuegosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliJuegosActionPerformed
        //Se inicailiza y declara  la ventana de eliminación de juegos
           EliminacionJuegosFrame eJugos = new EliminacionJuegosFrame();

            // Se agrega la ventana de eliminación de juegosal contenedor y se maximiza
            contenedorOpc.getDesktopManager().maximizeFrame(eJugos);

            //Se agrega la ventana de eliminación de juegos al contenedorOpc
            contenedorOpc.add(eJugos);

            //Se le da indica que la ventana de eliminación de juegos sea visible
            eJugos.setVisible(true);
    }//GEN-LAST:event_btnEliJuegosActionPerformed

    
    private void btnRegJuegosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegJuegosActionPerformed
        //Se inicailiza y declara la ventana de registro de juegos
           RegistroJuegosFrame rJuegos = new RegistroJuegosFrame();

            // Se agrega la ventana de registro de juegos al contenedor y se maximiza
            contenedorOpc.getDesktopManager().maximizeFrame(rJuegos);

            //Se agrega registro de juegos al contenedorOpc
            contenedorOpc.add(rJuegos);

            //Se le da indica que registro de juegos sea visible
            rJuegos.setVisible(true);
    }//GEN-LAST:event_btnRegJuegosActionPerformed

    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnEliJuegos;
    private javax.swing.JToggleButton btnEliProveedores;
    private javax.swing.JToggleButton btnRegJuegos;
    private javax.swing.JToggleButton btnRegProvedores;
    private javax.swing.JDesktopPane contenedorOpc;
    private javax.swing.ButtonGroup grupoBotones;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
