
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
                
                break;
            case 2:
                
                break;
            case 3:
                
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
        String nombre = read.next();
        System.out.println("Ingrese el precio del producto de comida: ");
        double precio = read.nextDouble();
        int estado= 3;
        while(estado!=0 || estado!= 1){
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
        }
        productos.add(new Comidas(expirado, nombre, precio));
    }
    
    public static void agregarB(){
        
    }
}
