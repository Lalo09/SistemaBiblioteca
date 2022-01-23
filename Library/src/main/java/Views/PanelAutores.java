/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views;
import Logic.ClassAuthor;
import Data.FunctionsAutor;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author eduardo
 */
public class PanelAutores extends javax.swing.JPanel {

    DefaultTableModel modeloTablaAuthor = new DefaultTableModel();
    /**
     * Creates new form PanelAutores
     */
    public PanelAutores() {
        initComponents();
        CargarColumnasAuthor();
    }
    
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelForaneo = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaAutores = new javax.swing.JTable();
        btnBuscarAutor = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(254, 254, 254));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelForaneo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(PanelForaneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 390, 280));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(66, 62, 62));
        jLabel9.setText("Buscar");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 170, -1));

        txtNombre1.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtNombre1.setForeground(new java.awt.Color(68, 68, 68));
        txtNombre1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 260, 30));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 260, 10));

        TablaAutores.setModel(modeloTablaAuthor);
        TablaAutores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaAutoresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaAutores);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 350, 130));

        btnBuscarAutor.setBackground(new java.awt.Color(151, 151, 151));
        btnBuscarAutor.setForeground(new java.awt.Color(254, 254, 254));
        btnBuscarAutor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarAutorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarAutorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarAutorMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Ver");

        javax.swing.GroupLayout btnBuscarAutorLayout = new javax.swing.GroupLayout(btnBuscarAutor);
        btnBuscarAutor.setLayout(btnBuscarAutorLayout);
        btnBuscarAutorLayout.setHorizontalGroup(
            btnBuscarAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBuscarAutorLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnBuscarAutorLayout.setVerticalGroup(
            btnBuscarAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        add(btnBuscarAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 80, 40));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(66, 62, 62));
        jLabel8.setText("Listado de autores");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Ver");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 45, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarAutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarAutorMouseClicked

    }//GEN-LAST:event_btnBuscarAutorMouseClicked

    private void btnBuscarAutorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarAutorMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarAutorMouseEntered

    private void btnBuscarAutorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarAutorMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarAutorMouseExited

    private void TablaAutoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaAutoresMouseClicked
        int index = TablaAutores.getSelectedRow();
        TableModel model = TablaAutores.getModel();
        int id = Integer.parseInt(model.getValueAt(index,0).toString());
        String name = model.getValueAt(index,1).toString()+ " "+model.getValueAt(index,2).toString();
        
        //test
        //JOptionPane.showMessageDialog(this, id+" y "+name);
        //PanelLibros.idAutor = id;
        PanelLibros.lblIdAutor.setText(""+id);
        PanelLibros.txtNombreAutor.setText(name);
    }//GEN-LAST:event_TablaAutoresMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelForaneo;
    private javax.swing.JTable TablaAutores;
    private javax.swing.JPanel btnBuscarAutor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtNombre1;
    // End of variables declaration//GEN-END:variables
}
