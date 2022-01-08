package com.robertkaptur;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public void bark() {
        System.out.println(getName() + " barks!");
    }

    public void whatsTheName() {
        System.out.println("The name of the dog is " + getName());
    }

    public void whatsTheAge() {
        System.out.println("The age of the dog is " + getAge());
    }
}
