import java.util.Scanner;

public class Expoente { //difícil
	public static void main(String[] args) {
		long base, exp, res=1,i=1;

		Scanner in = new Scanner(System.in);
		System.out.println("Digite a base: ");
		base = in.nextLong(); //Digitar a base

		System.out.println("Digite o expoente: ");
		exp = in.nextLong(); //Digitar o expoente
		System.out.print(base + "^" + exp);
		
		do {
			i++; //Diminuir o contador
			res = res* base; //Calcular a potênciação
		} while (i <= exp); //Parar quando o contador for menor ou igual ao expoente
		System.out.println(" = " + res);

		in.close();
	}
}
