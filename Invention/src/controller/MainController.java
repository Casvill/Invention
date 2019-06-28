package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.AncestorListener;
import view.ViewLogin;

/**
 *
 * @author Daniel Castillo Villamarín
 */
public class MainController implements ActionListener {
    
    private ViewLogin login;
    
    public MainController()
    {
        login = new ViewLogin();
        login.setVisible(true);
        
        //ActionListeners:------------------------------------------------------
        login.jbClose.addActionListener(this);
        //End ActionListeners.--------------------------------------------------
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == login.jbClose)
        {
            System.exit(0);
        }
    }
    
    
    
    public static void main(String args[]) 
    {
        MainController mc = new MainController();
    }
}
