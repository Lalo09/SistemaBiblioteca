/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views;

import Data.FunctionsBook;
import Data.FunctionsClient;
import Data.FunctionsRent;
import Logic.ClassBook;
import Logic.ClassClient;
import Logic.ClassRent;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eduardo
 */
public class PanelReportes extends javax.swing.JPanel {

    DefaultTableModel modeloTablaLibros = new DefaultTableModel();
    DefaultTableModel modeloTablaCliente = new DefaultTableModel();
    DefaultTableModel modeloTablaRenta = new DefaultTableModel();
    /**
     * Creates new form PanelReportes
     */
    public PanelReportes() {
        initComponents();
        CargarColumnasLibro();
        CargarColumnasCliente();
        CargarColumnasRenta();
        lblIdCategorias.setVisible(false);
        lblIdClientes.setVisible(false);
        lblidRentas.setVisible(false);
    }
    
    private void CargarColumnasLibro(){
       modeloTablaLibros.addColumn("id");
       modeloTablaLibros.addColumn("Titulo");
       modeloTablaLibros.addColumn("Volumen");
       modeloTablaLibros.addColumn("Paginas");
       modeloTablaLibros.addColumn("Copias");
       modeloTablaLibros.addColumn("Precio renta");
       modeloTablaLibros.addColumn("Autor");
       modeloTablaLibros.addColumn("Editorial");
       modeloTablaLibros.addColumn("Categoria");
       
       FunctionsBook funcionesLibro = new FunctionsBook();
       ArrayList<ClassBook> lista = funcionesLibro.ReportBooks();
       
       int cantBooks =lista.size();
       modeloTablaLibros.setNumRows(cantBooks);
       for (int i = 0; i < cantBooks; i++) {
            ClassBook book = lista.get(i);
            modeloTablaLibros.setValueAt(book.getIdBook(), i, 0);
            modeloTablaLibros.setValueAt(book.getTitle(), i, 1);
            modeloTablaLibros.setValueAt(book.getVolume(), i, 2);
            modeloTablaLibros.setValueAt(book.getPages(), i, 3);
            modeloTablaLibros.setValueAt(book.getCopies(), i, 4);
            modeloTablaLibros.setValueAt(book.getRent_price(), i, 5);
            modeloTablaLibros.setValueAt(book.getAuthor(), i, 6);
            modeloTablaLibros.setValueAt(book.getEditorial(), i, 7);
            modeloTablaLibros.setValueAt(book.getCategoria(), i, 8);
        }
    }
    
    private void CargarColumnasCliente(){
       modeloTablaCliente.addColumn("id");
       modeloTablaCliente.addColumn("Nombre");
       modeloTablaCliente.addColumn("Apellidos");
       modeloTablaCliente.addColumn("Email");
       modeloTablaCliente.addColumn("Telefono");
       modeloTablaCliente.addColumn("Edad");
       modeloTablaCliente.addColumn("Calle");
       modeloTablaCliente.addColumn("Num int");
       modeloTablaCliente.addColumn("Num ext");
       modeloTablaCliente.addColumn("Ciudad");
       modeloTablaCliente.addColumn("Estado");
       modeloTablaCliente.addColumn("Pais");
       
       FunctionsClient funcionesCliente = new FunctionsClient();
       ArrayList<ClassClient> lista = funcionesCliente.ShowClients();
       
       int cantCliente =lista.size();
       modeloTablaCliente.setNumRows(cantCliente);
       for (int i = 0; i < cantCliente; i++) {
            ClassClient cliente = lista.get(i);
            modeloTablaCliente.setValueAt(cliente.getId(), i, 0);
            modeloTablaCliente.setValueAt(cliente.getName(), i, 1);
            modeloTablaCliente.setValueAt(cliente.getLast_name(), i, 2);
            modeloTablaCliente.setValueAt(cliente.getEmail(), i, 3);
            modeloTablaCliente.setValueAt(cliente.getPhone(), i, 4);
            modeloTablaCliente.setValueAt(cliente.getAge(), i, 5);
            modeloTablaCliente.setValueAt(cliente.getStreet(), i, 6);
            modeloTablaCliente.setValueAt(cliente.getNum_int(), i, 7);
            modeloTablaCliente.setValueAt(cliente.getNum_ext(), i, 8);
            modeloTablaCliente.setValueAt(cliente.getCity(), i, 9);
            modeloTablaCliente.setValueAt(cliente.getState(), i, 10);
            modeloTablaCliente.setValueAt(cliente.getCountry(), i, 11);
        }
    }
    
