package aula_02;

import java.util.Scanner;



public class aula_3{

    public static void main(String[] args){
    Scanner entrada = new Scanner (System.in);
    System.out.print("Digite o número de publicações para serem analizadas: ");
    int numPublicacoes = entrada.nextInt();

    int totalCurtidas = 0;

    for (int i = 1; i <= numPublicacoes; i++){
        System.out.printf("Curtidas para a publicação #%d: ", i);
        int numCurtidas = entrada.nextInt();
        totalCurtidas = totalCurtidas + numCurtidas;

        if (numCurtidas >= 100) {
            System.out.println("\tPublicação de Sucesso!");
        }
        else {
            System.out.println("\tPublicação com poucos likes.");
        }
    }
    double mediaCurtidas = (double) totalCurtidas / numPublicacoes;
    System.out.printf("Media de curtidas = %.1f\n", mediaCurtidas);
    System.out.printf("Número de publicações = %d\n", numPublicacoes);

    entrada.close();
    }
}

