import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do saque: ");
        int valor = sc.nextInt();

        if (valor > 0 && valor % 5 == 0) {
            int nota200 = valor / 200;
            valor = valor % 200;

            int nota100 = valor / 100;
            valor = valor % 100;

            int nota50 = valor / 50;
            valor = valor % 50;

            int nota20 = valor / 20;
            valor = valor % 20;

            int nota10 = valor / 10;
            valor = valor % 10;

            int nota5 = valor / 5;
            valor = valor % 5; // sempre vai dar 0, porque já validamos divisível por 5

            System.out.println("Notas a serem entregues:");
            if (nota200 > 0) System.out.println(nota200 + " nota(s) de R$ 200");
            if (nota100 > 0) System.out.println(nota100 + " nota(s) de R$ 100");
            if (nota50 > 0)  System.out.println(nota50 + " nota(s) de R$ 50");
            if (nota20 > 0)  System.out.println(nota20 + " nota(s) de R$ 20");
            if (nota10 > 0)  System.out.println(nota10 + " nota(s) de R$ 10");
            if (nota5 > 0)   System.out.println(nota5 + " nota(s) de R$ 5");
        } else {
            System.out.println("Valor inválido! O saque deve ser positivo e múltiplo de 5.");
        }

        sc.close();
    }
}
