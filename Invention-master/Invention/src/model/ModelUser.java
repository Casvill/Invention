package model;

/**
 *
 * @author Daniel Castillo Villamarín
 */
public class ModelUser {
    
    private int id;
    private String username;
    private String password;
    private boolean active;

    public ModelUser(int id, String username, String password, boolean active) 
    {
        this.id = id;
        this.username = username;
        this.password = password;
        this.active = active;
    }
    
    public boolean deleteUser()
    {
        active = false;
        return true;
    }
    
    public boolean recoverUser()
    {
        active = true;
        return true;
    }

    public int getId() 
    {
        return id;
    }

    public boolean setId(int id) 
    {
        this.id = id;
        return true;
    }

    public String getUsername() 
    {
        return username;
    }

    public boolean setUsername(String username) 
    {
        this.username = username;
        return true;
    }

    public String getPassword() 
    {
        return password;
    }

    public boolean setPassword(String password) 
    {
        this.password = password;
        return true;
    }
    
    public boolean getActive()
    {
        return this.active;
    }
}
