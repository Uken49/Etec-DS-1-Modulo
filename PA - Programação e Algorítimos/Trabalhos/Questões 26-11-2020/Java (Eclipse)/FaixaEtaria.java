import java.util.*;

public class FaixaEtaria {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int idd, i, jvm = 0, adt1 = 0, adt2 = 0, vlh = 0, ids = 0;

		for (i = 1; i <= 15; i++) {
			System.out.println("Digite a " + i + "° idade");
			idd = in.nextInt();
			if (idd <= 15) {
				jvm++;
			} else if (idd >= 16 && idd <= 30) {
				adt1++;
			} else if (idd >= 31 && idd <= 45) {
				adt2++;
			} else if (idd >= 46 && idd <= 60) {
				vlh++;
			} else {
				ids++;
			}
		}
		System.out.println("Até 15 anos: " + jvm);
		System.out.println("De 16 a 30 anos: " + adt1);
		System.out.println("De 31 a 45 anos: " + adt2);
		System.out.println("De 46 a 60 anos: " + vlh);
		System.out.println("Acima de 61 anos: " + ids);

		in.close();
	}
}
