import java.util.Arrays;

public class Q5 {
    public static void moveZeros(int[] v) {
        int pos = 0; // posição onde vamos colocar o próximo número diferente de zero

        // percorre o array
        for (int i = 0; i < v.length; i++) {
            if (v[i] != 0) {
                v[pos] = v[i];
                pos++;
            }
        }

        // preenche o restante com zeros
        while (pos < v.length) {
            v[pos] = 0;
            pos++;
        }
    }

    public static void main(String[] args) {
        int[] v = {0, 1, 5, 0, 3, 0, 12};
        moveZeros(v);
        System.out.println(Arrays.toString(v)); // saída: [1, 5, 3, 12, 0, 0, 0]
    }
}
