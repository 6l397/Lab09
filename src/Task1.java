import java.util.Arrays;

public class Task1 {
    public static double[] task1(double[] a) {
        double[] c = new double[a.length];
        int cIndex = 0;
        boolean alternating = true;
        for (int i = 0; i < a.length-1; i++) {
            if ((a[i] >= 0 && a[i+1] >= 0) || (a[i] < 0 && a[i+1] < 0)) {
                alternating = false;
                break;
            }
        }
        if (alternating) {
            return a;
        } else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] < 0) {
                    c[cIndex] = a[i];
                    cIndex++;
                }
            }
            return Arrays.copyOf(c, cIndex);
        }
    }
}
