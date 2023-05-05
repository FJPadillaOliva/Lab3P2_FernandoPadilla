
package lab3p2_fernandopadilla;
import java.util.*;

public class Lab3P2_FernandoPadilla {

    static Scanner read = new Scanner(System.in);
    static ArrayList<Productos> productos = new ArrayList();
    
    public static void main(String[] args) {
        int opcion = 0;
        do{
        System.out.println("	Menu\n"
                + "----------------------\n"
                + "1-Agregar Comida\n"
                + "2-Agregar Bebida\n"
                + "3-Modificar Productos\n"
                + "4-Eliminar Productos\n"
                + "5-Mostrar Productos\n"
                + "6-Generar Compra\n"
                + "7-Registro Compras\n"
                + "8-Salida\n");
        opcion = read.nextInt();
        switch(opcion){
            case 1:
                agregarC();
                break;
            case 2:
                agregarB();
                break;
            case 3:
                imprimirL();
                /*int tipo = 0;
                do{
                    System.out.println("Ingrese el tipo de producto a modificar(1-Comida/2-Bebida): ");
                    tipo = read.nextInt();
                }while(tipo!= 1 || tipo!= 2);
                System.out.println("Ingrese el indice del producto: ");
                int indice = read.nextInt();
                modificarP(tipo, indice);*/
                break;
            case 4:
                
                break;
            case 5:
                
                break;
            case 6:
                
                break;
            case 7:
                
                break;
            case 8:
                opcion = 8;
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        }while(opcion != 8);
    }
    
    public static void agregarC(){
        boolean expirado = false;
        System.out.println("Ingrese el nombre del producto de comida: ");
        read.nextLine();
        String nombre = read.nextLine();
        double precio;
        do{
            System.out.println("Ingrese el precio del producto de comida: ");
            precio = read.nextDouble();
        }while(precio<0);
        int estado;
        do{
            System.out.println("Ingrese el estado de vencimiento del producto (0-Uso optimo/1-Expirado)");
            estado = read.nextInt();
            switch(estado){
                case 0:
                    expirado = false;
                    break;
                case 1:
                    expirado = true;
                    break;
                default: 
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(estado<0 || estado >1);
        productos.add(new Comidas(expirado, nombre, precio));
    }
    
    public static void agregarB(){
     System.out.println("Ingrese el nombre de la bebida: ");
        read.nextLine();
        String nombre = read.nextLine();
        double precio;
        do{
            System.out.println("Ingrese el precio de la bebida: ");
            precio = read.nextDouble();
        }while(precio<0);
        int size;
        do{
            System.out.println("Ingrese el tamaño de la bebida: ");
            size = read.nextInt();
        }while(size<0);
        productos.add(new Bebidas(size, nombre, precio));
    }
    
    public static void imprimirL(){
        System.out.println("Comidas: ");
        for (Productos t : productos) {
            if (t instanceof Comidas) {
                System.out.println(t);
            }
        }
        System.out.println("Bebidas: ");
        for (Productos t : productos) {
            if (t instanceof Bebidas) {
                System.out.println(t);
            }
        }
    }
    
    public static void modificarP(int tipo, int indice){
        switch (tipo){
            case 1:
                boolean expirado = false;
                System.out.println("Ingrese el nuevo nombre del producto de comida: ");
                String nombre = read.next();
                double precio;
                do {
                    System.out.println("Ingrese el nuevo precio del producto de comida: ");
                    precio = read.nextDouble();
                } while (precio < 0);
                int estado;
                do {
                    System.out.println("Ingrese el nuevo estado de vencimiento del producto (0-Uso optimo/1-Expirado)");
                    estado = read.nextInt();
                    switch (estado) {
                        case 0:
                            expirado = false;
                            break;
                        case 1:
                            expirado = true;
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                } while (estado < 0 || estado > 1);
                break;
            case 2:
                
                break;
        }
    }
}
