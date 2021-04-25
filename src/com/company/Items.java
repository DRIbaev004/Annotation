package com.company;

public class Items {
    String name;
    @RandomNumber(min = 10,max = 15)
    int damage;

    public Items(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Items{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                '}';
    }
}
