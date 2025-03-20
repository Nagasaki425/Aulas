package aula_02;

import java.util.Scanner;

public class Ativ1 {
    public static void main (String[] agrs){ 
    Scanner entrada = new Scanner (System.in);
    double lista[] = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o valor do produto %d: ", i+1);
            lista[i] = entrada.nextInt();
        }
    
    System.out.print("Digite o valor do desconto para porcentagem: ");
    double descontoPorcentagem = entrada.nextDouble();
    double desconto = descontoPorcentagem / 100;

    System.out.println("Novos valore: ");
    for (int i = 0; i < 10; i++) {
        lista[i] = lista[i] * (1 - desconto);
        System.out.printf("Produto %d: R$ %.2f\n", (i + 1), lista[i]);

    }       

    }
}