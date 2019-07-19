package model;

import java.util.ArrayList;

/**
 *
 * @author jepabon
 */
public class Compra extends Base {
    
    private String codigo;
    private Proveedor proveedor;
    private ArrayList<Insumo> insumos;
    
    public Compra(int id) {
        super(id);
    }
    
    public boolean cambiarCodigo(String codigo) {
        this.codigo = codigo;
        return true;
    }
    
    public String obtenerCodigo() {
        return this.codigo;
    }
    
    public boolean cambiarProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
        return true;
    }
    
    public Proveedor obtenerProveedor() {
        return this.proveedor;
    }

    public boolean agregarInsumo(Insumo insumo) {
        this.insumos.add(insumo);
        return true;
    }

    public boolean eliminarInsumo(int id) {
        boolean res = true;
        ArrayList<Insumo> insumos_tmp = this.insumos;
        int id_insumo = encontrarInsumo(id);

        if (id_insumo == -1) {
            res = false;
        }
        else {
            insumos_tmp.remove(id_insumo);
            this.insumos = insumos_tmp;
        }

        return res;
    }

    public ArrayList<Insumo> obtenerInsumos() {
        return this.insumos;
    }

    private int encontrarInsumo(int id) {
        int id_insumo = -1;
        for (int i=0; i < this.insumos.size(); i++) {
            if (this.insumos.get(i).getID() == id) {
                id_insumo = id;
            }
        }

        return id_insumo;
    }
}
