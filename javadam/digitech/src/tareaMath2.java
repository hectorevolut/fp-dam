import java.util.*;

public class tareaMath2 {
    public static void main(String[] args) {
        Scanner pantalla = new Scanner(System.in);
        System.out.println("Introduce la longitud del lado 1: ");
        double ladoUno = pantalla.nextDouble();
        System.out.println("Introduce la longitud del lado 2: ");
        double ladoDos = pantalla.nextDouble();
        System.out.println("Introduce la longitud del lado 3: ");
        double ladoTres = pantalla.nextDouble();
        //Calculo p
        double p = (ladoUno+ladoDos+ladoTres)/2;
        double area = Math.sqrt(p*(p-ladoUno)*(p-ladoDos)*(p-ladoTres));
        System.out.println("El área del triángulo es: "+area);
    }
}
