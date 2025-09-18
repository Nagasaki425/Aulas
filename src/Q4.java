import java.util.Arrays;

public class Q4 {

    public static int[] mergeOrdenado(int[] a, int[] b) {
        int[] res = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        // percorre ambos os arrays e adiciona o menor elemento
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                res[k++] = a[i++];
            } else {
                res[k++] = b[j++];
            }
        }

        // adiciona os elementos restantes de 'a', se houver
        while (i < a.length) {
            res[k++] = a[i++];
        }

        // adiciona os elementos restantes de 'b', se houver
        while (j < b.length) {
            res[k++] = b[j++];
        }

        return res;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 6, 8};
        int[] resultado = mergeOrdenado(a, b);
        System.out.println(Arrays.toString(resultado)); // [1, 2, 3, 4, 5, 6, 8]
    }
}
