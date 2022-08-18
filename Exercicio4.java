import javax.swing.JOptionPane; 

public class Exercicio4 {
    public static void main(String[] args) {
        int valorInteiro, resultado;
        valorInteiro = Integer.parseInt(JOptionPane  
        .showInputDialog("Digite um valor:"));

        resultado = valorInteiro - 1; 
        System.out.println("O antecessor do valor digitado e "  + resultado );
        
    }
}
