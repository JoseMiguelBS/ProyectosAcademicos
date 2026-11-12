import java.util.Scanner;

public class Fecha {
	
	
public void Fecha(int day, int month , int  year ) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*Seleccione la fecha que desea la cita*");
		
		System.out.println("Coloque el Mes");
		month = sc.nextInt();
		
		if(month>0 && month<12) {
			
			
			
		}else {
			
			System.out.println("Error, El mes tiene que ser mayor a 0 y menor a 12");
			
			System.out.println("Coloque el Mes");
			month = sc.nextInt();
			
		}
		
		if(month==02) {
			
			System.out.println("Coloque el Dia");
			day = sc.nextInt();	
			
			if(day>0 && day<28) {
				
				
				
			}
			else {
				
				System.out.println("Error, El dia tiene que ser mayor a 0 y menor a 28");
				System.out.println("Coloque el Dia");
				day = sc.nextInt();	
			}
			
		}
		else {
		System.out.println("Coloque el Dia");
		day = sc.nextInt();	
		
		if(day>0 && day<31) {
			
			
			
		}
		else {
			
			System.out.println("Error, El dia tiene que ser mayor a 0 y menor a 31");
			System.out.println("Coloque el Dia");
			day = sc.nextInt();	
		}
		}
		
		
		System.out.println("Coloque el Año");
		year = sc.nextInt();
			
		if(year>=2022 && year<2050) {
			
			
			
		}
		else {
			
			System.out.println("Error, El año tiene que ser mayor a 2022 y menor a 2050");
			System.out.println("Coloque el Año");
			year = sc.nextInt();	
			
			
		}
		
		System.out.println("El dia " + day + ", Mes  " + month + ", Año " + year + ", Es su cita programada");
		
	}
	
	
}
	

