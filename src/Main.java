import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        double[] fractions = {0, 1.57, 0, 7.654, 9.986, 0};
        fractions[1] = 1.57;
        fractions[3] = 7.654;
        fractions[4] = 9.986;
        System.out.println(fractions[1]);
        System.out.println(fractions[3]);
        System.out.println(fractions[4]);
        System.out.println("Задача 2");
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(fractions));
        System.out.println("Задача 3");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + ", ");
        } System.out.println();
        {
            for (int b = fractions.length - 1; b >= 0; b--) {
                System.out.print(fractions[b] + ",");
            }
            System.out.println();
            System.out.println("Задача 4");
            int [] num = {1,2,3};
            for (int k = 0; k < num.length; k++)
                if (num[k] % 2 != 0)
                    num[k] = num[k] + 1;
            System.out.println(Arrays.toString(num));
            }
        }
    }
