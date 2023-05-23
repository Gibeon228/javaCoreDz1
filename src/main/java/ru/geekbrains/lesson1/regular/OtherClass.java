package ru.geekbrains.lesson1.regular;

/**
 *
 */

public class OtherClass {

    /**
     * Функция суммирования двух чисел
     *
     * @param a первое слагаемое
     * @param b второе слагаемое
     * @return сумма a и b, без проверки на переполнение переменной.
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Функция деления двух чисел
     *
     * @param a делимое
     * @param b делитель
     * @return частное a и b, без проверки на переполнение переменной.
     */
    public static int div(int a, int b) {
        return a / b;
    }

    /**
     * Функция умножения двух чисел
     *
     * @param a первый множитель
     * @param b второй множитель
     * @return произведение a и b, без проверки на переполнение переменной.
     */
    public static int mul(int a, int b) {
        return a * b;
    }

    /**
     * Функция вычитания двух чисел
     *
     * @param a уменьшаемое
     * @param b вычитаемое
     * @return разность a и b, без проверки на переполнение переменной.
     */
    public static int sub(int a, int b) {
        return a - b;
    }

    public static int buildingInDegree(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
}
