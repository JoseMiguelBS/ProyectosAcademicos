import javax.swing.JOptionPane;

public class Cola {

	private NodoCola InicioCola, FinalCola;
	
	String Cola = "";
	
	public Cola() {
		
		InicioCola = null;
		FinalCola= null;
		
	}
	
	public boolean ColaVacia() {
		
		if(InicioCola==null) {
			return true;
		}else {
			
			return false;
		}
	}
	
    public void InsertarCola(int id,String nombre) {
    	
    	NodoCola newNodo = new NodoCola();
    	newNodo.id = id;
    	newNodo.nombre=nombre;
    	newNodo.next=null;
    	
    	if(ColaVacia()) {
    		
    		InicioCola = newNodo;
    		FinalCola = newNodo;
    		
    	}else {
    		
    		FinalCola.next=newNodo;
    		FinalCola=newNodo;
    		
    	}
    	
    }
    
    public int ExtraerCola() {
    	
    	if(!ColaVacia()) {
    		
    		int informacion = InicioCola.informacion;
    		
    		if(InicioCola == FinalCola) {
    			
    			InicioCola=null;
    			FinalCola=null;	
    		}else {
    			
    			InicioCola=InicioCola.next;
    			
    		}
    		return informacion;
    		
    	}else {
    		
    		return Integer.MAX_VALUE;
    	}
    }
	
    
    public void MostrarCola() {
    	
    	NodoCola recorrido = InicioCola;
    	String ColaInvertida=" ";
    	
    	while(recorrido !=null ) {
    		
    		Cola +=recorrido.nombre+ " ";
    		recorrido=recorrido.next;
    		
    	}
    	
    	String cadena [] = Cola.split(" ");
    	
    	for(int i=cadena.length-1;i>=0;i--) {
    		
    		ColaInvertida += " "+ cadena[i];
    		
    		JOptionPane.showMessageDialog(null, ColaInvertida);
    		Cola=" ";
    			
    	}	   
    	
    }
	
}