    private void CargarColumnasRenta(){
       modeloTablaRenta.addColumn("id");
       modeloTablaRenta.addColumn("Total");
       modeloTablaRenta.addColumn("Fecha renta");
       modeloTablaRenta.addColumn("Fecha devolucion");
       modeloTablaRenta.addColumn("Status");
       modeloTablaRenta.addColumn("Cliente");
       modeloTablaRenta.addColumn("Notas");
       
       FunctionsRent funcionesRenta = new FunctionsRent();
       ArrayList<ClassRent> lista = funcionesRenta.ReportRent();
       
       int cantBooks =lista.size();
       modeloTablaRenta.setNumRows(cantBooks);
       for (int i = 0; i < cantBooks; i++) {
            ClassRent rent = lista.get(i);
            modeloTablaRenta.setValueAt(rent.getId_rent(), i, 0);
            modeloTablaRenta.setValueAt(rent.getTotal(), i, 1);
            modeloTablaRenta.setValueAt(rent.getRent_date(), i, 2);
            modeloTablaRenta.setValueAt(rent.getReturn_date(), i, 3);
            modeloTablaRenta.setValueAt(rent.getStatus(), i, 4);
            modeloTablaRenta.setValueAt(rent.getClient(), i, 5);
            modeloTablaRenta.setValueAt(rent.getNotes(), i, 6);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        PanelUsuarios = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaLibros = new javax.swing.JTable();
        btnSaveCategoria = new javax.swing.JPanel();
        btnReporteLibros = new javax.swing.JLabel();
        btnLimpiarCategoria = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        lblIdCategorias = new javax.swing.JLabel();
        PanelUsuarios2 = new javax.swing.JPanel();
        lblTitulo3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaRentas = new javax.swing.JTable();
        btnReporteRentas = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnLimpiarCategoria1 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        lblidRentas = new javax.swing.JLabel();
        PanelUsuarios3 = new javax.swing.JPanel();
        lblTitulo4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TablaClientes = new javax.swing.JTable();
        btnReporteLibro = new javax.swing.JPanel();
        btnReporteClientes = new javax.swing.JLabel();
        btnLimpiarCategoria2 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        lblIdClientes = new javax.swing.JLabel();

        PanelUsuarios.setBackground(new java.awt.Color(244, 244, 244));
        PanelUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Reporte de libros");
        PanelUsuarios.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 460, 40));

