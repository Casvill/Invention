//Para navegar rápido:------------
//ActionListeners
//Falta
//Button Action
//--------------------------------

package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.ViewLogin;

/**
 *
 * @author Daniel Castillo Villamarín
 */

public class MainController implements ActionListener 
{
    
    private ViewLogin login;
    
    public MainController()
    {
        login = new ViewLogin();
        login.setVisible(true);
        
        //ActionListeners:------------------------------------------------------
        login.jbClose.addActionListener(this);
        login.jbGo.addActionListener(this);
        //End ActionListeners.--------------------------------------------------
    }
    

    //Button Action:------------------------------------------------------------
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == login.jbClose)
        {
            System.exit(0);
        }
        
        if(e.getSource() == login.jbGo)
        {
            //Falta
        }
    }
    //End Button Action.--------------------------------------------------------
    
    
    public static void main(String args[]) 
    {
        MainController mc = new MainController();
    }
}
