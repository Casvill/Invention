package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jepabon
 */
public class Factura extends Base {
    
    private String codigoFactura;
    private Date fecha;
    private double valorBruto;
    private double descuento;
    private double subtotal;
    private double iva;
    private double valorNeto;
    private Cliente cliente;
    private ArrayList<Producto> productos;
    private boolean anulada;

    public Factura(int id) {
        super(id);
    }
    
    public boolean cambiarCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
        return true;
    }
    
    public String obtenerCodigoFactura() {
        return this.codigoFactura;
    }

    public void cambiarFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date obtenerFecha() {
        return this.fecha;
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
    
    public boolean cambiarCliente(Cliente cliente) {
        this.cliente = cliente;
        return true;
    }
    
    public Cliente obtenerCliente() {
        return this.cliente;
    }

    public boolean agregarProducto(Producto producto) {
        this.productos.add(producto);
        return true;
    }

    public boolean eliminarProducto(int id) {
        boolean res = true;
        ArrayList<Producto> productos_tmp = this.productos;
        int id_producto = encontrarProducto(id);

        if (id_producto == -1) {
            res = false;
        }
        else {
            productos_tmp.remove(id_producto);
            this.productos = productos_tmp;
        }

        return res;
    }

    public ArrayList<Producto> obtenerProductos() {
        return this.productos;
    }

    public boolean anular() {
        this.anulada = true;
        return true;
    }

    public boolean obtenerAnulada() {
        return this.anulada;
    }

    private int encontrarProducto(int id) {
        int id_producto = -1;
        for (int i=0; i < this.productos.size(); i++) {
            if (this.productos.get(i).getID() == id) {
                id_producto = id;
            }
        }

        return id_producto;
    }
}
