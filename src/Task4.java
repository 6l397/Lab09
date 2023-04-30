public class Task4 {
    public static String task4(double[] memory, double[] price, int n04) {
        String result = "Обсяг пам'яті жорстких дисків, вартість яких більша за " + n04 + ":\n";
        for (int i = 0; i < memory.length; i++) {
            if (price[i] > n04) {
                result += memory[i] + " Гб \n";
            }
        }
        return result;
    }
}
