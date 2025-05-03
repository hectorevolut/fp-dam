import java.util.*;

public class tareaMath3 {
    public static void main(String[] args) {
        final double pi = Math.PI;
        Scanner pantalla = new Scanner(System.in);
        System.out.println("Introduce el radio de la circunferencia: ");
        double radio = pantalla.nextDouble();
        double area = pi*Math.pow(radio, 2);
        System.out.println("El área de la circunferencia redondeado al número entero más cercano es: " + Math.round(area));
    }
}
