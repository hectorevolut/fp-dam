import java.util.*;

public class tareaMath6 {
    public static void main(String[] args) {
        Scanner pantalla = new Scanner(System.in);
        System.out.println("Introduce 'a': ");
        double a = pantalla.nextDouble();
        System.out.println("Introduce 'b': ");
        double b = pantalla.nextDouble();
        System.out.println("Introduce 'c': ");
        double c = pantalla.nextDouble();
        //Al realizar el programa me di cuenta de que no podía haber raices negativas...
        if (Math.pow(b,2)-(4*a*c)<0) {
            System.out.println("No podemos tener raices de un número negativo");
        //Si la raiz es positiva...
        } else {
            double ecuacionMas = (-b + Math.sqrt((Math.pow(b, 2)-(4*a*c))))/(2*a);
            double ecuacionMenos = (-b - Math.sqrt((Math.pow(b, 2)-(4*a*c))))/(2*a);
            System.out.println("El resultado de la ecuación de segundo grado es "+ecuacionMenos+" y "+ecuacionMas);
        }       
    }
}
