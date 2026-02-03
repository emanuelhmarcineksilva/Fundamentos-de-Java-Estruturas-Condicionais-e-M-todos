import java.util.Scanner;

public class ex002DiaSemana {

	public static void main(String[] args) {
	
		System.out.println("DIA DA SEMANA.");
		System.out.print("Diga o número do dia da semana: ");
		
		Scanner sc = new Scanner(System.in);
		
		int nDia;
		String retDia;
		
		nDia = sc.nextInt();
		
		switch(nDia) {
		case 1:
			retDia = "Domingo";
			break;
		case 2:
			retDia = "Segunda";
			break;
		case 3:
			retDia = "Terça";
			break;
		case 4:
			retDia = "Quarta";
			break;
		case 5:
			retDia = "Quinta";
			break;
		case 6:
			retDia = "Sexta";
			break;
		case 7:
			retDia = "Sabado";
			break;
		default:
			retDia = "Dia não aceito, tente outra vez...";
			break;
		}
		
		System.out.println(retDia);
		
		sc.close();
		
	}
}
