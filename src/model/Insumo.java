package model;

/**
 *
 * @author jepabon
 */
public class Insumo extends Base {
    
    private String codigo;
    private String descripcion;
    private double cantidadTotalEnGramos;
    private double costoAlGramo;
    private double stockMinimo;
    
    public Insumo(int id) {
        super(id);
    }
    
    public boolean cambiarCodigo(String codigo) {
        this.codigo = codigo;
        return true;
    }
    
    public String obtenerCodigo() {
        return this.codigo;
    }
    
    public boolean cambiarDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return true;
    }
    
    public String obtenerDescripcion() {
        return this.descripcion;
    }

    public boolean cambiarCantidadTotalEnGramos(double cantidadTotalEnGramos) {
        this.cantidadTotalEnGramos = cantidadTotalEnGramos;
        return true;
    }
    
    public double obtenerCantidadTotalEnGramos() {
        return this.cantidadTotalEnGramos;
    }

    public boolean cambiarCostoAlGramo(double costoAlGramo) {
        this.costoAlGramo = costoAlGramo;
        return true;
    }
    
    public double obtenerCostoAlGramo() {
        return this.costoAlGramo;
    }

    public boolean cambiarStockMinimo(double stockMinimo) {
        this.stockMinimo = stockMinimo;
        return true;
    }
    
    public double obtenerStockMinimo() {
        return this.stockMinimo;
    }
}
