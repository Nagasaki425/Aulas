public class Q3 {

    public static void inverter(int[] v) {
        int inicio = 0;
        int fim = v.length - 1;
        int aux;
        while (inicio < fim) {
            aux = v[inicio];
            v[inicio] = v[fim];
            v[fim] = aux;
            inicio++;
            fim--;
        }
    }

    public static void main(String[] args) {
        int[] v = {1, 2, 3, 4, 5};
        inverter(v);
        for (int x : v) {
            System.out.println(x + "");
        }
    }
}
