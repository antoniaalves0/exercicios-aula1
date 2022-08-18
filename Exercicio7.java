
import javax.swing.JOptionPane; 

public class Exercicio7 {
    public static void main(String[] args) {
        int anos, meses, dias, resultado ; 
        anos = Integer.parseInt(JOptionPane  
        .showInputDialog("Digite sua idade em anos:"));
        meses = Integer.parseInt(JOptionPane  
        .showInputDialog("Digite o mes"));
        dias = Integer.parseInt(JOptionPane  
        .showInputDialog("Digite o dia"));

        resultado = (anos * 365) + (meses * 30) +  dias ;

        System.out.println("Sua idade em dias e " + resultado);


    }
}
