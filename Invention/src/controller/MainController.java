//Para navegar rápido:------------
//ActionListeners
//Button Action
//--------------------------------

package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.ViewLogin;
import view.ViewDashboard;

/**
 *
 * @author Daniel Castillo Villamarín
 */

public class MainController implements ActionListener 
{
    
    private ViewLogin login;
    private ViewDashboard dashboard;
    
    public MainController()
    {
        login = new ViewLogin();
        dashboard = new ViewDashboard();
        dashboard.setVisible(false);
        login.setVisible(true);
        
        //ActionListeners:------------------------------------------------------
        login.jbClose.addActionListener(this);
        login.jbGo.addActionListener(this);
        
        dashboard.jbClose.addActionListener(this);
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
        
        if(e.getSource() == dashboard.jbClose)
        {
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
