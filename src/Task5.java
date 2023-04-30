public class Task5 {
    public static int[] task5(int[] a5, int b5) {
        int[] result = new int[a5.length];
        int start = 0;
        int end = a5.length - 1;
        for (int i = 0; i < a5.length; i++) {
            if (a5[i] < b5) {
                result[start] = a5[i];
                start++;
            } else {
                result[end] = a5[i];
                end--;
            }
        }
        return result;
    }
}
