import java.util.*;

public class tareaMath5 {
    public static void main(String[] args) {
        int max=0;
        int min=0;
        Scanner pantalla = new Scanner(System.in);
        System.out.println("Dime el primer número: ");
        int numeroUno = pantalla.nextInt();
        System.out.println("Dime el segundo número: ");
        int numeroDos = pantalla.nextInt();
        if(numeroUno==numeroDos){
            System.out.println("Al ser los número iguales, el número aleatorio será igual a "+numeroUno);
        } else if(numeroUno>numeroDos){
            max = numeroUno;
            min = numeroDos;
        } else {
            max = numeroDos;
            min = numeroUno;
        }
        int numeroAleatorio = (int)(Math.random()*(max-min+1))+min;
        System.out.println("El número aleatorio entre "+min+" y "+max+" es "+numeroAleatorio);
    }
}
