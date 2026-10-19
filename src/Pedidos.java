public class Pedidos {

    private int numero;
    private String cliente;
    private double total;
    private String estado;

    private static int contadorPedidos = 0;
    private static int ventasTotales = 0;

    public Pedidos(String cliente, double total) {
        ++contadorPedidos;
        this.numero = contadorPedidos;
        this.cliente = cliente;
        this.total = total;
        this.estado = "Pendiente";
    }

    public void mostrarInformacion(){
        System.out.println("El numero es: " + numero);
        System.out.println("El cliente es: " + cliente);
        System.out.println("El total es: " + total);
        System.out.println("Estado: " + estado);
    }

    public void confirmar(){
        estado = "Confirmado";
        ventasTotales++;
    }

    public static void mostrarVentasTotales() {
        System.out.println(ventasTotales);
    }



}
