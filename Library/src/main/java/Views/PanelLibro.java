/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views;

import java.awt.Color;

/**
 *
 * @author eduardo
 */
public class PanelLibro extends javax.swing.JPanel {

    /**
     * Creates new form PanelClientes
     */
    public PanelLibro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEnter = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jTextField5 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jTextField11 = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        btnEnter1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        btnEnter2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        btnEnter3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(254, 254, 254));
        setPreferredSize(new java.awt.Dimension(890, 670));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEnter.setBackground(new java.awt.Color(85, 211, 128));
        btnEnter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEnterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEnterMouseExited(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setIcon(new javax.swing.ImageIcon("/resources/disquete.png")); // NOI18N

        javax.swing.GroupLayout btnEnterLayout = new javax.swing.GroupLayout(btnEnter);
        btnEnter.setLayout(btnEnterLayout);
        btnEnterLayout.setHorizontalGroup(
            btnEnterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEnterLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(36, 36, 36))
        );
        btnEnterLayout.setVerticalGroup(
            btnEnterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEnterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(btnEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 430, 100, 60));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 320, 10));

        jTextField1.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(68, 68, 68));
        jTextField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 320, 30));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(66, 62, 62));
        jLabel4.setText("Apellido Materno");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, -1, -1));

        lblTitulo.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Registro de cliente");
        add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 460, 30));

        jTextField2.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(68, 68, 68));
        jTextField2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 200, 30));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 200, 10));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(66, 62, 62));
        jLabel6.setText("Correo electronico");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(66, 62, 62));
        jLabel7.setText("Edad");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 150, -1, -1));

        jTextField3.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(68, 68, 68));
        jTextField3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 320, 30));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 320, 10));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(66, 62, 62));
        jLabel8.setText("Nombre(s)");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jTextField4.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(68, 68, 68));
        jTextField4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 280, 30));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 280, 10));

        jTextField5.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(68, 68, 68));
        jTextField5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, 130, 30));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 130, 10));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(66, 62, 62));
        jLabel9.setText("Telefono");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, -1));

        jTextField6.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(68, 68, 68));
        jTextField6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 200, 30));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 200, 10));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(66, 62, 62));
        jLabel10.setText("Apellido Paterno");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(66, 62, 62));
        jLabel11.setText("Direccion");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 470, 10));

        jTextField7.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(68, 68, 68));
        jTextField7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 470, 30));

        jTextField8.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(68, 68, 68));
        jTextField8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 130, 30));
        add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 130, 10));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(66, 62, 62));
        jLabel12.setText("Num ext.");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, -1, -1));

        jTextField9.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(68, 68, 68));
        jTextField9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 270, 130, 30));
        add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, 130, 10));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(66, 62, 62));
        jLabel13.setText("Num int.");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, -1, -1));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(66, 62, 62));
        jLabel14.setText("Ciudad");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        jTextField10.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(68, 68, 68));
        jTextField10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 280, 30));
        add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 280, 10));

        jTextField11.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(68, 68, 68));
        jTextField11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 240, 30));
        add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 240, 10));

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(66, 62, 62));
        jLabel15.setText("Pais");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, -1, -1));

        jTextField12.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(68, 68, 68));
        jTextField12.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, 230, 30));
        add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, 230, 10));

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(66, 62, 62));
        jLabel16.setText("Estado");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 428, 640, 160));

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(66, 62, 62));
        jLabel17.setText("Buscar:");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, -1, -1));

        jTextField13.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(68, 68, 68));
        jTextField13.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 610, 370, 30));
        add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 640, 370, 10));

        btnEnter1.setBackground(new java.awt.Color(255, 38, 0));
        btnEnter1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnter1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnter1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEnter1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEnter1MouseExited(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(246, 1, 1));
        jLabel18.setForeground(new java.awt.Color(254, 254, 254));
        jLabel18.setIcon(new javax.swing.ImageIcon("/resources/delete.png")); // NOI18N

        javax.swing.GroupLayout btnEnter1Layout = new javax.swing.GroupLayout(btnEnter1);
        btnEnter1.setLayout(btnEnter1Layout);
        btnEnter1Layout.setHorizontalGroup(
            btnEnter1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEnter1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel18)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        btnEnter1Layout.setVerticalGroup(
            btnEnter1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEnter1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(btnEnter1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 510, 100, 60));

        btnEnter2.setBackground(new java.awt.Color(211, 85, 139));
        btnEnter2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnter2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnter2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEnter2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEnter2MouseExited(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(254, 254, 254));
        jLabel19.setIcon(new javax.swing.ImageIcon("/resources/login.png")); // NOI18N
        jLabel19.setText("Buscar");

        javax.swing.GroupLayout btnEnter2Layout = new javax.swing.GroupLayout(btnEnter2);
        btnEnter2.setLayout(btnEnter2Layout);
        btnEnter2Layout.setHorizontalGroup(
            btnEnter2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEnter2Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(43, 43, 43))
        );
        btnEnter2Layout.setVerticalGroup(
            btnEnter2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEnter2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(btnEnter2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 600, 170, -1));

        btnEnter3.setBackground(new java.awt.Color(151, 151, 151));
        btnEnter3.setForeground(new java.awt.Color(254, 254, 254));
        btnEnter3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnter3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnter3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEnter3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEnter3MouseExited(evt);
            }
        });

        jLabel20.setBackground(new java.awt.Color(151, 151, 151));
        jLabel20.setForeground(new java.awt.Color(151, 151, 151));
        jLabel20.setIcon(new javax.swing.ImageIcon("/resources/clean.png")); // NOI18N

        javax.swing.GroupLayout btnEnter3Layout = new javax.swing.GroupLayout(btnEnter3);
        btnEnter3.setLayout(btnEnter3Layout);
        btnEnter3Layout.setHorizontalGroup(
            btnEnter3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEnter3Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(30, 30, 30))
        );
        btnEnter3Layout.setVerticalGroup(
            btnEnter3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEnter3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(btnEnter3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 590, 100, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnterMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnterMouseClicked

    private void btnEnterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnterMouseEntered
        // TODO add your handling code here:
        btnEnter.setBackground(new Color(63,162,97));
    }//GEN-LAST:event_btnEnterMouseEntered

    private void btnEnterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnterMouseExited
        // TODO add your handling code here:
        btnEnter.setBackground(new Color(85,211,128));
    }//GEN-LAST:event_btnEnterMouseExited

    private void btnEnter1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnter1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnter1MouseClicked

    private void btnEnter1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnter1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnter1MouseEntered

    private void btnEnter1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnter1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnter1MouseExited

    private void btnEnter2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnter2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnter2MouseClicked

    private void btnEnter2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnter2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnter2MouseEntered

    private void btnEnter2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnter2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnter2MouseExited

    private void btnEnter3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnter3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnter3MouseClicked

    private void btnEnter3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnter3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnter3MouseEntered

    private void btnEnter3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnter3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnter3MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnEnter;
    private javax.swing.JPanel btnEnter1;
    private javax.swing.JPanel btnEnter2;
    private javax.swing.JPanel btnEnter3;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
