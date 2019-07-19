//Para navegar rápido:------------
//ActionListeners
//Button Action
//EXTRACCION DB
//AÑADIR A TABLAS
//--------------------------------

package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Conexion;
import view.ViewLogin;
import view.ViewDashboard;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel Castillo Villamarín
 */

public class MainController implements ActionListener 
{
    
    private ViewLogin login;
    private ViewDashboard dashboard;
    private Conexion conexion;
    
    
    
    public MainController()
    {      
        conexion = new Conexion("jdbc:postgresql://raja.db.elephantsql.com:5432/bmuortco"
                               ,"bmuortco"
                               ,"8roxusbFnVarGYswAZkE05rMVoF51rsz");
        
        login = new ViewLogin();
        dashboard = new ViewDashboard(conexion);
        dashboard.setVisible(false);
        login.setVisible(true);
        
        
        //ActionListeners:------------------------------------------------------
        login.jbClose.addActionListener(this);
        login.jbGo.addActionListener(this);
        dashboard.jbClose.addActionListener(this);
        //End ActionListeners.--------------------------------------------------
        
    }
    //Fin constructor-----------------------------------------------------------
    

    
    //Button Action:------------------------------------------------------------
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == login.jbClose)
        {
            System.exit(0);
        }
        
        if(e.getSource() == dashboard.jbClose)
        {
            dashboard.jlBanner.setText("AGUA Y HARINA");
            dashboard.setVisible(false);
            login.setVisible(true);
        }
        
        if(e.getSource() == login.jbGo)
        {
            login.setVisible(false);
            dashboard.setVisible(true);
        }
    }
    //End Button Action.--------------------------------------------------------
    
    
   
    public static void main(String args[]) 
    {
        MainController mc = new MainController();
    }
}
