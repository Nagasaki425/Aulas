import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		java.util.Scanner sc = new Scanner(System.in);
		System.out.print("Digite uma vogal e veja uma palavra que se inicia com ela: ");

		String vogal = sc.next().toLowerCase();

		switch (vogal) {
			case "a":
				System.out.println("Ana");
				break;
			case "e":
				System.out.println("Eduarda");
				break;
			case "i":
				System.out.println("Isadora");
				break;
			case "o":
				System.out.println("Olívia");
				break;
			case "u":
				System.out.println("Úrsula");
				break;
			default:
				System.out.println("Digite uma vogal!");
				break;
		}
		sc.close();
	}

}
