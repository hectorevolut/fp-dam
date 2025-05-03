
import java.util.Scanner;

public class BuclesFor {
    public static void main(String[] args) {
        /*Usos del bucle for:
         *  Recorrer cadenas de caracteres.
         *  Recorrer ficheros de texto.
         *  Recorrer registros en base de datos.
         *  Recorrer arrays o matrices.
         *  Recorrer colecciones
         */
        /*SINTAXIX
            for(inicio bucle; condición; contador bucle){
                Líneas de código que se repiten
            }
                El contador puede ser de incremento, de decremento, de uno en uno o seguir cualquier serie.
         */

         //Imprimir en consola 10 veces mi nombre
         /*for (int index = 1; index <= 10; index++) {
            System.out.println(index+" Héctor Calderón Hervás");
         }*/

         //Verificar de forma sencilla que tenga arroba
         /*String mail = JOptionPane.showInputDialog("Introduce email...");
         int contador=0;
         boolean punto = false;
         for (int index = 0; index < mail.length(); index++) {
            if (mail.charAt(index)=='@') contador ++;
            if (mail.charAt(index)=='.') punto=true;
         }
         //Al tener solo una instrucción, no hace falta incluir {}
         //Puedo omitir el ==true si es verdadero.
         if (contador==1 && punto) JOptionPane.showMessageDialog(null, "La cadena tiene 1 @ y punto. Es correcto.", "Correcto", JOptionPane.INFORMATION_MESSAGE);
         else JOptionPane.showMessageDialog(null, "Email incorrecto.", "Inorrecto", JOptionPane.ERROR_MESSAGE);*/
         //Ejercicio propuesto - No más de una @ y debe de tener al menos un .

         //Bucle for-each (permite recorrer arrays, colecciones, mapas, etc.)

         //Calcular el factorial de un número.
        Scanner pantalla = new Scanner(System.in);
        System.out.println("Introduce un número entero.");
        int numero = pantalla.nextInt();
        long factorial=1L;
        for (int i = numero; i > 0; i--) factorial = factorial * i;
        System.out.println("El número factorial "+numero+"! es "+factorial);
        /*El factorial crecerá muy rápido y habrá desborde en la variable.
            Cuando desborda por la derecha vuelve por la izaquierda. Por eso a veces sale negativo.
        Podemos usar la calse BigInteger para números muy grandes.*/
        
    }
}
