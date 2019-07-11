/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Magneto
 */
public class CTextField extends JTextField implements FocusListener{

    private Color borderColor = new Color(145,228,251);
    
    public CTextField()
    {
        super();
        
        CTextField.this.setText("");
        
        CTextField.this.setForeground(new Color(0,0,0));
        
        CTextField.this.setBackground(new Color(255,255,255));
        
        CTextField.this.setPreferredSize(new Dimension(200,36));
        
        CTextField.this.setVisible(true);
        
        CTextField.this.setFont(new Font("Arima Amurai", Font.PLAIN, 18));
        
        CTextField.this.setBorder(new EmptyBorder(0,12,0,12));
        
        CTextField.this.setCaretColor(new Color(0,0,0));
        
        CTextField.this.setSelectionColor(new Color(145,228,251));
        
        CTextField.this.setSelectedTextColor(new Color(255,255,255));
        
        CTextField.this.putClientProperty("caretWidth", 4);
        
        CTextField.this.setOpaque(false);
        
        CTextField.this.addFocusListener(CTextField.this);
    }
    
    public void paintComponent(Graphics g)
    {
        
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        Polygon fig = new Polygon();
        
        fig.addPoint(2, 2);
        fig.addPoint(getWidth(), 0);
        fig.addPoint(0, getHeight());
        
        g2.setColor(new Color(145,228,251));
        g2.fill(fig);
        
        g2.setColor(borderColor);
        g2.setStroke(new BasicStroke(3));
        g2.draw(fig);
        
        super.paintComponent(g);
    }
    
    @Override
    public void focusGained(FocusEvent e) {
        borderColor = new Color(145,228,251);
        repaint();
    }

    @Override
    public void focusLost(FocusEvent e) {
        borderColor = new Color(145,228,251);
        repaint();
    }
    
        
    
}
