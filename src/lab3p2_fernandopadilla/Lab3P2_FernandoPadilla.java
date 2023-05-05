package lab3p2_fernandopadilla;

import java.util.*;

public class Lab3P2_FernandoPadilla {

    static Scanner read = new Scanner(System.in);
    static ArrayList<Productos> productos = new ArrayList();
    static ArrayList Compras = new ArrayList();

    public static void main(String[] args) {
        int opcion = 0;
        do {
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
            switch (opcion) {
                case 1:
                    agregarC();
                    break;
                case 2:
                    agregarB();
                    break;
                case 3:
                    imprimirL();
                    int tipo;
                    do {
                        System.out.println("Ingrese el tipo de producto a modificar(1-Comida/2-Bebida): ");
                        tipo = read.nextInt();
                    } while (tipo < 1 || tipo > 2);
                    System.out.println("Ingrese el nombre del producto a modificar:");
                    read.nextLine();
                    String nombre = read.nextLine();
                    modificarP(tipo, nombre);
                    break;
                case 4:
                    imprimirL();
                    do {
                        System.out.println("Ingrese el tipo de producto a eliminar(1-Comida/2-Bebida): ");
                        tipo = read.nextInt();
                    } while (tipo < 1 || tipo > 2);
                    System.out.println("Ingrese el nombre del producto a eliminar: ");
                    read.nextLine();
                    nombre = read.nextLine();
                    eliminarP(tipo,nombre);
                    break;
                case 5:
                    imprimirL();
                    break;
                case 6:
                    simularC(); 
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
        } while (opcion != 8);
    }

    public static void agregarC() {
        boolean expirado = false;
        System.out.println("Ingrese el nombre del producto de comida: ");
        read.nextLine();
        String nombre = read.nextLine();
        double precio;
        do {
            System.out.println("Ingrese el precio del producto de comida: ");
            precio = read.nextDouble();
        } while (precio < 0);
        int estado;
        do {
            System.out.println("Ingrese el estado de vencimiento del producto (0-Uso optimo/1-Expirado)");
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
        productos.add(new Comidas(expirado, nombre, precio));
    }

    public static void agregarB() {
        System.out.println("Ingrese el nombre de la bebida: ");
        read.nextLine();
        String nombre = read.nextLine();
        double precio;
        do {
            System.out.println("Ingrese el precio de la bebida: ");
            precio = read.nextDouble();
        } while (precio < 0);
        int size;
        do {
            System.out.println("Ingrese el tamaño de la bebida: ");
            size = read.nextInt();
        } while (size < 0);
        productos.add(new Bebidas(size, nombre, precio));
    }

    public static void imprimirL() {
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

    public static void modificarP(int tipo, String nombre) {
        switch (tipo) {
            case 1:
                for (Productos t : productos) {
                    if (t instanceof Comidas) {
                        if (t.getNombre().equals(nombre)) {
                            boolean estadoN = false;
                            System.out.println("Ingrese el nuevo nombre del producto: ");
                            read.nextLine();
                            String nombreN = read.nextLine();
                            t.setNombre(nombreN);
                            System.out.println("Ingrese el nuevo precio del producto: ");
                            double precio;
                            do {
                                precio = read.nextDouble();
                            } while (precio < 0);
                            t.setPrecio(precio);
                            int estado;
                            do {
                                System.out.println("Ingrese el nuevo estado de vencimiento(0-Uso optimo/1-Expirado): ");
                                estado = read.nextInt();
                            } while (estado < 0 || estado > 1);
                            if (estado == 0) {
                                estadoN = false;
                            } else {
                                estadoN = true;
                            }
                            ((Comidas) t).setVencimiento(estadoN);
                        } else {
                            System.out.println("Producto no encontrado");
                        }
                    }
                }
                break;
            case 2:
                for (Productos t : productos) {
                    if (t instanceof Bebidas) {
                        if (t.getNombre().equals(nombre)) {
                            System.out.println("Ingrese el nuevo nombre del producto: ");
                            read.nextLine();
                            String nombreN = read.nextLine();
                            t.setNombre(nombreN);
                            System.out.println("Ingrese el nuevo precio del producto: ");
                            double precio;
                            do {
                                precio = read.nextDouble();
                            } while (precio < 0);
                            t.setPrecio(precio);
                            int size;
                            do {
                                System.out.println("Ingrese el nuevo tamaño de la bebida: ");
                                size = read.nextInt();
                            } while (size < 0);
                        } else {
                            System.out.println("Producto no encontrado");
                        }
                    }
                }
                break;
        }
    }
    
    public static void eliminarP(int tipo, String nombre){
        switch(tipo){
            case 1:
                for (Productos t : productos) {
                    if (t instanceof Comidas) {
                        if(t.getNombre().equals(nombre)){
                            productos.remove(productos.indexOf(t));
                        }else{
                            System.out.println("El producto no existe");
                        }
                    }
                }
            break;
            case 2:
                for (Productos t : productos) {
                    if (t instanceof Bebidas) {
                        if(t.getNombre().equals(nombre)){
                            productos.remove(productos.indexOf(t));
                        }else{
                            System.out.println("El producto no existe");
                        }
                    }
                }
            break;
        }
    }
    
    public static void simularC() {
        imprimirL();
        int opc;
        do {
            System.out.println("	Menu\n"
                    + "----------------------\n"
                    + "1-Agregar Producto\n"
                    + "2-Imprimir total de compra\n");
            opc = read.nextInt();
            double total = 0;
            switch(opc){
                case 1:
                    System.out.println("Ingrese el nombre del producto: ");
                    read.nextLine();
                    String nombre = read.nextLine();
                    for (Productos t : productos) {
                        if (t.getNombre().equals(nombre)) {
                            Compras.add(t);
                            total += t.getPrecio();
                        }
                    }
                    break;
                case 2:
                    for (Object t : Compras) {
                        System.out.println(t);
                    }
                    System.out.println("El total a pagar es de: "+ total);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
        }
        } while (opc != 2);
    }
    
    
}
