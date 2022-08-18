import javax.swing.JOptionPane;


public class Exercicio1 {
    public static void main(String[] args) {
        double real  = 5.17 ;
        double valorDolar, resultado ;
        valorDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade dolares: "));
        resultado =  valorDolar *  real ;

        System.out.println(valorDolar + " dolares equivale a R$" + resultado);

    }
}