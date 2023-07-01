// Найти максимальное значение


import java.util.List;

public class homework3_task3 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 10, 3, -7, 2);
        int max = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        System.out.println("Максимальное значение: " + max);
    }
}