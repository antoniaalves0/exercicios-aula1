import javax.swing.JOptionPane;
public class Exercicio2 {
    public static void main(String[] args) {
        double primeiroValor, segundoValor, terceiroValor, quartoValor, resultado; 
        primeiroValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        segundoValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
        terceiroValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro valor: "));
        quartoValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto valor: "));
        //processamento
        //resultado = ((primeiroValor * Math.pow(primeiroValor, 1)) * (segundoValor * Math.pow(segundoValor, 1)) + (terceiroValor * Math.pow(terceiroValor, 1)) + (quartoValor * Math.pow(quartoValor, 1)));           
        resultado = (primeiroValor * primeiroValor) + (segundoValor * segundoValor) + (terceiroValor * terceiroValor) + (quartoValor * quartoValor);
           //saída 
        JOptionPane.showMessageDialog(null,"O resltado da soma elevada ao quadrado e ="+ resultado); 
    }

}