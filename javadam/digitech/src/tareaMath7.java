

public class tareaMath7 {
/*ENUNCIADO
 * Realiza un programa en Java que simule el lanzamiento de un dado de 6 caras por parte de dos jugadores. Cada jugador lanza el dado una vez, y el programa debe determinar qué jugador 
 * ha sacado un número mayor. El programa debe mostrar el resultado de cada jugador y anunciar quién ha ganado la partida.
*/
    public static void main(String[] args) {
        System.out.println("Se presentan los participantes. A continuación hará su lanzamiento el jugador 1...");
        //Con la función random generamos un valor aleatorio >=0 y <1.
        double aux1 = (Math.random()*6)+0.5; //Al sumarle 0.5 aseguramos que podamos redondear bien el número.
        System.out.println("Se presentan los participantes. A continuación hará su lanzamiento el jugador 2...");
        double aux2 = (Math.random()*6)+0.5;
        double intento1 = Math.round(aux1); //Redondeamos al número entero más cercano.
        double intento2 = Math.round(aux2);
        int jugador1 = (int)intento1; //Mediante un casting pasamos un double a un int con pérdida de datos decimales.
        int jugador2 = (int)intento2;
        //Imprimimos el resultado.
        System.out.println("El jugador 1 ha sacado "+jugador1+" y el jugador 2 ha sacado "+jugador2);
        int ganador = Math.max(jugador1, jugador2);
        System.out.println("Quien sacó "+ganador+" es el ganador");
    }
}
