public class Q2 {
    public static int[] maxEIndice(int[] v) {
        int res[] = new int[2];
        res[0] = v[0];
        res[1] = 0;
        for (int i=1; i < v.length; i++){
            if (v[i] > res[0]){
                res[0] = v[i];
                res[1] = i;
            }
        }
        return res;
    } 

    public static void main(String[] args) {
        int[] v = {-5, 3, 7, 7, 2};
        int[] r = maxEIndice(v);
        // esperado: r[0] = 7, r[1] = 2
        System.out.println(r[0] + " @ " + r[1]);
    }
}
    
