# Lab Assignment 16

In this lab you will practice working with classes and objects.

Unlike previous labs, your main class has already been created for you. 

## Let's get started!

For this lab your **main() method** is in the Dealership class. You can create any new classes below the Dealership class or inside a new java file. 

Now let's begin!

## Classes and Objects

Classes and objects are the core concept of Object-Oriented Programming (OOP). Classes are blueprints with instructions on how to build an object. A class itself is not a real entity, however an object is. Think of how architects use blueprints to build houses. Once built, houses are independent from each other.

<img src="img/blueprint_houses.png" width="200px">

### Attributes and Methods

<img src="img/class_objects.png" width="300px">

**Attributes** are variables within an object storing data pertaining to that object. For example, look at the diagram above. Using the Dog class we can creat multiple objects representing an indivdual dogs, each with unique attributes such as `name` and `thirsty`.

**Methods** are functions within an object that perform an action for that object itself. For example, if we call the method `drink_water()` from dog1, it will only quench the thirst for dog1, thus dog2 and dog3 will remain thirsty.

* Classes also have **constructors**. Constructors are unique methods that don't have a type and are used to set default values to our attributes.

**Code Example:**

**Main.java**
```java
public class Main {
    public static void main(String[] args) {
        // Creating objects from Dog class
        // Each object is independent from one another.
        Dog dog1 = new Dog("Rover");
        Dog dog2 = new Dog("Spot");
        Dog dog3 = new Dog("Sparky");
        
        // Quenching Spot's thirst only.
        dog2.drink_water();
    }
}
```
**Dog.java**
```java
public class Dog {
    // Attributes:
    public String name;
    public boolean thirsty;

    // Methods:
    // Constructor
    public Dog(String n) {
        name = n;
        thirsty = true;
    }
    public void drink_water() {
        System.out.println(name + " is drinking!");
        thirsty = false;
    }
}
```

## Your Program

### Car Dealership

Let's assume you  work at a Car Dealership. Create a Car class to help you organize your cars better.

1. Inside the `Car.java` file, create a **public** class `Car`.
2. Inside the `Car` class, create three **public** attributes `model`, `make`, and `year` (year). 
3. Next, create a **public constructor** with a three parameter to set the `model`, `make`, and `year` (in that order). 
4. Finally, create a **public** method `is_new()` to return `true` if the car is of year 2025, otherwise return `false`.

Create multiple Car objects inside the Dealership class to test your code.

You can test your solution by running the command below in your terminal.

```
./test.sh
```

## Submit your assignment

[Grading Criteria](https://joselitoguardado.dev/3326/labs/Lab_16.pdf)

[How to Submit Assignments to GitHub](https://joselitoguardado.dev/3326/How_to_Submit_Assignments_to_GitHub.pdf)