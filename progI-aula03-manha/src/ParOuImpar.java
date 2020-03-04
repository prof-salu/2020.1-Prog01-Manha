
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //System.out.println("Digite um numero: ");
        int numero;
        
        //numero = entrada.nextInt();
        
        //entrada.close();
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        
        System.out.println("Numero digitado: " + numero);
        
        if(numero % 2 == 0){
            //System.out.println("Par");
            JOptionPane.showMessageDialog(null, "Par");
        }else{
            JOptionPane.showMessageDialog(null, "Impar");
        }
        
        
        JOptionPane.showMessageDialog(null, "Fim do programa");
        
        
        
    }
}
