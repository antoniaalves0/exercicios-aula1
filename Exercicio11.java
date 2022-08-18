import javax.swing.JOptionPane; 

public class Exercicio11 {
    public static void main(String[] args) {
        float salarioFixo, totalVendas, valorComissao, salarioFinal, totalComissao;
        int carrosVendidos;
        salarioFixo = Float.parseFloat(JOptionPane.showInputDialog("Digite o salario fixo: "));
        valorComissao = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor por carro vendido: "));
        carrosVendidos = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de carros vendidos: "));
        totalVendas = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor total de vendas: "));

        totalComissao = carrosVendidos * valorComissao;
        totalComissao = totalComissao + (totalVendas * 0.05f);

        salarioFinal = totalComissao + salarioFixo;

        System.out.println("O salario final e " + salarioFinal);

    }
}
