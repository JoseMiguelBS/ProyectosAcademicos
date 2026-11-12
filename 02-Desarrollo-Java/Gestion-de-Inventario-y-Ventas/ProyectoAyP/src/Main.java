import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
    Inventario inventario = new Inventario();
    Vender ventas = new Vender();
   
	Scanner sc = new Scanner(System.in);
	
	int opcion=0;
    
	
	while(opcion!=5){
		
		String nombreProducto = null;
		double precioProducto = 0;
		
	System.out.println("****MENU****");
	System.out.println("1.Inventario.");
	System.out.println("2.Vender Productos");
	System.out.println("3.Factura.");
	System.out.println("5. Salir");
    System.out.println("--------------"); 
    opcion=Integer.parseInt(sc.nextLine());
     	
	if(opcion==1) {
		
	 inventario.AgregarProducto(nombreProducto, precioProducto);
		
		
	}else if(opcion==2) {
		
		String productoVenta=null;
		
		ventas.mostrar(nombreProducto, precioProducto);
		
		System.out.println("Que producto desea comprar");
		productoVenta=sc.next();
		
		ventas.Ventas(nombreProducto, precioProducto,productoVenta);
		
	}else if(opcion==3) {
        
		
        
        }
	
	}
	
	}

}
