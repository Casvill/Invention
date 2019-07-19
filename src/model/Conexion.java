package model;

import java.sql.*;

//jdbc:postgresql://localhost:5432/Invention

public class Conexion {
    
    private String url;
    private String user;
    private String pass;
    
    
    private Connection conexion;
    private java.sql.Statement st;
    private ResultSet result;
    
    
    /******************************************************************************************************/
    
    //Deberá proveerse la url de donde se encuentra alojada la base de datos, el usuario y la contraseña.
    public Conexion(String url, String user, String pass)
    { 
        
        this.url=url;
        this.user=user;
        this.pass=pass;
        
        try
        {
            Class.forName("org.postgresql.Driver");//
            System.out.println("Conexion satisfactoria.");
        }catch(ClassNotFoundException error)
        {
            System.out.println("[Conexion][Conexion(String,String,String)]:"+error.getMessage());
        }
    }
    //Fin constructor con parámetros-------------------------------------------------------------------------
    
    /******************************************************************************************************/
    
    //Método para enviar una query que no retorna nada del servidor:--------------------------------------
    public boolean ejecutarQuery(String query)
    {
        try 
        {
            st= conexion.createStatement();
            st.execute(query);
            return true;
        }catch (SQLException | NullPointerException error) 
        {
            System.out.println("[Conexion][ejecutarQuery(String)]:"+error.getMessage());
            return false;
        }
    }
    //Fin ejecutarQuery()---------------------------------------------------------------------------------
    
    /******************************************************************************************************/
    
    //Método para enviar una query que retorna algo del servidor:-----------------------------------------------------
    public ResultSet ejecutarQueryResult(String query)
    { 
        try 
        {
            st= conexion.createStatement();
            result = st.executeQuery(query);
      
        }catch (SQLException | NullPointerException error) 
        {
            System.out.println("[Conexion][ejecutarQueryResult(String)]:"+error.getMessage());
        }
        
        return result;
    }
    //Fin ejecutarQueryResult()---------------------------------------------------------------------------
    
    /******************************************************************************************************/
    
    public void abrirConexion()
    {
        try 
        {
            conexion = DriverManager.getConnection(url,user,pass);
            //System.out.println("Conexion abierta.");
        } catch (SQLException error) 
        {
            System.out.println("[Conexion][abrirConexion()]:"+error.getMessage());
        }
    }
    //Fin abrirConexion()-------------------------------------------------------------------------------------
    
    /******************************************************************************************************/
    
    public void cerrarConexion()
    {
        try
        {
            conexion.close();
            st.close();
            result.close();
            //System.out.println("Conexion cerrada.");
        }catch(SQLException | NullPointerException error)
        {
            System.out.println("[Conexion][cerrarConexion()]:"+error.getMessage());
        }
    }
    //Fin cerrarConexion()---------------------------------------------------------------------------------------
}
