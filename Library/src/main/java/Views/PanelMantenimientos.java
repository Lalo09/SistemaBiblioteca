/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views;

import java.awt.Color;
import Logic.ClassCategory;
import Logic.ClassEditorial;
import Logic.ClassAuthor;
import Logic.ClassUser;
import Data.FunctionsCategory;
import Data.FunctionsEditorial;
import Data.FunctionsAutor;
import Data.FunctionsUser;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
*Notas:
*En cada crud implementar funcionalidad de:
*   Insertar - Create
*   Mostrar  -  Read
*   Actualizar - Update
*   Eliminar  -  Delete
*
*   Solo en libros y clientes implementar la funcionalidad de buscar
*/

/**
 *
 * @author eduardo
 */
public class PanelMantenimientos extends javax.swing.JPanel {

    DefaultTableModel modeloTablaCategoria = new DefaultTableModel();
    DefaultTableModel modeloTablaEditorial = new DefaultTableModel();
    DefaultTableModel modeloTablaAuthor = new DefaultTableModel();
    DefaultTableModel modeloTablaUser = new DefaultTableModel();    
    /**
     * Creates new form PanelClientes
     */
    public PanelMantenimientos() {
        initComponents();
        CargarColumnasCategoria();
        CargarColumnasEditorial();
        CargarColumnasAuthor();
        CargarColumnasUser();
        lblIdCategorias.setVisible(false);
        lblEditandoCategoria.setVisible(false);
        lblIdEditorial.setVisible(false);
        lblEditandoEditorial.setVisible(false);
        lblIdAutor.setVisible(false);
        lblEditandoAutor.setVisible(false);
        lblIdUser.setVisible(false);
        lblEditandoUser.setVisible(false);
    } 
    
    //Metodo para cargar las columnas en la tabla categoria
    private void CargarColumnasCategoria(){
       modeloTablaCategoria.addColumn("id");
       modeloTablaCategoria.addColumn("Nombre");
       modeloTablaCategoria.addColumn("Descripcion");
       
       FunctionsCategory funcionesCategoria = new FunctionsCategory();
       ArrayList<ClassCategory> lista = funcionesCategoria.showCategories();
       
       int cantCategoria =lista.size();
       modeloTablaCategoria.setNumRows(cantCategoria);
       for (int i = 0; i < cantCategoria; i++) {
            ClassCategory categoria = lista.get(i);
            modeloTablaCategoria.setValueAt(categoria.getId(), i, 0);
            modeloTablaCategoria.setValueAt(categoria.getName(), i, 1);
            modeloTablaCategoria.setValueAt(categoria.getDescription(), i, 2);
        }
    }
    
    //Metodo para cargar las columnas en la tabla editorial
    private void CargarColumnasEditorial(){
       modeloTablaEditorial.addColumn("id");
       modeloTablaEditorial.addColumn("Nombre");
       modeloTablaEditorial.addColumn("Descripcion");
       
       FunctionsEditorial funcionesEditorial = new FunctionsEditorial();
       ArrayList<ClassEditorial> lista = funcionesEditorial.showEditoriales();
       
       int cantCategoria =lista.size();
       modeloTablaEditorial.setNumRows(cantCategoria);
       for (int i = 0; i < cantCategoria; i++) {
            ClassEditorial editorial = lista.get(i);
            modeloTablaEditorial.setValueAt(editorial.getId(), i, 0);
            modeloTablaEditorial.setValueAt(editorial.getName(), i, 1);
            modeloTablaEditorial.setValueAt(editorial.getDescription(), i, 2);
        }
    }
    
    //Metodo para cargar las columnas en la tabla autor
    private void CargarColumnasAuthor(){
       modeloTablaAuthor.addColumn("id");
       modeloTablaAuthor.addColumn("Nombre(s)");
       modeloTablaAuthor.addColumn("Apellidos");
       
       FunctionsAutor funcionesAutor = new FunctionsAutor();
       ArrayList<ClassAuthor> lista = funcionesAutor.showAuthors();
       
       int cantCategoria =lista.size();
       modeloTablaAuthor.setNumRows(cantCategoria);
       for (int i = 0; i < cantCategoria; i++) {
            ClassAuthor author = lista.get(i);
            modeloTablaAuthor.setValueAt(author.getId(), i, 0);
            modeloTablaAuthor.setValueAt(author.getFirst_name(), i, 1);
            modeloTablaAuthor.setValueAt(author.getLast_name(), i, 2);
        }
    }

