
// Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа

import java.util.ArrayList;
import java.util.List;

public class homework3_task1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        
        List<Integer> result = new ArrayList<>();
        
        for (int number : numbers) {
            if (number % 2 != 0) {
                result.add(number);
            }
        }
        
        System.out.println("Исходный список: " + numbers);
        System.out.println("Список без четных чисел: " + result);
    }
}