package igu;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Automovil;
import logica.ControladoraLogica;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import javax.swing.table.TableModel;


/**
 * Clase que representa la interfaz gráfica para visualizar, buscar, editar y eliminar automóviles.
 * Muestra un listado de vehículos en una tabla con capacidad de filtrado y acciones CRUD.
 *  control: Controladora de la lógica del negocio para gestionar las operaciones con automóviles.
 * sorter : Objeto para el filtrado y ordenamiento de filas en la tabla de automóviles.
 */
public class VerAutos extends javax.swing.JFrame {
    ControladoraLogica control= null;
    
    private TableRowSorter<TableModel> sorter;
    
    public VerAutos() {
        control = new ControladoraLogica();
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTotal = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        panelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaAutos = new javax.swing.JTable();
        labelPatente = new javax.swing.JLabel();
        txtBuscarPatente = new javax.swing.JTextField();
        bntBuscarPatente = new javax.swing.JButton();
        btnLimpiarFiltro = new javax.swing.JButton();
        panelBotones = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelTotal.setBackground(new java.awt.Color(204, 204, 204));

        panelTitulo.setBackground(new java.awt.Color(0, 0, 0));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logoAuto (1).png"))); // NOI18N

        titulo.setBackground(new java.awt.Color(0, 0, 0));
        titulo.setFont(new java.awt.Font("Sitka Heading", 3, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("VER LISTADO DE AUTOS");
        titulo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                tituloAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo)
                .addGap(110, 110, 110)
                .addComponent(titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titulo)
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelTabla.setBackground(new java.awt.Color(204, 204, 204));

        TablaAutos.setBackground(new java.awt.Color(204, 204, 204));
        TablaAutos.setForeground(new java.awt.Color(0, 0, 0));
        TablaAutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaAutos);

        labelPatente.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        labelPatente.setForeground(new java.awt.Color(0, 0, 0));
        labelPatente.setText("Buscar automovil por número de patente: ");

        txtBuscarPatente.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscarPatente.setForeground(new java.awt.Color(0, 0, 0));

        bntBuscarPatente.setBackground(new java.awt.Color(0, 0, 0));
        bntBuscarPatente.setForeground(new java.awt.Color(255, 255, 255));
        bntBuscarPatente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/search.png"))); // NOI18N
        bntBuscarPatente.setText("Buscar");
        bntBuscarPatente.setMaximumSize(new java.awt.Dimension(100, 43));
        bntBuscarPatente.setMinimumSize(new java.awt.Dimension(100, 43));
        bntBuscarPatente.setPreferredSize(new java.awt.Dimension(100, 43));
        bntBuscarPatente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBuscarPatenteActionPerformed(evt);
            }
        });

        btnLimpiarFiltro.setBackground(new java.awt.Color(0, 0, 0));
        btnLimpiarFiltro.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/clear.png"))); // NOI18N
        btnLimpiarFiltro.setText("Limpiar Filtro");
        btnLimpiarFiltro.setMaximumSize(new java.awt.Dimension(100, 43));
        btnLimpiarFiltro.setMinimumSize(new java.awt.Dimension(100, 43));
        btnLimpiarFiltro.setPreferredSize(new java.awt.Dimension(100, 43));
        btnLimpiarFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarFiltroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTablaLayout = new javax.swing.GroupLayout(panelTabla);
        panelTabla.setLayout(panelTablaLayout);
        panelTablaLayout.setHorizontalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTablaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTablaLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBuscarPatente)
                            .addGroup(panelTablaLayout.createSequentialGroup()
                                .addComponent(bntBuscarPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(135, 135, 135)
                                .addComponent(btnLimpiarFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        panelTablaLayout.setVerticalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(labelPatente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscarPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntBuscarPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiarFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        bntBuscarPatente.getAccessibleContext().setAccessibleDescription("");

        panelBotones.setBackground(new java.awt.Color(204, 204, 204));

        btnEditar.setBackground(new java.awt.Color(0, 0, 0));
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/edit.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(0, 0, 0));
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/delete.png"))); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(0, 0, 0));
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/return.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelTotalLayout = new javax.swing.GroupLayout(panelTotal);
        panelTotal.setLayout(panelTotalLayout);
        panelTotalLayout.setHorizontalGroup(
            panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelTotalLayout.createSequentialGroup()
                .addComponent(panelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTotalLayout.setVerticalGroup(
            panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTotalLayout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelTotalLayout.createSequentialGroup()
                        .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tituloAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tituloAncestorMoved

    }//GEN-LAST:event_tituloAncestorMoved
    
     /**
     * Maneja el evento del botón Editar.
     * Abre la ventana de modificación para el automóvil seleccionado en la tabla.
     * @param evt Evento de acción
     */
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(TablaAutos.getRowCount() > 0){
           if(TablaAutos.getSelectedRow() != -1){
              int numAuto = Integer.parseInt(String.valueOf(TablaAutos.getValueAt(TablaAutos.getSelectedRow(),0))); 
              
              ModificarAuto pantallaModi = new ModificarAuto(numAuto); 
              pantallaModi.setVisible(true); 
              pantallaModi.setLocationRelativeTo(null); 
              this.dispose(); 

           }
           else{
              JOptionPane.showMessageDialog(null, "No selecciono ninguna fila para editar", "Alerta", JOptionPane.ERROR_MESSAGE);

           }
       
       }
       else{
           JOptionPane.showMessageDialog(null, "No hay registros para editar", "Tabla Vacia", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_btnEditarActionPerformed
   
    
     /**
     * Maneja el evento del botón Borrar.
     * Elimina el automóvil seleccionado después de confirmación del usuario.
     * @param evt Evento de acción
     */
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        if (TablaAutos.getRowCount() > 0) {
            if (TablaAutos.getSelectedRow() != -1) {
                Object[] opciones = {"Sí", "No"};
                int respuesta = JOptionPane.showOptionDialog(
                    null,
                    "¿Está seguro que desea eliminar el registro?",
                    "Confirmar eliminación",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[1]
                );

                if (respuesta == JOptionPane.YES_OPTION) {
                    int numAuto = Integer.parseInt(
                        String.valueOf(TablaAutos.getValueAt(TablaAutos.getSelectedRow(), 0))
                    );

                    control.borrarAuto(numAuto);

                    JOptionPane.showMessageDialog(
                        null,
                        "Se eliminó el auto de la base de datos",
                        "Borrado exitoso",
                        JOptionPane.INFORMATION_MESSAGE
                    );

                    cargarTabla(); 
                }
            } else {
                JOptionPane.showMessageDialog(
                    null,
                    "No seleccionó ninguna fila para eliminar",
                    "Alerta",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        } else {
            JOptionPane.showMessageDialog(
                null,
                "No hay registros para borrar",
                "Tabla vacía",
                JOptionPane.ERROR_MESSAGE
            );
        }    
   
    }//GEN-LAST:event_btnBorrarActionPerformed
    
    
    /**
     * Maneja el evento del botón Volver.
     * Cierra la ventana actual y regresa al menú principal.
     * @param evt Evento de acción
     */
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();//cierra la ventana
        Principal menu = new Principal(); 
        menu.setVisible(true); 
        menu.setLocationRelativeTo(null); 
    }//GEN-LAST:event_btnVolverActionPerformed
    
    
     /**
     * Maneja el evento de apertura de ventana.
     * Carga los datos en la tabla al abrirse la ventana.
     * @param evt Evento de ventana
     */
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened
    
    
      /**
     * Maneja el evento del botón Buscar por patente.
     * Filtra la tabla mostrando solo los vehículos cuya patente coincida con el texto ingresado.
     * @param evt Evento de acción
     */
    private void bntBuscarPatenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBuscarPatenteActionPerformed
        String textoPatente = txtBuscarPatente.getText().trim();
        if (textoPatente.length() == 0) {
            sorter.setRowFilter(null); 
        } else {
      
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + textoPatente, 5));
        }
    }//GEN-LAST:event_bntBuscarPatenteActionPerformed
    
     /**
     * Maneja el evento del botón Limpiar Filtro.
     * Restablece la vista completa de la tabla eliminando cualquier filtro aplicado.
     * @param evt Evento de acción
     */
    private void btnLimpiarFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarFiltroActionPerformed
        sorter.setRowFilter(null);
        txtBuscarPatente.setText("");
       
    }//GEN-LAST:event_btnLimpiarFiltroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaAutos;
    private javax.swing.JButton bntBuscarPatente;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnLimpiarFiltro;
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelPatente;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JPanel panelTotal;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtBuscarPatente;
    // End of variables declaration//GEN-END:variables

    
      /**
     * Carga los datos de automóviles en la tabla y configura el filtrado.
     * Resalta visualmente las filas con patente vacía o nula.
     * Ya que los autos sin patente son 0km.
     */
    private void cargarTabla() {
       DefaultTableModel modeloTabla = new DefaultTableModel(){ 
           
           @Override 
           public boolean isCellEditable(int row, int column){
              return false;
           }
           
       }; 
    
       String [] titulos = {"Num","Modelo", "Marca", "Motor", "Color", "Patente", "Cant. Puertas"};
       modeloTabla.setColumnIdentifiers(titulos); 
   
       List <Automovil> listaAutos = control.traerAutos();  

       if(listaAutos != null){
          
          for (Automovil auto: listaAutos){
              Object [] automovil = {auto.getIdAuto(), auto.getModelo(), auto.getMarca(), auto.getMotor(),
               auto.getColor(), auto.getPatente(), auto.getCantidadPuertas()}; 
              
              modeloTabla.addRow(automovil); 
             
            }
            TablaAutos.setModel(modeloTabla); 
          
        }  
        
        TablaAutos.setModel(modeloTabla); 
        sorter = new TableRowSorter<>(modeloTabla);
        TablaAutos.setRowSorter(sorter);
        
        TablaAutos.setDefaultRenderer(Object.class, new javax.swing.table.DefaultTableCellRenderer() {
            @Override
            public java.awt.Component getTableCellRendererComponent(
                javax.swing.JTable table, Object value, boolean isSelected,
                boolean hasFocus, int row, int column) {

                java.awt.Component c = super.getTableCellRendererComponent(
                    table, value, isSelected, hasFocus, row, column);

                int modelRow = table.convertRowIndexToModel(row);
                
                DefaultTableModel model = (DefaultTableModel) table.getModel();

                String patente = (String) model.getValueAt(modelRow, 5);

                if (patente == null || patente.trim().isEmpty()) {
                    c.setBackground(new java.awt.Color(153, 153, 153)); 
                } else {
                    c.setBackground(java.awt.Color.WHITE);
                }

                return c;
            }
        });
    }
}

