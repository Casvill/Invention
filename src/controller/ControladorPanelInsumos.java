package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import model.Conexion;
import view.ViewCrearInsumo;
import view.PanelInsumos;
import view.ViewDashboard;

/**
 *
 * @author Daniel Castillo Villamarín
 */
public class ControladorPanelInsumos implements ActionListener{
    
    private DefaultTableModel modeloInsumos;
    private Conexion conexion;
    private PanelInsumos panelInsumos;
    private ViewCrearInsumo crearInsumo;
    
    public ControladorPanelInsumos(PanelInsumos panelInsumos,Conexion conexion)
    {
        this.panelInsumos = panelInsumos;
        this.conexion=conexion;
        
        this.panelInsumos.jbAnyadirInsumo.addActionListener(this);
        
        modeloInsumos = (DefaultTableModel) panelInsumos.jtInsumos.getModel();
        
        extraerInsumosDeDB();
    }
    
    //--------------------------------------------------------------------------
    public void extraerInsumosDeDB()
    {
        borrarTablaInsumos();
        
        
        conexion.abrirConexion();
        ResultSet rs = conexion.ejecutarQueryResult("select * from insumos");
        try
        {
            while(rs.next())
            {
                anyadirATablaInsumos(rs.getString("codinsumo"), rs.getString("descripcion"), rs.getString("cantidad"), rs.getString("costo")
                                        ,"No disponible",rs.getString("estado"));
            }
        }catch(SQLException | NullPointerException error)
        {
            System.out.println("[MainController][extraerInsumosDeDB()]:"+error.getMessage());
        }
        conexion.cerrarConexion();
    }
    //--------------------------------------------------------------------------
    
    
    //--------------------------------------------------------------------------
    public void anyadirATablaInsumos(String codProducto, String descripcion, String costoGramo, String cantGramos, 
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
    //--------------------------------------------------------------------------
    
    
    //--------------------------------------------------------------------------
    public void borrarTablaInsumos()
    {
        for (int i = modeloInsumos.getRowCount() -1; i >= 0; i--)
        {
            modeloInsumos.removeRow(i);
        }
    }
    //--------------------------------------------------------------------------
    
    
    //--------------------------------------------------------------------------
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == panelInsumos.jbAnyadirInsumo)
        {            
            crearInsumo = new ViewCrearInsumo(conexion,this);
            crearInsumo.setVisible(true);
        }
    }
}
