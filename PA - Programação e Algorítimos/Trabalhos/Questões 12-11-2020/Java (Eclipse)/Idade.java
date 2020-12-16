import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = 1, nasc, idade, ano;

		while (i <= 6) {
			System.out.println("Digite o ano do seu nascimento: ");
			nasc = in.nextInt();
			System.out.println("Digite o ano atual: ");
			ano = in.nextInt();

			idade = ano - nasc;
			if (idade < 18) {
				System.out.println("Sua idade é " + idade + ". Você é menor de idade\n");
			} else {
				System.out.println("Sua idade é " + idade + ". Você é maior de idade\n");
			}
			i++;
		}
		in.close();
	}
}
