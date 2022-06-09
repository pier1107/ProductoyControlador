public class Main {

    public static void main(String args[])
    {
        ProductoControlador productoControlador = new ProductoControlador(5);
        System.out.println("------------- Lista de Productos -------------");
        productoControlador.agregar("Inca Kola 3lt", 646548,11.50);
        productoControlador.agregar("Leche Evaporada Gloria", 896521, 3.50);
        productoControlador.agregar("Agua Vida 2lt", 445345, 5.00);
        productoControlador.agregar("Milo 400gr", 1651651,15.00);
        productoControlador.agregar("Mayonesa Alacena 350gr", 6468284,8.50);
        productoControlador.listar2();

        System.out.println("------------- Buscar Producto -------------");

        int Producto = 6468284 ;

        Producto encontrado;

        encontrado = productoControlador.buscar(Producto);

        if(encontrado != null)
        {
            System.out.println("Producto encontrado: "+encontrado.getNombres());

        } else {

            System.out.println("No se encontro en stock: "+Producto);
        }

    }
}
