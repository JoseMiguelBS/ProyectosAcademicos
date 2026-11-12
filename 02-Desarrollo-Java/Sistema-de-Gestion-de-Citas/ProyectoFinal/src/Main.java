import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		int opcion = 0;
		int id=0;
		String nombre = null;
		
		Cola cola = new Cola();
		
		
		do {
			
			try {
				
				opcion=Integer.parseInt(JOptionPane.showInputDialog(null, 
						
					" Menu de opciones \n \n"
				  +"1. Insertar Informacon\n"
				  +"2. Extraer Informacion\n"
				  +"3. Mostrar contenido\n"
				  +"4. Salir\n\n"));
				
				switch(opcion) {
				
				case 1:
					
					id=Integer.parseInt(JOptionPane.showInputDialog(null,
							"Ingrese la cedula "));
					        cola.InsertarCola(id, nombre);
					        
					        nombre=JOptionPane.showInputDialog(null,
					         "Ingrese el nombre");
					        cola.InsertarCola(id, nombre);
					
					
					break;
				case 2:
					
					if(!cola.ColaVacia()) {
						
						JOptionPane.showMessageDialog(null,"Se extrajo la informacion con el valor" + cola.ExtraerCola());
					}
					else {
						JOptionPane.showMessageDialog(null,"No hay informacion");
						
					}
					
					break;
				case 3:
					
					cola.MostrarCola();
					
					break;
				case 4:
					
					opcion=4;
					break;
				default:
					
					JOptionPane.showMessageDialog(null,"Opcion no disponibe");
					
					break;	 
				}
				
			}catch(Exception e) {
				
				
			}	
		}while(opcion!=4);
		

	}

}
