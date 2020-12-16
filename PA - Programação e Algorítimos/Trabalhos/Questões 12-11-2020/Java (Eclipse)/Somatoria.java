import java.util.Scanner;

public class Somatoria {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = 1, soma = 0;

		while (i <= 100) {
			soma = soma + i; // i++ é a mesma coisa que i=i+1
			i++;
			System.out.println(soma);
		}
		in.close();
	}
}
