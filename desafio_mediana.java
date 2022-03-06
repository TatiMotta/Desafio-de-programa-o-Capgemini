import java.util.Scanner;

public class desafio_mediana {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int med;
		System.out.println("Olá, eu sou seu algoritmo!");
		System.out.println("Digite 3 números: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a < b && a > c) {
			med = a;
		}
		else if (b < a && b > c) {
			med = b;
		}
		else {
			med = c;		
		}

		System.out.println("Mediana = " + med);
	}

}
