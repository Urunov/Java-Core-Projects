# Java Fundamentals and Project. [ru/eng]

   1. Java Core
   2. OOPs
   3. LambdaExpression
   4. Colelction Framework


------------
## ~~&minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus;~~
------------

## Java OOP 
![](https://assets-global.website-files.com/5c7536fc6fa90e7dbc27598f/5d8350501fa9f72a27a893bf_Oo65m_6e_qkDzypQAEMmPHMgn_mbbZo492Zf-qLCs1Rw1gc6CUAZqLxgmawjN1qdAiIrSqtRU5PpkEYlM2MAhUYjt1SwuvUialeWk2c6mIu0Vwt5F97USlsy1lmLTy_XsHjH5GK0U2BPhz3TEA.png)

# Definition of OOP Concepts in Java

The main ideas behind Java’s Object-Oriented Programming, OOP concepts include **abstraction**, **encapsulation**, **inheritance** and **polymorphism**. Basically, Java OOP concepts let us create working methods and variables, then re-use all or part of them without compromising security. Grasping OOP concepts is key to understanding how Java works.


## &diams;Abstraction

------------
![](https://4.bp.blogspot.com/-f4xkVxrB9cE/Vr35rdyb1OI/AAAAAAAAKww/omBDIeFZEx0/s1600/Java%2BTutorial%2B-%2BJava%2Babstract%2Bclass%2528Printer%2529.jpg)
Using simple things to represent complexity. We all know how to turn the TV on, but we don’t need to know how it works in order to enjoy it. In Java, abstraction means simple things like **objects**, **classes** and **variables** represent more complex underlying code and data. This is important because it lets you avoid repeating the same work multiple times.

> ### *How Abstraction Works*
> Abstraction lets programmers create useful and reusable tools. For example, a programmer can create several different types of **objects**, which can be variables, functions or data structures. Programmers can also create different **classes** of objects as ways to define the objects.
> For instance, a class of variable might be an address. The class might specify that each address object shall have a name, street, city and zip code. The objects, in this case, might be employee addresses, customer addresses or supplier addresses.For instance, a class of variable might be an address. The class might specify that each address object shall have a name, street, city and zip code. The objects, in this case, might be employee addresses, customer addresses or supplier addresses.

## &diams;Encapsulation

------------
![](https://telegra.ph/file/44c9d6bcc07b09a76b168.jpg)

The practice of keeping fields within a class private, then providing access to those fields via public methods. Encapsulation is a protective barrier that keeps the data and code safe within the class itself. We can then reuse objects like code components or variables without allowing open access to the data system-wide.

> ### *How Encapsulation Works*
> Encapsulation lets us reuse functionality without jeopardizing security. It’s a powerful, time-saving OOP concept in Java. For example, we may create a piece of code that calls specific data from a database. It may be useful to reuse that code with other databases or processes. Encapsulation lets us do that while keeping our original data private. It also lets us alter our original code without breaking it for others who have adopted it in the meantime.

### &diams;Inheritance

------------

![](https://d1jnx9ba8s6j9r.cloudfront.net/blog/wp-content/uploads/2017/04/Inheritance-example-java.png)
A special feature of Object-Oriented Programming in Java, Inheritance lets programmers create new classes that share some of the attributes of existing classes. Using Inheritance lets us build on previous work without reinventing the wheel.

> ### *How Inheritance Works*
> Inheritance is another labor-saving Java OOP concept that works by letting a new class adopt the properties of another. We call the inheriting class a subclass or a child class. The original class is often called the parent. We use the keyword extends to define a new class that inherits properties from an old class.

### &diams;Polymorphism

------------
![](http://www.btechsmartclass.com/java/java_images/OOP-Concept-Inheritance.png)

Allows programmers to use the same word in Java to mean different things in different contexts. One form of polymorphism is **method overloading**. That’s when the code itself implies different meanings. The other form is **method overriding**. That’s when the values of the supplied variables imply different meanings. Let’s delve a little further.


> ### *How Polymorphism Works*
> Polymorphism in Java works by using a reference to a parent class to affect an object in the child class. We might create a class called “horse” by extending the “animal” class. That class might also implement the “professional racing” class. The “horse” class is “polymorphic,” since it inherits attributes of both the “animal” and “professional racing” class.
> 
> Two more examples of polymorphism in Java are method overriding and method overloading.
> 
> In **method overriding**, the child class can use the OOP polymorphism concept to override a method of its parent class. That allows a programmer to use one method in different ways depending on whether it’s invoked by an object of the parent class or an object of the child class.
> 
> In **method overloading**, a single method may perform different functions depending on the context in which it’s called. This means a single method name might work in different ways depending on what arguments are passed to it.



### *Examples of OOP Concepts in Java*
*Now that we explained the foundational OOP concepts in Java, let’s look at a few common examples.*

### Short Encapsulation Example in Java
In the example below, encapsulation is demonstrated as an OOP concept in Java. Here, the variable “name” is kept private or “encapsulated.”


```java
    //save as Student.java
    package com.javatpoint;
    
    public class Student {
        private String name;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }
    
    
    //save as Test.java
    package com.javatpoint;
    class Test {
        public static void main(String[] args) {
            Student s = new Student();
            s.setName("Donik");
            System.out.println(s.getName());
        }
    }
```

------------



    Compile By: javac -d . Test.java
    Run By: java com.javatpoint.Test
    
    Output: Donik


------------

### Example of Inheritance in Java
*It’s quite simple to achieve inheritance as an OOP concept in Java. Inheritance can be as easy as using the **extends** keyword:*

```java
class Students {

}
class Teachers extends Students {

}
class Univercity extends Teachers {

}
```

------------

### Short Example of Polymorphism in Java
*In the example below of polymorphism as an OOP concept in Java, we have two classes: Person and Employee. The Employee class inherits from the Person class by using the keyword **extends**. Here, the child class overrides the parent class.*

```java
package com.javatpoint;

class Person {
    void walk() {
        System.out.println("Can Run….");
    }
}
class Employee extends Person {
    public static void main(String args[]) {
        Person p = new Employee(); //upcasting
        p.walk();
    }
    void walk() {
        System.out.println("Running Fast…");
    }
}
```

------------



    Compile By: javac -d . Employee.java
    Run By: java com.javatpoint.Employee
    
    Output: Running Fast…
------------


## ~~&minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus; &minus;~~

## Lambda Expression
// 

 Project
 =======

 
 The project includes an ATM program that serves consumers.
 
 Project performance structure :
 ![ATM-menu-tree-structure](https://user-images.githubusercontent.com/99829336/164917060-6279ff50-31ee-43c9-9b97-2299d6fe81b7.png)
 
 The project has 2 incoming data and 6 outgoing data.
   
   Incoming information.
   
      + The program will ask you to enter the card ID.
      + Again you enter your card password.
      
   Output information.
   
      - View card account.
      - Cash withdrawal.
      - Replenish the card account.
      - Currency exchange.
      - SMS notification.
      - Change the card code.
      
  * When you start the program, you will be asked for a plastic ID.
  <img width="204" alt="Screen Shot 2022-05-27 at 17 06 39" src="https://user-images.githubusercontent.com/99829336/170696884-3374cfa3-d901-4b73-8ea9-5c4182938b68.png">
after you enter ->

   * The card password is requested.
   <img width="174" alt="Screen Shot 2022-05-27 at 17 12 50" src="https://user-images.githubusercontent.com/99829336/170697102-a8fe2dbd-8f11-4198-b02f-a4f16d9f8870.png">
after you enter ->

❌ If your card ID is incorrect <img width="196" alt="Screen Shot 2022-05-27 at 17 04 36" src="https://user-images.githubusercontent.com/99829336/170697195-8f8b47ae-d5e2-4280-a8f5-ba62eeaa48d0.png">  If your password is incorrect <img width="247" alt="Screen Shot 2022-05-27 at 17 07 49" src="https://user-images.githubusercontent.com/99829336/170697160-05e6b2af-596a-404f-9172-e925bf985f90.png"> you will get the answer



✅ If your plastic ID and password are correct

   * The program will open a list of services for you
   <img width="245" alt="Screen Shot 2022-05-27 at 17 16 30" src="https://user-images.githubusercontent.com/99829336/170697728-84d264ba-b433-4762-8ab4-7e094623b24c.png">

   If you want to see the program's service list code, -> [Click](https://github.com/Urunov/Java-Core-Projects/blob/master/ATM-Bank/src/main/java/uz/bepro/atm/model/uzbek/UzbekchaLogics.java)
    
   * Enter the order number you want to use the service for

   I want to see my card account for example.
   <img width="269" alt="Screen Shot 2022-05-27 at 17 08 04" src="https://user-images.githubusercontent.com/99829336/170697904-82b4a494-fb42-49eb-a939-0656ecbb088f.png">
   
   ******************************************
   
   or I want to withdraw money from the card
   <img width="316" alt="Screen Shot 2022-05-27 at 17 08 17" src="https://user-images.githubusercontent.com/99829336/170697923-e72a930a-db1f-4734-b4d0-7df686f43c0c.png">


You can use any service ATM works in the same way.

Please to see the project [Click](https://github.com/Urunov/Java-Core-Projects/tree/master/ATM-Bank)


## Reference 

1. Book-1. [Click](https://www.amazon.in/dp/B01GXXQ5KG?tag=guru99-21&geniuslink=true)
2. 
