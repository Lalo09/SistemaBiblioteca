/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Logic.ClassBook;
import Data.FunctionsBook;
import java.util.ArrayList;
import javax.swing.table.TableModel;

/**
 *
 * @author eduardo
 */
public class PanelLibros extends javax.swing.JPanel {

    public static int idAutor = 0;
    public static int idEditorial = 0;
    public static int idCategory = 0;
    DefaultTableModel modeloTablaLibros = new DefaultTableModel();
    
    /**
     * Creates new form PanelLibros
     */
    public PanelLibros() {
        initComponents();
        CargarColumnasLibro();
        lblEditandoLibro.setVisible(false);
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
       /*
       TablaLibros.getColumnModel().getColumn(6).setMinWidth(0);
       TablaLibros.getColumnModel().getColumn(6).setMaxWidth(0);
       TablaLibros.getColumnModel().getColumn(6).setWidth(0);
       TablaLibros.getColumnModel().getColumn(7).setMinWidth(0);
       TablaLibros.getColumnModel().getColumn(7).setMaxWidth(0);
       TablaLibros.getColumnModel().getColumn(7).setWidth(0);
       TablaLibros.getColumnModel().getColumn(8).setMinWidth(0);
       TablaLibros.getColumnModel().getColumn(8).setMaxWidth(0);
       TablaLibros.getColumnModel().getColumn(8).setWidth(0);*/
       
       FunctionsBook funcionesLibro = new FunctionsBook();
       ArrayList<ClassBook> lista = funcionesLibro.ShowBooks();
       
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
            modeloTablaLibros.setValueAt(book.getId_author(), i, 6);
            modeloTablaLibros.setValueAt(book.getId_editorial(), i, 7);
            modeloTablaLibros.setValueAt(book.getId_category(), i, 8);
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

        jLabel8 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lblTitulo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtVolumen = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        txtPaginas = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        txtCopias = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        btnBuscar = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaLibros = new javax.swing.JTable();
        btnSave = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        btnClear = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        PanelForaneo = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtNombreAutor = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        txtNombreEditorial = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtNombreCategoria = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        lblAbrirPanelCategoria = new javax.swing.JLabel();
        lblAbrirPanelAutor1 = new javax.swing.JLabel();
        lblAbrirPanelEditorial = new javax.swing.JLabel();
        lblIdAutor = new javax.swing.JLabel();
        lblIdEditorial = new javax.swing.JLabel();
        lblIdCategoria = new javax.swing.JLabel();
        lblIdLibro = new javax.swing.JLabel();
        lblEditandoLibro = new javax.swing.JLabel();

        setBackground(new java.awt.Color(254, 254, 254));
        setPreferredSize(new java.awt.Dimension(890, 670));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(66, 62, 62));
        jLabel8.setText("Titulo");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        txtTitulo.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(68, 68, 68));
        txtTitulo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 320, 30));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 320, 10));

        lblTitulo.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Registro de Libros");
        add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 460, 40));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(66, 62, 62));
        jLabel9.setText("Volumen");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        txtVolumen.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtVolumen.setForeground(new java.awt.Color(68, 68, 68));
        txtVolumen.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(txtVolumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 150, 30));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 150, 10));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(66, 62, 62));
        jLabel10.setText("Paginas");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 70, -1));

        txtPaginas.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtPaginas.setForeground(new java.awt.Color(68, 68, 68));
        txtPaginas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(txtPaginas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 160, 30));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 160, 10));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(66, 62, 62));
        jLabel11.setText("Copias");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        txtCopias.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtCopias.setForeground(new java.awt.Color(68, 68, 68));
        txtCopias.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(txtCopias, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 150, 30));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 120, 10));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(66, 62, 62));
        jLabel12.setText("Precio renta");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, -1));

        txtPrecio.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(68, 68, 68));
        txtPrecio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 160, 30));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 160, 10));

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(66, 62, 62));
        jLabel17.setText("Buscar:");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 620, -1, -1));

        txtBuscar.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(68, 68, 68));
        txtBuscar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 620, 380, 30));
        add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 650, 380, 10));

        btnBuscar.setBackground(new java.awt.Color(211, 85, 139));
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarMouseExited(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(254, 254, 254));
        jLabel19.setIcon(new javax.swing.ImageIcon("/resources/login.png")); // NOI18N
        jLabel19.setText("Buscar");

        javax.swing.GroupLayout btnBuscarLayout = new javax.swing.GroupLayout(btnBuscar);
        btnBuscar.setLayout(btnBuscarLayout);
        btnBuscarLayout.setHorizontalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBuscarLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel19)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        btnBuscarLayout.setVerticalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 610, 160, 50));

        TablaLibros.setModel(modeloTablaLibros);
        TablaLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaLibrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaLibros);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 498, 780, 100));

        btnSave.setBackground(new java.awt.Color(85, 211, 128));
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSaveMouseExited(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setIcon(new javax.swing.ImageIcon("/resources/disquete.png")); // NOI18N

        javax.swing.GroupLayout btnSaveLayout = new javax.swing.GroupLayout(btnSave);
        btnSave.setLayout(btnSaveLayout);
        btnSaveLayout.setHorizontalGroup(
            btnSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSaveLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(32, 32, 32))
        );
        btnSaveLayout.setVerticalGroup(
            btnSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSaveLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 100, 50));

        btnDelete.setBackground(new java.awt.Color(255, 38, 0));
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(246, 1, 1));
        jLabel18.setForeground(new java.awt.Color(254, 254, 254));
        jLabel18.setIcon(new javax.swing.ImageIcon("/resources/delete.png")); // NOI18N

        javax.swing.GroupLayout btnDeleteLayout = new javax.swing.GroupLayout(btnDelete);
        btnDelete.setLayout(btnDeleteLayout);
        btnDeleteLayout.setHorizontalGroup(
            btnDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDeleteLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel18)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        btnDeleteLayout.setVerticalGroup(
            btnDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDeleteLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 100, 50));

        btnClear.setBackground(new java.awt.Color(151, 151, 151));
        btnClear.setForeground(new java.awt.Color(254, 254, 254));
        btnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClearMouseExited(evt);
            }
        });

        jLabel20.setBackground(new java.awt.Color(151, 151, 151));
        jLabel20.setForeground(new java.awt.Color(151, 151, 151));
        jLabel20.setIcon(new javax.swing.ImageIcon("/resources/clean.png")); // NOI18N

        javax.swing.GroupLayout btnClearLayout = new javax.swing.GroupLayout(btnClear);
        btnClear.setLayout(btnClearLayout);
        btnClearLayout.setHorizontalGroup(
            btnClearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnClearLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(32, 32, 32))
        );
        btnClearLayout.setVerticalGroup(
            btnClearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnClearLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, 100, 50));

        javax.swing.GroupLayout PanelForaneoLayout = new javax.swing.GroupLayout(PanelForaneo);
        PanelForaneo.setLayout(PanelForaneoLayout);
        PanelForaneoLayout.setHorizontalGroup(
            PanelForaneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        PanelForaneoLayout.setVerticalGroup(
            PanelForaneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        add(PanelForaneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 390, 280));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(66, 62, 62));
        jLabel13.setText("Autor");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        txtNombreAutor.setEditable(false);
        txtNombreAutor.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtNombreAutor.setForeground(new java.awt.Color(68, 68, 68));
        txtNombreAutor.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(txtNombreAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 270, 30));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 270, 10));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 270, 10));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(66, 62, 62));
        jLabel14.setText("Editorial");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        txtNombreEditorial.setEditable(false);
        txtNombreEditorial.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtNombreEditorial.setForeground(new java.awt.Color(68, 68, 68));
        txtNombreEditorial.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(txtNombreEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 270, 30));

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(66, 62, 62));
        jLabel15.setText("Categoria");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));

        txtNombreCategoria.setEditable(false);
        txtNombreCategoria.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtNombreCategoria.setForeground(new java.awt.Color(68, 68, 68));
        txtNombreCategoria.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(txtNombreCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 270, 30));
        add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 270, 10));

        lblAbrirPanelCategoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAbrirPanelCategoria.setIcon(new javax.swing.ImageIcon("/resources/plus.png")); // NOI18N
        lblAbrirPanelCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAbrirPanelCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAbrirPanelCategoriaMouseClicked(evt);
            }
        });
        add(lblAbrirPanelCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, -1, 40));

        lblAbrirPanelAutor1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAbrirPanelAutor1.setIcon(new javax.swing.ImageIcon("/resources/plus.png")); // NOI18N
        lblAbrirPanelAutor1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAbrirPanelAutor1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAbrirPanelAutor1MouseClicked(evt);
            }
        });
        add(lblAbrirPanelAutor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 308, -1, 40));

        lblAbrirPanelEditorial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAbrirPanelEditorial.setIcon(new javax.swing.ImageIcon("/resources/plus.png")); // NOI18N
        lblAbrirPanelEditorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAbrirPanelEditorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAbrirPanelEditorialMouseClicked(evt);
            }
        });
        add(lblAbrirPanelEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, -1, 40));

        lblIdAutor.setText("0");
        add(lblIdAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, -1, -1));

        lblIdEditorial.setText("0");
        add(lblIdEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, -1, -1));

        lblIdCategoria.setText("0");
        add(lblIdCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, -1, -1));

        lblIdLibro.setText("0");
        add(lblIdLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, -1, -1));

        lblEditandoLibro.setForeground(new java.awt.Color(255, 0, 0));
        lblEditandoLibro.setText("Editando a");
        add(lblEditandoLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarMouseExited

    private void TablaLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaLibrosMouseClicked
        int index = TablaLibros.getSelectedRow();
        TableModel model = TablaLibros.getModel();
        int id = Integer.parseInt(model.getValueAt(index,0).toString());
        String titulo = model.getValueAt(index,1).toString();
        String volumen = model.getValueAt(index,2).toString();
        int paginas = Integer.parseInt(model.getValueAt(index,3).toString());
        int copias = Integer.parseInt(model.getValueAt(index,4).toString());
        double precio = Double.parseDouble(model.getValueAt(index,5).toString());
        int autor = Integer.parseInt(model.getValueAt(index,6).toString());
        int editorial = Integer.parseInt(model.getValueAt(index,7).toString());
        int categoria = Integer.parseInt(model.getValueAt(index,8).toString());
        
        lblIdLibro.setText(""+id);
        txtTitulo.setText(titulo);
        txtVolumen.setText(volumen);
        txtPaginas.setText(""+paginas);
        txtCopias.setText(""+copias);
        txtPrecio.setText(""+precio);
        lblIdAutor.setText(""+autor);
        lblIdEditorial.setText(""+editorial);
        lblIdCategoria.setText(""+categoria);

        lblEditandoLibro.setVisible(true);
        lblEditandoLibro.setText("Editando informacion de "+titulo);
    }//GEN-LAST:event_TablaLibrosMouseClicked

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        String title = txtTitulo.getText().trim();
        String volume = txtVolumen.getText().trim();
        int pages = Integer.parseInt(txtCopias.getText().trim());
        int copies = Integer.parseInt(txtCopias.getText().trim());
        double price = Double.parseDouble(txtPrecio.getText().trim());
        int author = Integer.parseInt(lblIdAutor.getText().trim());
        int editorial = Integer.parseInt(lblIdEditorial.getText().trim());
        int category = Integer.parseInt(lblIdCategoria.getText().trim());

        ClassBook book = new ClassBook(Integer.parseInt(lblIdLibro.getText()), title, volume, pages, copies, price, author, editorial, category);
        FunctionsBook functions = new FunctionsBook();
                
        if (Integer.parseInt(lblIdLibro.getText()) == 0) {
            if (functions.SaveBook(book)) {
                JOptionPane.showMessageDialog(null,"Se ha registrado correctamente el libro"+title);
                LimpiarForm();
            }else{
                JOptionPane.showMessageDialog(null,"Error al registrar la informacion, compruebe los datos ingresados");
            }
        }else{
            if (functions.UpdateBook(book)) {
                JOptionPane.showMessageDialog(null,"Se ha actualizado correctamente la informacion del libro");
                LimpiarForm();
            }else{
                JOptionPane.showMessageDialog(null,"Error al aactualizar la informacion, compruebe los datos ingresados");
            }
        }
        
    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseEntered
        // TODO add your handling code here:
        btnSave.setBackground(new Color(63,162,97));
    }//GEN-LAST:event_btnSaveMouseEntered

    private void btnSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseExited
       
    }//GEN-LAST:event_btnSaveMouseExited

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        FunctionsBook functions = new FunctionsBook();

        if (functions.DeleteBook(Integer.parseInt(lblIdLibro.getText()))) {
            JOptionPane.showMessageDialog(null,"Libro eliminado correctamente");
            LimpiarForm();
        }else{
            JOptionPane.showMessageDialog(null,"No se puede eliminar este libro, contacte a su administrador de sistemas");
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteMouseExited

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        LimpiarForm();
    }//GEN-LAST:event_btnClearMouseClicked

    private void btnClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClearMouseEntered

    private void btnClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClearMouseExited

    private void lblAbrirPanelAutor1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAbrirPanelAutor1MouseClicked
        PanelAutores pautores = new PanelAutores();
        pautores.setSize(400, 300);
        pautores.setLocation(0, 0);
        
        PanelForaneo.removeAll();
        PanelForaneo.add(pautores, BorderLayout.CENTER);
        PanelForaneo.revalidate();
        PanelForaneo.repaint();
    }//GEN-LAST:event_lblAbrirPanelAutor1MouseClicked

    private void lblAbrirPanelEditorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAbrirPanelEditorialMouseClicked
        PanelEditoriales peditoriales = new PanelEditoriales();
        peditoriales.setSize(400, 300);
        peditoriales.setLocation(0, 0);
        
        PanelForaneo.removeAll();
        PanelForaneo.add(peditoriales, BorderLayout.CENTER);
        PanelForaneo.revalidate();
        PanelForaneo.repaint();
    }//GEN-LAST:event_lblAbrirPanelEditorialMouseClicked

    private void lblAbrirPanelCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAbrirPanelCategoriaMouseClicked
        PanelCategorias pcategorias = new PanelCategorias();
        pcategorias.setSize(400, 300);
        pcategorias.setLocation(0, 0);
        
        PanelForaneo.removeAll();
        PanelForaneo.add(pcategorias, BorderLayout.CENTER);
        PanelForaneo.revalidate();
        PanelForaneo.repaint();
    }//GEN-LAST:event_lblAbrirPanelCategoriaMouseClicked


    private void LimpiarForm(){
        modeloTablaLibros.setRowCount(0);
        modeloTablaLibros.setColumnCount(0);
        txtTitulo.setText("");
        txtVolumen.setText("");
        txtPaginas.setText("");
        txtCopias.setText("");
        txtPrecio.setText("");
        lblIdAutor.setText(""+0);
        lblIdEditorial.setText(""+0);
        lblIdCategoria.setText(""+0);
        CargarColumnasLibro();
        lblIdLibro.setText(""+0);
        lblEditandoLibro.setVisible(false);
        txtNombreAutor.setText("");
        txtNombreEditorial.setText("");
        txtNombreCategoria.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelForaneo;
    private javax.swing.JTable TablaLibros;
    private javax.swing.JPanel btnBuscar;
    private javax.swing.JPanel btnClear;
    private javax.swing.JPanel btnDelete;
    private javax.swing.JPanel btnSave;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblAbrirPanelAutor1;
    private javax.swing.JLabel lblAbrirPanelCategoria;
    private javax.swing.JLabel lblAbrirPanelEditorial;
    private javax.swing.JLabel lblEditandoLibro;
    public static javax.swing.JLabel lblIdAutor;
    public static javax.swing.JLabel lblIdCategoria;
    public static javax.swing.JLabel lblIdEditorial;
    private javax.swing.JLabel lblIdLibro;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCopias;
    public static javax.swing.JTextField txtNombreAutor;
    public static javax.swing.JTextField txtNombreCategoria;
    public static javax.swing.JTextField txtNombreEditorial;
    private javax.swing.JTextField txtPaginas;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtVolumen;
    // End of variables declaration//GEN-END:variables
}
