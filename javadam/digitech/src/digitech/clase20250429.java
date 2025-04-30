
package digitech;

import java.util.Random;

public class clase20250429 {

	public static void main(String[] args) {
		// Clase Random
		/*Métodos predefinidos:
		 * 	nextInt() - Devuelve un número entero positivo o negativo dentro del rango de enteros.
		 * 	nextInt(int n) - Devuelve unn valor >=0 y menor que n.
		 * 	nextDouble() - Número positivo double >=0.0 y <1*/
		
		//Generar un número aleatorio entre 1 y 100
		Random random = new Random();
		int numero = random.nextInt(100) + 1;
		System.out.println("Número aleatorio generado: "+numero);
		
		//Genera el lanzamiento de un dado de 6 caras
		int dado = random.nextInt(6)+1; //Números del 1 al 6
		System.out.println("Resultado del dado: "+dado);
		
		System.out.println("El resultado econnómico es: "+(numero*dado));
		
		//Genera una lista de 5 númeroa aleatorios entre 1 y 50
		int suma = 0;
		System.out.println("Lista de números aleatorios: ");
		for(int i=0; i<5; i++) {
			int numero1 = random.nextInt(50)+1;
			int otro=numero1*numero*dado;
			System.out.println(numero1*numero*dado);
			suma += otro;
		}
		System.out.println(suma);
		
		int num[] = new int[5];
		
		for(int i=0; i<5; i++) {
			num[i] = random.nextInt(50);
		}
		System.out.println("ARRAY");
		for(int i=0; i< 5;i++) {
			System.out.println(num[i]);
		}
		
		/*Programación Orientada a Objetos*/
		/*Cómo creamos una clase:
		 * He creado una clase en otro archivo y creo los objetos en el main.*/
		alumno pepe = new alumno("Pepe", "Gómez", 23, "pepe@hola.com","44456654");
		pepe.Imprimir();
		alumno ines = new alumno("Inés", "Arroyo Valencia", 45, "diseñoholistico", "423234234");
		ines.Imprimir();
		
		ines.calcularEdad(numero);
	}

}
