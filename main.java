
import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {

        int num1;
        String mensagem;

        mensagem = JOptionPane.showInputDialog("Digite um número:");
        num1 = Integer.parseInt(mensagem);

        if (num1 % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número digitado é par!");
        } else if (num1 == 0) {
            JOptionPane.showMessageDialog(null, "O número digitado é neutro!");
        } else {
            JOptionPane.showMessageDialog(null, "O número digitado é ímpar!");
        }
    }
}
