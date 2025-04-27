/*Podemos importar todas las clases *, una clase e nconcreto y de importar solo el método que nos interese
 * import static(si es static) paquete.clase.método */
/*También podemos no importar y hacer referencia a la ruta en el código:
 * 	- Util cuando en un programa grande y queremos usar una clase o método una únnica vez.
 * 		javax.swing.JOptionPane.showInputDialog();*/
import java.util.*;

public class Condicionales {

	public static void main(String[] args) {
		
		// Condicionales I - Vídeo 16
		/*Estructuras de control de flujo - Condicionales y bucles
		 * 	El flujo de entrada de un programa siempre empieza por el método main (único en un programa).
		 * 	Dentro del main el flujo de arriba a abajo.
		 * 	Los condiconales y bucles permiten modificar el flujo ejecución (Un condicional lo modifica dando 
		 * 	saltos y un bucle vuelve hacia atrás)*/
		
		//Condicionales IF
		/*if(condición){ Si solo tiene una únnica línea de código puedes prescindir de {}
		 	Código a ejecutar si la condición es verdadera
		 	}
		 	else{ Es opcional. Pegado a su if. Si solo tiene una únnica línea de código puedes prescindir de {}
		 		Código a ejecutar si la condición es falsa
		 		}*/
		//Condición - Usando los operadores construyes la pregunta.
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu edad: ");
		int edad = entrada.nextInt();
		if(edad>=18) {
			System.out.println("Eres mayor de edad");
		}
		else {
			System.out.println("Eres menor de edad");
		}
		
		//abreviar el código
		if(edad>=50) System.out.println("Eres muy mayor");
		
		else System.out.println("Y tienes toda la vida por delante");
		
		//if anidados - else if - Los if trabajan juntos, forman parte del mismo bloque de lógica.
		// Abreviados al tener solo una línea de código.
		if(edad<0) System.out.println("Ni has nacido");
		else if(edad<=30) System.out.println("eres un hombre");
		else if(edad>30 && edad<100) System.out.println("Eres anciano");
		else System.out.println("Estarás muerto");
		
		
		
		entrada.close();
	}

}
