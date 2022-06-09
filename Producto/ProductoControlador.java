public class ProductoControlador {

    private Producto productos[];

    private int contador;

    public ProductoControlador(int size)
    {
        this.productos = new Producto[size];

        this.contador = 0;
    }

    public void agregar(String nombres, int codigo, Double precio)
    {
        this.productos[this.contador] = new Producto(nombres, codigo, precio);

        this.contador++;
    }

    public Producto buscar(int codigo)
    {
        int i;

        for(i=0; i<this.contador; i++)
        {
            if(this.productos[i].getCodigo() == codigo)
            {
                break;
            }
        }

        if(i == this.contador)
        {
            return null;

        } else {

            return this.productos[i];
        }
    }

    public Producto[] listar()
    {
        return this.productos;
    }

    public void listar2()
    {
        for(Producto i : productos){
            i.listarProducto();
            }
    }
}
