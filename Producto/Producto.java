public class Producto {

    private String nombres;
    private int codigo;
    private double precio;

    public Producto(String nombres, int codigo, Double precio)
    {
        this.nombres = nombres;
        this.codigo = codigo; 
        this.precio = precio;

    }

    public String getNombres() {
        return nombres;
    }

    public int getCodigo() {
        return codigo;
    }
    public double getPrecio(){
        return precio;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setPrecio(float precio){
        this.precio = precio;
    }

    public void listarProducto()
    {
        System.out.println("Nombre de Producto: " + this.getNombres());
        System.out.println("Codigo de Producto: " + this.getCodigo());
        System.out.println("Precio en Soles:" + this.getPrecio());
        System.out.println("---------------------------------------------");
    }
}
