import javax.swing.JOptionPane;


public class Exercicio1 {
    public static void main(String[] args) {
        
       
        double dolar , cotacao, real; 
        dolar = Double.parseDouble(JOptionPane.showInputDialog("digite a quantidade dee dolares:"));
        cotacao = Double.parseDouble(JOptionPane.showInputDialog("valor do dolar")); 
        real = dolar * cotacao ;
                
        JOptionPane.showMessageDialog(null, "Voce tem R$" + real);

    }
}
