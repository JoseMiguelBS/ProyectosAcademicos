import java.util.Scanner;

public class Linklist {
    int size = 0;
    NodoInventario newNodo = null;
    NodoInventario newNull = null;
    NodoInventario head = null;
    NodoInventario pointer ;
    NodoInventario primero;
    NodoInventario ultimo;

    Scanner sc = new Scanner(System.in);
    
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
   public void insetarFinal(String nombreProducto,double precioProducto) {
        newNodo = new NodoInventario(nombreProducto, precioProducto);
        if (head==null){
            head = newNodo;
        }else{
            pointer = head;
          while(pointer.getNext()!= null){
                pointer = pointer.getNext();
            }
          pointer.setNext(newNodo);
          size ++;
        }   
   }
   
   public void insertarPosicion(String nombreProducto,double precioProducto,int posicion){
       newNodo = new NodoInventario(nombreProducto, precioProducto);
       if (head==null && posicion==0){
            head = newNodo;
        }else if(posicion < size && posicion>0){
            pointer = head;
            int contador =0;
            while(posicion >= contador){
                pointer = pointer.getNext();
                contador ++;
            }
            newNodo.setNext(pointer.getNext());
            pointer.setNext(newNodo);
        }else{
            System.out.println("Posicion no valida");  
        }
      
       }
   public void showAll(String nombreProducto,double precioProducto){
       try{
           pointer = head;
           while(pointer!= null){
               System.out.println(pointer.getNombreProducto());
               System.out.println(pointer.getPrecioProducto());
               pointer = pointer.getNext();
           }
       } catch(Exception e){
           System.out.println("null");
       }
   }
   
   
public boolean buscarDato(String buscarProducto) {
	
	boolean encontrado=false;
	
	NodoInventario pointer= head;
	
	while(encontrado!=true && pointer!=null) {
		
			if(buscarProducto.equals(pointer.getNombreProducto())) {
				
				encontrado=true;
			}else {
				
				pointer=pointer.getNext();
				
			}
			if(encontrado==true)break;
	}
	
	
return encontrado;
}


public void listaSimple() {
	
	primero=null;
	ultimo=null;
}


public void eliminarDato(String productoEliminar,String nombreProducto) {
	
	NodoInventario actual ;
	NodoInventario anterior;
    
	actual=primero;
	anterior=null;
	
	while(actual!=null) {
		if(actual.getNombreProducto()==nombreProducto) {
			 if(actual==primero) {
				 primero=primero.getNext();	
			 }else {
				 
				 anterior=actual.getNext();
				 
			 }
			 anterior=actual;
			 actual=actual.getNext();	
			
		}
		
	}
	
}

public void modificarDato() {
	
	
	
}
  
}


