/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControladorPanelInsumos;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import model.Conexion;

/**
 *
 * @author Magneto
 */
public class PanelInsumos extends javax.swing.JPanel {

    
    
    private ControladorPanelInsumos controlInsumos;
    
    
    
    public PanelInsumos(Conexion conexion) {
        initComponents();
        controlInsumos = new ControladorPanelInsumos(this,conexion);
        
        
        //Modificacion de tabla insumos-----------------------------------------
        jtInsumos.getTableHeader().setFont(new Font("Tw cen MT", Font.PLAIN, 18));
        jtInsumos.getTableHeader().setOpaque(false);
        jtInsumos.getTableHeader().setBackground(new Color(0, 200, 248));
        jtInsumos.getTableHeader().setPreferredSize(new Dimension(10,40));
        jtInsumos.setRowHeight(25);
        //Fin modificacion de tabla insumos-------------------------------------
    }
    
    
    
    //--------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpInsumos = new javax.swing.JPanel();
        jpSearch = new javax.swing.JPanel();
        jlIconSearch = new javax.swing.JLabel();
        jtfSearch = new javax.swing.JTextField();
        jspInsumos = new javax.swing.JScrollPane();
        jtInsumos = new javax.swing.JTable();
        jpBotonCrear = new javax.swing.JPanel();
        jbAnyadirInsumo = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1049, 471));

        jpInsumos.setBackground(new java.awt.Color(255, 255, 255));

        jpSearch.setBackground(new java.awt.Color(255, 255, 255));
        jpSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlIconSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        jlIconSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jpSearch.add(jlIconSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 30));

        jtfSearch.setBorder(null);
        jtfSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jpSearch.add(jtfSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 16, 160, -1));

        jtInsumos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descripción", "Cantidad en Gramos", "Costo al Gramo", "Stock Mínimo", "Estado"
            }
        ));
        jtInsumos.setFocusable(false);
        jtInsumos.setGridColor(new java.awt.Color(204, 204, 204));
        jtInsumos.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jtInsumos.setRowHeight(25);
        jtInsumos.setSelectionBackground(new java.awt.Color(153, 255, 255));
        jtInsumos.setShowVerticalLines(false);
        jtInsumos.getTableHeader().setReorderingAllowed(false);
        jspInsumos.setViewportView(jtInsumos);

        jpBotonCrear.setBackground(new java.awt.Color(255, 255, 255));
        jpBotonCrear.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbAnyadirInsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonAñadir.png"))); // NOI18N
        jbAnyadirInsumo.setBorder(null);
        jbAnyadirInsumo.setBorderPainted(false);
        jbAnyadirInsumo.setContentAreaFilled(false);
        jbAnyadirInsumo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAnyadirInsumo.setFocusPainted(false);
        jpBotonCrear.add(jbAnyadirInsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 180, -1));

        javax.swing.GroupLayout jpInsumosLayout = new javax.swing.GroupLayout(jpInsumos);
        jpInsumos.setLayout(jpInsumosLayout);
        jpInsumosLayout.setHorizontalGroup(
            jpInsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInsumosLayout.createSequentialGroup()
                .addComponent(jpSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 392, Short.MAX_VALUE)
                .addComponent(jpBotonCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jspInsumos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jpInsumosLayout.setVerticalGroup(
            jpInsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInsumosLayout.createSequentialGroup()
                .addGroup(jpInsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpBotonCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspInsumos, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 822, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpInsumos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 462, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpInsumos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jbAnyadirInsumo;
    private javax.swing.JLabel jlIconSearch;
    private javax.swing.JPanel jpBotonCrear;
    private javax.swing.JPanel jpInsumos;
    public javax.swing.JPanel jpSearch;
    public javax.swing.JScrollPane jspInsumos;
    public javax.swing.JTable jtInsumos;
    private javax.swing.JTextField jtfSearch;
    // End of variables declaration//GEN-END:variables
}
