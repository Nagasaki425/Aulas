import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double preco1;
        double preco2;
        double preco3;

        int qtd1;
        int qtd2;
        int qtd3;

        double total;

        //item1
        System.out.print("Digite o preço do item 1: ");
        preco1 = scanner.nextDouble();
        System.out.print("Digite a quantidade do item 1: ");
        qtd1 = scanner.nextInt();
        //item1
        System.out.print("Digite o preço do item 2: ");
        preco2 = scanner.nextDouble();
        System.out.print("Digite a quantidade do item 2: ");
        qtd2 = scanner.nextInt();
        //item1
        System.out.print("Digite o preço do item 3: ");
        preco3 = scanner.nextDouble();
        System.out.print("Digite a quantidade do item 3: ");
        qtd3 = scanner.nextInt();

        total = qtd1*preco1 + qtd2*preco2 + qtd3*preco3;

        System.out.println("+--------------------------------------+");
        System.out.println("Item \t Qtd \t Unit \t Subtotal");
        System.out.println("1 \t" + qtd1 + "\t" + preco1 + "\t" +(qtd1*preco1));
        System.out.println("2 \t" + qtd2 + "\t" + preco2 + "\t" +(qtd2*preco2));
        System.out.println("3 \t" + qtd3 + "\t" + preco3 + "\t" +(qtd3*preco3));
        System.out.println("+--------------------------------------+");



    }
}
