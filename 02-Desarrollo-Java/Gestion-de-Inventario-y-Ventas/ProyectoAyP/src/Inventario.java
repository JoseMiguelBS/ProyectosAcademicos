
import java.util.Scanner;

public class Inventario {

  public  Linklist nodo = new Linklist();

    public void AgregarProducto(String nombreProducto, double precioProducto) {

        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        String productoEliminar = null;
        String buscarProducto=null;
        
        System.out.println("-------------------");
        System.out.println("1.Agregar Producto");
        System.out.println("2.Eliminar Producto");
        System.out.println("3.Buscar producto");
        System.out.println("4.Modificar producto");
        System.out.println("5.Mostrar Productos");
        System.out.println("-------------------");
        opcion = Integer.parseInt(sc.nextLine());

        if (opcion == 1) {
            
            System.out.println("Ingrese el nombre del producto");
            nombreProducto = sc.nextLine();

            System.out.println("Ingrese el precio del producto");
            precioProducto = Integer.parseInt(sc.nextLine());
            
            nodo.insetarFinal(nombreProducto, precioProducto);

        } else if (opcion == 2) {

            System.out.println("Que producto desea eliminar");
            productoEliminar = sc.next();
            
            nodo.eliminarDato(productoEliminar, nombreProducto);
            System.out.println(" ");
            System.out.println("El producto eliminado es: \n "+productoEliminar);
            System.out.println(" ");

        } else if (opcion == 3) {
        		
           System.out.println("Que producto que desea buscar");
           buscarProducto = sc.next();
           
           if(nodo.buscarDato(buscarProducto)) {
        	   
        	   System.out.println(" ");
        	   System.out.println("El producto buscado es: ");
        	   System.out.println(buscarProducto);
        	   System.out.println(" ");
        	   
           }else {
        	   
        	   System.out.println("El dato no se encuentra");
        	   
           }
             
        }
        else if(opcion==4) {
            
            nodo.showAll(nombreProducto , precioProducto);
            
            
           }

    }

}
