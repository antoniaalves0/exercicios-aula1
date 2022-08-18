import javax.swing.JOptionPane; 

public class Exercicio5 {
    public static void main(String[] args) {
        double base, altura, area;
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base do retangulo: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura do retagulo: "));

        area = base * altura;

        System.out.println("A area do retanguo e " + area);
    }
}
