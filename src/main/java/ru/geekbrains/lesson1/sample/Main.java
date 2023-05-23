package ru.geekbrains.lesson1.sample;

import ru.geekbrains.lesson1.regular.*;

public class Main {
    public static void main(String[] args) {
        int result = OtherClass.add(2, 3);
        System.out.println(Decorator.decorator(result));
        result = OtherClass.sub(2, 3);
        System.out.println(Decorator.decorator(result));
        result = OtherClass.mul(2, 3);
        System.out.println(Decorator.decorator(result));
        result = OtherClass.div(2, 3);
        System.out.println(Decorator.decorator(result));
        result = OtherClass.buildingInDegree(2, 3);
        System.out.println(Decorator.decorator(result));
    }
}