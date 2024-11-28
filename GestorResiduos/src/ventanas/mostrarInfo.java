/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ventanas;

import javax.swing.JPanel;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import Clases.*;

/**
 *
 * @author jdavid
 */
public class mostrarInfo extends javax.swing.JPanel {

    ArrayList<Residuo> residuos;
    Residuo elementoActual;
    String tipoResiduo;
    String esBiodegradable;
    int indiceActual = 0;
    /**
     * Creates new form mostrarInfo
     */
    public mostrarInfo(ArrayList<Residuo> residuos) {
        initComponents();
        initComponents();
        this.residuos = residuos;
        actualizarInformacion();
    }
    
    
    private void actualizarInformacion() {
        if (residuos.isEmpty()) {
            return; 
        }

        elementoActual = residuos.get(indiceActual); 
        
        if (elementoActual instanceof Reciclable)
            tipoResiduo = "Reciclable: Sí";
        else
            tipoResiduo = "Reciclable: No";
        
        if (elementoActual.isBiodegradable())
            esBiodegradable = "Es biodegradable: Sí";
        else
            esBiodegradable = "Es biodegradable: No";
        
        nombre.setText(elementoActual.getNombre());
        reciclable.setText(tipoResiduo);
        biodegradable.setText(esBiodegradable);
        tipo.setText(elementoActual.getCategoria());
        descripcion.setText(elementoActual.getDescripcion());
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/" + elementoActual.getIcono())));

        
        anterior2.setEnabled(indiceActual > 0);
        siguiente.setEnabled(indiceActual < residuos.size() - 1); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mostrarInfo = new javax.swing.JPanel();
        atras = new javax.swing.JToggleButton();
        siguiente = new javax.swing.JButton();
        anterior2 = new javax.swing.JButton();
        nombre = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        tipo = new javax.swing.JLabel();
        biodegradable = new javax.swing.JLabel();
        reciclable = new javax.swing.JLabel();
        label8 = new javax.swing.JLabel();
        label9 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1200, 700));
        setPreferredSize(new java.awt.Dimension(1200, 700));

        mostrarInfo.setMinimumSize(new java.awt.Dimension(1200, 700));
        mostrarInfo.setPreferredSize(new java.awt.Dimension(1200, 700));
        mostrarInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        atras.setBorderPainted(false);
        atras.setContentAreaFilled(false);
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        mostrarInfo.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 40));

        siguiente.setBorderPainted(false);
        siguiente.setContentAreaFilled(false);
        siguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });
        mostrarInfo.add(siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 350, 30, 30));

        anterior2.setBorderPainted(false);
        anterior2.setContentAreaFilled(false);
        anterior2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        anterior2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anterior2ActionPerformed(evt);
            }
        });
        mostrarInfo.add(anterior2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 30, 30));

        nombre.setBackground(new java.awt.Color(208, 221, 230));
        nombre.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nombre.setOpaque(true);
        mostrarInfo.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 400, 40));

        imagen.setBackground(new java.awt.Color(208, 221, 230));
        imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagen.setOpaque(true);
        mostrarInfo.add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 230, 220));

        jScrollPane3.setBackground(new java.awt.Color(215, 206, 158));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jScrollPane3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane3.setHorizontalScrollBar(null);

        descripcion.setEditable(false);
        descripcion.setBackground(new java.awt.Color(82, 109, 130));
        descripcion.setColumns(20);
        descripcion.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        descripcion.setForeground(new java.awt.Color(221, 230, 237));
        descripcion.setLineWrap(true);
        descripcion.setRows(5);
        descripcion.setToolTipText("");
        descripcion.setWrapStyleWord(true);
        descripcion.setBorder(null);
        jScrollPane3.setViewportView(descripcion);

        mostrarInfo.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, 580, 150));

        tipo.setBackground(new java.awt.Color(208, 221, 230));
        tipo.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        tipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tipo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tipo.setOpaque(true);
        mostrarInfo.add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, 280, 30));

        biodegradable.setBackground(new java.awt.Color(208, 221, 230));
        biodegradable.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        biodegradable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        biodegradable.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        biodegradable.setOpaque(true);
        mostrarInfo.add(biodegradable, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, 280, 30));

        reciclable.setBackground(new java.awt.Color(208, 221, 230));
        reciclable.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        reciclable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reciclable.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        reciclable.setOpaque(true);
        mostrarInfo.add(reciclable, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 280, 30));

        label8.setBackground(new java.awt.Color(208, 221, 230));
        label8.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        label8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label8.setOpaque(true);
        mostrarInfo.add(label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 280, 40));

        label9.setBackground(new java.awt.Color(208, 221, 230));
        label9.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        label9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label9.setOpaque(true);
        mostrarInfo.add(label9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, 280, 40));

        label3.setBackground(new java.awt.Color(208, 221, 230));
        label3.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label3.setOpaque(true);
        mostrarInfo.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, 280, 40));

        label7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/previous.png"))); // NOI18N
        label7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mostrarInfo.add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 50, 50));

        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/next.png"))); // NOI18N
        label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mostrarInfo.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 340, 50, 50));

        label2.setBackground(new java.awt.Color(157, 178, 191));
        label2.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        label2.setForeground(new java.awt.Color(221, 230, 237));
        label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label2.setText("Mostrar Informacion de Todos Residuos Insertados");
        label2.setOpaque(true);
        mostrarInfo.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 800, 90));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        mostrarInfo.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 40, 40));

        jLabel1.setBackground(new java.awt.Color(221, 230, 237));
        jLabel1.setForeground(new java.awt.Color(98, 111, 71));
        jLabel1.setOpaque(true);
        mostrarInfo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mostrarInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mostrarInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ponerPanel(JPanel p) {
        mostrarInfo.removeAll();

    // Establecer tamaño y ubicación para el panel a agregar
        p.setSize(mostrarInfo.getWidth(), mostrarInfo.getHeight()); // Ajusta al tamaño del panelDerecha
        p.setLocation(0, 0); // Establecer la ubicación en el panelDerecha

        // Agregar el panel al contenedor sin especificar layout
        mostrarInfo.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1)); // Usando AbsoluteConstraints

        // Revalidar y repaint
        mostrarInfo.revalidate();
        mostrarInfo.repaint();
    }
    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        menuPanel p = new menuPanel();
        ponerPanel(p);
    }//GEN-LAST:event_atrasActionPerformed

    private void anterior2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anterior2ActionPerformed
        if (indiceActual > 0) {
            indiceActual--; 
            actualizarInformacion(); 
        }
    }//GEN-LAST:event_anterior2ActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        if (indiceActual < residuos.size() - 1) {
            indiceActual++; 
            actualizarInformacion();
        }
    }//GEN-LAST:event_siguienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anterior2;
    private javax.swing.JToggleButton atras;
    private javax.swing.JLabel biodegradable;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel label;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel label9;
    private javax.swing.JPanel mostrarInfo;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel reciclable;
    private javax.swing.JButton siguiente;
    private javax.swing.JLabel tipo;
    // End of variables declaration//GEN-END:variables
}
