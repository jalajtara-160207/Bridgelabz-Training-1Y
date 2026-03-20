package com.inheritance;

public class Runner1 {
    static void main()
    {
        Animal Dog = new Animal.Dog("Buddy",3);
        Animal Cat = new Animal.Cat("Kitty",2);
        Animal Bird = new Animal.Bird("Koyal",1);

        Dog.makeSound();
        Cat.makeSound();
        Bird.makeSound();
    }
}
