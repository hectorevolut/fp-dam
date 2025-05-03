import javax.swing.JOptionPane;

public class ArraysI {
    public static void main(String[] args) {
        /*Array - Arreglo - Matriz (varias dimensiones).
            - Estructuras de datos que contienen valores del mismo tipo.
            - Para almacenar valores que normalmente tienen alguna relación entre sí.
            - Normalmente la información suele venir de fuentes externas (Bases de datos, ficheros de texto, etc)
        SINTAXIX
            Declaración: tipo_dato[] nombreArray = new tipo_dato[tamaño]
                Se puede hacer en dos líneas diferenntes:
                    tipo_dato[] nombreArray;
                    nombreArray = new tipo_dato[tamaño];
            Dar valor a los arrays:
                nombreArray[indice]=valor; El índice comienza por 0.
            Declaración e inicialización:
                tipo_dato[] nombreArray = {valores separados por comas}; 
            */
        //Declaración
        //int[] miArray;
        //Inicialización
        /*miArray[0]=1;
        miArray[1]=2;
        miArray[2]=3;
        miArray[3]=4;
        miArray[4]=5;*/
        int[] miArray = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9};
        //Visualización
        System.out.println(miArray[0]);
        System.out.println(miArray[1]);
        System.out.println(miArray[2]);
        System.out.println(miArray[3]);
        System.out.println(miArray[4]);
        //Imprimir con bucle for
        System.out.println("Imprimir con Bucle for...");
        //miArray.length - Longitud o tamaño del Array.
        for (int i = 0; i < miArray.length; i++) System.out.println("Índice "+i+"-"+miArray[i]);
        /*Alternativa ligera a los Arrays java.util.List.of(...)
            List<String> nombres = List.of("Inés", "Cristina", "Domingo");
            List<tipo_dato> nombreLista = List.of(Datos separados por comas);
            - Te despreocupas de los índices.
            - ¿Cuándo usarlo?
                Listas inmutables.
                Mejor integración con Streams y APIs modernas.
                Labores de testing.
            - ¿Cuándo no utilizarlo?
                - Si necesitas modificar la lista.
                - Si vas a trabajar con primitivos.
                - Si los datos provienen de entradas de usuario, bucles, etc.
        */
        /*Podemos crear estructuras ue incluyan Arrays de forma más sencilla y limpia: los records
            public record Alumno(String nombre, int[] notas){}
            Alumno a = new Alumno("Luis", new int[]{8,9,10});
        */
        /*Uso bucle for-each
            Permite leer la información en un Array.
            No permite introducir la información en un Array.
            for(tipo_dato_igual_Array indice: nombreArray){}
        */
        System.out.println("");
        System.out.println("Uso bucle for-each");
        String[] paises = new String[4];
        for (int i = 1; i < paises.length+1; i++) {
            paises[i-1] = JOptionPane.showInputDialog("Itroduce el país "+i);
        }
        for(String pais: paises) System.out.println(pais);
        //Crear unn programa que cree 20 números aleatorios y mostrarlos por pantalla
        int[] aleatorios = new int[20];
        for(int i=0; i<aleatorios.length; i++) aleatorios[i]=(int)(Math.random()*100)+1;
        for(int numero: aleatorios) System.out.print(numero + " ");
    }
}
