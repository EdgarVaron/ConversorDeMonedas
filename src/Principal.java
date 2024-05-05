import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        int opcionUsuario = 0;
        ConsultaMoneda consulta = new ConsultaMoneda();
        ArrayList<HistoricoConversion> listaDeConversiones = new ArrayList<>();
        System.out.println("---------------------------------------------------------\n");
        System.out.println("*** Bienvenido al conversor de moneda ***\n");
        System.out.println("" +
                "─▌█──║─║╔═║─║─╔═╗─\n" +
                "─███─╠═╣╠═║─║─║─║─\n" +
                "─▐█▐─║─║╚═╚═╚═╚═╝─\n" +
                "─▐▐───────────────\n" +
                "─▐▐───────────────");
        while (opcionUsuario != 3) {
            Menu menu = new Menu();
            menu.mostrarMenuPrincipal();
            opcionUsuario = menu.leerOpcionPrincipal();

            switch (opcionUsuario) {
                case 1:
                    menu.mostrarMenuMonedas("inicial");
                    String monedaBase = menu.leerOpcionMoneda();
                    menu.mostrarMenuMonedas("final");
                    String monedaFinal = menu.leerOpcionMoneda();
                    Double cantidadCambiar = menu.leerCantidadACambiar();
                    GsonInfo conversor = consulta.buscaMoneda(monedaBase);
                    Double tasaDeConversion = conversor.getConversionRate(monedaFinal.toUpperCase());
                    Double cantidadObtenida = menu.cantidadObtenida(monedaBase, cantidadCambiar, tasaDeConversion, monedaFinal);
                    HistoricoConversion nuevaConversion = new HistoricoConversion(monedaBase, monedaFinal, cantidadCambiar, cantidadObtenida);
                    listaDeConversiones.add(nuevaConversion);
                    break;
                case 2:
                    menu.imprimirConversiones(listaDeConversiones);
                    break;
                case 3:
                    System.out.println("Gracias por utilizar el conversor de moneda");
                    System.out.println("" +
                            "░░░░░░░░░░░▄▄\n" +
                            "░░░░░░░░░░█░░█\n" +
                            "░░░░░░░░░░█░░█\n" +
                            "░░░░░░░░░█░░░█\n" +
                            "░░░░░░░░█░░░░█\n" +
                            "██████▄▄█░░░░░██████▄\n" +
                            "▓▓▓▓▓█░░░░░░░░░░░░░░█\n" +
                            "▓▓▓▓▓█░░░░░░░░░░░░░░█\n" +
                            "▓▓▓▓▓█░░░░░░░░░░░░░░█\n" +
                            "▓▓▓▓▓█░░░░░░░░░░░░░░█\n" +
                            "▓▓▓▓▓█░░░░░░░░░░░░░░█\n" +
                            "▓▓▓▓▓█████░░░░░░░░░█\n" +
                            "█████▀░░░░▀▀██████▀");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción del menú.");
            }

        }
    }
}
