
package lab3p2_fernandopadilla;


public class Comidas extends Productos {
    private boolean vencimiento;
    
    public Comidas(){
        super();
    }

    public Comidas(boolean vencimiento, String nombre, double precio) {
        super(nombre, precio);
        this.vencimiento = vencimiento;
    }

    public boolean isVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(boolean vencimiento) {
        this.vencimiento = vencimiento;
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
        return "Nombre = " + nombre + '\n' +"Precio = "+ precio + "Lps. \n" +  "Expirado = " + vencimiento + '\n';
    }
    
}
