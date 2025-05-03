import javax.swing.JOptionPane;

public class BuclesDoWhile {
    public static void main(String[] args) {
        //Si necesitas que el código se ejecute al menos una vez, es mejor usar este bucle.
        //Mismo programa de números aleatorios entre 0 y 99.
        /*int aleatorio=(int)(Math.random()*100);
        Scanner teclado = new Scanner(System.in);
        int intentos = 0;
        int numeroUsuario = 0;
        do {
            intentos ++;
            System.out.println("Introduce un número entre 0 y 99");
            numeroUsuario = teclado.nextInt();
            if(aleatorio>numeroUsuario) System.out.println("Más alto");
            else if(aleatorio<numeroUsuario) System.out.println("Más bajo");
        } while (aleatorio != numeroUsuario);
        System.out.println("Correcto. Lo has adivinado en "+intentos+" intentos");*/

        //Nos pide por JOptionPane nuestra altura en cm y nuestro género y nos dice cuál es nuestro pso ideal (hombre altura-110 = peso ideal)
        //(mujer altura-120 = peso ideal)
        //Al introducir género, H, h para hombre y M, m para mujer. Sino, opción incorrecta y volver a pedir.
        
        String genero="";
        do {
            genero=JOptionPane.showInputDialog("Introduce tu género (H/M):");
        } while (genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
        //No puedo hacer casting en tipos no compatibles. Uso parseInt
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce altura en cm"));
        int pesoIdeal=0;
        if (genero.equalsIgnoreCase("H")) pesoIdeal = altura - 110;
        else if(genero.equalsIgnoreCase("M")) pesoIdeal = altura - 120;
        //También podemos usar System.out.println();
        JOptionPane.showMessageDialog(null, "Tu peso ideal es"+pesoIdeal);
    }
    }
