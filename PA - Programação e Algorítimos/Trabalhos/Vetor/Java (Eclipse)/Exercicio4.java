import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int a[], i;
		double VM = 0;
		a = new int[TAM];

		for (i = 0; i < TAM; i++) {
			System.out.println("Digite o "+(i+1)+" valor do vetor A");
			a[i] = in.nextInt();
			VM = VM + a[i];
		}
		VM = VM / TAM;

		System.out.print("Media dos vetores " + VM);
	}

}
