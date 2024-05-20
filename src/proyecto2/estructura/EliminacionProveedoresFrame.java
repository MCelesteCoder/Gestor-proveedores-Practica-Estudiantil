package proyecto2.estructura;


import javax.swing.table.DefaultTableModel;

public class EliminacionProveedoresFrame extends javax.swing.JInternalFrame {

    DefaultTableModel tablaEliProvee = new DefaultTableModel();

    public EliminacionProveedoresFrame() {
        initComponents();

         //Metodo llamado para agregar columnas a la tabla
        cargarTablaEliProvee();
    }

    private void cargarTablaEliProvee() {
        //Se carga la información referente a los juegos y proveedores
        tablaEliProvee.addColumn("Proveedor");
        tablaEliProvee.addColumn("Juegos");

        datosPyJ();
    }

    private void datosPyJ() {
        //Se actualiza la informacion de los proveedores y juegos
        tablaEliProvee.setRowCount(0);
        Proveedores[] arregloProveedores = Proveedores.getArreglo();
        for (Proveedores proveedor : arregloProveedores) {
            String juegos = obtenerJuegos(proveedor); // Se obtiene los de la pila del proveedor llamando al metodo obtenerJuegos
            if (proveedor != null) { // Asegurar que el proveedor no sea nulo
                tablaEliProvee.addRow(new Object[]{
                    proveedor.getDescripcion(),
                    juegos

                });
            }
        }
    }

    private String obtenerJuegos(Proveedores proveedor) {
         //Este metodo lo que hace es generar una cadena de texto con lo juegos que esten en la pila relacionada al proveedor
        StringBuilder juegos = new StringBuilder();//Este objeto ayuda con la contruccion de la cadena de texto de los juegos}
        
        if (proveedor != null) {
            for (Juego juego : proveedor.getJuegosAr()) {
                if (juego != null) {
                    juegos.append(juego.getNombre()).append("   -   ");//Luego de cada jeugo se agrega un guion
                }
            }
        }
        
        // Eliminar el ultimo guion y espacio si hay juegos en la cadena 
        if (juegos.length() > 0) {
            juegos.delete(juegos.length() - 7, juegos.length());
        }
        return juegos.toString();

    }

    private void eliminarFIFO() {

        //Metodo para la eliminacion de el primer proveedor 
        Proveedores primerProveedor = Proveedores.getArreglo()[0];
        primerProveedor.eliminarPrimerProveedor();
        datosPyJ();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnEliProvee = new javax.swing.JButton();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Eliminación de proveedores");

        jTable1.setModel(tablaEliProvee);
        jScrollPane1.setViewportView(jTable1);

        btnEliProvee.setBackground(new java.awt.Color(102, 102, 102));
        btnEliProvee.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnEliProvee.setText("Eliminar Proveedor");
        btnEliProvee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliProveeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(369, 369, 369)
                .addComponent(btnEliProvee, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addGap(414, 414, 414))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnEliProvee, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 99, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliProveeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliProveeActionPerformed
        eliminarFIFO();
    }//GEN-LAST:event_btnEliProveeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliProvee;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
