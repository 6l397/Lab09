import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Оберіть номер завдання, яке ви хочете розв'язати: ");
            String Exercise = scanner.nextLine();
            switch (Exercise) {
                case "1":
                    Scanner scanner01 = new Scanner(System.in);
                    System.out.print("Уведіть кількість елементів масива: ");
                    int n = scanner01.nextInt();
                    double[] a = new double[n];
                    for (int i = 0; i < n; i++) {
                        System.out.print("Уведіть " + (i + 1) + "-й елемент масиву: ");
                        a[i] = scanner01.nextDouble();
                    }
                    double[] result = Task1.task1(a);
                    System.out.println(Arrays.toString(result));
                    break;
                case "2":
                    Scanner scanner02 = new Scanner(System.in);
                    System.out.print("Уведіть кількість елементів масива: ");
                    int n2 = scanner02.nextInt();
                    int[] a2 = new int[n2];
                    for (int i = 0; i < n2; i++) {
                        System.out.print("Уведіть " + (i + 1) + "-й елемент масиву: ");
                        a2[i] = scanner02.nextInt();
                    }
                    System.out.println("Уведіть значення m: ");
                    int m = scanner02.nextInt();
                    System.out.println(Task2.task2(a2, m));
                    break;
                case "3":
                    Scanner scanner03 = new Scanner(System.in);
                    System.out.print("Уведіть кількість елементів масива: ");
                    int n3 = scanner03.nextInt();
                    double[] a3 = new double[n3];
                    for (int i = 0; i < n3; i++) {
                        System.out.print("Уведіть " + (i + 1) + "-й елемент масиву: ");
                        a3[i] = scanner03.nextInt();
                    }
                    System.out.println(Arrays.toString(Task3.task3(a3)));
                    break;
                case "4":
                    Scanner scanner04 = new Scanner(System.in);
                    System.out.print("Уведіть кількість жорстких дисків: ");
                    int n4 = scanner04.nextInt();
                    double[] memory = new double[n4];
                    for (int i = 0; i < n4; i++) {
                        System.out.print("Уведіть пам'ять " + (i + 1) + "-го жорсткого диску : ");
                        memory[i] = scanner04.nextInt();
                    }
                    double[] price = new double[n4];
                    for (int i = 0; i < n4; i++) {
                        System.out.print("Уведіть ціну " + (i + 1) + "-го жорсткого диску : ");
                        price[i] = scanner04.nextInt();
                    }
                    System.out.println("Уведіть значення n: ");
                    int n04 = scanner04.nextInt();
                    System.out.println(Task4.task4(memory, price, n04));
                    break;
                case "5":
                    Scanner scanner05 = new Scanner(System.in);
                    System.out.print("Уведіть кількість елементів масива: ");
                    int n5 = scanner05.nextInt();
                    int[] a5 = new int[n5];
                    for (int i = 0; i < n5; i++) {
                        System.out.print("Уведіть " + (i + 1) + "-й елемент масиву: ");
                        a5[i] = scanner05.nextInt();
                    }
                    System.out.println("Уведіть значення b: ");
                    int b5 = scanner05.nextInt();
                    System.out.println(Arrays.toString(Task5.task5(a5, b5)));
                    break;
                default:
                    System.out.println("Уведіть число від 1 до 5");
                    break;
            }
        }
    }
}