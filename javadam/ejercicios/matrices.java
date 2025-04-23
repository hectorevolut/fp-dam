package javadam.ejercicios;

import java.util.Scanner;

public class matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Pedimos la palabra al usuario
        System.out.print("Introduce una palabra: ");
        String palabra = scanner.nextLine();

        // 2. Creamos un array del mismo tamaño que la palabra
        char[] matriz = new char[palabra.length()];

        // 3. Guardamos cada letra en el array
        for (int i = 0; i < palabra.length(); i++) {
            matriz[i] = palabra.charAt(i);
        }

        // 4. Comprobamos si hay letras repetidas
        boolean hayRepetidos = false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = i + 1; j < matriz.length; j++) {
                if (matriz[i] == matriz[j]) {
                    hayRepetidos = true;
                    System.out.println("Letra repetida: '" + matriz[i] + "' en posiciones " + i + " y " + j);
                }
            }
        }

        if (!hayRepetidos) {
            System.out.println("No hay letras repetidas.");
        }
        scanner.close();
    }
}
