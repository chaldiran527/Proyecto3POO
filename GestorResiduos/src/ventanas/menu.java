/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import javax.swing.*;


/**
 *
 * @author jdavid
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public menu() {
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

        menuPanel = new javax.swing.JPanel();
        eliminar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        insertar = new javax.swing.JButton();
        VerLista = new javax.swing.JButton();
        MostrarInfo = new javax.swing.JButton();
        InformaciónTipo = new javax.swing.JButton();
        ResiduosCategoría = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        imagen4 = new javax.swing.JLabel();
        imagen3 = new javax.swing.JLabel();
        imagen2 = new javax.swing.JLabel();
        imagen1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Centro de Informacion y Manejo de Residuos");
        setAlwaysOnTop(true);
        setBounds(new java.awt.Rectangle(0, 0, 10, 10));
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1200, 700));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 700));

        menuPanel.setMaximumSize(new java.awt.Dimension(1200, 700));
        menuPanel.setMinimumSize(new java.awt.Dimension(1200, 700));
        menuPanel.setPreferredSize(new java.awt.Dimension(1200, 700));
        menuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eliminar.setBorderPainted(false);
        eliminar.setContentAreaFilled(false);
        eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuPanel.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 250, 300, 70));

        editar.setBorderPainted(false);
        editar.setContentAreaFilled(false);
        editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuPanel.add(editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 300, 70));

        insertar.setBorderPainted(false);
        insertar.setContentAreaFilled(false);
        insertar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarActionPerformed(evt);
            }
        });
        menuPanel.add(insertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 300, 70));

        VerLista.setBorderPainted(false);
        VerLista.setContentAreaFilled(false);
        VerLista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VerLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerListaActionPerformed(evt);
            }
        });
        menuPanel.add(VerLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(945, 570, 210, 50));

        MostrarInfo.setBorderPainted(false);
        MostrarInfo.setContentAreaFilled(false);
        MostrarInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MostrarInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarInfoActionPerformed(evt);
            }
        });
        menuPanel.add(MostrarInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 570, 210, 50));

        InformaciónTipo.setBorderPainted(false);
        InformaciónTipo.setContentAreaFilled(false);
        InformaciónTipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        InformaciónTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InformaciónTipoActionPerformed(evt);
            }
        });
        menuPanel.add(InformaciónTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 570, 210, 50));

        ResiduosCategoría.setBorderPainted(false);
        ResiduosCategoría.setContentAreaFilled(false);
        ResiduosCategoría.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ResiduosCategoría.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResiduosCategoríaActionPerformed(evt);
            }
        });
        menuPanel.add(ResiduosCategoría, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 210, 50));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fefae0 (1).png"))); // NOI18N
        jLabel31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuPanel.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 690, 1200, 10));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fefae0 (1).png"))); // NOI18N
        jLabel30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuPanel.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 340, 10, 360));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fefae0 (1).png"))); // NOI18N
        jLabel29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuPanel.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, 10, 360));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fefae0 (1).png"))); // NOI18N
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuPanel.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 10, 360));

        imagen4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/to-do-list.png"))); // NOI18N
        menuPanel.add(imagen4, new org.netbeans.lib.awtextra.AbsoluteConstraints(985, 410, 130, 128));

        imagen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trash.png"))); // NOI18N
        menuPanel.add(imagen3, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 410, 128, 128));

        imagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/waste.png"))); // NOI18N
        menuPanel.add(imagen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 410, 128, 128));

        imagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/category.png"))); // NOI18N
        menuPanel.add(imagen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 128, 128));

        jLabel18.setForeground(new java.awt.Color(98, 111, 71));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Ver Lista de Residuos");
        menuPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 580, 190, 30));

        jLabel17.setForeground(new java.awt.Color(98, 111, 71));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Mostrar Información de Residuo");
        menuPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 580, 190, 30));

        jLabel16.setForeground(new java.awt.Color(98, 111, 71));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Información por Tipo de Residuo");
        menuPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 580, 190, 30));

        jLabel15.setForeground(new java.awt.Color(98, 111, 71));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Residuos por Categoría");
        menuPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, 190, 30));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI", 0, 30)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(200, 188, 122));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Eliminar Residuo");
        menuPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 260, 280, 40));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 0, 30)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(200, 188, 122));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Editar Residuo");
        menuPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 280, 40));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 0, 30)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(200, 188, 122));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Insertar Residuo");
        menuPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 280, 40));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 1, 29)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(98, 111, 71));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Centro de Información y Manejo de Residuos");
        menuPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 600, 60));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EDE7C6 (1).png"))); // NOI18N
        jLabel9.setText("1200");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(945, 570, 210, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EDE7C6 (1).png"))); // NOI18N
        jLabel10.setText("1200");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 570, 210, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EDE7C6 (1).png"))); // NOI18N
        jLabel8.setText("1200");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 570, 210, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EDE7C6 (1).png"))); // NOI18N
        jLabel7.setText("1200");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 210, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fefae0 (1).png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 250, 300, 70));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fefae0 (1).png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 300, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fefae0 (1).png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 300, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EDE7C6 (1).png"))); // NOI18N
        jLabel1.setText("1200");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 650, 100));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/d7ce9e (1).png"))); // NOI18N
        menuPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(935, 560, 230, 70));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fefae0 (1).png"))); // NOI18N
        jLabel32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuPanel.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 220, 10, 470));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fefae0 (1).png"))); // NOI18N
        jLabel33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuPanel.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 10, 470));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/d7ce9e (1).png"))); // NOI18N
        menuPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 670, 120));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/d7ce9e (1).png"))); // NOI18N
        menuPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 230, 70));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/d7ce9e (1).png"))); // NOI18N
        menuPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 560, 230, 70));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/d7ce9e (1).png"))); // NOI18N
        menuPanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 560, 230, 70));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/d7ce9e (1).png"))); // NOI18N
        menuPanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, -1, 110));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fefae0 (1).png"))); // NOI18N
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuPanel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 1200, 130));

        jLabel2.setBackground(new java.awt.Color(98, 111, 71));
        jLabel2.setForeground(new java.awt.Color(98, 111, 71));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/626f47 (1).png"))); // NOI18N
        menuPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 700));

        jLabel25.setForeground(new java.awt.Color(98, 111, 71));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Ver Lista de Residuos");
        menuPanel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 580, 190, 30));

        jLabel26.setForeground(new java.awt.Color(98, 111, 71));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Mostrar Información de Residuo");
        menuPanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 580, 190, 30));

        jLabel27.setForeground(new java.awt.Color(98, 111, 71));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Información por Tipo de Residuo");
        menuPanel.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 580, 190, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ponerPanel(JPanel p) { 
    // Establecer tamaño y ubicación para el panel a agregar
        menuPanel.removeAll();

    // Establecer tamaño y ubicación para el panel a agregar
        p.setSize(menuPanel.getWidth(), menuPanel.getHeight()); // Ajusta al tamaño del panelDerecha
        p.setLocation(0, 0); // Establecer la ubicación en el panelDerecha

        // Agregar el panel al contenedor sin especificar layout
        menuPanel.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1)); // Usando AbsoluteConstraints

        // Revalidar y repaint
        menuPanel.revalidate();
        menuPanel.repaint();
    }

    private void ResiduosCategoríaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResiduosCategoríaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResiduosCategoríaActionPerformed

    private void InformaciónTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InformaciónTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InformaciónTipoActionPerformed

    private void MostrarInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MostrarInfoActionPerformed

    private void VerListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerListaActionPerformed
        
    }//GEN-LAST:event_VerListaActionPerformed

    private void insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarActionPerformed

        insertar p1 = new insertar();
        ponerPanel(p1);
    }//GEN-LAST:event_insertarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InformaciónTipo;
    private javax.swing.JButton MostrarInfo;
    private javax.swing.JButton ResiduosCategoría;
    private javax.swing.JButton VerLista;
    private javax.swing.JButton editar;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel imagen1;
    private javax.swing.JLabel imagen2;
    private javax.swing.JLabel imagen3;
    private javax.swing.JLabel imagen4;
    private javax.swing.JButton insertar;
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel menuPanel;
    // End of variables declaration//GEN-END:variables
}
