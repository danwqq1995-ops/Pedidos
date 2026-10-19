void main() {

    Pedidos p1 = new Pedidos("Raul Domingues", 34.3);
    Pedidos p2 = new Pedidos("Gabriel Rivera", 7.1);
    Pedidos p3 = new Pedidos("Leo Flores", 12.2);

    System.out.println("--PEDIDO 1--");
    p1.mostrarInformacion();
    System.out.println("--PEDIDO 2--");
    p2.mostrarInformacion();
    System.out.println("--PEDIDO 3--");
    p3.mostrarInformacion();

    //Cambio estado//
    System.out.println(" ");
    p1.confirmar();
    System.out.println("---CONFIRMADO--- ");
    p2.confirmar();
    System.out.println(" ");

    System.out.println("--PEDIDO 1--");
    p1.mostrarInformacion();
    System.out.println("--PEDIDO 2--");
    p2.mostrarInformacion();
    System.out.println("--PEDIDO 3--");
    p3.mostrarInformacion();

    System.out.println(" ");
    System.out.println("--VENTAS TOTALES--");
    Pedidos.mostrarVentasTotales();




}