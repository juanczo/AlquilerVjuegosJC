/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juan C
 */
public class Clientes extends javax.swing.JFrame {

  ButtonGroup btnGr; 
  
    public Clientes() {
        initComponents();  
       cargaTablaClientes();
       cargaTablaAlquiler();  
       cargaTablaJuegos();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        BtnGuardar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtalquiCodigo = new javax.swing.JTextField();
        txtalquiFechaInicio = new javax.swing.JTextField();
        txtalquiFechaEntrega = new javax.swing.JTextField();
        txtalquiPrecioAlqui = new javax.swing.JTextField();
        txtalquiPrecioVenta = new javax.swing.JTextField();
        txtalquiCodigoJue = new javax.swing.JTextField();
        txtalquiCodigoCli = new javax.swing.JTextField();
        BtnGuardarAlqui = new javax.swing.JButton();
        BtnModificarAlqui = new javax.swing.JButton();
        BtnEliminarAlqui = new javax.swing.JButton();
        BtnLimpiarAlqui = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TblAlquiler = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        BtnGuardarJue = new javax.swing.JButton();
        BtnModificarJue = new javax.swing.JButton();
        BtnEmilinarJue = new javax.swing.JButton();
        BtnLimpiarJue = new javax.swing.JButton();
        TxtJueCodigoJuego = new javax.swing.JTextField();
        TxtJueTituloJue = new javax.swing.JTextField();
        TxtJueNombreJue = new javax.swing.JTextField();
        TxtJueAño = new javax.swing.JTextField();
        TxtJueProtago = new javax.swing.JTextField();
        TxtJueDirector = new javax.swing.JTextField();
        TxtJueProductor = new javax.swing.JTextField();
        TxtJueTecnol = new javax.swing.JTextField();
        TxtJuePrecio = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        TblJuegos = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clientes");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel3.setText("Cedula:");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Edad:");

        jLabel6.setText("Telefono:");

