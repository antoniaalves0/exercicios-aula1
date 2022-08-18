import javax.swing.JOptionPane; 

public class Exercicio8 {
    public static void main(String[] args) {
        int totalEleitores , votoBranco, votoNulo, votoValido;
        double percentualB, percentualN, percentualV;
        totalEleitores = Integer.parseInt(JOptionPane  
        .showInputDialog("Digite o total de eleitores:"));
        votoBranco= Integer.parseInt(JOptionPane  
        .showInputDialog("Digite o numero de votos em branco:"));
        votoNulo = Integer.parseInt(JOptionPane  
        .showInputDialog("Digite o numero de votos nulos:"));
        votoValido = Integer.parseInt(JOptionPane  
        .showInputDialog("Digite o numero de votos validos:"));

        percentualB = ((double)votoBranco / totalEleitores) * 100;
        percentualN = ((double)votoNulo /  totalEleitores) * 100;
        percentualV = ((double)votoValido / totalEleitores) * 100;

        System.out.println("O percentual de votos brancos em relação ao total de eleitores e " + percentualB);
        System.out.println("O percentual de votos nulos em relação ao total de eleitores e "+ percentualN);
        System.out.println("O percentual de votos validos em relação ao total de eleitores e " + percentualV);


    }
    
}
