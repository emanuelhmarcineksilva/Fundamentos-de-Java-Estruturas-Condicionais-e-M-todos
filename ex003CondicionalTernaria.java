import java.util.Scanner;
public class ex003CondicionalTernaria {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double preco = 8.14;
		preco = sc.nextDouble();
		double desconto;
		
		if (preco < 5) {
			desconto = preco * 0.1;
		} else {
			desconto = preco * 0.05;
		}
		
		System.out.printf("Seu desconto é de %.2f", desconto);
		
		// Usando Condicional Ternaria
		
		preco = sc.nextDouble();
		double desconto1 = (preco < 5) ? preco * 0.1 : preco * 0.05;
		
		System.out.printf("%n"
				+ "Seu desconto é de %.2f", desconto1);
		
		sc.close();

	}

}
