package com.company;

public class TaskOne {
    public static void main(String[] args) {

        // Объявляем переменные
        int x1 = 4;
        int s1;
        int p1;
        int x2 = 2;
        int s2;
        int p2;
        boolean isResOne = true;
        boolean isResTwo = false;
        String string = "Периметр равен площади: ";

        // Вычисляем площадь и периметр
        s1 = x1 * x1;
        p1 = 4 * x1;
        s2 = x2 * x2;
        p2 = 4 * x2;

        // Сравниваем площадь с периметром и выводим результат
        // Два варианта
        isResOne = s1 == p1;
        System.out.println(string + isResOne);

        if (s2 == p2) {
            System.out.println(string + isResOne);
        } else {
            System.out.println(string + isResTwo);
        }
    }
}
