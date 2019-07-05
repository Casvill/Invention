package model;

import java.util.Date;

/**
 *
 * @author jepabon
 */
public class Cliente extends Base {
    
    private String nombres;
    private String apellidos;
    private String tipoDocumento;
    private String identificacion;
    private Date fechaNacimiento;
    
    public Cliente(int id) {
        super(id);
    }
    
    public boolean cambiarNombres(String nombres) {
        this.nombres = nombres;
        return true;
    }
    
    public String obtenerNombres() {
        return this.nombres;
    }
    
    public boolean cambiarApellidos(String apellidos) {
        this.apellidos = apellidos;
        return true;
    }
    
    public String obtenerApellidos() {
        return this.apellidos;
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
    
    public boolean cambiarFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
        return true;
    }
    
    public Date obtenerFechaNacimiento() {
        return this.fechaNacimiento;
    }
}
