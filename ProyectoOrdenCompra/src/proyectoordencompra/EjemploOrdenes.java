package proyectoordencompra;

import javax.swing.JOptionPane;

public class EjemploOrdenes {

    public static void main(String[] args) {

        /////////////////// Clientes///////////////////////////////
        Cliente cliente1 = new Cliente();
        cliente1.setNombre(
                "Carlos");
        cliente1.setApellido(
                "Montiel");

        Cliente cliente2 = new Cliente();
        cliente2.setNombre(
                "Carlos");
        cliente2.setApellido(
                "Madrigal");

        Cliente cliente3 = new Cliente();
        cliente3.setNombre(
                "Luis");
        cliente3.setApellido(
                "Montero");

        OrdenCompra orden1 = new OrdenCompra("Compra del señor Carlos Montiel", cliente1);
        orden1.addProducto(new Producto("Yamaha", "Motocicleta", 2250000));
        orden1.addProducto(new Producto("Honda", "Motocicleta", 2050000));
        orden1.addProducto(new Producto("Kawasaki", "Motocicleta", 2450000));
        orden1.addProducto(new Producto("BMW", "Motocicleta", 2250000));

        OrdenCompra orden2 = new OrdenCompra("Compra nueva Carlos Madrigal", cliente2);
        orden2.addProducto(new Producto("Pulsar", "Motocicleta", 1700000));
        orden2.addProducto(new Producto("Pulsar", "Motocicleta", 1950000));
        orden2.addProducto(new Producto("Kawasaki", "Motocicleta", 2450000));
        orden2.addProducto(new Producto("Suzuki", "Motocicleta", 2250000));

        OrdenCompra orden3 = new OrdenCompra("Compra nueva Luis Montero", cliente3);
        orden3.addProducto(new Producto("Yamaha", "Cuadraciclo", 2250000));
        orden3.addProducto(new Producto("Honda", "Motocicleta", 1350000));
        orden3.addProducto(new Producto("Kawasaki", "Cuadraciclo", 2550000));
        orden3.addProducto(new Producto("Yamaha", "Sidebyside", 4250000));

        int opcion = 0;

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Cual orden de compra desea visualizar?:\n"
                        + "1. Orden #1\n"
                        + "2. Orden #2\n"
                        + "3. Orden #3\n"
                        + "4. Salir ",
                        "Digite el numero de la opcion a elegir"));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");

            }

            if (opcion > 0 && opcion < 5) {

                switch (opcion) {
                    case 1:
                        JOptionPane.showMessageDialog(null, OrdenCompra.devolverOrden(orden1));
                        opcion = 0;
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, OrdenCompra.devolverOrden(orden2));
                        opcion = 0;
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, OrdenCompra.devolverOrden(orden3));
                        opcion = 0;
                        break;
                    case 4:
                        System.exit(0);

                        break;
                    default:
                        throw new AssertionError();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese una de las opciones del menu (1-4)");
            }
        } while (opcion != 4);

    }

}
