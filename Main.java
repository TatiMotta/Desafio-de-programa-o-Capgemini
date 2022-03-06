import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		int i, x, N;
		
		System.out.println("Olá, eu sou seu algoritmo!");
		System.out.println("Quantos números você vai digitar? ");
		N = sc.nextInt();
		
		int[] vet = new int[N];
		
		for (i = 0; i < N; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextInt();
		}
		System.out.print("Digite um valor para x: ");
		x = sc.nextInt();
		
		int par = 0;
		
		for (i=0; i<N; i++) {
			for (int j=1; j<N; j++) {
				if (vet[j] - vet[i] == x || vet[j] + vet[i] == x ) {
					par = par +1;
				}
			}
		}
		System.out.println(par);
		
		

	}

}
