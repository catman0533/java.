// Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
// 1) Умножьте два числа и верните произведение в виде связанного списка.
// 2) Сложите два числа и верните сумму в виде связанного списка. Одно или два числа должны быть отрицательными.
    
// package com.java_learn;

import java.util.*;

public class homework4_task1_2 {

    public static int BASE_NUMBER = 10;

    public int testValue = 0;

    public static void main(String[] args) {
        //24 42
        Deque<Integer> number1 = new ArrayDeque<>();
        number1.addLast(4);
        number1.addLast(2);

        Deque<Integer> number2 = new ArrayDeque<>();
        number2.addLast(1);
        number2.addLast(2);

        int value1 = convertDequeToNumber(number1, true);
        int value2 = convertDequeToNumber(number2, true);

        List<Integer> resultSum = convertNumberToList(value1 + value2, true);
        List<Integer> resultMultiply = convertNumberToList(value1 * value2, true);

        System.out.println(resultSum);
        System.out.println(resultMultiply);
    }

    public static int convertDequeToNumber(Deque<Integer> dequeNumber, boolean isDirectOrder) {
        int result = 0;
        int degree = 0;
        int signNumber = 1;

        Iterator<Integer> iterator = isDirectOrder ? dequeNumber.descendingIterator() : dequeNumber.iterator();

        while(iterator.hasNext()) {
            int nodeValue = iterator.next();
            if(nodeValue<0)
                signNumber = -1;
            int absValue = (int) Math.abs(nodeValue * Math.pow(BASE_NUMBER, degree));
            result+=absValue;
            degree++;
        }
        return result * signNumber;
    }

    public static List<Integer> convertNumberToList(int number, boolean isDirectOrder) {
        List<Integer> listNumbers = new LinkedList<>();
        int tempNumber = Math.abs(number);

        while(tempNumber>0) {
            listNumbers.add(tempNumber%BASE_NUMBER);
            tempNumber = tempNumber/BASE_NUMBER;
        }
        if(number<0) {
            int lastIndex = listNumbers.size() - 1;
            int value = listNumbers.get(lastIndex) * (-1);
            listNumbers.set(lastIndex, value);
        }

        if(isDirectOrder)
            Collections.reverse(listNumbers);

        return listNumbers;
    }
}
