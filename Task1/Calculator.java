package ru.geekbrains.JDK.Task1;

public class Calculator {
    public static void main(String[] args) {

        System.out.println(sum(5, 4));
        System.out.println(multiply(5, 6));
        System.out.println(divide(8, 2));
        System.out.println(substract(16, 6));

    }


    public static <T extends Number, V extends Number> double sum(T t, V v) {
        return t.doubleValue() + v.doubleValue();
    }

    public static <T extends Number, V extends Number> double multiply(T t, V v) {
        return t.doubleValue() + v.doubleValue();
    }

    public static <T extends Number, V extends Number> double divide(T t, V v) {
        if (v.doubleValue() != 0) {
            return t.doubleValue() / v.doubleValue();
        }
        System.out.println("На ноль делить нельзя!");
        return 0;
    }

    public static <T extends Number, V extends Number> double substract(T t, V v) {
        return t.doubleValue() - v.doubleValue();
    }
}
