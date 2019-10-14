package com.Excersice5Switch.app;
import java.util.Scanner; 

public class Swith_Case 
{
	public static void main(String[] args) 
	{
		//Declaracion de variables
		int nMes=0;
		char respuesta='s';
		//Declaracion de constantes
			
		//Construccion de Objetos
		Scanner input = new Scanner(System.in);
		
		do
		{
			nMes=0;
			//Validacion de datos
			while (nMes<=0)
			{
				//Mostrar
				System.out.println("Dame un Numero de Mes: ");
				nMes = input.nextInt();
				
				//verificacion y mostrar aviso
				if (nMes <=0) 
				{
					System.out.println("Dato no valido!!");
					
				}
			}
				
				//Analisis del dato recibido
				switch(nMes) 
				{
				case 1: 
					System.out.println("Tu mes es: Enero");
					break;
				case 2: 
					System.out.println("Tu mes es: Febrero");
					break;
				case 3: 
					System.out.println("Tu mes es: Marzo");
					break;
				case 4: 
					System.out.println("Tu mes es: Abril");
					break;
				case 5: 
					System.out.println("Tu mes es: Mayo");
					break;
				case 6: 
					System.out.println("Tu mes es: Junio");
					break;
				case 7: 
					System.out.println("Tu mes es: Julio");
					break;
				case 8: 
					System.out.println("Tu mes es: Agosto");
					break;
				case 9: 
					System.out.println("Tu mes es: Septiembre");
					break;
				case 10: 
					System.out.println("Tu mes es: Octubre");
					break;
				case 11: 
					System.out.println("Tu mes es: Noviembre");
					break;
				case 12: 
					System.out.println("Tu mes es: Diciembre");
					break;	
				default: 
					System.out.println("Mes no valido!!");
					break;	
				}	
				
			System.out.println("¿Quieres introducir otro mes?(s/n)");
			respuesta =input.next().charAt(0);
				
		}while(respuesta=='s');
		
		input.close();
	}

}
