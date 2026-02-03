import java.util.Scanner;
public class ex004MaiorNumero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Digite 3 números: ");
		
		int x, y, z;
		
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		
		// feito sem criar funcao
		
		if (x > y && x > z) {
			System.out.println(x);
		} else if (y > x && y > z) {
			System.out.println(y);
		} else {
			System.out.println(z);
		}
		
		// feito usando algumas funcaos
		
		System.out.println("usando uma funcao criada");
		
		int higher = max(x, y, z);
		
		showResult(higher);
		
		sc.close();
		
	}
	
	// crando as funcoes
	
	public static int max(int a, int b, int c) { 	// o public  é para que a funcão possa ser usada em outras classes, o static é para a funcao poder ser chamada mesmo sem criar um objeto e o int é para avisar o tipo de dado que ela ira retornar
		
		int aux;
		
		if (a > b && a > c) {
			aux = a;
		} else if (b > a && b > c) {
			aux = b;
		} else {
			aux = c;
		}
		return aux;
	}
	
	public static void showResult(int dado) { // Void significa que o return é vazio, ou seja, será executado apenas uma acao
		
		
		System.out.println("Resultado : " + dado);
		
		
	}

}
