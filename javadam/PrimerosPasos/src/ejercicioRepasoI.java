
import javax.swing.JOptionPane;


public class ejercicioRepasoI {
    public static void main(String[] args) {
        //Genero el número aleatorio y lo multiplico por 100 y le resto 1 para que esté entre 1 y 100.
        int aleatorio = (int) ((Math.random()*100)+1);
        //Pido el nuestro número por pantalla hasta que sea cierto.
        System.out.println(aleatorio);
        int nuestro=0;
        int intentos=0;
        do{
            try{ //Excepción de errores al meter una cadena no numérica.
                //Integer.parseInt() pasa String a int y Integer.parseDouble() pasa String a double.
                nuestro = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu número entre 1 y 100..."));
                if (nuestro>aleatorio) {
                //Con "Definición del mensaje", JOptionPane.XXXXX_MESSAGE genero typo de ventana (PLAIN, INFORMATION, WARNING, ERROR, QUESTION)
                JOptionPane.showMessageDialog(null, "El número es menor", "Pista", JOptionPane.WARNING_MESSAGE);
                } else if (nuestro<aleatorio){
                    JOptionPane.showMessageDialog(null, "El número es mayor", "Pista", JOptionPane.WARNING_MESSAGE);
                }
                intentos ++;
                if(intentos>=5) {
                    /*if (nuestro==aleatorio) {
                        JOptionPane.showMessageDialog(null, "Número de intentos consumido", "Salida", JOptionPane.WARNING_MESSAGE);
                    }*/
                    break;
                }
            }catch(NumberFormatException e){ //NumberFormatException sería el error al no introducir la cadena correcta que no puedo pasar a int.
                JOptionPane.showMessageDialog(null, "Tienes que introducir un número", "Error", JOptionPane.ERROR_MESSAGE);
            }          
        }while (nuestro != aleatorio);
        if(nuestro != aleatorio) {
            JOptionPane.showMessageDialog(null, "Número de intentos consumido", "Salida", JOptionPane.WARNING_MESSAGE);
        } else if(nuestro==aleatorio){
            JOptionPane.showMessageDialog(null, "El número es correcto en "+intentos+" intentos", "Resultado", JOptionPane.PLAIN_MESSAGE);
        }
        
    }
}
