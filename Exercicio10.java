import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor do veículo: ");
		double valorVeiculo = sc.nextDouble();
		System.out.print("Porcentagem Distribuidor: ");
		double ajusteDistribuidor = sc.nextDouble();
		System.out.print("Valor do Imposto: ");
		double valorDoImposto = sc.nextDouble();
		
		
		 double totalVeiculo = (valorVeiculo * ajusteDistribuidor / 100) + (valorVeiculo * valorDoImposto / 100) + valorVeiculo;
		 
		
		
		System.out.println("Total de Imposto: R$ " + totalVeiculo);
	
		sc.close();
	}
}

