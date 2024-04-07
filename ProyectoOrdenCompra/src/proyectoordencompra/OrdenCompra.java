package proyectoordencompra;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import proyectoordencompra.Producto;

public class OrdenCompra {

    private static int counter = 1;
    private int identificador;
    private String descripcion;
    private LocalDate date;
    private Cliente cliente;
    private ArrayList<Producto> productos = new ArrayList<>();

    public OrdenCompra() {
    }

    public OrdenCompra(String descripcion, Cliente cliente/* int identificador*/) {
        this.descripcion = descripcion;
        this.date = LocalDate.now();
        this.cliente = cliente;
        this.identificador = counter++; 
        
    }

    public ArrayList getLista() {
        return this.productos;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Cliente getCliente() {
        return cliente;

    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void addProducto(Producto producto) {
        productos.add(producto);

    }

    public static String stringProductos(OrdenCompra orden) {
        StringBuilder StringBuilder1 = new StringBuilder();
        for (var productos : orden.getProductos()) {
            StringBuilder1.append("\n Nombre de producto:").append(productos.getNombre()).append("\n").append("Nombre de fabricante:"
            ).append(productos.getFabricante()).append("\n").append("Precio:"
            ).append(Integer.toString(productos.getPrecio())).append("\n");
        }
        return StringBuilder1.toString();

    }

    public static String devolverOrden(OrdenCompra orden) {

        String productosString = stringProductos(orden);

        String textoAMostrar = "La orden de compra es la #" + orden.identificador + "\n"
                + "Identificador: " + orden.getIdentificador() + "\n"
                + "Descripcion: " + orden.getDescripcion() + "\n"
                + "Fecha: " + orden.getDate() + "\n"
                + "Cliente: " + orden.cliente.getNombre() + " " + orden.cliente.getApellido() + "\n"
                + "Productos: \n" + productosString + "\n"
                + "\n" + "\n" + "El total a pagar es de: " + devolverTotal(orden);

        return textoAMostrar;

    }
    
    public static int devolverTotal (OrdenCompra orden){
        int total = 0;
        for (Producto producto : orden.productos) {
            total += producto.precio;

        }
        return total;
    }

}

