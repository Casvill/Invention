package model;

/**
 *
 * @author jepabon
 */
public abstract class Base {
    private int id;
    private boolean active;
    
    public Base(int id) 
    {
        this.id = id;
        this.active = true;
    }
    
    public boolean delete() {
        this.active = false;
        return true;
    }
    
    public boolean recover() {
        this.active = true;
        return true;
    }
    
    public boolean getActive() {
        return this.active;
    }
    
    public int getID() {
        return this.id;
    }
}
