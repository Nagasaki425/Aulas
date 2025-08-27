import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Menu de cafés
        System.out.println("*---Menu---* \n" +
                "1 - Expresso   = R$ 4,50 \n" +
                "2 - Machiatto  = R$ 6,00 \n" +
                "3 - Capuccino  = R$ 7,50 \n" +
                "Digite sua opção: ");

        int opc = sc.nextInt();
        double total = 0.0;
        int qtd = 0;

        // preços
        double expresso = 4.5;
        double machiatto = 6.0;
        double capuccino = 7.5;

        if (opc >= 1 && opc <= 3) {
            System.out.print("Digite a quantidade: ");
            qtd = sc.nextInt();

            switch (opc) {
                case 1: total = expresso * qtd; break;
                case 2: total = machiatto * qtd; break;
                case 3: total = capuccino * qtd; break;
            }

            System.out.println("*---Pagamento---* \n" +
                    "1 - Débito   (10% de desconto)\n" +
                    "2 - Crédito  (5% de desconto)\n" +
                    "3 - Dinheiro (sem desconto)\n" +
                    "Digite sua opção: ");

            switch (opc) {
                case 1: total = total * 0.9; break;
                case 2: total = total * 0.95; break;
                case 3: break;
                default:
                    System.out.println("Opção de pagamento inválida! Sem desconto aplicado.");
            }

            System.out.printf("Total a pagar: R$ %.2f%n", total);
        } else {
            System.out.println("Opção de café inválida!");
        }

        sc.close();
    }
}
