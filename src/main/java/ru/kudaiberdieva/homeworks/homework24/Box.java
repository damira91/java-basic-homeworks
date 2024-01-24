package ru.kudaiberdieva.homeworks.homework24;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public double weight() {
        double result = 0;
        for(Fruit fruit: fruits){
            result += fruit.getWeight();
        }
        return result;
    }

    public boolean compare(Box<?> otherBox) {
        return Math.abs(this.weight() - otherBox.weight()) < 0.001;
    }

    public void putFruitsToAnotherBox(Box<? super T> otherBox) {
        if (otherBox == null) {
            throw new IllegalArgumentException("������ ���������� ������ �� ������ �������");
        }
        if (otherBox == this) {
            throw new IllegalArgumentException("������ ���������� ������ � �� �� �������");
        }
        otherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}
