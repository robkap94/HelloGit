package com.robertkaptur;

public class Main {

    public static void main(String[] args) {

        // This is main class

        System.out.println("Hello Git!");
        System.out.println("This is going to be my test app for establishing GIT in my IDE");

        Dog bailey = new Dog("Bailey", 5);
        bailey.bark();
        bailey.whatsTheAge();

        Dog rufus = new Dog("Rufus", 10);
        rufus.bark();
        rufus.whatsTheName();
        rufus.whatsTheAge();
    }
}
