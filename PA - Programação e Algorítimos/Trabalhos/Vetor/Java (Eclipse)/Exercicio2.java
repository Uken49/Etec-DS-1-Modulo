import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		
		final int TAM=10;
		int a[],b[],c[],i;
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		
		//Laço para a leitura do vetor A
		for (i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+" valor do vetor A");
			a[i]=in.nextInt();
		}
		//Laço para a leitura do vetor B
		for (i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+" valor do vetor B");
			b[i]=in.nextInt();
			c[i]=a[i]+b[i];
		}
		System.out.println("Soma dos vetores:");
		for(i=0;i<TAM;i++) {
			System.out.print("["+c[i]+"] ");
		}
	}
}
