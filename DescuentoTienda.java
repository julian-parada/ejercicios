public class DescuentoTienda {
    public static void main(String[] args) {
        // Precios originales
        double precioCamiseta = 25.0;
        double precioPantalon = 30.0;

        // Descuentos
        final double DESCUENTO_ESTANDAR = 0.15;
        final double DESCUENTO_ADICIONAL_CAMISETA = 0.05;

        // Cálculo del precio con descuento de la primera camiseta y el pantalón
        double precioCamisetaConDescuento = precioCamiseta - (precioCamiseta * DESCUENTO_ESTANDAR);
        double precioPantalonConDescuento = precioPantalon - (precioPantalon * DESCUENTO_ESTANDAR);

        // Cálculo del precio con descuento adicional para la segunda camiseta
        double precioSegundaCamisetaConDescuento = precioCamisetaConDescuento - (precioCamisetaConDescuento * DESCUENTO_ADICIONAL_CAMISETA);

        // Cálculo del precio total
        double precioTotal = precioCamisetaConDescuento + precioPantalonConDescuento + precioSegundaCamisetaConDescuento;

        // Mostrar resultados
        System.out.printf("Precio de la primera camiseta con descuento: $%.2f%n", precioCamisetaConDescuento);
        System.out.printf("Precio del pantalón con descuento: $%.2f%n", precioPantalonConDescuento);
        System.out.printf("Precio de la segunda camiseta con descuento adicional: $%.2f%n", precioSegundaCamisetaConDescuento);
        System.out.printf("Precio total: $%.2f%n", precioTotal);
    }
}

