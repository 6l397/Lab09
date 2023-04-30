public class Task2 {
    public static String task2(int[] a2, int m) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < a2.length; i += 2) {
            if (a2[i] > m) {
                sum += a2[i];
                count++;
            }
        }
        String result = "";
        result = "Сума таких елементів: " + sum + ". " +"Кількість: " + count;
        return result;
    }
}