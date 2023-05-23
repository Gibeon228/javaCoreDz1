package ru.geekbrains.lesson1.regular;

/**
 * Декоратор. Он декорирует, т.е., накладывает на результат декорации.
 * Внешний вид важен, поэтому класс существует
 */

public class Decorator {

    public static String decorator(int a) {
        /**
         * Метод декорирует число, добавляя к нему строку
         * при помощи функции форматирования строк
         */
        return String.format("Here is your number: %d.", a);
    }
}
