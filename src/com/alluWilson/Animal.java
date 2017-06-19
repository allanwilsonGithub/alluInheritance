package com.alluWilson;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by allu on 19/06/2017.
 */
public class Animal {
    private String Name;
    private int Brain;
    private int Body;
    private int Weight;
    private int Size;
    private int Food;

    public Animal(String name, int brain, int body, int weight, int size, int food) {
        Name = name;
        Brain = brain;
        Body = body;
        Weight = weight;
        Size = size;
        Food = food;
    }

    public void eat (int units) {
        System.out.println("Food ammount was; " + getFood());
        System.out.println("The animal ate: " + units);
        setFood(getFood() + units);
        System.out.println("Food ammount is now; " + getFood());
    }

    public int getFood () {
        return Food;
    }

    public void setFood (int food){
        Food = food;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name){
        Name = name;
    }

    public int getBrain() {
        return Brain;
    }

    public int getBody() {
        return Body;
    }

    public int getWeight() {
        return Weight;
    }

    public int getSize() {
        return Size;
    }
}
