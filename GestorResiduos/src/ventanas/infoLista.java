/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ventanas;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author jdavid
 */
public class infoLista extends javax.swing.JPanel {

    /**
     * Creates new form infoLista
     */
    public infoLista() {
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

        infoLista = new javax.swing.JPanel();
        atras = new javax.swing.JToggleButton();
        jLabel22 = new javax.swing.JLabel();
        Plásticos = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1200, 700));

        infoLista.setMinimumSize(new java.awt.Dimension(1200, 700));
        infoLista.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        atras.setBorderPainted(false);
        atras.setContentAreaFilled(false);
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        infoLista.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 40));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        infoLista.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 40, 40));

        Plásticos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Plásticos.setForeground(new java.awt.Color(77, 134, 156));
        Plásticos.setText("Plásticos");
        Plásticos.setBorderPainted(false);
        Plásticos.setContentAreaFilled(false);
        Plásticos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlásticosActionPerformed(evt);
            }
        });
        infoLista.add(Plásticos, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 120, 270, 40));

        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(77, 134, 156));
        jButton8.setText("Papel y Cartón");
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        infoLista.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 190, 270, 40));

        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(77, 134, 156));
        jButton7.setText("Vidrio");
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        infoLista.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 260, 270, 40));

        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(77, 134, 156));
        jButton6.setText("Residuos Electrónicos");
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        infoLista.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 330, 270, 40));

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(77, 134, 156));
        jButton5.setText("Metales");
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        infoLista.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 400, 270, 40));

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(77, 134, 156));
        jButton4.setText("Residuos Textiles");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        infoLista.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 470, 270, 40));

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(77, 134, 156));
        jButton3.setText("Residuos Peligrosos");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        infoLista.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 540, 270, 40));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(77, 134, 156));
        jButton2.setText("Residuos Compuestos");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        infoLista.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 610, 270, 40));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(77, 134, 156));
        jButton1.setText("Residuos Orgánicos");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        infoLista.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 50, 270, 40));

        jScrollPane3.setBackground(new java.awt.Color(215, 206, 158));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jScrollPane3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane3.setHorizontalScrollBar(null);

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(82, 109, 130));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(221, 230, 237));
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(5);
        jTextArea3.setToolTipText("");
        jTextArea3.setBorder(null);
        jScrollPane3.setViewportView(jTextArea3);

        infoLista.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 310, 210));

        jLabel18.setForeground(new java.awt.Color(77, 134, 156));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/azul2 (1).png"))); // NOI18N
        jLabel18.setText("Residuos Orgánicos");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        infoLista.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 610, 270, 40));

        jLabel17.setForeground(new java.awt.Color(77, 134, 156));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/azul2 (1).png"))); // NOI18N
        jLabel17.setText("Residuos Orgánicos");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        infoLista.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 540, 270, 40));

        jLabel16.setForeground(new java.awt.Color(77, 134, 156));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/azul2 (1).png"))); // NOI18N
        jLabel16.setText("Residuos Orgánicos");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        infoLista.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 470, 270, 40));

        jLabel15.setForeground(new java.awt.Color(77, 134, 156));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/azul2 (1).png"))); // NOI18N
        jLabel15.setText("Residuos Orgánicos");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        infoLista.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 400, 270, 40));

        jLabel14.setForeground(new java.awt.Color(77, 134, 156));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/azul2 (1).png"))); // NOI18N
        jLabel14.setText("Residuos Orgánicos");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        infoLista.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 330, 270, 40));

        jLabel13.setForeground(new java.awt.Color(77, 134, 156));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/azul2 (1).png"))); // NOI18N
        jLabel13.setText("Residuos Orgánicos");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        infoLista.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 260, 270, 40));

        jLabel12.setForeground(new java.awt.Color(77, 134, 156));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/azul2 (1).png"))); // NOI18N
        jLabel12.setText("Residuos Orgánicos");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        infoLista.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 190, 270, 40));

        jLabel11.setForeground(new java.awt.Color(77, 134, 156));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/azul2 (1).png"))); // NOI18N
        jLabel11.setText("Residuos Orgánicos");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        infoLista.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 120, 270, 40));

        jLabel10.setForeground(new java.awt.Color(77, 134, 156));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/azul2 (1).png"))); // NOI18N
        jLabel10.setText("Residuos Orgánicos");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        infoLista.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 50, 270, 40));

        jLabel9.setBackground(new java.awt.Color(82, 109, 130));
        jLabel9.setOpaque(true);
        infoLista.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, 330, 660));

        imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/banana.png"))); // NOI18N
        imagen.setFocusable(false);
        imagen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        infoLista.add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 290, 190));

        jLabel7.setBackground(new java.awt.Color(157, 178, 191));
        jLabel7.setOpaque(true);
        infoLista.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 290, 190));

        nombre.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        nombre.setForeground(new java.awt.Color(77, 134, 156));
        nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre.setText("Residuos Orgánicos");
        nombre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        infoLista.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 410, 40));

        jLabel8.setBackground(new java.awt.Color(82, 109, 130));
        jLabel8.setOpaque(true);
        infoLista.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 310, 210));

        jLabel6.setForeground(new java.awt.Color(77, 134, 156));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/azul2 (1).png"))); // NOI18N
        jLabel6.setText("Residuos Orgánicos");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        infoLista.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 430, 60));
        jLabel6.getAccessibleContext().setAccessibleName("");

        jLabel19.setBackground(new java.awt.Color(157, 178, 191));
        jLabel19.setForeground(new java.awt.Color(221, 230, 237));
        jLabel19.setOpaque(true);
        infoLista.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 270, 230));

        jLabel5.setBackground(new java.awt.Color(82, 109, 130));
        jLabel5.setForeground(new java.awt.Color(221, 230, 237));
        jLabel5.setOpaque(true);
        infoLista.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 680, 270));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/azul2 (1).png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        infoLista.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 370, 700));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/azul2 (1).png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        infoLista.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 800, 230));

        jLabel1.setBackground(new java.awt.Color(122, 178, 178));
        jLabel1.setForeground(new java.awt.Color(98, 111, 71));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/azul4 (1).png"))); // NOI18N
        infoLista.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(infoLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(infoLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        menuPanel p = new menuPanel();
        ponerPanel(p);
    }//GEN-LAST:event_atrasActionPerformed

    private void PlásticosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlásticosActionPerformed
        nombre.setText("Plásticos");
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/water-bottle.png")));
        
    }//GEN-LAST:event_PlásticosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        nombre.setText("Residuos Orgánicos");
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/banana.png")));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        nombre.setText("Papel y Cartón");
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/paper.png")));
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        nombre.setText("Vidrio");
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/glass.png")));
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        nombre.setText("Residuos Electrónicos");
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/microwave.png")));
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        nombre.setText("Metales");
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/steel.png")));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        nombre.setText("Residuos Textiles");
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/t-shirt.png")));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        nombre.setText("Residuos Compuestos");
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/garbage.png")));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        nombre.setText("Residuos Peligrosos");
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/skeleton.png")));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ponerPanel(JPanel p) {
        infoLista.removeAll();

    // Establecer tamaño y ubicación para el panel a agregar
        p.setSize(infoLista.getWidth(), infoLista.getHeight()); // Ajusta al tamaño del panelDerecha
        p.setLocation(0, 0); // Establecer la ubicación en el panelDerecha

        // Agregar el panel al contenedor sin especificar layout
        infoLista.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1)); // Usando AbsoluteConstraints

        // Revalidar y repaint
        infoLista.revalidate();
        infoLista.repaint();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Plásticos;
    private javax.swing.JToggleButton atras;
    private javax.swing.JLabel imagen;
    private javax.swing.JPanel infoLista;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JLabel nombre;
    // End of variables declaration//GEN-END:variables
}
