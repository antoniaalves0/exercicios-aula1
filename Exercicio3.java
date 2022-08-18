import javax.swing.JOptionPane;

public class Exercicio3{
    public static void main(String[] args) {
        float preco, quantidade, comissao;
        preco = Float.parseFloat(JOptionPane.showInputDialog("Digite o preço unitario da peca: "));
        quantidade = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade vendida: "));

        comissao = (preco * quantidade) * 0.05f;

        System.out.println("O valor da comissao e de " + comissao);


    }
}