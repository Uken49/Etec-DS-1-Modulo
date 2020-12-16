import java.util.Scanner;

public class Fibonacci { //incrivelmente fácil
	public static void main(String[] args) {
		long i = 1, n, fn, f1 = 1, f2 = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Escreva o número do termo: ");
		n = in.nextLong();

		do {
			fn = f1 + f2; // 13= 8 + 5 | 21 = 13 + 8
			System.out.print(fn + ", ");
			i++;
			f2 = f1; // 8
			f1 = fn; // 13
		} while (i <= n);
		System.out.println("...");
		in.close();
	}
}
