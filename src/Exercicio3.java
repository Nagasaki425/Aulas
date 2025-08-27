import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.print("digite A: ");
        a = scanner.nextInt();
        System.out.print("digite B: ");
        b = scanner.nextInt();
        System.out.print("digite C: ");
        c = scanner.nextInt();

        if ((a+b > c) || (a+c>b) || (b+c>c)){
            if ( (a == b ) && (b == c)){
            System.out.println("Equilátero");
            }else if (a == b || a == c || b == c){
                System.out.println("Isósceles");
            }
            else{
                System.out.println("Escaleno");
            }
        }else{
            System.out.println("Os valores não formam um triângulo.");
        }

    }
}
