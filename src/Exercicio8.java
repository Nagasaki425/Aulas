import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu salário e veja se tem direito ao aumento!");

        System.out.print("Salário atual: ");
        double salarioAtual = sc.nextDouble();

        if (salarioAtual > 0 && salarioAtual <= 2000){
            double aumento = (salarioAtual * 0.40);
            double salarioNovo = aumento + salarioAtual;
            System.out.println("Seu aumento foi dê: "+ aumento);
            System.out.println("Seu novo salário é dê: "+ salarioNovo);
        } else if (salarioAtual > 2000 && salarioAtual <= 3000) {
            double aumento = (salarioAtual * 0.30);
            double salarioNovo = aumento + salarioAtual;
            System.out.println("Seu aumento foi dê: "+ aumento);
            System.out.println("Seu novo salário é dê:"+ salarioNovo);
        } else if (salarioAtual > 3000 && salarioAtual <= 4000){ 
            double aumento = (salarioAtual * 0.20);
            double salarioNovo = aumento + salarioAtual;
            System.out.println("Seu aumento foi dê: "+ aumento);
            System.out.println("Seu novo salário é dê: "+ salarioNovo);
        } else if (salarioAtual > 4000 && salarioAtual <= 5000) {
            double aumento = (salarioAtual * 0.10);
            double salarioNovo = aumento + salarioAtual;
            System.out.println("Seu aumento foi dê: "+ aumento);
            System.out.println("Seu novo salário é dê: "+ salarioNovo);
        } else if (salarioAtual > 5000) {
            System.out.println("Não tem direito ao aumento.");
        }
        else {
            System.out.println("Digite um salário válido!");
        }


            sc.close();
    }
    
}
