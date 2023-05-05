
package lab3p2_fernandopadilla;


public class Bebidas extends Productos {
    private int size;

    public Bebidas() {
        super();
    }

    public Bebidas(int size, String nombre, double precio) {
        super(nombre, precio);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
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
        return "Nombre = " + nombre + '\n' +"Precio = "+ precio + "Lps. \n" + "Tamaño = " + size + ".mL "+ '\n';
    }
    
    
}
