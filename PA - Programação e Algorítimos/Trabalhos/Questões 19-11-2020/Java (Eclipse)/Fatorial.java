import java.util.Scanner;

public class Fatorial { //incrivelmente difícil
	public static void main(String[] args) {
		int num, i = 1, fat=1;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o número: ");
		num = in.nextInt(); //Digitar o número

		i = num - i; //Definir valor do contador
		fat = i * num; //Multiplica i pelo numero
		do {
			i--;
			fat = i * fat; //Fazer o fatorial
		} while (i > 1);
		System.out.println("O fatorial de "+num+" é: "+fat);
		in.close();
	}
}
// n!=n*(n-1)*(n-2)*(n-3)...=res