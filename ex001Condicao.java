import java.util.Scanner;
public class ex001Condicao {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double renda;
		
		System.out.println("Digite sua renda mensal: ");
		System.out.print("R$ ");
		
		renda = sc.nextDouble();
		
		if (renda < 0) {
			System.out.println("reda inválida");
		} else if (renda >= 0 && renda < 2000) {
			System.out.println("Isento");
		} else if (renda >= 2001 && renda < 3000) {
			
			double calculo;
			
			calculo = ((renda - 2000) * 8.0)/100;
			System.out.printf("Segunda a regra você deve pagar de imposto %.2f", calculo);
		} else if (renda >= 3001 && renda < 4500) {
			double calculo;
			
			calculo = ((renda - 3000) * 18.0)/100 + ((1000 * 8)/100);
			System.out.printf("Segunda a regra você deve pagar de imposto %.2f", calculo);
		}else if (renda >= 4501) {
			double calculo;
			
			calculo = ((renda - 4500) * 28.0)/100 + ((1500 * 18)/100) + ((1000 * 8)/100);
			System.out.printf("Segunda a regra você deve pagar de imposto %.2f", calculo);
		}
		
		
		sc.close();
	}
}
