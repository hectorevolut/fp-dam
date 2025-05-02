import java.util.*;

public class tareaMath4 {
    public static void main(String[] args) {
        Scanner pantalla = new Scanner(System.in);
        System.out.println("¿Cuántos números aleatorios quieres mostrar? ");
        int numerosAleatorios = pantalla.nextInt();
        for (int index = 0; index < numerosAleatorios; index++) {
            System.out.println("Número aleatorio "+(index+1)+": "+Math.random());
        }
    }
}
