import java.util.Scanner;

public class Exercicio9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do produto no mercado ABC: ");
        double pdtMerABC = sc.nextDouble();
        System.out.print("Digite o valor do produto no mercado 1: ");
        double pdtMer1 = sc.nextDouble();
        System.out.print("Digite o valor do produto no mercado 2: ");
        double pdtMer2 = sc.nextDouble();
        System.out.print("Digite o valor do produto no mercado 3: ");
        double pdtMer3 = sc.nextDouble();
        System.out.print("Digite o valor do produto no mercado 4: ");
        double pdtMer4 = sc.nextDouble();
        System.out.print("Digite o valor do produto no mercado 5: ");
        double pdtMer5 = sc.nextDouble();

        int lojasMaisCaras = 0;

        if (pdtMerABC < pdtMer1) lojasMaisCaras ++;
        if (pdtMerABC < pdtMer2) lojasMaisCaras ++;
        if (pdtMerABC < pdtMer3) lojasMaisCaras ++;
        if (pdtMerABC < pdtMer4) lojasMaisCaras ++;
        if (pdtMerABC < pdtMer5) lojasMaisCaras ++;

        System.out.println("O pruduto é mais caro em " + lojasMaisCaras + " lojas.");

        sc.close();
    }
}
