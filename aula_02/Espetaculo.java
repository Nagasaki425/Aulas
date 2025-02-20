package aula_02;

import java.util.Scanner;


public class Espetaculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Entrada de Dados
        System.out.print("Digite o valor do custo de produçaõ: ");
        float custoProducao = entrada.nextFloat();
        System.out.print("Valor do ingresso: ");
        float valorIngresso = entrada.nextFloat();
        //Processamneto
        int qtdeIngressos = (int) Math.ceil(custoProducao / valorIngresso);
        int qtdeIngressos23 =(int) Math.ceil((custoProducao * 1.23f) / valorIngresso);
        //Saida de Dados
        System.out.printf("Quantidade de convite: %d\n" , qtdeIngressos );
        System.out.printf("Quantidade de convite para ter 23%% de lucro: %d\n", qtdeIngressos23);

    }

    
}
