import javax.swing.JOptionPane;

public class Exercicio10{

    public static void main(String[] args) {
    int n1, n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Coloque um número: ")); 
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Coloque outro número: ")); 
            if (n1>n2){
                JOptionPane.showMessageDialog(null,"O primeiro numero é maior: ");
            }else if (n1<n2){  JOptionPane.showMessageDialog(null,"O segundo numero é maior: ");
            }else{
            
                JOptionPane.showMessageDialog(null,"os numeros sao iguais: ");
            }
            }
    }

