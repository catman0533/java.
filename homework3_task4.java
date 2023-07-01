//  Найти среднее значение

import java.util.ArrayList;
import java.util.List;

public class homework3_task4 {
    public static void main(String[] args) {
        // Произвольный список целых чисел
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);

        // Нахождение среднего значения
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum / numbers.size();

        System.out.println("Среднее значение: " + average);
    }
}
