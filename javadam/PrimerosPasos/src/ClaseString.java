
public class ClaseString {

	public static void main(String[] args) {
		
		//Manipulación de cadenas. Clase String - Vídeo 12
		
		/*La clase String tiene métodos static y métodos que no lo son.
		 * 	Para usar los no static objeto.método(parámetros);
		 * Almacenar una cadena: String nombre = "valor"; - nombre es unn objeto (instancia, ejemplar)
		 * de la calse String.
		 * Los objetos de la clase String son inmutables - La RAM Se divide en varias áreas: Stack (pila) y Heap (montón)
		 * 		String saludo = "Hola"; - Almacenamos el objeto String("Hola") en el Heap de la memoria RAM (al terminar la 
		 * 		ejecución se borra) y la variable saludo en el Stack. Hay un enlace desde la variable saludo 
		 * 		hasta el objeto String("Hola") - saludo apunta al objeto String("Hola").
		 * 		saludo = "Mundo"; - No modifica el objeto String("Hola") - Creamos unn segundo objeto en el Heap 
		 * 		String("Mundo") y deja de apuntar al objeto String("Hola"), apunta al objeto String("Mundo").
		 * 		El objeto String("Hola") se queda huérfano sin nada que apunte a él - El garbagge collector o recolector
		 * 		de basura elimina cuando cree conveniente los elemenntos en memoria que están sin referenciar (no inmediato)
		 * 		Si volvemos a indicar saludo="Hola" reutiliza el mismo objeto, salvo que declares saludo = new String("Hola")
		 * */
		
		String nombre = "Héctor";
		char[] caracter = {'h', 'é', 'c', 't', 'o', 'r'};
		String otroNombre = new String(caracter);
		
		/*Métodos más comunes:
		 * int length(); - Nos devuelve la longitud de una cadena de caracteres.
		 * int charAt(n); - Nos devuelve la posición del caracter n dentro de la cadena.
		 * 		Las posiciones empiezan a contar desde 0.
		 * String substring(x, y); - Extrae una subcadena desde x (incluido) hasta y (no incluido).
		 * 		Diferentes constructores. Sobrecarga de métodos.
		 * boolean equals(cadena); - Devuelve true si la cadena es igual a la cadena que se da como parámetro.
		 * 		Distingue entre mayúsculas y minúsculas.
		 * boolean equalsIgnoreCase(cadena); - Igual que el anterior pero ignorando mayúsculas y minúsculas.
		 * */
		
		int longitud = nombre.length();
		System.out.println("Mi nombre tiene "+longitud+" letras.");
		
		System.out.println("La primera letra de mi nombre es "+nombre.charAt(0));
		
		System.out.println("La última letra de mi nombre es "+nombre.charAt(nombre.length()-1)); /*charAt comienza
		 	a contar desde la posición 0. Por eso pongo el -1.*/
		
		String subcadena = new String(nombre.substring(3, 5)); //3 incluido, 5 no incluido.
		System.out.println(subcadena);
		//Si queremos una subcadena desde el index hasta el final.
		subcadena = nombre.substring(3);
		System.out.println(subcadena);
		
		if(nombre.equals(otroNombre)) { /*Si ponemos nombre == otroNombre - Comparamos si ocupan la misma posición
				de memoria.*/
			System.out.println("Las cadenas son iguales");
		} else {
			System.out.println("Las cadenas no son iguales");
		}
		
		if(nombre.equalsIgnoreCase(otroNombre)) {
			System.out.println("Las cadenas son iguales");
		}
		

	}

}
