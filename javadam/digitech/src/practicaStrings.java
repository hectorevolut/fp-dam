import java.util.*;

public class practicaStrings {

    public static void main(String[] args) {
        //Creamos el objeto Scanner
        Scanner pantalla = new Scanner(System.in);
        System.out.println("Introduce cadena a analizar");
        String cadena = pantalla.nextLine();
        //Quitamos los espacioa que puedan existir al final y al principio
        cadena = cadena.trim();
        //Si no hay espacios, imprimimos la cadena tal cual.
        if (cadena.indexOf(' ')==-1) {
            System.out.println(cadena);
        /*Si tiene espacios, imprimimos hasta el primer espacio, eliminamos esa subcadena y volvemos a compribar espacios.
            Así hasta que no haya espacios.*/
        }else{
            while (cadena.indexOf(' ') != -1) {  
                String palabra = cadena.substring(0, cadena.indexOf(' '));
                System.out.println(palabra);
                cadena = (cadena.substring(cadena.indexOf(' ')+1)).trim();
            }
        }
        //Si la última palabra no está vacía.
        if (!cadena.isEmpty()) {
            System.out.println(cadena);
        }
        pantalla.close();
    }
}