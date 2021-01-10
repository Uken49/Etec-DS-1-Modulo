import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		final int TAM = 10;
		int a[], b[], i, j;
		a = new int[TAM];
		b = new int[TAM];

		j = TAM-1;
		for (i = 0; i  TAM; i++) {
			System.out.println(Digite o  + (i + 1) +  valor do vetor A);
			a[i] = in.nextInt();
			b[j] = a[i];
			j--;
		}
		System.out.print(Vetor A);
		for (i = 0; i  TAM; i++) {
			System.out.print([ + a[i] + ] );
		}
		System.out.print(nVetor B);
		for (i = 0; i  TAM; i++) {
			System.out.print([ + b[i] + ] );
		}
	}

}
