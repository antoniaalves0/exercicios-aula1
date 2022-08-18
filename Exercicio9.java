
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o salario atual: ");
		double salarioAtual = sc.nextDouble();
		System.out.print("Reajuste: ");
		int valorParaAjuste = sc.nextInt();
		
		
		double salarioReajustado = salarioAtual + (salarioAtual * valorParaAjuste) / 100;
		
		System.out.println("Salario reajustado para: " + salarioReajustado);
	
		sc.close();
	}

}
