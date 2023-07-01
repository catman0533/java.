// Пусть дан произвольный список целых чисел.
//  Найти минимальное значение


import java.util.ArrayList;
import java.util.List;

public class homework3_task2 {
    public static void main(String[] args) {
        // Создаем список целых чисел
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(10);
        numbers.add(1);
        numbers.add(8);

        // Инициализируем минимальное значение значением первого элемента списка
        int min = numbers.get(0);

        // Проходим по остальным элементам списка и обновляем минимальное значение при необходимости
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }

        // Выводим минимальное значение
        System.out.println("Минимальное значение: " + min);
    }
}