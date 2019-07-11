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
    private DefaultTableModel modeloInsumos;
    
    
    
    public MainController()
    {
        //Conexión con base de datos:---------------
        conexion = new Conexion("jdbc:postgresql://raja.db.elephantsql.com:5432/bmuortco"
                               ,"bmuortco"
                               ,"8roxusbFnVarGYswAZkE05rMVoF51rsz");
        //Fin Conexión.-----------------------------
        
        
        login = new ViewLogin();
        dashboard = new ViewDashboard();
        dashboard.setVisible(false);
        login.setVisible(true);
        
        
        //ActionListeners:------------------------------------------------------
        login.jbClose.addActionListener(this);
        login.jbGo.addActionListener(this);
        dashboard.jbClose.addActionListener(this);
        //End ActionListeners.--------------------------------------------------
        
        
        //Modelos de tablas:----------------------------------------------------
        modeloInsumos = (DefaultTableModel) this.dashboard.jtInsumos.getModel();
        //Fin Modelos de tablas.------------------------------------------------
        
        
        //Extracciones:---------------------------------------------------------
        extraerInsumosDeDB();
        //Fin Extracciones.-----------------------------------------------------
    }
    //Fin constructor-----------------------------------------------------------
    
    
    
    //EXTRACCIÓN DB:*****************************************************************************************************
    public void extraerInsumosDeDB()
    {
        conexion.abrirConexion();
        ResultSet rs = conexion.ejecutarQueryResult("select * from insumos");
        try
        {
            while(rs.next())
            {
                añadirATablaInsumos(rs.getString("codinsumo"), rs.getString("descripcion"), rs.getString("cantidad"), rs.getString("costo")
                                        ,"No disponible",rs.getString("estado"));
            }
        }catch(SQLException | NullPointerException error)
        {
            System.out.println("[MainController][extraerInsumosDeDB()]:"+error.getMessage());
        }
        conexion.cerrarConexion();
    }
    //Fin extraerInsumos()------------------------------------------------------------------------------------------------
    //FIN EXTRACCIÓN DB.**************************************************************************************************

    
    
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
    
    
    
    //AÑADIR A TABLAS:******************************************************************************************
    public void añadirATablaInsumos(String codProducto, String descripcion, String costoGramo, String cantGramos, 
                                         String stockMínimo, String estado)
    {
        Object []object = new Object[6];
        object[0] = codProducto;
        object[1] = descripcion;
        object[2] = costoGramo;
        object[3] = cantGramos; 
        object[4] = stockMínimo;
        
        if(estado.equals("t"))
        {object[5] = "Activo";}
        else
        {object[5] = "Inactivo";}    
                
        modeloInsumos.addRow(object);   
    }
    //Fin añadirATablaInsumos()-------------------------------------------------
    //FIN AÑADIR A TABLAS.****************************************************************************************
    
    
    
    public static void main(String args[]) 
    {
        MainController mc = new MainController();
    }
}
