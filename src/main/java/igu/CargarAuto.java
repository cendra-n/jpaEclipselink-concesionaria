package igu;
import logica.ControladoraLogica;

/**
 * Clase que representa la interfaz gráfica para cargar datos de automóviles.
 * Permite ingresar información como modelo, marca, motor, color, patente y cantidad de puertas.
 */

public class CargarAuto extends javax.swing.JFrame {
     /**
     * Controladora de la lógica del negocio para gestionar las operaciones con automóviles.
     */
    ControladoraLogica control = new ControladoraLogica();
    
    public CargarAuto() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTotal = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        panelInput = new javax.swing.JPanel();
        labelModelo = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        labelMarca = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        labelMotor = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        txtPatente = new javax.swing.JTextField();
        labelCantidad = new javax.swing.JLabel();
        comboMotor = new javax.swing.JComboBox<>();
        labelPatente = new javax.swing.JLabel();
        comboPuertas = new javax.swing.JComboBox<>();
        labelColor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelBotones = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelTotal.setBackground(new java.awt.Color(204, 204, 204));

        panelTitulo.setBackground(new java.awt.Color(0, 0, 0));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logoAuto (1).png"))); // NOI18N

        titulo.setBackground(new java.awt.Color(0, 0, 0));
        titulo.setFont(new java.awt.Font("Sitka Heading", 3, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("CARGAR AUTO");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(225, 225, 225)
                .addComponent(titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTituloLayout.createSequentialGroup()
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTituloLayout.createSequentialGroup()
                        .addComponent(titulo)
                        .addGap(20, 20, 20))))
        );

        panelInput.setBackground(new java.awt.Color(204, 204, 204));

        labelModelo.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        labelModelo.setForeground(new java.awt.Color(0, 0, 0));
        labelModelo.setText("Modelo: ");

        txtModelo.setBackground(new java.awt.Color(255, 255, 255));
        txtModelo.setForeground(new java.awt.Color(0, 0, 0));
        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });

        labelMarca.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        labelMarca.setForeground(new java.awt.Color(0, 0, 0));
        labelMarca.setText("Marca:");

        txtMarca.setBackground(new java.awt.Color(255, 255, 255));
        txtMarca.setForeground(new java.awt.Color(0, 0, 0));

        labelMotor.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        labelMotor.setForeground(new java.awt.Color(0, 0, 0));
        labelMotor.setText("Motor:");

        txtColor.setBackground(new java.awt.Color(255, 255, 255));
        txtColor.setForeground(new java.awt.Color(0, 0, 0));

        txtPatente.setBackground(new java.awt.Color(255, 255, 255));
        txtPatente.setForeground(new java.awt.Color(0, 0, 0));

        labelCantidad.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        labelCantidad.setForeground(new java.awt.Color(0, 0, 0));
        labelCantidad.setText("Cantidad de Puertas:");

        comboMotor.setBackground(new java.awt.Color(255, 255, 255));
        comboMotor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1.0L - 1.6L", "1.8L - 2.5L", "3.0L o más" }));

        labelPatente.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        labelPatente.setForeground(new java.awt.Color(0, 0, 0));
        labelPatente.setText("Patente:");

        comboPuertas.setBackground(new java.awt.Color(255, 255, 255));
        comboPuertas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "2", "3", "4", "5" }));

        labelColor.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        labelColor.setForeground(new java.awt.Color(0, 0, 0));
        labelColor.setText("Color:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ACLARACIÓN:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Si el auto es nuevo, dejar la patente vacía.");

        javax.swing.GroupLayout panelInputLayout = new javax.swing.GroupLayout(panelInput);
        panelInput.setLayout(panelInputLayout);
        panelInputLayout.setHorizontalGroup(
            panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInputLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelInputLayout.createSequentialGroup()
                        .addComponent(labelCantidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelInputLayout.createSequentialGroup()
                        .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelModelo)
                            .addComponent(labelMarca))
                        .addGap(99, 99, 99)
                        .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(labelColor)
                    .addGroup(panelInputLayout.createSequentialGroup()
                        .addComponent(labelPatente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInputLayout.createSequentialGroup()
                        .addComponent(labelMotor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtColor)
                            .addComponent(comboMotor, 0, 133, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        panelInputLayout.setVerticalGroup(
            panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelModelo)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMarca))
                .addGap(31, 31, 31)
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMotor)
                    .addComponent(comboMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelColor)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPatente)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCantidad)
                    .addComponent(comboPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        panelBotones.setBackground(new java.awt.Color(204, 204, 204));

        btnGuardar.setBackground(new java.awt.Color(0, 0, 0));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/save.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/clear.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(0, 0, 0));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
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
                .addGap(26, 26, 26)
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelTotalLayout = new javax.swing.GroupLayout(panelTotal);
        panelTotal.setLayout(panelTotalLayout);
        panelTotalLayout.setHorizontalGroup(
            panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelTotalLayout.createSequentialGroup()
                .addComponent(panelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelTotalLayout.setVerticalGroup(
            panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTotalLayout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelTotalLayout.createSequentialGroup()
                        .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed

    }//GEN-LAST:event_txtModeloActionPerformed
    
    
    /**
     * Maneja el evento del botón Volver.
     * Cierra la ventana actual y muestra la ventana principal.
     * @param evt Evento de acción
     */
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose(); 
        Principal menu = new Principal();
        menu.setVisible(true); 
        menu.setLocationRelativeTo(null); 
        
    }//GEN-LAST:event_btnVolverActionPerformed
     
    /**
     * Maneja el evento del botón Guardar.
     * Recoge los datos ingresados y los envía a la controladora para su almacenamiento.
     * @param evt Evento de acción
     */
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String modelo = txtModelo.getText();
        String marca = txtMarca.getText();
        String motor = (String) comboMotor.getSelectedItem(); 
        String color = txtColor.getText();
        String patente = txtPatente.getText();
        String cantidadPuertas = (String) comboPuertas.getSelectedItem();
         
        control.guardarDatos(modelo,marca,motor,color,patente,cantidadPuertas);
    }//GEN-LAST:event_btnGuardarActionPerformed

    
     /**
     * Maneja el evento del botón Limpiar.
     * Restablece todos los campos del formulario a sus valores por defecto.
     * @param evt Evento de acción
     */
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtModelo.setText("");
        txtMarca.setText("");
        comboMotor.setSelectedIndex(0);
        txtColor.setText("");
        txtPatente.setText("");
        comboPuertas.setSelectedIndex(0);

    }//GEN-LAST:event_btnLimpiarActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> comboMotor;
    private javax.swing.JComboBox<String> comboPuertas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelCantidad;
    private javax.swing.JLabel labelColor;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JLabel labelMotor;
    private javax.swing.JLabel labelPatente;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelInput;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JPanel panelTotal;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPatente;
    // End of variables declaration//GEN-END:variables
}
