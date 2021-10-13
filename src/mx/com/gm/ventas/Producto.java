package mx.com.gm.ventas;

public class Producto {

    private int  idproducto ;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    private Producto() {

        this.idproducto = ++Producto.contadorProductos;

    }

    public Producto(String nombre, double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;

    }

    public int getIdproducto() {
        return idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "idproducto=" + idproducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }

}