    //Metodo para cargar las columnas en la tabla autor
    private void CargarColumnasUser(){
       modeloTablaUser.addColumn("id");
       modeloTablaUser.addColumn("Nombre(s)");
       modeloTablaUser.addColumn("Apellidos");
       modeloTablaUser.addColumn("email");
       
       FunctionsUser funcionesUser = new FunctionsUser();
       ArrayList<ClassUser> lista = funcionesUser.showUsers();
       
       int cantUser =lista.size();
       modeloTablaUser.setNumRows(cantUser);
       for (int i = 0; i < cantUser; i++) {
            ClassUser user = lista.get(i);
            modeloTablaUser.setValueAt(user.getId(), i, 0);
            modeloTablaUser.setValueAt(user.getFirst_name(), i, 1);
            modeloTablaUser.setValueAt(user.getLast_name(), i, 2);
            modeloTablaUser.setValueAt(user.getEmail(), i, 3);
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        PanelUsuarios = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNameCategoria = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        txtDescriptionCategoria = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCategorias = new javax.swing.JTable();
        btnSaveCategoria = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnDeleteCategoria = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        btnLimpiarCategoria = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        lblIdCategorias = new javax.swing.JLabel();
        lblEditandoCategoria = new javax.swing.JLabel();
        PanelEditorial = new javax.swing.JPanel();
        lblTitulo1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNameEditorial = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        txtDescriptionEditorial = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaEditorial = new javax.swing.JTable();
        btnSaveEditorial = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btneliminarCategoria = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        btnLimpiarEditorial = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        lblIdEditorial = new javax.swing.JLabel();
        lblEditandoEditorial = new javax.swing.JLabel();
        PanelUsuarios1 = new javax.swing.JPanel();
        lblTitulo2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNameAutor = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        txtDescriptionAutor = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaAutores = new javax.swing.JTable();
        btnSaveAutor = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnDeleteAutor = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        btnLimpiarAutor = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        lblIdAutor = new javax.swing.JLabel();
        lblEditandoAutor = new javax.swing.JLabel();
        PanelUsuarios2 = new javax.swing.JPanel();
        lblTitulo3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        txtApellidoUsuario = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaUsuarios = new javax.swing.JTable();
        btnSaveUser = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        btnDeleteUser = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        btnLimpiarUser = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        lblIdUser = new javax.swing.JLabel();
        lblEditandoUser = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtEmailUsuario = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel26 = new javax.swing.JLabel();
        txtUsuarioPassword = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(254, 254, 254));
        setPreferredSize(new java.awt.Dimension(890, 670));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelUsuarios.setBackground(new java.awt.Color(244, 244, 244));
        PanelUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Registro de categorias");
        PanelUsuarios.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 460, 40));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(66, 62, 62));
        jLabel8.setText("Nombre");
        PanelUsuarios.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        txtNameCategoria.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtNameCategoria.setForeground(new java.awt.Color(68, 68, 68));
        txtNameCategoria.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PanelUsuarios.add(txtNameCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 320, 30));
        PanelUsuarios.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 320, 10));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(66, 62, 62));
        jLabel9.setText("Descripcion");
        PanelUsuarios.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        txtDescriptionCategoria.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtDescriptionCategoria.setForeground(new java.awt.Color(68, 68, 68));
        txtDescriptionCategoria.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PanelUsuarios.add(txtDescriptionCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 320, 30));
        PanelUsuarios.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 320, 10));

        TablaCategorias.setModel(modeloTablaCategoria);
        TablaCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaCategoriasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaCategorias);

        PanelUsuarios.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 730, 250));

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

        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setIcon(new javax.swing.ImageIcon("/resources/disquete.png")); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnSaveCategoriaLayout = new javax.swing.GroupLayout(btnSaveCategoria);
        btnSaveCategoria.setLayout(btnSaveCategoriaLayout);
        btnSaveCategoriaLayout.setHorizontalGroup(
            btnSaveCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSaveCategoriaLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(36, 36, 36))
        );
        btnSaveCategoriaLayout.setVerticalGroup(
            btnSaveCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSaveCategoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelUsuarios.add(btnSaveCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 100, 60));

        btnDeleteCategoria.setBackground(new java.awt.Color(255, 38, 0));
        btnDeleteCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteCategoriaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteCategoriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteCategoriaMouseExited(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(246, 1, 1));
        jLabel18.setForeground(new java.awt.Color(254, 254, 254));
        jLabel18.setIcon(new javax.swing.ImageIcon("/resources/delete.png")); // NOI18N

        javax.swing.GroupLayout btnDeleteCategoriaLayout = new javax.swing.GroupLayout(btnDeleteCategoria);
        btnDeleteCategoria.setLayout(btnDeleteCategoriaLayout);
        btnDeleteCategoriaLayout.setHorizontalGroup(
            btnDeleteCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDeleteCategoriaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel18)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        btnDeleteCategoriaLayout.setVerticalGroup(
            btnDeleteCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDeleteCategoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelUsuarios.add(btnDeleteCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 100, 60));

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

        PanelUsuarios.add(btnLimpiarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, 100, 60));

        lblIdCategorias.setText("0");
        PanelUsuarios.add(lblIdCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, -1, -1));

        lblEditandoCategoria.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblEditandoCategoria.setForeground(new java.awt.Color(254, 1, 1));
        lblEditandoCategoria.setText("Editando informacion de");
        PanelUsuarios.add(lblEditandoCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        jTabbedPane1.addTab("Categorias", PanelUsuarios);

        PanelEditorial.setBackground(new java.awt.Color(244, 244, 244));
        PanelEditorial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lblTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo1.setText("Registro de editoriales");
        PanelEditorial.add(lblTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 460, 40));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(66, 62, 62));
        jLabel10.setText("Nombre");
        PanelEditorial.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        txtNameEditorial.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtNameEditorial.setForeground(new java.awt.Color(68, 68, 68));
        txtNameEditorial.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PanelEditorial.add(txtNameEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 320, 30));
        PanelEditorial.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 320, 10));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(66, 62, 62));
        jLabel11.setText("Descripcion");
        PanelEditorial.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        txtDescriptionEditorial.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtDescriptionEditorial.setForeground(new java.awt.Color(68, 68, 68));
        txtDescriptionEditorial.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PanelEditorial.add(txtDescriptionEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 320, 30));
        PanelEditorial.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 320, 10));

        TablaEditorial.setModel(modeloTablaEditorial);
        TablaEditorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaEditorialMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaEditorial);

        PanelEditorial.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 730, 250));

        btnSaveEditorial.setBackground(new java.awt.Color(85, 211, 128));
        btnSaveEditorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSaveEditorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveEditorialMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaveEditorialMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSaveEditorialMouseExited(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setIcon(new javax.swing.ImageIcon("/resources/disquete.png")); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnSaveEditorialLayout = new javax.swing.GroupLayout(btnSaveEditorial);
        btnSaveEditorial.setLayout(btnSaveEditorialLayout);
        btnSaveEditorialLayout.setHorizontalGroup(
            btnSaveEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSaveEditorialLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(36, 36, 36))
        );
        btnSaveEditorialLayout.setVerticalGroup(
            btnSaveEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSaveEditorialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelEditorial.add(btnSaveEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 100, 60));

        btneliminarCategoria.setBackground(new java.awt.Color(255, 38, 0));
        btneliminarCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btneliminarCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btneliminarCategoriaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btneliminarCategoriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btneliminarCategoriaMouseExited(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(246, 1, 1));
        jLabel19.setForeground(new java.awt.Color(254, 254, 254));
        jLabel19.setIcon(new javax.swing.ImageIcon("/resources/delete.png")); // NOI18N

        javax.swing.GroupLayout btneliminarCategoriaLayout = new javax.swing.GroupLayout(btneliminarCategoria);
        btneliminarCategoria.setLayout(btneliminarCategoriaLayout);
        btneliminarCategoriaLayout.setHorizontalGroup(
            btneliminarCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btneliminarCategoriaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel19)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        btneliminarCategoriaLayout.setVerticalGroup(
            btneliminarCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btneliminarCategoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelEditorial.add(btneliminarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 100, 60));

        btnLimpiarEditorial.setBackground(new java.awt.Color(151, 151, 151));
        btnLimpiarEditorial.setForeground(new java.awt.Color(254, 254, 254));
        btnLimpiarEditorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarEditorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarEditorialMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarEditorialMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarEditorialMouseExited(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(151, 151, 151));
        jLabel21.setForeground(new java.awt.Color(151, 151, 151));
        jLabel21.setIcon(new javax.swing.ImageIcon("/resources/clean.png")); // NOI18N

        javax.swing.GroupLayout btnLimpiarEditorialLayout = new javax.swing.GroupLayout(btnLimpiarEditorial);
        btnLimpiarEditorial.setLayout(btnLimpiarEditorialLayout);
        btnLimpiarEditorialLayout.setHorizontalGroup(
            btnLimpiarEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLimpiarEditorialLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(30, 30, 30))
        );
        btnLimpiarEditorialLayout.setVerticalGroup(
            btnLimpiarEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLimpiarEditorialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelEditorial.add(btnLimpiarEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, 100, 60));

        lblIdEditorial.setText("0");
        PanelEditorial.add(lblIdEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, -1, -1));

        lblEditandoEditorial.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblEditandoEditorial.setForeground(new java.awt.Color(254, 1, 1));
        lblEditandoEditorial.setText("Editando informacion de");
        PanelEditorial.add(lblEditandoEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        jTabbedPane1.addTab("Editoriales", PanelEditorial);

        PanelUsuarios1.setBackground(new java.awt.Color(244, 244, 244));
        PanelUsuarios1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo2.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lblTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo2.setText("Registro de autores");
        PanelUsuarios1.add(lblTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 460, 40));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(66, 62, 62));
        jLabel12.setText("Nombre");
        PanelUsuarios1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        txtNameAutor.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtNameAutor.setForeground(new java.awt.Color(68, 68, 68));
        txtNameAutor.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PanelUsuarios1.add(txtNameAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 320, 30));
        PanelUsuarios1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 320, 10));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(66, 62, 62));
        jLabel13.setText("Apellido(s)");
        PanelUsuarios1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        txtDescriptionAutor.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtDescriptionAutor.setForeground(new java.awt.Color(68, 68, 68));
        txtDescriptionAutor.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PanelUsuarios1.add(txtDescriptionAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 320, 30));
        PanelUsuarios1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 320, 10));

        TablaAutores.setModel(modeloTablaAuthor);
        TablaAutores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaAutoresMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TablaAutores);

        PanelUsuarios1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 730, 250));

        btnSaveAutor.setBackground(new java.awt.Color(85, 211, 128));
        btnSaveAutor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSaveAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveAutorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaveAutorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSaveAutorMouseExited(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setIcon(new javax.swing.ImageIcon("/resources/disquete.png")); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnSaveAutorLayout = new javax.swing.GroupLayout(btnSaveAutor);
        btnSaveAutor.setLayout(btnSaveAutorLayout);
        btnSaveAutorLayout.setHorizontalGroup(
            btnSaveAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSaveAutorLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(36, 36, 36))
        );
        btnSaveAutorLayout.setVerticalGroup(
            btnSaveAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSaveAutorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelUsuarios1.add(btnSaveAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 100, 60));

        btnDeleteAutor.setBackground(new java.awt.Color(255, 38, 0));
        btnDeleteAutor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteAutorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteAutorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteAutorMouseExited(evt);
            }
        });

        jLabel22.setBackground(new java.awt.Color(246, 1, 1));
        jLabel22.setForeground(new java.awt.Color(254, 254, 254));
        jLabel22.setIcon(new javax.swing.ImageIcon("/resources/delete.png")); // NOI18N

        javax.swing.GroupLayout btnDeleteAutorLayout = new javax.swing.GroupLayout(btnDeleteAutor);
        btnDeleteAutor.setLayout(btnDeleteAutorLayout);
        btnDeleteAutorLayout.setHorizontalGroup(
            btnDeleteAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDeleteAutorLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel22)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        btnDeleteAutorLayout.setVerticalGroup(
            btnDeleteAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDeleteAutorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelUsuarios1.add(btnDeleteAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 100, 60));

        btnLimpiarAutor.setBackground(new java.awt.Color(151, 151, 151));
        btnLimpiarAutor.setForeground(new java.awt.Color(254, 254, 254));
        btnLimpiarAutor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarAutorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarAutorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarAutorMouseExited(evt);
            }
        });

        jLabel23.setBackground(new java.awt.Color(151, 151, 151));
        jLabel23.setForeground(new java.awt.Color(151, 151, 151));
        jLabel23.setIcon(new javax.swing.ImageIcon("/resources/clean.png")); // NOI18N

        javax.swing.GroupLayout btnLimpiarAutorLayout = new javax.swing.GroupLayout(btnLimpiarAutor);
        btnLimpiarAutor.setLayout(btnLimpiarAutorLayout);
        btnLimpiarAutorLayout.setHorizontalGroup(
            btnLimpiarAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLimpiarAutorLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(30, 30, 30))
        );
        btnLimpiarAutorLayout.setVerticalGroup(
            btnLimpiarAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLimpiarAutorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelUsuarios1.add(btnLimpiarAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, 100, 60));

        lblIdAutor.setText("0");
        PanelUsuarios1.add(lblIdAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, -1, -1));

        lblEditandoAutor.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblEditandoAutor.setForeground(new java.awt.Color(254, 1, 1));
        lblEditandoAutor.setText("Editando informacion de");
        PanelUsuarios1.add(lblEditandoAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        jTabbedPane1.addTab("Autores", PanelUsuarios1);

        PanelUsuarios2.setBackground(new java.awt.Color(244, 244, 244));
        PanelUsuarios2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo3.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lblTitulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo3.setText("Registro de Usuarios");
        PanelUsuarios2.add(lblTitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 460, 40));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(66, 62, 62));
        jLabel14.setText("Nombre");
        PanelUsuarios2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        txtNombreUsuario.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtNombreUsuario.setForeground(new java.awt.Color(68, 68, 68));
        txtNombreUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PanelUsuarios2.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 320, 30));
        PanelUsuarios2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 320, 10));

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(66, 62, 62));
        jLabel15.setText("Apellidos");
        PanelUsuarios2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        txtApellidoUsuario.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtApellidoUsuario.setForeground(new java.awt.Color(68, 68, 68));
        txtApellidoUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PanelUsuarios2.add(txtApellidoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 320, 30));
        PanelUsuarios2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 320, 10));

        TablaUsuarios.setModel(modeloTablaUser);
        TablaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaUsuariosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TablaUsuarios);

        PanelUsuarios2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 730, 180));

        btnSaveUser.setBackground(new java.awt.Color(85, 211, 128));
        btnSaveUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSaveUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaveUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSaveUserMouseExited(evt);
            }
        });

        jLabel16.setForeground(new java.awt.Color(254, 254, 254));
        jLabel16.setIcon(new javax.swing.ImageIcon("/resources/disquete.png")); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnSaveUserLayout = new javax.swing.GroupLayout(btnSaveUser);
        btnSaveUser.setLayout(btnSaveUserLayout);
        btnSaveUserLayout.setHorizontalGroup(
            btnSaveUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSaveUserLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(36, 36, 36))
        );
        btnSaveUserLayout.setVerticalGroup(
            btnSaveUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSaveUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelUsuarios2.add(btnSaveUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 100, 60));

        btnDeleteUser.setBackground(new java.awt.Color(255, 38, 0));
        btnDeleteUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteUserMouseExited(evt);
            }
        });

        jLabel24.setBackground(new java.awt.Color(246, 1, 1));
        jLabel24.setForeground(new java.awt.Color(254, 254, 254));
        jLabel24.setIcon(new javax.swing.ImageIcon("/resources/delete.png")); // NOI18N

        javax.swing.GroupLayout btnDeleteUserLayout = new javax.swing.GroupLayout(btnDeleteUser);
        btnDeleteUser.setLayout(btnDeleteUserLayout);
        btnDeleteUserLayout.setHorizontalGroup(
            btnDeleteUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDeleteUserLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel24)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        btnDeleteUserLayout.setVerticalGroup(
            btnDeleteUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDeleteUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelUsuarios2.add(btnDeleteUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 100, 60));

        btnLimpiarUser.setBackground(new java.awt.Color(151, 151, 151));
        btnLimpiarUser.setForeground(new java.awt.Color(254, 254, 254));
        btnLimpiarUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarUserMouseExited(evt);
            }
        });

        jLabel25.setBackground(new java.awt.Color(151, 151, 151));
        jLabel25.setForeground(new java.awt.Color(151, 151, 151));
        jLabel25.setIcon(new javax.swing.ImageIcon("/resources/clean.png")); // NOI18N

        javax.swing.GroupLayout btnLimpiarUserLayout = new javax.swing.GroupLayout(btnLimpiarUser);
        btnLimpiarUser.setLayout(btnLimpiarUserLayout);
        btnLimpiarUserLayout.setHorizontalGroup(
            btnLimpiarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLimpiarUserLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addGap(30, 30, 30))
        );
        btnLimpiarUserLayout.setVerticalGroup(
            btnLimpiarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLimpiarUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelUsuarios2.add(btnLimpiarUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, 100, 60));

        lblIdUser.setText("0");
        PanelUsuarios2.add(lblIdUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, -1, -1));

        lblEditandoUser.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblEditandoUser.setForeground(new java.awt.Color(254, 1, 1));
        lblEditandoUser.setText("Editando informacion de");
        PanelUsuarios2.add(lblEditandoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(66, 62, 62));
        jLabel17.setText("Email");
        PanelUsuarios2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        txtEmailUsuario.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtEmailUsuario.setForeground(new java.awt.Color(68, 68, 68));
        txtEmailUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PanelUsuarios2.add(txtEmailUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 320, 30));
        PanelUsuarios2.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 320, 10));

        jLabel26.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(66, 62, 62));
        jLabel26.setText("Password");
        PanelUsuarios2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        txtUsuarioPassword.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtUsuarioPassword.setForeground(new java.awt.Color(68, 68, 68));
        txtUsuarioPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PanelUsuarios2.add(txtUsuarioPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 320, 30));
        PanelUsuarios2.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 320, 10));

        jTabbedPane1.addTab("Usuarios", PanelUsuarios2);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 660));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarAutorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarAutorMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarAutorMouseExited

    private void btnLimpiarAutorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarAutorMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarAutorMouseEntered

    private void btnLimpiarAutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarAutorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarAutorMouseClicked

    private void btnDeleteAutorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteAutorMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteAutorMouseExited

    private void btnDeleteAutorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteAutorMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteAutorMouseEntered

    private void btnDeleteAutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteAutorMouseClicked
        FunctionsAutor functions = new FunctionsAutor();

        if (functions.DeleteAuthor(Integer.parseInt(lblIdAutor.getText()))) {
            JOptionPane.showMessageDialog(null,"Autor eliminado correctamente");
            limpiarFormAutor();
        }else{
            JOptionPane.showMessageDialog(null,"No se puede eliminar este autor debido a que esta asociado a uno o mas libros");
        }
    }//GEN-LAST:event_btnDeleteAutorMouseClicked

    private void btnSaveAutorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveAutorMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveAutorMouseExited

    private void btnSaveAutorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveAutorMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveAutorMouseEntered

    private void btnSaveAutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveAutorMouseClicked

        String name = txtNameAutor.getText().trim();
        String last_name = txtDescriptionAutor.getText().trim();

        ClassAuthor author = new ClassAuthor(Integer.parseInt(lblIdAutor.getText()), name, last_name);
        FunctionsAutor functions = new FunctionsAutor();

        if (Integer.parseInt(lblIdAutor.getText()) == 0) {
            if (functions.SaveAuthor(author)) {
                JOptionPane.showMessageDialog(null,"Se ha registrado correctamentel autor con el nombre: "+name);
                limpiarFormAutor();
            }else{
                JOptionPane.showMessageDialog(null,"Error al registrar la informacion, compruebe los datos ingresados");
            }
        }else{
            if (functions.UpdateAuthor(author)) {
                JOptionPane.showMessageDialog(null,"Se ha actualizado correctamente la informacion del autor");
                limpiarFormAutor();
            }else{
                JOptionPane.showMessageDialog(null,"Error al aactualizar la informacion, compruebe los datos ingresados");
            }
        }
    }//GEN-LAST:event_btnSaveAutorMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void TablaAutoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaAutoresMouseClicked
        int index = TablaAutores.getSelectedRow();
        TableModel model = TablaAutores.getModel();
        int id = Integer.parseInt(model.getValueAt(index,0).toString());
        String name = model.getValueAt(index,1).toString();
        String last_name = model.getValueAt(index,2).toString();

        lblIdAutor.setText(""+id);
        txtNameAutor.setText(name);
        txtDescriptionAutor.setText(last_name);

        lblEditandoAutor.setVisible(true);
        lblEditandoAutor.setText("Editando informacion de "+name);
    }//GEN-LAST:event_TablaAutoresMouseClicked

    private void btnLimpiarEditorialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarEditorialMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarEditorialMouseExited

    private void btnLimpiarEditorialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarEditorialMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarEditorialMouseEntered

    private void btnLimpiarEditorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarEditorialMouseClicked
        limpiarFormEditorial();
    }//GEN-LAST:event_btnLimpiarEditorialMouseClicked

    private void btneliminarCategoriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneliminarCategoriaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btneliminarCategoriaMouseExited

    private void btneliminarCategoriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneliminarCategoriaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btneliminarCategoriaMouseEntered

    private void btneliminarCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneliminarCategoriaMouseClicked
        FunctionsEditorial functions = new FunctionsEditorial();

        if (functions.DeleteEditorial(Integer.parseInt(lblIdEditorial.getText()))) {
            JOptionPane.showMessageDialog(null,"Categoria eliminada correctamente");
            limpiarFormEditorial();
        }else{
            JOptionPane.showMessageDialog(null,"No se puede eliminar esta categoria debido a que contiene libros");
        }
    }//GEN-LAST:event_btneliminarCategoriaMouseClicked

    private void btnSaveEditorialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveEditorialMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveEditorialMouseExited

    private void btnSaveEditorialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveEditorialMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveEditorialMouseEntered

    private void btnSaveEditorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveEditorialMouseClicked
        String name = txtNameEditorial.getText().trim();
        String description = txtDescriptionEditorial.getText().trim();

        ClassEditorial editorial = new ClassEditorial(Integer.parseInt(lblIdEditorial.getText()), name, description);
        FunctionsEditorial functions = new FunctionsEditorial();

        if (Integer.parseInt(lblIdEditorial.getText()) == 0) {
            if (functions.SaveEditorial(editorial)) {
                JOptionPane.showMessageDialog(null,"Se ha registrado correctamente la editorial con el nombre: "+name);
                limpiarFormEditorial();
            }else{
                JOptionPane.showMessageDialog(null,"Error al registrar la informacion, compruebe los datos ingresados");
            }
        }else{
            if (functions.UpdateEditorial(editorial)) {
                JOptionPane.showMessageDialog(null,"Se ha actualizado correctamente los datos de la editorial");
                limpiarFormEditorial();
            }else{
                JOptionPane.showMessageDialog(null,"Error al actualizar la informacion, compruebe los datos ingresados");
            }
        }
    }//GEN-LAST:event_btnSaveEditorialMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void TablaEditorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaEditorialMouseClicked
        int index = TablaEditorial.getSelectedRow();
        TableModel model = TablaEditorial.getModel();
        int id = Integer.parseInt(model.getValueAt(index,0).toString());
        String name = model.getValueAt(index,1).toString();
        String description = model.getValueAt(index,2).toString();

        lblIdEditorial.setText(""+id);
        txtNameEditorial.setText(name);
        txtDescriptionEditorial.setText(description);

        lblEditandoEditorial.setVisible(true);
        lblEditandoEditorial.setText("Editando informacion de "+name);
    }//GEN-LAST:event_TablaEditorialMouseClicked

    private void btnLimpiarCategoriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarCategoriaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarCategoriaMouseExited

    private void btnLimpiarCategoriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarCategoriaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarCategoriaMouseEntered

    private void btnLimpiarCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarCategoriaMouseClicked
        // TODO add your handling code here:
        limpiarFormCategoria();
    }//GEN-LAST:event_btnLimpiarCategoriaMouseClicked

    private void btnDeleteCategoriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteCategoriaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteCategoriaMouseExited

    private void btnDeleteCategoriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteCategoriaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteCategoriaMouseEntered

    private void btnDeleteCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteCategoriaMouseClicked
        FunctionsCategory functions = new FunctionsCategory();

        if (functions.DeleteCategory(Integer.parseInt(lblIdCategorias.getText()))) {
            JOptionPane.showMessageDialog(null,"Categoria eliminada correctamente");
            limpiarFormCategoria();
        }else{
            JOptionPane.showMessageDialog(null,"No se puede eliminar esta categoria debido a que contiene libros");
        }
    }//GEN-LAST:event_btnDeleteCategoriaMouseClicked

    private void btnSaveCategoriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveCategoriaMouseExited
        btnSaveCategoria.setBackground(new Color(85,211,128));
    }//GEN-LAST:event_btnSaveCategoriaMouseExited

    private void btnSaveCategoriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveCategoriaMouseEntered
        btnSaveCategoria.setBackground(new Color(63,162,97));
    }//GEN-LAST:event_btnSaveCategoriaMouseEntered

    private void btnSaveCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveCategoriaMouseClicked
        String name = txtNameCategoria.getText().trim();
        String description = txtDescriptionCategoria.getText().trim();

        ClassCategory category = new ClassCategory(Integer.parseInt(lblIdCategorias.getText()), name, description);
        FunctionsCategory functions = new FunctionsCategory();

        if (Integer.parseInt(lblIdCategorias.getText()) == 0) {
            if (functions.SaveCategory(category)) {
                JOptionPane.showMessageDialog(null,"Se ha registrado correctamente categoria con el nombre: "+name);
                limpiarFormCategoria();
            }else{
                JOptionPane.showMessageDialog(null,"Error al registrar la informacion, compruebe los datos ingresados");
            }
        }else{
            if (functions.UpdateCategory(category)) {
                JOptionPane.showMessageDialog(null,"Se ha actualizado correctamente la categoria");
                limpiarFormCategoria();
            }else{
                JOptionPane.showMessageDialog(null,"Error al aactualizar la informacion, compruebe los datos ingresados");
            }
        }
    }//GEN-LAST:event_btnSaveCategoriaMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void TablaCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaCategoriasMouseClicked
        int index = TablaCategorias.getSelectedRow();
        TableModel model = TablaCategorias.getModel();
        int id = Integer.parseInt(model.getValueAt(index,0).toString());
        String name = model.getValueAt(index,1).toString();
        String description = model.getValueAt(index,2).toString();

        lblIdCategorias.setText(""+id);
        txtNameCategoria.setText(name);
        txtDescriptionCategoria.setText(description);

        lblEditandoCategoria.setVisible(true);
        lblEditandoCategoria.setText("Editando informacion de "+name);
    }//GEN-LAST:event_TablaCategoriasMouseClicked

    private void TablaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaUsuariosMouseClicked
        int index = TablaUsuarios.getSelectedRow();
        TableModel model = TablaUsuarios.getModel();
        int id = Integer.parseInt(model.getValueAt(index,0).toString());
        String name = model.getValueAt(index,1).toString();
        String last_name = model.getValueAt(index,2).toString();
        String email = model.getValueAt(index,2).toString();

        lblIdUser.setText(""+id);
        txtNombreUsuario.setText(name);
        txtApellidoUsuario.setText(last_name);
        txtEmailUsuario.setText(email);

        lblEditandoUser.setVisible(true);
        lblEditandoUser.setText("Editando informacion de "+name);
    }//GEN-LAST:event_TablaUsuariosMouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel16MouseClicked

    private void btnSaveUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveUserMouseClicked
        String name = txtNombreUsuario.getText().trim();
        String last_name = txtApellidoUsuario.getText().trim();
        String email = txtEmailUsuario.getText().trim();
        String password = txtUsuarioPassword.getText().trim();

        ClassUser user = new ClassUser(Integer.parseInt(lblIdUser.getText()), name, last_name,email,password,null);
        FunctionsUser functions = new FunctionsUser();

        if (Integer.parseInt(lblIdUser.getText()) == 0) {
            if (functions.SaveUser(user)) {
                JOptionPane.showMessageDialog(null,"Se ha registrado correctamente el usuario "+email);
                limpiarFormUser();
            }else{
                JOptionPane.showMessageDialog(null,"Error al registrar la informacion, compruebe los datos ingresados");
            }
        }else{
            if (functions.UpdateUser(user)) {
                JOptionPane.showMessageDialog(null,"Se ha actualizado correctamente la informacion del usuario");
                limpiarFormUser();
            }else{
                JOptionPane.showMessageDialog(null,"Error al aactualizar la informacion, compruebe los datos ingresados");
            }
        }        
    }//GEN-LAST:event_btnSaveUserMouseClicked

    private void btnSaveUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveUserMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveUserMouseEntered

    private void btnSaveUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveUserMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveUserMouseExited

    private void btnDeleteUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteUserMouseClicked
        FunctionsUser functions = new FunctionsUser();

        if (functions.DeleteUser(Integer.parseInt(lblIdUser.getText()))) {
            JOptionPane.showMessageDialog(null,"Usuario eliminado correctamente");
            limpiarFormUser();
        }else{
            JOptionPane.showMessageDialog(null,"No se puede eliminar este usuario, contacte a su administrador de sistemas");
        }
    }//GEN-LAST:event_btnDeleteUserMouseClicked

    private void btnDeleteUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteUserMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteUserMouseEntered

    private void btnDeleteUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteUserMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteUserMouseExited

    private void btnLimpiarUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarUserMouseClicked
        limpiarFormUser();
    }//GEN-LAST:event_btnLimpiarUserMouseClicked

    private void btnLimpiarUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarUserMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarUserMouseEntered

    private void btnLimpiarUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarUserMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarUserMouseExited

    //Funciones propias
    private void limpiarFormCategoria(){
        modeloTablaCategoria.setRowCount(0);
        modeloTablaCategoria.setColumnCount(0);
        txtNameCategoria.setText("");
        txtDescriptionCategoria.setText("");
        CargarColumnasCategoria();
        lblIdCategorias.setText(""+0);
        lblEditandoCategoria.setVisible(false);
    }
    
    private void limpiarFormEditorial(){
        modeloTablaEditorial.setRowCount(0);
        modeloTablaEditorial.setColumnCount(0);
        txtNameEditorial.setText("");
        txtDescriptionEditorial.setText("");
        CargarColumnasEditorial();
        lblIdEditorial.setText(""+0);
        lblEditandoEditorial.setVisible(false);
    }
    
    private void limpiarFormAutor(){
        modeloTablaAuthor.setRowCount(0);
        modeloTablaAuthor.setColumnCount(0);
        txtNameAutor.setText("");
        txtDescriptionAutor.setText("");
        CargarColumnasAuthor();
        lblIdAutor.setText(""+0);
        lblEditandoAutor.setVisible(false);
    }
    
    private void limpiarFormUser(){
        modeloTablaUser.setRowCount(0);
        modeloTablaUser.setColumnCount(0);
        txtNombreUsuario.setText("");
        txtApellidoUsuario.setText("");
        txtEmailUsuario.setText("");
        txtUsuarioPassword.setText("");
        CargarColumnasUser();
        lblIdUser.setText(""+0);
        lblEditandoUser.setVisible(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelEditorial;
    private javax.swing.JPanel PanelUsuarios;
    private javax.swing.JPanel PanelUsuarios1;
    private javax.swing.JPanel PanelUsuarios2;
    private javax.swing.JTable TablaAutores;
    private javax.swing.JTable TablaCategorias;
    private javax.swing.JTable TablaEditorial;
    private javax.swing.JTable TablaUsuarios;
    private javax.swing.JPanel btnDeleteAutor;
    private javax.swing.JPanel btnDeleteCategoria;
    private javax.swing.JPanel btnDeleteUser;
    private javax.swing.JPanel btnLimpiarAutor;
    private javax.swing.JPanel btnLimpiarCategoria;
    private javax.swing.JPanel btnLimpiarEditorial;
    private javax.swing.JPanel btnLimpiarUser;
    private javax.swing.JPanel btnSaveAutor;
    private javax.swing.JPanel btnSaveCategoria;
    private javax.swing.JPanel btnSaveEditorial;
    private javax.swing.JPanel btnSaveUser;
    private javax.swing.JPanel btneliminarCategoria;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblEditandoAutor;
    private javax.swing.JLabel lblEditandoCategoria;
    private javax.swing.JLabel lblEditandoEditorial;
    private javax.swing.JLabel lblEditandoUser;
    private javax.swing.JLabel lblIdAutor;
    private javax.swing.JLabel lblIdCategorias;
    private javax.swing.JLabel lblIdEditorial;
    private javax.swing.JLabel lblIdUser;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblTitulo3;
    private javax.swing.JTextField txtApellidoUsuario;
    private javax.swing.JTextField txtDescriptionAutor;
    private javax.swing.JTextField txtDescriptionCategoria;
    private javax.swing.JTextField txtDescriptionEditorial;
    private javax.swing.JTextField txtEmailUsuario;
    private javax.swing.JTextField txtNameAutor;
    private javax.swing.JTextField txtNameCategoria;
    private javax.swing.JTextField txtNameEditorial;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtUsuarioPassword;
    // End of variables declaration//GEN-END:variables
}
