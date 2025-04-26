import java.math.BigInteger;
import java.math.BigInteger;

public class ClaseMath {

	public static void main(String[] args) {
		
		// Clase Math y API - Vídeo 9
		
		/*En Java tenemos las siguentes clases:
		 * 1. Propias (creadas por nosotros).
		 * 2. Predefinidas (ya vienen construidas por Java) - Tienen métodos que permiten realizar operaciones.
		 * 		Ej. String, Math, Array, Thread.
		 * 	Organzación API Java (clases predefinidas)
		 * 		-Módulos.
		 * 			-Paquetes.
		 * 				-Clases.
		 * 					-Métodos.
		 * 					-Atributos.
		 * https://docs.oracle.com/en/java/javase/23/docs/api/index.html
		 * 
		 * Todos los métodos de la clase Math son static (para usar el método hay que poner el nombre de la clase
		 * delante. 
		 * 		Math.método();
		 */
		// public: Modificador de acceso - Lo puedes utilizar desde cualquier lugar.
		
		//Clase Math, Casting y API - Vídeo 10
		/*Con clases de uso muy común, al crear el objeto podemos obviar el new, además del manejo de la momoria
		 * (stack, hepa):
		 * 		String nombre = "Héctor"; es lo mismo que String nombre = new String("Héctor");*/
		double raiz = Math.sqrt(9); //Revisar bien los tipos para parámetros y resultados para evitar Type mismatch.
		int raiz2 = (int) Math.sqrt(9); //Para evitar errores, hacmos casting. Paso unn double a int.
		//Las conversiones a datos más pequeños pueden tener pérdidas de información.
		/*Tipos de conversión:
		 * 	- Implícita: De más pequeño a más grande (Widening casting) - Lo hace Java.
		 * 	- Explícita (casting): De más grande a más pequeño (NNarrowing casting) - Lo hacemos notroso.
		 * 	byte--short--int--long--float--double*/
		
		
		//Clases Math, BigInteger y métodos comunes en Math - Vídeo 11
		
		//Método double pow(double x, double y); eleva x a y
		raiz=Math.pow(raiz, raiz2);
		System.out.println(raiz); /*Ojo, que esta clase puede generar desbordamientos y truncar el valor al máximo
			que permita el tipo de dato*/
		//Todas las clases del paquete java.lang se usan sinn necesidad de importación.
		
		//BigInnteger pertenece a java.math - import java.math.BigInnteger
		int exponente=321;
		BigInteger base = BigInteger.valueOf(exponente);
		BigInteger potencia = base.pow(exponente);
		System.out.println(potencia);
		
		//Método double random(); - Devuelve un número aleatorio entre 0.0 (incluido) y menor que 1.0
		//Número entero aleatorio entre 0 y 100:
		double aleatorio=(int)(Math.random()*100); //Opción 1 - Truncando la parte decimal. - Importante paréntesis.		
		double aleatorio2=Math.round(Math.random()*100); //Opión 2 - Redondeo con el método double round(double a);
		//Sobrecarga de métodos - Métodos iguales con tipos y parámetros distintos.
		// int round(float a);
		System.out.println(aleatorio + " " + aleatorio2);
		
		/*Método abs() - Método con sobrecarga - Devuelve tipos y tiene métodos distintos.
			Devuelve la magnitud sin importar el signo. Importante en cálculos financieros, distancias sin importar
			el sentido...*/
		int absolut = Math.abs(-45);
		System.out.println(absolut);
		
		/*Método max() - Método con sobrecarga.
		 * Devuelve el mayor de dos valores*/
		int mayor = Math.max(3, 54);
		System.out.println(mayor);
	}

}
