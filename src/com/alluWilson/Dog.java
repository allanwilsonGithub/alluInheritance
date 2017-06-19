package com.alluWilson;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by allu on 19/06/2017.
 */
public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int teeth;
    private int tail;
    private String coat;


    public Dog(String name, int weight, int size, int eyes, int legs, int teeth, int tail, String coat, int Food) {
        super(name, 1, 1, weight, size, Food);
        this.eyes = eyes;
        this.legs = legs;
        this.teeth = teeth;
        this.tail = tail;
        this.coat = coat;

    }

    public int getEyes() {
        return eyes;
    }

    public int getLegs() {
        return legs;
    }

    public int getTeeth() {
        return teeth;
    }

    public int getTail() {
        return tail;
    }

    public String getCoat() {
        return coat;
    }

    public void setCoat (String coat) {
        coat = coat;
    }

    private void chew(int units){
        System.out.println("Chewing...");
        System.out.println("Food ammount was; " + getFood());
        System.out.println("The animal chewed: " + units);
        setFood(getFood() + units-1);
        System.out.println("Food ammount is now; " + getFood());
    }

    @Override
    public void eat(int units) {
        System.out.println("Overriding eat with chew...");
        chew(7);
        super.eat(units);
    }
}
