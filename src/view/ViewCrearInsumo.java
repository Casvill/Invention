package view;

import controller.ControladorCrearInsumo;
import controller.ControladorPanelInsumos;
import model.Conexion;

/**
 *
 * @author Daniel Castillo Villamarín
 */
public class ViewCrearInsumo extends javax.swing.JFrame {
    
    private ControladorCrearInsumo control;
    private int x,y;

    public ViewCrearInsumo(Conexion conexion,ControladorPanelInsumos controladorPanelInsumos) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        
        control = new ControladorCrearInsumo(this,conexion,controladorPanelInsumos);

        
        if(jrbActivo.isSelected() == true)
        {
            jrbInactivo.setSelected(false);
        }
        if(jrbInactivo.isSelected()== true)
        {
            jrbActivo.setSelected(false);
        }
        
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFondo = new javax.swing.JPanel();
        jpBanner = new javax.swing.JPanel();
        jlBanner = new javax.swing.JLabel();
        jpCuerpo = new javax.swing.JPanel();
        jpCuerpoDer = new javax.swing.JPanel();
        jlCostoAlGramo = new javax.swing.JLabel();
        jtfCostoAlGramo = new javax.swing.JTextField();
        jlEstado = new javax.swing.JLabel();
        jrbActivo = new javax.swing.JRadioButton();
        jrbInactivo = new javax.swing.JRadioButton();
        jpCuerpoIzq = new javax.swing.JPanel();
        jlDescripcion = new javax.swing.JLabel();
        jtfDescripcion = new javax.swing.JTextField();
        jlCantidadInicialEnGramos = new javax.swing.JLabel();
        jtfCantidadInicialEnGramos = new javax.swing.JTextField();
        jpBotones = new javax.swing.JPanel();
        jbAceptar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jpFondo.setBackground(new java.awt.Color(255, 255, 255));
        jpFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        jpFondo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jpFondoMouseDragged(evt);
            }
        });
        jpFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpFondoMousePressed(evt);
            }
        });

        jpBanner.setBackground(new java.awt.Color(145, 228, 251));

        jlBanner.setFont(new java.awt.Font("Arima Madurai", 0, 36)); // NOI18N
        jlBanner.setForeground(new java.awt.Color(102, 102, 102));
        jlBanner.setText("CREAR INSUMO");

        javax.swing.GroupLayout jpBannerLayout = new javax.swing.GroupLayout(jpBanner);
        jpBanner.setLayout(jpBannerLayout);
        jpBannerLayout.setHorizontalGroup(
            jpBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBannerLayout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jlBanner)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpBannerLayout.setVerticalGroup(
            jpBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBannerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlBanner)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpCuerpo.setBackground(new java.awt.Color(255, 255, 255));

        jpCuerpoDer.setBackground(new java.awt.Color(255, 255, 255));

        jlCostoAlGramo.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jlCostoAlGramo.setText("Costo al gramo:");

        jlEstado.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jlEstado.setText("Estado:");

        jrbActivo.setBackground(new java.awt.Color(255, 255, 255));
        jrbActivo.setText("Activo");

        jrbInactivo.setBackground(new java.awt.Color(255, 255, 255));
        jrbInactivo.setText("Inactivo");

        javax.swing.GroupLayout jpCuerpoDerLayout = new javax.swing.GroupLayout(jpCuerpoDer);
        jpCuerpoDer.setLayout(jpCuerpoDerLayout);
        jpCuerpoDerLayout.setHorizontalGroup(
            jpCuerpoDerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCuerpoDerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCuerpoDerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfCostoAlGramo)
                    .addGroup(jpCuerpoDerLayout.createSequentialGroup()
                        .addGroup(jpCuerpoDerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbInactivo)
                            .addComponent(jrbActivo)
                            .addComponent(jlCostoAlGramo)
                            .addComponent(jlEstado))
                        .addGap(0, 93, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpCuerpoDerLayout.setVerticalGroup(
            jpCuerpoDerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCuerpoDerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlCostoAlGramo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfCostoAlGramo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jlEstado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbActivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbInactivo)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jpCuerpoIzq.setBackground(new java.awt.Color(255, 255, 255));

        jlDescripcion.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jlDescripcion.setText("Descripción:");

        jlCantidadInicialEnGramos.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jlCantidadInicialEnGramos.setText("Cantidad inicial en gramos:");

        javax.swing.GroupLayout jpCuerpoIzqLayout = new javax.swing.GroupLayout(jpCuerpoIzq);
        jpCuerpoIzq.setLayout(jpCuerpoIzqLayout);
        jpCuerpoIzqLayout.setHorizontalGroup(
            jpCuerpoIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCuerpoIzqLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCuerpoIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfDescripcion)
                    .addGroup(jpCuerpoIzqLayout.createSequentialGroup()
                        .addGroup(jpCuerpoIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlDescripcion)
                            .addComponent(jlCantidadInicialEnGramos))
                        .addGap(0, 31, Short.MAX_VALUE))
                    .addComponent(jtfCantidadInicialEnGramos))
                .addContainerGap())
        );
        jpCuerpoIzqLayout.setVerticalGroup(
            jpCuerpoIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCuerpoIzqLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlDescripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jlCantidadInicialEnGramos)
                .addGap(18, 18, 18)
                .addComponent(jtfCantidadInicialEnGramos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpCuerpoLayout = new javax.swing.GroupLayout(jpCuerpo);
        jpCuerpo.setLayout(jpCuerpoLayout);
        jpCuerpoLayout.setHorizontalGroup(
            jpCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCuerpoLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jpCuerpoIzq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jpCuerpoDer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jpCuerpoLayout.setVerticalGroup(
            jpCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCuerpoDer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpCuerpoIzq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpBotones.setBackground(new java.awt.Color(255, 255, 255));

        jbAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonAceptar.png"))); // NOI18N
        jbAceptar.setBorder(null);
        jbAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAceptar.setFocusPainted(false);
        jbAceptar.setFocusable(false);

        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonCancelar.png"))); // NOI18N
        jbCancelar.setBorder(null);
        jbCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbCancelar.setFocusPainted(false);
        jbCancelar.setFocusable(false);

        javax.swing.GroupLayout jpBotonesLayout = new javax.swing.GroupLayout(jpBotones);
        jpBotones.setLayout(jpBotonesLayout);
        jpBotonesLayout.setHorizontalGroup(
            jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBotonesLayout.createSequentialGroup()
                .addComponent(jbAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jbCancelar))
        );
        jpBotonesLayout.setVerticalGroup(
            jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBotonesLayout.createSequentialGroup()
                .addGroup(jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbAceptar)
                    .addComponent(jbCancelar))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpFondoLayout = new javax.swing.GroupLayout(jpFondo);
        jpFondo.setLayout(jpFondoLayout);
        jpFondoLayout.setHorizontalGroup(
            jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpFondoLayout.createSequentialGroup()
                .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFondoLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jpCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpFondoLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jpBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jpFondoLayout.setVerticalGroup(
            jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondoLayout.createSequentialGroup()
                .addComponent(jpBanner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jpCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jpBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpFondoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpFondoMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jpFondoMouseDragged

    private void jpFondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpFondoMousePressed
        x=evt.getX();
        y=evt.getY();
    }//GEN-LAST:event_jpFondoMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jbAceptar;
    public javax.swing.JButton jbCancelar;
    private javax.swing.JLabel jlBanner;
    private javax.swing.JLabel jlCantidadInicialEnGramos;
    private javax.swing.JLabel jlCostoAlGramo;
    private javax.swing.JLabel jlDescripcion;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JPanel jpBanner;
    private javax.swing.JPanel jpBotones;
    private javax.swing.JPanel jpCuerpo;
    private javax.swing.JPanel jpCuerpoDer;
    private javax.swing.JPanel jpCuerpoIzq;
    private javax.swing.JPanel jpFondo;
    public javax.swing.JRadioButton jrbActivo;
    public javax.swing.JRadioButton jrbInactivo;
    public javax.swing.JTextField jtfCantidadInicialEnGramos;
    public javax.swing.JTextField jtfCostoAlGramo;
    public javax.swing.JTextField jtfDescripcion;
    // End of variables declaration//GEN-END:variables
}