        jLabel7.setText("Direccion:");

        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        BtnModificar.setText("Modificar");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(25, 25, 25)
                                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(121, 121, 121))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnLimpiar)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGuardar)
                    .addComponent(BtnModificar)
                    .addComponent(BtnEliminar)
                    .addComponent(BtnLimpiar))
                .addGap(55, 55, 55))
        );

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Edad", "Telefono", "Direccion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Ingreso de Clientes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(402, 402, 402))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 59, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Clientes", jPanel2);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel15.setText("Codigo alquiler:");

        jLabel16.setText("Fecha de inicio:");

        jLabel17.setText("Fecha de entrega:");

        jLabel18.setText("Precio de alquiler:");

        jLabel19.setText("Precio de venta:");

        jLabel20.setText("Codigo dle juego:");

        jLabel21.setText("N documento del cliente:");

        txtalquiCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalquiCodigoActionPerformed(evt);
            }
        });

        txtalquiFechaInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalquiFechaInicioActionPerformed(evt);
            }
        });

        BtnGuardarAlqui.setText("Guardar");
        BtnGuardarAlqui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarAlquiActionPerformed(evt);
            }
        });

        BtnModificarAlqui.setText("Modificar");
        BtnModificarAlqui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarAlquiActionPerformed(evt);
            }
        });

        BtnEliminarAlqui.setText("Eliminar");
        BtnEliminarAlqui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarAlquiActionPerformed(evt);
            }
        });

        BtnLimpiarAlqui.setText("Limpiar");
        BtnLimpiarAlqui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarAlquiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(BtnGuardarAlqui)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnModificarAlqui)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnEliminarAlqui)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnLimpiarAlqui))
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel20))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtalquiFechaEntrega, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtalquiPrecioVenta)
                            .addComponent(txtalquiCodigoJue)
                            .addComponent(txtalquiPrecioAlqui)
                            .addComponent(txtalquiFechaInicio)
                            .addComponent(txtalquiCodigo)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(txtalquiCodigoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtalquiCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtalquiFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtalquiFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtalquiPrecioAlqui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtalquiPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtalquiCodigoJue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtalquiCodigoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGuardarAlqui)
                    .addComponent(BtnModificarAlqui)
                    .addComponent(BtnEliminarAlqui)
                    .addComponent(BtnLimpiarAlqui))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        TblAlquiler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo ", "Fecha inicio", "Fecha  entrega", "Precio alquiler", "Precio venta", "Codigo juego", "Codigo cliente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(TblAlquiler);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Renta de Videojuegos");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(397, 397, 397))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Alquiler", jPanel4);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel9.setText("Codigo juego:");

        jLabel10.setText("Titulo:");

        jLabel11.setText("Nombre:");

        jLabel12.setText("Año:");

        jLabel13.setText("Protagonista:");

        jLabel14.setText("Director:");

        jLabel22.setText("Productor:");

        jLabel23.setText("Tecnologia:");

        jLabel24.setText("Precio:");

        BtnGuardarJue.setText("Guardar");
        BtnGuardarJue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarJueActionPerformed(evt);
            }
        });

        BtnModificarJue.setText("Modificar");
        BtnModificarJue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarJueActionPerformed(evt);
            }
        });

        BtnEmilinarJue.setText("Eliminar");
        BtnEmilinarJue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEmilinarJueActionPerformed(evt);
            }
        });

        BtnLimpiarJue.setText("Limpiar");
        BtnLimpiarJue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarJueActionPerformed(evt);
            }
        });

        TxtJueTituloJue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtJueTituloJueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtJueProtago, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(TxtJueDirector)
                            .addComponent(TxtJueProductor)
                            .addComponent(TxtJueTecnol)
                            .addComponent(TxtJuePrecio)
                            .addComponent(TxtJueCodigoJuego, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxtJueTituloJue, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxtJueNombreJue, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxtJueAño, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(BtnGuardarJue)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnModificarJue)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnEmilinarJue)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnLimpiarJue)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TxtJueCodigoJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TxtJueTituloJue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TxtJueNombreJue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(TxtJueAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(TxtJueProtago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(TxtJueDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(TxtJueProductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(TxtJueTecnol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24)
                    .addComponent(TxtJuePrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGuardarJue)
                    .addComponent(BtnModificarJue)
                    .addComponent(BtnEmilinarJue)
                    .addComponent(BtnLimpiarJue))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        TblJuegos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo ", "Titulo", "Nombre", "Año", "Protagonista", "Director", "Productor", "Tecnologia", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(TblJuegos);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setText("Ingreso de Juegos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel25))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Juegos", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        int Cedula = Integer.parseInt(txtCedula.getText());
        String Nombre = txtNombre.getText();
        int Edad = Integer.parseInt(txtEdad.getText());
        int Telefono = Integer.parseInt(txtTelefono.getText());
        String Direccion = txtDireccion.getText();

        try{
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("INSERT INTO clientes (cedula_cli, nombre_cli, edad, telefono, direccion_cli) VALUES (?,?,?,?,?)");
            ps.setInt(1, Cedula);
            ps.setString(2, Nombre);
            ps.setInt(3, Edad);
            ps.setInt(4, Telefono);
            ps.setString(5, Direccion); 
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro guardado");
            limpiar(); 
            cargaTablaClientes();
            
            
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }

    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void txtalquiCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalquiCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtalquiCodigoActionPerformed

    private void txtalquiFechaInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalquiFechaInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtalquiFechaInicioActionPerformed

    private void BtnGuardarAlquiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarAlquiActionPerformed
        
       int id_alqui = Integer.parseInt(txtalquiCodigo.getText());   
       String fecha_inicio = txtalquiFechaInicio.getText();  
       String fecha_entrega = txtalquiFechaEntrega.getText(); 
       int valor_alqui = Integer.parseInt(txtalquiPrecioAlqui.getText());
       int valor_venta = Integer.parseInt(txtalquiPrecioVenta.getText()); 
       int codigo_jue1 = Integer.parseInt(txtalquiCodigoJue.getText()); 
       int cedula_cli3 = Integer.parseInt(txtalquiCodigoCli.getText());

        try{
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("INSERT INTO alquiler (id_alqui, fecha_inicio, fecha_entrega, valor_alqui, valor_venta, codigo_jue1, cedula_cli3) VALUES (?,?,?,?,?,?,?)");
            ps.setInt(1, id_alqui);
            ps.setString(2, fecha_inicio);
            ps.setString(3, fecha_entrega);
            ps.setInt(4, valor_alqui);
            ps.setInt(5, valor_venta);   
            ps.setInt(6, codigo_jue1);
            ps.setInt(7, cedula_cli3);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro guardado");
            limpiar();   
            cargaTablaAlquiler();
            
            
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_BtnGuardarAlquiActionPerformed

    private void BtnModificarAlquiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarAlquiActionPerformed
         int id_alqui = Integer.parseInt(txtalquiCodigo.getText());   
       String fecha_inicio = txtalquiFechaInicio.getText();  
       String fecha_entrega = txtalquiFechaEntrega.getText(); 
       int valor_alqui = Integer.parseInt(txtalquiPrecioAlqui.getText());
       int valor_venta = Integer.parseInt(txtalquiPrecioVenta.getText()); 
       int codigo_jue1 = Integer.parseInt(txtalquiCodigoJue.getText()); 
       int cedula_cli3 = Integer.parseInt(txtalquiCodigoCli.getText());

        try{
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("UPDATE alquiler SET id_alqui=?, fecha_inicio=?, fecha_entrega=?, valor_alqui=?, valor_venta=?, codigo_jue1=?, cedula_cli3=? WHERE id_alqui=?"); 
            ps.setInt(1, id_alqui);
            ps.setString(2, fecha_inicio);
            ps.setString(3, fecha_entrega);
            ps.setInt(4, valor_alqui);
            ps.setInt(5, valor_venta);   
            ps.setInt(6, codigo_jue1);
            ps.setInt(7, cedula_cli3);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Modificado");
            limpiar();   
            cargaTablaAlquiler();
            
            
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_BtnModificarAlquiActionPerformed

    private void TxtJueTituloJueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtJueTituloJueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtJueTituloJueActionPerformed

    private void BtnGuardarJueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarJueActionPerformed
         
       int codigo_jue = Integer.parseInt(TxtJueCodigoJuego.getText()); 
       String titulo_jue = TxtJueTituloJue.getText(); 
       String Nombre_jue = TxtJueNombreJue.getText(); 
       String año_jue = TxtJueAño.getText(); 
       String protagonista_jue = TxtJueProtago.getText(); 
       String director_jue = TxtJueDirector.getText(); 
       String productor_jue = TxtJueProductor.getText(); 
       String tecnologia_jue = TxtJueTecnol.getText();   
       int valor_jue = Integer.parseInt(TxtJuePrecio.getText());
       

        try{
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("INSERT INTO juegos (codigo_jue, Titulo_jue, Nombre_jue, año_jue, protagonista_jue, director_jue, productor_jue, tecnologia_jue, valor_jue) VALUES (?,?,?,?,?,?,?,?,?)");
            ps.setInt(1, codigo_jue);
            ps.setString(2, titulo_jue);
            ps.setString(3, Nombre_jue);
            ps.setString(4, año_jue);
            ps.setString(5, protagonista_jue); 
            ps.setString(6, director_jue); 
            ps.setString(7, productor_jue); 
            ps.setString(8, tecnologia_jue);
            ps.setInt(9, valor_jue);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro guardado");
            limpiar(); 
            cargaTablaJuegos();
            
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }

    }//GEN-LAST:event_BtnGuardarJueActionPerformed

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked

        
    }//GEN-LAST:event_tblClientesMouseClicked

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
          int Cedula = Integer.parseInt(txtCedula.getText());
        String Nombre = txtNombre.getText();
        int Edad = Integer.parseInt(txtEdad.getText());
        int Telefono = Integer.parseInt(txtTelefono.getText());
        String Direccion = txtDireccion.getText();

        try{
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("UPDATE clientes SET cedula_cli=?, nombre_cli=?, edad=?, telefono=?, direccion_cli=? where cedula_cli=?");
            ps.setInt(1, Cedula);
            ps.setString(2, Nombre);
            ps.setInt(3, Edad);
            ps.setInt(4, Telefono);
            ps.setString(5, Direccion); 
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro modificado");
            limpiar(); 
            cargaTablaClientes();
            
            
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }

    
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
          int Cedula = Integer.parseInt(txtCedula.getText());
       
        try{
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("DELETE FROM clientes WHERE cedula_cli=?");
            ps.setInt(1, Cedula); 
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Eliminado");
            limpiar(); 
            cargaTablaClientes();
            
            
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }

    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
       limpiar();
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BtnLimpiarAlquiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarAlquiActionPerformed
         limpiar();
    }//GEN-LAST:event_BtnLimpiarAlquiActionPerformed

    private void BtnLimpiarJueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarJueActionPerformed
        limpiar();
    }//GEN-LAST:event_BtnLimpiarJueActionPerformed

    private void BtnModificarJueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarJueActionPerformed
         int codigo_jue = Integer.parseInt(TxtJueCodigoJuego.getText()); 
       String titulo_jue = TxtJueTituloJue.getText(); 
       String Nombre_jue = TxtJueNombreJue.getText(); 
       String año_jue = TxtJueAño.getText(); 
       String protagonista_jue = TxtJueProtago.getText(); 
       String director_jue = TxtJueDirector.getText(); 
       String productor_jue = TxtJueProductor.getText(); 
       String tecnologia_jue = TxtJueTecnol.getText();   
       int valor_jue = Integer.parseInt(TxtJuePrecio.getText());
       

        try{
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("UPDATE  juegos SET codigo_jue=?, Titulo_jue=?, Nombre_jue=?, año_jue=?, protagonista_jue=?, director_jue=?, productor_jue=?, tecnologia_jue=?, valor_jue=? WHERE codigo_jue?");
            ps.setInt(1, codigo_jue);
            ps.setString(2, titulo_jue);
            ps.setString(3, Nombre_jue);
            ps.setString(4, año_jue);
            ps.setString(5, protagonista_jue); 
            ps.setString(6, director_jue); 
            ps.setString(7, productor_jue); 
            ps.setString(8, tecnologia_jue);
            ps.setInt(9, valor_jue);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Modificado");
            limpiar(); 
            cargaTablaJuegos();
            
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }

    }//GEN-LAST:event_BtnModificarJueActionPerformed

    private void BtnEmilinarJueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEmilinarJueActionPerformed
          int codigo_jue = Integer.parseInt(TxtJueCodigoJuego.getText()); 
      
       

        try{
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("DELETE FROM  juegos WHERE codigo_jue=?");
            ps.setInt(1, codigo_jue);
        
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro eliminado");
            limpiar(); 
            cargaTablaJuegos();
            
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }

    }//GEN-LAST:event_BtnEmilinarJueActionPerformed

    private void BtnEliminarAlquiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarAlquiActionPerformed
          int id_alqui = Integer.parseInt(txtalquiCodigo.getText());   

        try{
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("DELETE FROM alquiler WHERE id_alqui=?"); 
            ps.setInt(1, id_alqui);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Eliminado");
            limpiar();   
            cargaTablaAlquiler();
            
            
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_BtnEliminarAlquiActionPerformed
    
    private void limpiar(){ 
        txtCedula.setText(""); 
        txtNombre.setText(""); 
        txtEdad.setText(""); 
        txtTelefono.setText(""); 
        txtDireccion.setText(""); 
        btnGr.clearSelection();
    }
   
    private void cargaTablaClientes(){ 
    DefaultTableModel modeloTabla = (DefaultTableModel) tblClientes.getModel(); 
    modeloTabla.setRowCount(0);
    
    PreparedStatement ps; 
    ResultSet rs; 
    ResultSetMetaData rsmd; 
    int columnas;   
    
    try{ 
        Connection con = Conexion.getConexion(); 
        ps = con.prepareStatement("SELECT cedula_cli, nombre_cli, edad, telefono, direccion_cli FROM clientes ");
       rs = ps.executeQuery();
       rsmd = rs.getMetaData();  
       columnas = rsmd.getColumnCount();
       
       while(rs.next()){ 
           Object[] fila = new Object[columnas];  
           for (int indice=0; indice<columnas; indice++){ 
           fila[indice] = rs.getObject(indice + 1);
           }
           modeloTabla.addRow(fila);
       }
       
    }  catch (SQLException e){ 
        JOptionPane.showMessageDialog(null, e.toString());
    }
    } 
    
    
      private void cargaTablaAlquiler(){ 
    DefaultTableModel modeloTabla = (DefaultTableModel) TblAlquiler.getModel(); 
    modeloTabla.setRowCount(0);
    
    PreparedStatement ps; 
    ResultSet rs; 
    ResultSetMetaData rsmd; 
    int columnas;   
    
    try{ 
        Connection con = Conexion.getConexion(); 
        ps = con.prepareStatement("SELECT id_alqui, fecha_inicio, fecha_entrega, valor_alqui, valor_venta, codigo_jue1, cedula_cli3 FROM alquiler ");
       rs = ps.executeQuery();
       rsmd = rs.getMetaData();  
       columnas = rsmd.getColumnCount();
       
       while(rs.next()){ 
           Object[] fila = new Object[columnas];  
           for (int indice=0; indice<columnas; indice++){ 
           fila[indice] = rs.getObject(indice + 1);
           }
           modeloTabla.addRow(fila);
       }
       
    }  catch (SQLException e){ 
        JOptionPane.showMessageDialog(null, e.toString());
    }
    }   
      
      
      
      private void cargaTablaJuegos(){ 
    DefaultTableModel modeloTabla = (DefaultTableModel) TblJuegos.getModel(); 
    modeloTabla.setRowCount(0);
    
    PreparedStatement ps; 
    ResultSet rs; 
    ResultSetMetaData rsmd; 
    int columnas;   
    
    try{ 
        Connection con = Conexion.getConexion(); 
        ps = con.prepareStatement("SELECT codigo_jue, Titulo_jue, Nombre_jue, año_jue, protagonista_jue, director_jue, productor_jue, tecnologia_jue, valor_jue FROM juegos ");
       rs = ps.executeQuery();
       rsmd = rs.getMetaData();  
       columnas = rsmd.getColumnCount();
       
       while(rs.next()){ 
           Object[] fila = new Object[columnas];  
           for (int indice=0; indice<columnas; indice++){ 
           fila[indice] = rs.getObject(indice + 1);
           }
           modeloTabla.addRow(fila);
       }
       
    }  catch (SQLException e){ 
        JOptionPane.showMessageDialog(null, e.toString());
    }
    } 
      
      
      
      
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnEliminarAlqui;
    private javax.swing.JButton BtnEmilinarJue;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnGuardarAlqui;
    private javax.swing.JButton BtnGuardarJue;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnLimpiarAlqui;
    private javax.swing.JButton BtnLimpiarJue;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnModificarAlqui;
    private javax.swing.JButton BtnModificarJue;
    private javax.swing.JTable TblAlquiler;
    private javax.swing.JTable TblJuegos;
    private javax.swing.JTextField TxtJueAño;
    private javax.swing.JTextField TxtJueCodigoJuego;
    private javax.swing.JTextField TxtJueDirector;
    private javax.swing.JTextField TxtJueNombreJue;
    private javax.swing.JTextField TxtJuePrecio;
    private javax.swing.JTextField TxtJueProductor;
    private javax.swing.JTextField TxtJueProtago;
    private javax.swing.JTextField TxtJueTecnol;
    private javax.swing.JTextField TxtJueTituloJue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtalquiCodigo;
    private javax.swing.JTextField txtalquiCodigoCli;
    private javax.swing.JTextField txtalquiCodigoJue;
    private javax.swing.JTextField txtalquiFechaEntrega;
    private javax.swing.JTextField txtalquiFechaInicio;
    private javax.swing.JTextField txtalquiPrecioAlqui;
    private javax.swing.JTextField txtalquiPrecioVenta;
    // End of variables declaration//GEN-END:variables
}
