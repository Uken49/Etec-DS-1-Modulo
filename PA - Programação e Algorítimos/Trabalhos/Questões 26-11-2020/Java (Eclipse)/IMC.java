import java.util.*;

public class IMC {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, vlh = 0, idd;
		double altM = 0, alt, peso, imc;

		for (i = 1; i <= 2; i++) {
			System.out.println("Insira a altura:");
			alt = in.nextDouble();
			System.out.println("Insira o peso:");
			peso = in.nextDouble();
			System.out.println("Insira a idade:");
			idd = in.nextInt();

			imc = peso / (alt * alt);
			System.out.println(i + "° Pessoa IMC: " + imc+"\n");
			if (idd > 50) {
				vlh++;
			} else {
				vlh = vlh;
			}
			altM = altM + alt;
		}
		System.out.println(vlh + " pessoa(s) com mais de 50 anos.");
		altM = altM / (--i);
		System.out.println("A média de altura é: " + altM);
		in.close();
	}
}
