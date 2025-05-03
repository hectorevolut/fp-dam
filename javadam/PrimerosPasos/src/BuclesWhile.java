import javax.swing.JOptionPane;

public class BuclesWhile {

	public static void main(String[] args) {
		
		// Bucles I - Vídeo 18
		
		/*Bucles indeterminados - While y Do-while
		 * 	No sabemos cuántas veces se va a ejecutar.
		  Bucles determinados - For y For-each
		  	Sabemos cuántas veces se va a ejecutar.
		  
		  while(condición){ //Se repiten siempre que la condición sea verdad.
		  	Líneas de código a repetir
		  }
		  Puede darse que nunca se ejecute el código.
		 * */
		
		String clave = "Lunes";
		String pass = ""; //Inicialización con cadena vacía.
		while(clave.equals(pass)==false) { //Comparamos con equals o equalsIgnoreCase - No con ==
			pass=JOptionPane.showInputDialog("Introduce constraseña: ");
			if(clave.equals(pass)==false) System.out.println("Contraseña incorrecta");
		}
		System.out.println("Acceso correcto");
	

	}

}
