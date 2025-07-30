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

Assume you are hired as a programmer at a Car Dealership. You open up their source code and to your shock you realize the previous developrs didn't know OOP.

This is the code you see... Shocking isn't it.

```java
// Car 1
String car1_make = "Totyota";
String car1_model = "Camry";
int car1_year = 2000;

// Car 2
String car2_make = "Ford";
String car2_model = "Mustang";
int car2_year = 2005;

// Car 3
String car3_make = "Nissan";
String car3_model = "Altima";
int car3_year = 2012;

// Buyer 1
String buyer1_name = "Bob Bobbert";
int buyer1_phone = 1234567;
float buyer1_creditScore = 800.0f;

// Buyer 2
String buyer1_name = "Carl Carlton";
int buyer1_phone = 9876543;
float buyer1_creditScore = 670.5f;
```

Copy & paste the code above into your Main class and refactor the code above to use **classes** & **objects**.

Create your classes in their designated file and be sure to include the following:

- Your **class is public**.
- Your **class has a constructor**.
- Your **class attributes are public**.
- Your **class methods are public**.

You can test your solution by running the command below in your terminal.

```
./test.sh
```

## Submit your assignment

[Grading Criteria](https://joselitoguardado.dev/3326/labs/Lab_16.pdf)

[How to Submit Assignments to GitHub](https://joselitoguardado.dev/3326/How_to_Submit_Assignments_to_GitHub.pdf)
