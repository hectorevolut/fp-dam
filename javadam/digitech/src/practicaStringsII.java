import java.util.*;

public class practicaStringsII {
    public static void main(String[] args) {
        //Creo objeto Scanner
        Scanner pantalla = new Scanner(System.in);
        System.out.println("Introduce una dirección de correo");
        String correo = pantalla.nextLine();
        if (correo.indexOf('@')==-1 && correo.indexOf('.')==-1) {
            System.out.println("El correo no tiene @ ni .");
        } else if(correo.indexOf('@')==-1){
            System.out.println("El correo no tiene @");
        } else if(correo.indexOf('.')==-1){
            System.out.println("El correo no tiene .");
        } else {
            System.out.println("El correo es correcto");
        }
    }
}
