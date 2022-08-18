import javax.swing.JOptionPane; 

public class Exercicio6 {
    public static void main(String[] args) {
        
        int anos, resultado ; 
        anos = Integer.parseInt(JOptionPane  
        .showInputDialog("Digite sua idade em anos:"));
        
        resultado = (anos * 365) ;

        System.out.println("Sua idade em dias e " + resultado);


    }
}