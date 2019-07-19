package model;

/**
 *
 * @author jepabon
 */
public class Reserva extends Base {
    
    private Cliente cliente;
    
    public Reserva(int id) {
        super(id);
    }
    
    public boolean cambiarCliente(Cliente cliente) {
        this.cliente = cliente;
        return true;
    }
    
    public Cliente obtenerCliente() {
        return this.cliente;
    }
}
