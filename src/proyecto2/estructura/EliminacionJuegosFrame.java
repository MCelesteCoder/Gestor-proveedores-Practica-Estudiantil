package proyecto2.estructura;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EliminacionJuegosFrame extends javax.swing.JInternalFrame {

    DefaultTableModel proveYjuegosTbl = new DefaultTableModel();
    DefaultTableModel juegosTbl = new DefaultTableModel();
    int fila;

    public EliminacionJuegosFrame() {
        initComponents();

        //se utiliza para modificar o seleccionar los datos de la tabla
        tbl2.setModel(proveYjuegosTbl);
        tbl3.setModel(juegosTbl);

        //Metodo llamado para agregar columnas a la tabla
        cargarJuegosTabla();
        llenarTablaDeProveedoresYJuegos();
    }

    private void llenarTablaDeProveedoresYJuegos() {
        //Se cargan los datos a la tabla de los proveedores y juegos 
        proveYjuegosTbl.addColumn("Proveedor");
        proveYjuegosTbl.addColumn("Juegos");
        datosPyJ();

    }

    private void datosPyJ() {
        //Se actualiza la informacion de los proveedores y juegos
        proveYjuegosTbl.setRowCount(0);
        Proveedores[] arregloProveedores = Proveedores.getArreglo();
        for (Proveedores proveedor : arregloProveedores) {
            String juegos = obtenerJuegos(proveedor);// Se obtiene los de la pila del proveedor llamando al metodo obtenerJuegos
            if (proveedor != null) { // Asegurar que el proveedor no sea nulo
                proveYjuegosTbl.addRow(new Object[]{
                    proveedor.getDescripcion(),
                    juegos

                });
            }
        }
    }

    private String obtenerJuegos(Proveedores proveedor) {

        //Este metodo lo que hace es generar una cadena de texto con lo juegos que esten en la pila relacionada al proveedor
        StringBuilder juegos = new StringBuilder(); //Este objeto ayuda con la contruccion de la cadena de texto de los juegos
        if (proveedor != null) {
            for (Juego juego : proveedor.getJuegosAr()) {
                if (juego != null) {
                    juegos.append(juego.getNombre()).append("   -   ");
                }
            }
        }
        // Eliminar el ultimo guion y espacio si hay juegos en la cadena 
        if (juegos.length() > 0) {
            juegos.delete(juegos.length() - 7, juegos.length());
        }
        return juegos.toString();

    }

    private void llenarJuegosTabla() {

        //Se rellena la tabla de la informacion de los juegos con la informacón de estos
        fila = tbl2.getSelectedRow();

        if (fila != -1) {
            codigoReLLenarTablaJuegos();
        } else {
            // Si no se ha seleccionado ninguna fila se le indica al usuario
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila para editar.",
                    "Selección requerida", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void codigoReLLenarTablaJuegos() {

        //De acuerdo con la fila que se haya seleccionado se muestran los datos de la pila en la tabla de los juegos
        Proveedores pSeleccionado = Proveedores.getArreglo()[fila];

        if (pSeleccionado != null) {
            DefaultTableModel modeloTabla = (DefaultTableModel) tbl3.getModel();
            modeloTabla.setRowCount(0); // Limpiar la tabla antes de agregar nuevas filas

            for (Juego juego : pSeleccionado.getJuegosAr()) {
                if (juego != null) {
                    Object[] filasDatos = new Object[]{
                        juego.getDni(),
                        juego.getNombre(),
                        juego.getCatInteraccion(),
                        juego.getCatAccesorios(),
                        juego.getMecanica(),
                        juego.getNumParticipantes(),
                        juego.getEdadMin()
                    };
                    modeloTabla.addRow(filasDatos);
                }
            }
        }
    }

    private void eliminarLIFO() {

        //Metodo para la eliminacion de el ultimo juego en la pila del proveedor seleccionado
        Proveedores ultProveedor = Proveedores.getArreglo()[fila];
        ultProveedor.eliminarUltimoJuego();

        //Se separa el codigo para la reutilizacion de este
        datosPyJ();
        codigoReLLenarTablaJuegos();
    }

    private void cargarJuegosTabla() {
        //Se agregar las columnas a la tabla de juegos
        juegosTbl.addColumn("DNI");
        juegosTbl.addColumn("Juego");
        juegosTbl.addColumn("Interacción");
        juegosTbl.addColumn("Accesorios");
        juegosTbl.addColumn("Mecánica");
        juegosTbl.addColumn("Num-Participantes");
        juegosTbl.addColumn("Edad Miníma");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl2 = new javax.swing.JTable();
        btnMostrarJuegos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl3 = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Eliminación de Juegos de mesa");

        tbl2.setModel(proveYjuegosTbl);
        jScrollPane1.setViewportView(tbl2);

        btnMostrarJuegos.setBackground(new java.awt.Color(102, 102, 102));
        btnMostrarJuegos.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnMostrarJuegos.setText("Mostrar juegos");
        btnMostrarJuegos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarJuegosActionPerformed(evt);
            }
        });

        tbl3.setModel(juegosTbl);
        jScrollPane2.setViewportView(tbl3);

        btnEliminar.setBackground(new java.awt.Color(102, 102, 102));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jScrollPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnMostrarJuegos, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                        .addGap(388, 388, 388))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(380, 380, 380))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMostrarJuegos, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarJuegosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarJuegosActionPerformed
        llenarJuegosTabla();
    }//GEN-LAST:event_btnMostrarJuegosActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarLIFO();
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMostrarJuegos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl2;
    private javax.swing.JTable tbl3;
    // End of variables declaration//GEN-END:variables
}
