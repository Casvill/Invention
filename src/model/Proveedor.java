package model;

import java.util.Date;

/**
 *
 * @author jepabon
 */
public class Proveedor extends Base {
    
    private String nombre;
    private String tipoDocumento;
    private String identificacion;
    private String direccion;
    private String telefono;
    
    public Proveedor(int id) {
        super(id);
    }
    
    public boolean cambiarNombre(String nombre) {
        this.nombre = nombre;
        return true;
    }
    
    public String obtenerNombre() {
        return this.nombre;
    }
    
    public boolean cambiarTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
        return true;
    }
    
    public String obtenerTipoDocumento() {
        return this.tipoDocumento;
    }
    
    public boolean cambiarIdentificacion(String identificacion) {
        this.identificacion = identificacion;
        return true;
    }
    
    public String obtenerIdentificacion() {
        return this.identificacion;
    }
    
    public boolean cambiarDireccion(String direccion) {
        this.direccion = direccion;
        return true;
    }
    
    public String obtenerDireccion() {
        return this.direccion;
    }
    
    public boolean cambiarTelefono(String telefono) {
        this.telefono = telefono;
        return true;
    }
    
    public String obtenerTelefono() {
        return this.telefono;
    }
}
