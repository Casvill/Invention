package model;

/**
 *
 * @author jepabon
 */
public class Producto extends Base {
    
    private String codigo;
    private String descripcion;
    private double valorBruto;
    private double descuento;
    private double subtotal;
    private double iva;
    private double valorNeto;
    private double costo;
    
    public Producto(int id) {
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

    public boolean cambiarValorBruto(double valorBruto) {
        this.valorBruto = valorBruto;
        return true;
    }
    
    public double obtenerValorBruto() {
        return this.valorBruto;
    }

    public boolean cambiarDescuento(double descuento) {
        this.descuento = descuento;
        return true;
    }
    
    public double obtenerDescuento() {
        return this.descuento;
    }

    public boolean cambiarSubtotal(double subtotal) {
        this.subtotal = subtotal;
        return true;
    }
    
    public double obtenerSubtotal() {
        return this.subtotal;
    }

    public boolean cambiarIva(double iva) {
        this.iva = iva;
        return true;
    }
    
    public double obtenerIva() {
        return this.iva;
    }

    public boolean cambiarValorNeto(double valorNeto) {
        this.valorNeto = valorNeto;
        return true;
    }
    
    public double obtenerValorNeto() {
        return this.valorNeto;
    }

    public boolean cambiarCosto(double costo) {
        this.costo = costo;
        return true;
    }
    
    public double obtenerCosto() {
        return this.costo;
    }
}
