import java.util.Scanner;

public class Exercicio1 {
    public static void main (String[] agrs){

            String nome;
            String cargo;
            String cel;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite seu nome: ");
            nome = scanner.nextLine();
            System.out.println("Digite seu cargo");
            cargo = scanner.nextLine();
            System.out.println("Digite seu telefone: ");
            cel = scanner.nextLine();


        System.out.println("+--------------------------------------+");
            System.out.printf("| %-36s |\n", "Nome: " + nome);
            System.out.printf("| %-36s |\n", "Cargo: " + cargo);
            System.out.printf("| %-36s |\n", "Telefone: " + cel);
        System.out.println("+--------------------------------------+");


            }
        }