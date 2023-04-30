import java.util.Arrays;

public class Task3 {
    public static double[] task3(double[] a3) {
        double[] b = new double[a3.length];
        int index = 0;
        for (int i = 0; i < a3.length; i++) {
            if (a3[i] > 0) {
                b[index] = a3[i];
                index++;
            }
        }
        Arrays.sort(b, 0, index);
        return Arrays.copyOf(b, index);
    }
}