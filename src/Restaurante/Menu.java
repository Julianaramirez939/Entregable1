package Restaurante;

import javax.swing.*;

public class Menu {
    public static void main(String[] args) {
        String nombreUsuario = JOptionPane.showInputDialog("Por favor, ingrese su nombre:");
        int codMenuPpal = 0;
        int cantidadPlatosComprados = 0;
        int cantidadPlatosTipicos = 0;
        int cantidadPlatosALaCarta = 0;
        int cantidadPlatosInternacionales = 0;
        int totalAPagar = 0;

        do {
            String menu = "MENU RESTAURANTE\n\n";
            menu += "1. Platos Típicos\n";
            menu += "2. Platos a la Carta\n";
            menu += "3. Platos Internacionales\n";
            menu += "4. Salir\n\n";
            menu += "Por favor seleccione una opción \n";
            codMenuPpal = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (codMenuPpal) {
                case 1:
                    int[] resultadoTipico = mostrarMenuTipico();
                    cantidadPlatosTipicos += resultadoTipico[0];
                    cantidadPlatosComprados += resultadoTipico[0];
                    totalAPagar += resultadoTipico[1];
                    break;

                case 2:
                    int[] resultadoCarta = mostrarMenuPlatosALaCarta();
                    cantidadPlatosALaCarta += resultadoCarta[0];
                    cantidadPlatosComprados += resultadoCarta[0];
                    totalAPagar += resultadoCarta[1];
                    break;

                case 3:
                    int[] resultadoInternacional = mostrarMenuPlatosInternacionales();
                    cantidadPlatosInternacionales += resultadoInternacional[0];
                    cantidadPlatosComprados += resultadoInternacional[0];
                    totalAPagar += resultadoInternacional[1];
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Factura: Muchas gracias por realizar el pedido, " + nombreUsuario + ".\n" +
                            "Usted compró " + cantidadPlatosComprados + " platos en total.\n" +
                            "De los cuales: " + cantidadPlatosTipicos + " fueron platos típicos,\n" +
                            cantidadPlatosALaCarta + " fueron platos a la carta,\n" +
                            "y " + cantidadPlatosInternacionales + " fueron platos internacionales.\n" +
                            "Su total a pagar es de: $" + totalAPagar);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "No corresponde a un código válido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        } while (codMenuPpal != 4);
    }

    private static int[] mostrarMenuTipico() {
        int codMenuTipico = 0;
        int cantidadPlatos = 0;
        int totalAPagar = 0;
        do {
            String menuTipico = "MENU TIPICO\n\n";
            menuTipico += "1. Frijoles\n";
            menuTipico += "2. Sopa de Verduras\n";
            menuTipico += "3. Regresar\n\n";
            menuTipico += "Por favor seleccione los platos que desea consumir \n";
            codMenuTipico = Integer.parseInt(JOptionPane.showInputDialog(menuTipico));

            switch (codMenuTipico) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de frijoles, el costo es de $12000");
                    cantidadPlatos++;
                    totalAPagar += 12000;
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Se ha solicitado una Sopa de Verduras, el costo es de $8000");
                    cantidadPlatos++;
                    totalAPagar += 8000;
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No corresponde a un código válido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        } while (codMenuTipico != 3);
        return new int[]{cantidadPlatos, totalAPagar};
    }

    private static int[] mostrarMenuPlatosALaCarta() {
        int codMenuCarta = 0;
        int cantidadPlatos = 0;
        int totalAPagar = 0;
        do {
            String menuCarta = "MENU PLATOS A LA CARTA\n\n";
            menuCarta += "1. Bandeja Paisa\n";
            menuCarta += "2. Arroz con pollo\n";
            menuCarta += "3. Regresar\n\n";
            menuCarta += "Por favor seleccione los platos que desea consumir \n";
            codMenuCarta = Integer.parseInt(JOptionPane.showInputDialog(menuCarta));

            switch (codMenuCarta) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Se ha solicitado una Bandeja Paisa, el costo es de $50000");
                    cantidadPlatos++;
                    totalAPagar += 50000;
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Arroz con pollo, el costo es de $15000");
                    cantidadPlatos++;
                    totalAPagar += 15000;
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No corresponde a un código válido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        } while (codMenuCarta != 3);
        return new int[]{cantidadPlatos, totalAPagar};
    }

    private static int[] mostrarMenuPlatosInternacionales() {
        int codMenuInternacional = 0;
        int cantidadPlatos = 0;
        int totalAPagar = 0;
        do {
            String menuInternacional = "MENU PLATOS INTERNACIONALES\n\n";
            menuInternacional += "1. Tacos\n";
            menuInternacional += "2. Arroz chino\n";
            menuInternacional += "3. Regresar\n\n";
            menuInternacional += "Por favor seleccione una opción \n";
            codMenuInternacional = Integer.parseInt(JOptionPane.showInputDialog(menuInternacional));

            switch (codMenuInternacional) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Tacos, el costo es de $12000");
                    cantidadPlatos++;
                    totalAPagar += 12000;
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Arroz chino, el costo es de $25000");
                    cantidadPlatos++;
                    totalAPagar += 25000;
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No corresponde a un código válido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        } while (codMenuInternacional != 3);
        return new int[]{cantidadPlatos, totalAPagar};
    }
}