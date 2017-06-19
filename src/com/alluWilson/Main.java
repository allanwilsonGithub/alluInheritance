package com.alluWilson;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {

    public static void main(String[] args) {
	Animal tiger = new Animal("KatyPerry", 1, 1, 30, 2, 3);

	tiger.setName("Joanna");
	System.out.println("The tiger's name is: " + tiger.getName());

	Dog collie = new Dog("Cindie",20, 2, 2, 4, 32, 1, "Glossy", 3);
    collie.setName("Barbie");
    collie.setCoat("Matt");
    System.out.println("The new dog's name is: " + collie.getName());
    System.out.println("The new dog's coat is: " + collie.getCoat());
    collie.eat(5);
    }

}
