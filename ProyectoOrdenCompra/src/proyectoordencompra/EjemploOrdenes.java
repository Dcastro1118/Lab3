package proyectoordencompra;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EjemploOrdenes {

    public static void main(String[] args) {

        
    ///////////////// Productos////////////////////////    
        Producto producto = new Producto();
        producto.setFabricante("Yamaha");
        producto.setNombre("Motocicleta");
        producto.setPrecio(2250000);
        OrdenCompra.addProducto(producto);

        Producto producto2 = new Producto();
        producto2.setFabricante("Honda");
        producto2.setNombre("Motocicleta");
        producto2.setPrecio(2050000);
        OrdenCompra.addProducto(producto);

        Producto producto3 = new Producto();
        producto3.setFabricante("Kawasaki");
        producto3.setNombre("Motocicleta");
        producto3.setPrecio(2450000);
        OrdenCompra.addProducto(producto);

        Producto producto4 = new Producto();
        producto4.setFabricante("Yamaha");
        producto4.setNombre("Motocicleta");
        producto4.setPrecio(2250000);
        OrdenCompra.addProducto(producto);

        /////////////////// Clientes///////////////////////////////
        
        Cliente cliente = new Cliente();
        cliente.setNombre("Carlos");
        cliente.setApellido("Montiel");
        
        Cliente cliente2 = new Cliente();
        cliente2.setNombre("Carlos");
        cliente2.setApellido("Montiel");
        
        
        OrdenCompra orden1 = new OrdenCompra("Compra nueva", cliente);
        orden1.addProducto(producto);
        orden1.addProducto(producto2);
        orden1.addProducto(producto3);
        OrdenCompra.Ordenes.add(orden1);


        
        OrdenCompra ordenObtenida = OrdenCompra.obtenerOrden(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el identificador de la orden:")));
        
        if (ordenObtenida != null) {
             JOptionPane.showMessageDialog(null, "La fecha fue:" + ordenObtenida.getDate() + "\n"
        + "El cliente es:" + ordenObtenida.getCliente().getNombre());
            
        } else {
        JOptionPane.showMessageDialog(null, "No se encontro registro", "Error", JOptionPane.ERROR_MESSAGE);
        }

        
        
    }

}
