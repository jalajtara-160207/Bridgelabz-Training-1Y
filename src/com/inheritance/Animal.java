package com.inheritance;

public class Animal
{
    String Name;
    int Age;

    public Animal(String Name, int Age)
    {
        this.Name = Name;
        this.Age = Age;
    }

    public void makeSound()
    {
        System.out.println("Some Generic Animal Sound are as follows:-");
    }

    static class Dog extends Animal
    {
        public Dog(String Name, int Age)
        {
            super(Name, Age);
        }
        @Override
        public void makeSound()
        {
            System.out.println(Name +"Says:Woof Woof !!");
        }
    }
    static class Cat extends Animal
    {
        public Cat(String Name, int Age)
        {
            super(Name, Age);
        }
        @Override
        public void makeSound() {
            System.out.println(Name + "Says: Meow Meow !!");
        }
    }

    static class Bird extends Animal
    {
        public Bird(String Name, int Age)
        {
            super(Name, Age);
        }
        @Override
        public void makeSound()
        {
            System.out.println(Name+ "Says: Kuooh Kuooh!!");
        }
    }
}