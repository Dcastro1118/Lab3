
package proyectoordencompra;


public class Producto {
    public static String fabricante;
    public static String nombre;
    public static int precio;

    public Producto() {
    }

    public Producto(String fabricante, String nombre, int precio) {
        this.fabricante = fabricante;
        this.nombre = nombre;
        this.precio = precio;
    }
      
    public static String getFabricante() {
        return fabricante;
    }

    public static void setFabricante(String fabricante) {
        Producto.fabricante = fabricante;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Producto.nombre = nombre;
    }

    public static int getPrecio() {
        return precio;
    }

    public static void setPrecio(int precio) {
        Producto.precio = precio;
    }
    
    
    
}
