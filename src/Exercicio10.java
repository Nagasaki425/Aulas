import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int jovens = 0;
        int adultos = 0;
        int idosos = 0;

        int idade;

        while (true) {
            System.out.println("(nagativo para encerrar o programa)");
            System.out.print("Digite a idade da pessoa: ");
            idade = sc.nextInt();
            
            if (idade < 1){break;}
            if (idade < 20) { jovens ++;}
            else if (idade <= 59){ adultos ++;}
            else { idosos ++;}
        }

        System.out.println("Quantidade de jovens: " + jovens);
        System.out.println("Quantidade de adultos: " + adultos);
        System.out.println("Quantidade de melhor idade: " + idosos);




        sc.close();
    }
}
