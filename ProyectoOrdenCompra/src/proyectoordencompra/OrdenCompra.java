
package proyectoordencompra;

import java.time.LocalDate;
import java.util.ArrayList;

public class OrdenCompra {
    
    private int identificador;
    private static String descripcion;
    private static LocalDate date;
    private static Cliente cliente;
    private static ArrayList<Producto> productos = new ArrayList<>();
    public static ArrayList<OrdenCompra> Ordenes = new ArrayList<>();   
    public OrdenCompra() {
    }

    public OrdenCompra(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.date = LocalDate.now();
        this.cliente = cliente;
        this.identificador = 1;
    }
    
    public static ArrayList getLista(){
        return productos;
    }
            

    public int getIdentificador() {
        return identificador;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public LocalDate getDate(){
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }

    public static Cliente getCliente(){
        return cliente;
    
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public static void addProducto (Producto producto){
        productos.add(producto);
 
    }

        public static OrdenCompra obtenerOrden (int identificador) {
            
        for (OrdenCompra orden : Ordenes) {

            if (orden.getIdentificador()== identificador) {
                return orden;
            }
        }
        return null;
    }
      
}
