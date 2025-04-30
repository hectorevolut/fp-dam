/*Podemos importar todas las clases *, una clase e nconcreto y de importar solo el método que nos interese
 * import static(si es static) paquete.clase.método */
/*También podemos no importar y hacer referencia a la ruta en el código:
 * 	- Util cuando en un programa grande y queremos usar una clase o método una únnica vez.
 * 		javax.swing.JOptionPane.showInputDialog();*/
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
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
		
		
		/*Scanner(System.in) abre una vía de comunicación con la entrada por defecto del sistema (teclado al usar
		 * la consola a no ser que lo cambie).
		 * Mientras está abierta consume recursos.
		 * */
		//entrada.close();
		//Si cierro la vía, no puedo utilizar la misma vía - Error en tiempo de ejecución.
		//No podrí autilizar el mismo Scanner y el System.in.
		/*Puedo abrir otro Scanner pero la entrada tiene que ser diferente (segundo buffer o vía de comunicación)
		 	Ej. Por fichero. System.setIn(new FileIputStream("datos.txt");*/
		/*try {
			System.setIn(new FileInputStream("datos.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Scanner entrada2 = new Scanner (System.in);
		
		
		//Codicionales II - Video 17
		
		//Condicionales switch - Cuando hay valores fijos y muchas condiciones a evaluar.
		///No usar cunado evaluamos rangos.
		 */
		/*
		 Switch(valor a evaluar){
		 	case valor1:
		 		Código a ejecutar;
		 		Break;
		 	case valor2:
		 		Código a ejecutar;
		 		Break;
		 	default:
		 		Código a ejecutar;
		 }*/
		System.out.println("Introduce un mes del primer cuatrimestre: ");
		int numero_mes=entrada.nextInt();
		switch(numero_mes) {
		case 1:
			System.out.println("Enero");
			break;
		case 2:
			System.out.println("Febrero");
			break;
		case 3:
			System.out.println("Marzo");
			break;
		case 4:
			System.out.println("Abrir");
			break;
		case 5,6,7,8:
			System.out.println("Es del segundo cuatrimestre");
			break;
		default:
			System.out.println("Mes icorrecto");
		}
		/*Novedad desde la versión 14:
		 * Se puede utilizar como una expresión que devuelva un valor que se puede utlizar fuera del switch.
		 * String resultado=switch(valor a evaluar){
		 * 	case valor1 -> Código a ejectutar;
		 * 	case valor2 -> Código a ejecutar;
		 * 	default -> Código a ejecutar;};
		 * Se pueden agrupar los valores separados por comas.
		 * Puedes hacer que se ejecutenn varias instrucciones abriendo {} y usando yield.*/
		entrada.nextLine();
		System.out.println("Introduce el día: ");
		String dia = entrada.nextLine();
		String resultados = switch(dia){
		case "lunes","martes","miercoles","jueves","viernes"->{
			System.out.println("El día es...");
			yield"Laborable";
		}
		case "sabado","domingo"->{
			System.out.println("El día es...");
			yield"No laborable";
		}
		default->{
			System.out.println("Procesando...");
			yield"Día no válido";
		}
		};
		System.out.println(resultados);
		/*Operador ternario (opera tres operandos)- Evaluar algo muy sencillo.
		 * 	condicion? valor_si_verdad:valor_si_falso;*/
		String resultado = (edad<18)? "y eres menor":"y eres mayor";
		System.out.println(resultado);
		
		entrada.close();
		
		
	}

}
