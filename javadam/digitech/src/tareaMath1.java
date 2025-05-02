import java.util.*;

public class tareaMath1 {
    public static void main(String[] args) {
        final double pi = Math.PI; //Constante Pi
        Scanner pantalla = new Scanner(System.in);
        System.out.println("Introduce la longitud del radio de la esfera: ");
        double logitudRadio = pantalla.nextDouble(); //Leemos la longitud de radio de la esfera
        double volumenEsfera = (4.0/3)*pi*(Math.pow(logitudRadio, 3));
        System.out.println("El volumen de la esfera es: "+volumenEsfera);
    }
}
