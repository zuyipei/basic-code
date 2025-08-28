package test;

public class Test6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 153, 7, 8, 9, 58};
        System.out.println(getMax(arr));
    }

    public static int getMax(int[] sb) {
        int max = sb[0];
        for (int i = 1; i < sb.length; i++) {
            if (sb[i] > max) {
                max = sb[i];
            }
        }
        return max;
    }
}
