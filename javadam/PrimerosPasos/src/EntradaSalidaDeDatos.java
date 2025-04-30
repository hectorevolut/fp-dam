import java.util.Scanner; //Importamos la clase Scanner para poder crear objetos Scanner.
import javax.swing.JOptionPane;

public class EntradaSalidaDeDatos {

	public static void main(String[] args) {
		
		// Entrada/Salida de datos - Vídeo 14
		
		//La clase object es la clase padre de las que heredan el resto de clases de Java, incluso las creadas.
		
		//Al nombrar nuestras clases no podemos usar nombres de clases de la API de JAva ni palabras reservadas.
		
		/*Clase Scanner - Permite introducir datos desde diferentes fuentes. Empezamos primero por consola.
		 * 
		 * 	public final class Scanner
		 * 	extends Object
		 * 	implements Iterator<String>, Closeable
		 * 
		 * 	Es public - La podemos acceder desde cualquier sitio.
		 * 	final - No tiene subclases. Impide que por debajo haya más clases.
		 * 	extends - Hereda de otra clase - Object.
		 * 	implements - Permite que una clase adopte comportamientos definidos enn las interfaces definidas.
		 * 		En caso de Scanner - Iterator<Strin>, Closeable.
		 * 
		 * 	Se crea primero un objeto de la clase Scanner para utilizar sus métodos.
		 * 
		 * 	Constructor - Método que tiene el mismo nombre de la clase para darle a los objetos diferentes estados 
		 * 		iniciales.
		 * 		Para leer desde consola:
		 * 			Scanner(InputStream source) - Usaremos al principio este.
		 * 			Scanner(InputStream source, String charsetName)
		 * 			Scanner(InputStream source, Charset charset)
		 * 		Para utilizar el constructor de un objeto utilizamos new y elegimos el constructor.
		 * */
		//Primero creamos el objeto entrada de la clase Scanner.
		Scanner entrada = new Scanner(System.in); //Objeto de InputStream System.in - Representa la entrada por teclado.
		/*Crea una vía decomunicación el exterior que consumen recursos - Sale la advertencia porque nos recomiendan
		 * cerrar esa vía de comunicación.*/
		System.out.println("Introduce tu nombre, por favor: ");
		String nombre_usuario=entrada.nextLine(); //nextLinne() - Método de Scanner que lee y devuelve una línea de texto 
			//hasta encontrar el siguiente salto de línea. Devuelve la cadena excluyendo el salto de línea generado.
			//Almacenamos en usuario lo que se escriba.
			//Está en ejecución hasta que se pulse Intro.
		System.out.println("Introduce tu edad: ");
		int edad = entrada.nextInt(); //Lee el número. Pero no lee el salto de línea. El salto de línea queda pendiente en el buffer.
			//Cualquier nexLine() después leerá el salto de línea y será lo que almacene.
			//Se puede aplicar el método entrada.nextLine() para consumir el salto de línea - Limpia el bufer.
		System.out.println("Hola "+nombre_usuario+" su edad es "+edad+" años");
		
		entrada.close(); //Cierra el objeto Scanner.
		
		//Entrada/Salida de datos II - Vídeo 15
		
		//Introducir con la clase JOptionPane
		//Método(sobrecargado) static showInputDialog-Ahora utilizamos el static String showIputDialog(Object message)
		String nombre = JOptionPane.showInputDialog("Introduce tu nomnbre");
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad")); //Ojo...showInputDialog devuelve un String
			//Los casting solo son posibles entre tipos compatibles.
			//Pasar String a int - Con métodos static de la clase Integer - parseInt(String s)
			//Pasar String a decimal - Con métodos de la clase Double parseDouble(String s)
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu salario"));
		System.out.println("Te llamas "+nombre+" y el año que viene tendrás "+(+ano+1)+" años y ganas "+salario+" euros.");
		/*El método de la clase Integer.valueof() devuelve un objeto Integer. Convierte String a Integer.
		 		Conviene utilizarlo al trabajar con ArrayList, etc.*/
		//El método de la clase Integer.parseInt() devuelve un primitivo.
	}

}
