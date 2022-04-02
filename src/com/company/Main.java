package com.company;

import java.util.Scanner;

/**
 * Lefter Olexii, #18
 */
public class Main {
    /**
     * Дана последовательность чисел, среди которых имеется один нуль.
     * Вывести на экран все числа до нуля включительно.
     */
    private static void task40() {
        System.out.println("Task 40");
        int[] numberRow = {1, 3, 6, 8, 1, 0, 4, 2, 7};
        for (int pos = 0; pos < numberRow.length; pos++) {
            if (numberRow[pos] != 0) {
                System.out.print(numberRow[pos] + " ");
            } else {
                break;
            }
        }
    }

    /**
     * Найти сумму наибольшего и наименьшего элементов массива вещественных чисел массива Z(n);
     */
    private static void task65() {
        System.out.println("\n\nTask 65");
        float[] numberRow = new float[14];
        for (int pos = 0; pos < numberRow.length; pos++) {
            numberRow[pos] = (float) Math.random() * 100;
            System.out.print(numberRow[pos] + " ");
        }
        float max = numberRow[0];
        float min = numberRow[0];
        float sum;
        for (int pos = 0; pos < numberRow.length; pos++) {
            if (numberRow[pos] < min) {
                min = numberRow[pos];
            }
            if (numberRow[pos] > max) {
                max = numberRow[pos];
            }
        }
        sum = min + max;
        System.out.print("\nSum of min and max = " + sum);
    }

    /**
     * Дана непустая последовательность целых чисел, оканчивающаяся отрицательным числом.
     * Верно ли, что все элементы последовательности равны между собой?
     */
    private static void task90() {
        System.out.println("\n\nTask 90");
        int[] numberRow = new int[9];
        int counter = 0;
        for (int pos = 0; pos < numberRow.length; pos++) {
            numberRow[pos] = -1;
            System.out.print(numberRow[pos] + " ");
        }
        for (int pos = 1; pos < numberRow.length; pos++) {
            if (numberRow[pos] == numberRow[pos - 1]) {
                counter++;
            }
        }
        if (counter == numberRow.length - 1) {
            System.out.print("\nВсе элементы последовательности равны между собой.");
        } else {
            System.out.print("\nНе все элементы последовательности равны между собой.");
        }
    }

    /**
     * На i-e место одномерного массива вещественных чисел вставить элемент,
     * равный квадратному корню из суммы квадратов двух введенных с клавиатуры элементов.
     */
    private static void task115() {
        System.out.println("\n\nTask 115");
        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_RESET = "\u001B[0m";
        int i = 3;
        double[] numberRow = new double[9];
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        if ((number1 >= 0) && (number2 >= 0) && (number1 <= numberRow.length) && (number2 <= numberRow.length)) {
            for (int pos = 0; pos < numberRow.length; pos++) {
                numberRow[pos] = (float) Math.random() * 15 - 5;
                System.out.printf("%.3f ", numberRow[pos]);
            }
            numberRow[i] = Math.sqrt(Math.pow(numberRow[number1 - 1], 2) + Math.pow(numberRow[number2 - 1], 2));
            System.out.print("");
            for (int pos = 0; pos < numberRow.length; pos++) {
                if (pos == i) {
                    System.out.print(ANSI_RED + String.format("%.3f ", numberRow[pos]) + ANSI_RESET);
                } else if ((pos == number1 - 1) || (pos == number2 - 1)) {
                    System.out.print(ANSI_GREEN + String.format("%.3f ", numberRow[pos]) + ANSI_RESET);
                } else {
                    System.out.printf("%.3f ", numberRow[pos]);
                }
            }
        } else {
            System.out.println("Введены некорректные данные");
        }
    }

    /**
     * Дана последовательность целых чисел а1, а2, ..., an. Минимальный член этой последовательности заменить целой
     * частью среднего арифметического всех членов, остальные члены оставить без изменения.
     * Если в последовательности несколько минимальных членов, то заменить последний по порядку.
     */
    private static void task140() {
        System.out.println("\n\nTask 140");
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_RESET = "\u001B[0m";
        double average;
        float sum = 0;
        float[] aRow = new float[15];
        for (int pos = 0; pos < aRow.length; pos++) {
            aRow[pos] = (int) (Math.random() * 101);
            sum += aRow[pos];
            System.out.print(aRow[pos] + " ");
        }
        System.out.println();
        int indexMin = 0;
        for (int pos = 0; pos < aRow.length; pos++) {
            if (aRow[pos] <= aRow[indexMin]) {
                indexMin = pos;
            }
        }
        average = sum / aRow.length;
        System.out.println("Average = " + average);
        aRow[indexMin] = (int) average;
        for (int pos = 0; pos < aRow.length; pos++) {
            if (pos == indexMin) {
                System.out.print(ANSI_GREEN + aRow[pos] + " " + ANSI_RESET);
            } else {
                System.out.print(aRow[pos] + " ");
            }
        }
    }

    public static void main(String[] args) {
        task40();
        task65();
        task90();
        task115();
        task140();
    }
}
