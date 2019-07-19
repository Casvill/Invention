//Esta clase contiene:
//Editar

//------------------------------------------------------------------------------
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Conexion;
import model.Insumo;
import view.ViewCrearInsumo;

/**
 *
 * @author Daniel Castillo Villamarín
 */
public class ControladorCrearInsumo implements ActionListener{
    
    private ViewCrearInsumo crearInsumo;
    private Conexion conexion;
    private ControladorPanelInsumos controlPanelInsumos;
    
    public ControladorCrearInsumo(ViewCrearInsumo crearInsumo,Conexion conexion,ControladorPanelInsumos controlPanelInsumos)
    {
        this.crearInsumo = crearInsumo;
        this.conexion = conexion;
        this.controlPanelInsumos = controlPanelInsumos;
        
        this.crearInsumo.jbAceptar.addActionListener(this);
        this.crearInsumo.jbCancelar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
        if(e.getSource() == crearInsumo.jbAceptar)
        {
            if(crearInsumo.jtfDescripcion.getText().trim().equals("") ||
               crearInsumo.jtfCantidadInicialEnGramos.getText().trim().equals("") ||
               crearInsumo.jtfCostoAlGramo.getText().trim().equals(""))
            {
                JOptionPane.showMessageDialog(crearInsumo, "Error, debe llenar todos los campos.");
            }
            else if(crearInsumo.jrbActivo.isSelected() == false && crearInsumo.jrbInactivo.isSelected() == false)
            {
                JOptionPane.showMessageDialog(crearInsumo, "Por favor elija el estado del insumo (Activo/Inactivo).");
            }
                
            else
            {
                if(anyadirInsumo(crearInsumo.jtfDescripcion.getText(),Float.parseFloat(crearInsumo.jtfCantidadInicialEnGramos.getText()),
                          Float.parseFloat(crearInsumo.jtfCostoAlGramo.getText()), crearInsumo.jrbActivo.isSelected()))
                {
                    JOptionPane.showMessageDialog(crearInsumo, "Insumo añadido exitosamente!!");
                    controlPanelInsumos.extraerInsumosDeDB();
                    crearInsumo.setVisible(false);
                }
                    
                
                else
                    JOptionPane.showMessageDialog(crearInsumo, "Error al tratar de añadir el insumo");
            }
            
        }
        if(e.getSource() == crearInsumo.jbCancelar)
        {
            crearInsumo.setVisible(false);
        }
        
    }
    
    public boolean anyadirInsumo(String descripcion,float cantidadInicialEnGramos,float costoAlGramo,boolean estado)
    {
        //Editar, el código no puede ser siempre 0 (cero).
        String query="insert into insumos values ('"+0+"','"+descripcion+"','"+cantidadInicialEnGramos+"','"
                     +costoAlGramo+"','"+estado+"')";

        
        //Envío de Query:-----------------------
        conexion.abrirConexion();

        if(conexion.ejecutarQuery(query) != true)
        {
            conexion.cerrarConexion();
            return false;
        }

        conexion.cerrarConexion();
        //Fin del envío de la Query.------------
            
        
        return true;
    }
    //Fin anyadirInsumo()------------------------------------------------------------------------------------
}
