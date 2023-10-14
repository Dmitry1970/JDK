package ru.geekbrains.JDK.Task3;

public class Pair<T, V> {

    private T t;
    private V v;


    public Pair(T t, V v) {
        this.t = t;
        this.v = v;
    }

    public T getFirst() {
        return t;
    }

    public V getSecond() {
        return v;
    }

    @Override
    public String toString() {
        return "T = " + getFirst() + "\n" +
                "V = " + getSecond();
    }
}