        TablaLibros.setModel(modeloTablaLibros);
        TablaLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaLibrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaLibros);

        PanelUsuarios.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 730, 440));

        btnSaveCategoria.setBackground(new java.awt.Color(85, 211, 128));
        btnSaveCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSaveCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveCategoriaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaveCategoriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSaveCategoriaMouseExited(evt);
            }
        });

        btnReporteLibros.setForeground(new java.awt.Color(253, 251, 251));
        btnReporteLibros.setText("Generar reporte");

        javax.swing.GroupLayout btnSaveCategoriaLayout = new javax.swing.GroupLayout(btnSaveCategoria);
        btnSaveCategoria.setLayout(btnSaveCategoriaLayout);
        btnSaveCategoriaLayout.setHorizontalGroup(
            btnSaveCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSaveCategoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteLibros, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnSaveCategoriaLayout.setVerticalGroup(
            btnSaveCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSaveCategoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteLibros, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelUsuarios.add(btnSaveCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 530, 150, 60));

        btnLimpiarCategoria.setBackground(new java.awt.Color(151, 151, 151));
        btnLimpiarCategoria.setForeground(new java.awt.Color(254, 254, 254));
        btnLimpiarCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarCategoriaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarCategoriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarCategoriaMouseExited(evt);
            }
        });

        jLabel20.setBackground(new java.awt.Color(151, 151, 151));
        jLabel20.setForeground(new java.awt.Color(151, 151, 151));
        jLabel20.setIcon(new javax.swing.ImageIcon("/resources/clean.png")); // NOI18N

        javax.swing.GroupLayout btnLimpiarCategoriaLayout = new javax.swing.GroupLayout(btnLimpiarCategoria);
        btnLimpiarCategoria.setLayout(btnLimpiarCategoriaLayout);
        btnLimpiarCategoriaLayout.setHorizontalGroup(
            btnLimpiarCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLimpiarCategoriaLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(30, 30, 30))
        );
        btnLimpiarCategoriaLayout.setVerticalGroup(
            btnLimpiarCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLimpiarCategoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelUsuarios.add(btnLimpiarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 530, 100, 60));

        lblIdCategorias.setText("0");
        PanelUsuarios.add(lblIdCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, -1, -1));

        jTabbedPane1.addTab("Reporte de libros", PanelUsuarios);

        PanelUsuarios2.setBackground(new java.awt.Color(244, 244, 244));
        PanelUsuarios2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo3.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lblTitulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo3.setText("Reporte de rentas");
        PanelUsuarios2.add(lblTitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 460, 40));

        TablaRentas.setModel(modeloTablaRenta);
        TablaRentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaRentasMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TablaRentas);

        PanelUsuarios2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 730, 440));

        btnReporteRentas.setBackground(new java.awt.Color(85, 211, 128));
        btnReporteRentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReporteRentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReporteRentasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReporteRentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReporteRentasMouseExited(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(253, 251, 251));
        jLabel2.setText("Generar reporte");

        javax.swing.GroupLayout btnReporteRentasLayout = new javax.swing.GroupLayout(btnReporteRentas);
        btnReporteRentas.setLayout(btnReporteRentasLayout);
        btnReporteRentasLayout.setHorizontalGroup(
            btnReporteRentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnReporteRentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnReporteRentasLayout.setVerticalGroup(
            btnReporteRentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReporteRentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelUsuarios2.add(btnReporteRentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 530, 150, 60));

        btnLimpiarCategoria1.setBackground(new java.awt.Color(151, 151, 151));
        btnLimpiarCategoria1.setForeground(new java.awt.Color(254, 254, 254));
        btnLimpiarCategoria1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarCategoria1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarCategoria1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarCategoria1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarCategoria1MouseExited(evt);
            }
        });

        jLabel24.setBackground(new java.awt.Color(151, 151, 151));
        jLabel24.setForeground(new java.awt.Color(151, 151, 151));
        jLabel24.setIcon(new javax.swing.ImageIcon("/resources/clean.png")); // NOI18N

        javax.swing.GroupLayout btnLimpiarCategoria1Layout = new javax.swing.GroupLayout(btnLimpiarCategoria1);
        btnLimpiarCategoria1.setLayout(btnLimpiarCategoria1Layout);
        btnLimpiarCategoria1Layout.setHorizontalGroup(
            btnLimpiarCategoria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLimpiarCategoria1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(30, 30, 30))
        );
        btnLimpiarCategoria1Layout.setVerticalGroup(
            btnLimpiarCategoria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLimpiarCategoria1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelUsuarios2.add(btnLimpiarCategoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 530, 100, 60));

        lblidRentas.setText("0");
        PanelUsuarios2.add(lblidRentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, -1, -1));

        jTabbedPane1.addTab("Reporte de rentas", PanelUsuarios2);

        PanelUsuarios3.setBackground(new java.awt.Color(244, 244, 244));
        PanelUsuarios3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo4.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lblTitulo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo4.setText("Reporte de clientes");
        PanelUsuarios3.add(lblTitulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 460, 40));

        TablaClientes.setModel(modeloTablaCliente);
        TablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaClientesMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(TablaClientes);

        PanelUsuarios3.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 730, 440));

        btnReporteLibro.setBackground(new java.awt.Color(85, 211, 128));
        btnReporteLibro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReporteLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReporteLibroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReporteLibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReporteLibroMouseExited(evt);
            }
        });

        btnReporteClientes.setForeground(new java.awt.Color(253, 251, 251));
        btnReporteClientes.setText("Generar reporte");

        javax.swing.GroupLayout btnReporteLibroLayout = new javax.swing.GroupLayout(btnReporteLibro);
        btnReporteLibro.setLayout(btnReporteLibroLayout);
        btnReporteLibroLayout.setHorizontalGroup(
            btnReporteLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnReporteLibroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnReporteLibroLayout.setVerticalGroup(
            btnReporteLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReporteLibroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelUsuarios3.add(btnReporteLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 530, 150, 60));

        btnLimpiarCategoria2.setBackground(new java.awt.Color(151, 151, 151));
        btnLimpiarCategoria2.setForeground(new java.awt.Color(254, 254, 254));
        btnLimpiarCategoria2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarCategoria2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarCategoria2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarCategoria2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarCategoria2MouseExited(evt);
            }
        });

        jLabel25.setBackground(new java.awt.Color(151, 151, 151));
        jLabel25.setForeground(new java.awt.Color(151, 151, 151));
        jLabel25.setIcon(new javax.swing.ImageIcon("/resources/clean.png")); // NOI18N

        javax.swing.GroupLayout btnLimpiarCategoria2Layout = new javax.swing.GroupLayout(btnLimpiarCategoria2);
        btnLimpiarCategoria2.setLayout(btnLimpiarCategoria2Layout);
        btnLimpiarCategoria2Layout.setHorizontalGroup(
            btnLimpiarCategoria2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLimpiarCategoria2Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addGap(30, 30, 30))
        );
        btnLimpiarCategoria2Layout.setVerticalGroup(
            btnLimpiarCategoria2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLimpiarCategoria2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelUsuarios3.add(btnLimpiarCategoria2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 530, 100, 60));

        lblIdClientes.setText("0");
        PanelUsuarios3.add(lblIdClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, -1, -1));

        jTabbedPane1.addTab("Reporte de clientes", PanelUsuarios3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarCategoriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarCategoriaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarCategoriaMouseExited

    private void btnLimpiarCategoriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarCategoriaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarCategoriaMouseEntered

    private void btnLimpiarCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarCategoriaMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnLimpiarCategoriaMouseClicked

    private void TablaLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaLibrosMouseClicked
        
    }//GEN-LAST:event_TablaLibrosMouseClicked

    private void btnSaveCategoriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveCategoriaMouseExited
        btnSaveCategoria.setBackground(new Color(85,211,128));
    }//GEN-LAST:event_btnSaveCategoriaMouseExited

    private void btnSaveCategoriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveCategoriaMouseEntered
        btnSaveCategoria.setBackground(new Color(63,162,97));
    }//GEN-LAST:event_btnSaveCategoriaMouseEntered

    private void btnSaveCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveCategoriaMouseClicked
       
    }//GEN-LAST:event_btnSaveCategoriaMouseClicked

    private void TablaRentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaRentasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TablaRentasMouseClicked

    private void btnReporteRentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporteRentasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReporteRentasMouseClicked

    private void btnReporteRentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporteRentasMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReporteRentasMouseEntered

    private void btnReporteRentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporteRentasMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReporteRentasMouseExited

    private void btnLimpiarCategoria1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarCategoria1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarCategoria1MouseClicked

    private void btnLimpiarCategoria1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarCategoria1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarCategoria1MouseEntered

    private void btnLimpiarCategoria1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarCategoria1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarCategoria1MouseExited

    private void TablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaClientesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TablaClientesMouseClicked

    private void btnReporteLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporteLibroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReporteLibroMouseClicked

    private void btnReporteLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporteLibroMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReporteLibroMouseEntered

    private void btnReporteLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporteLibroMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReporteLibroMouseExited

    private void btnLimpiarCategoria2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarCategoria2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarCategoria2MouseClicked

    private void btnLimpiarCategoria2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarCategoria2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarCategoria2MouseEntered

    private void btnLimpiarCategoria2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarCategoria2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarCategoria2MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelUsuarios;
    private javax.swing.JPanel PanelUsuarios2;
    private javax.swing.JPanel PanelUsuarios3;
    private javax.swing.JTable TablaClientes;
    private javax.swing.JTable TablaLibros;
    private javax.swing.JTable TablaRentas;
    private javax.swing.JPanel btnLimpiarCategoria;
    private javax.swing.JPanel btnLimpiarCategoria1;
    private javax.swing.JPanel btnLimpiarCategoria2;
    private javax.swing.JLabel btnReporteClientes;
    private javax.swing.JPanel btnReporteLibro;
    private javax.swing.JLabel btnReporteLibros;
    private javax.swing.JPanel btnReporteRentas;
    private javax.swing.JPanel btnSaveCategoria;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblIdCategorias;
    private javax.swing.JLabel lblIdClientes;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo3;
    private javax.swing.JLabel lblTitulo4;
    private javax.swing.JLabel lblidRentas;
    // End of variables declaration//GEN-END:variables
}
