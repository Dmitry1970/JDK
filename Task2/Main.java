package ru.geekbrains.JDK.Task2;

public class Main {
    public static void main(String[] args) {

        Task2<Integer> task2 = new Task2();
        Integer[] array = {1, 4, 6, 8, 15};
        Integer[] arr = {5, 3, 17, 95, 32};

        System.out.println(task2.compareArrays(array, arr));
    }
}
