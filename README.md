# Practice_Interface
## Instruction
In this assignment you are going to learn how to create an interface, how to implement that interface using a class. You will also learn the benefits of using interface. For this assignment you are given two packages with the starter code which you have to use for two different tasks as described below.

# Task 1
- We have a package named interface1 that includes two simple classes named *Vehicle* and *FixedProperty*. 
- Create two classes *Bus* and *House* where, Bus specializes (extends) the class Vehicle and House specializes the class FixedProperty.
- Bus class needs to have the following:
  - an instance variable *numberOfSeats* that keeps record for number of seats in the bus.
  - a getter function to return the number of seats.
  - a constructor that sets values for all member variables.
- The House class should have 
  - an instance variable *area* that stores the area of the house.
  - a getter function to return the area.
  - a constructor that sets values for all member variables. 
- Now, write an interface ITaxable with a parameterless operation TaxValue as **double TaxValue()**. The operation should return the tax amount as a decimal number .
- Create the variations of class *House* and class *Bus* which implement the interface Itaxable as *TaxableHouse* and *TaxableBus*. 
  - The tax for a bus is calculated as:
  
    -- Tax=0.01% of the price value for each seat
  - The tax for a house is calculated as
  
      -- If the house is located within the city : Tax=0.005% of the estimated price of the house for each square foot.
      
      -- Else Tax=0.001% of the price for each square foot.
- Notice that both class House and Bus have a superclass, namely FixedProperty and Vehicle, respectively. Therefore it is essential that taxation is introduced via an interface.

# Task 2
- Within the package interface2 you are given an interface called *Measurable* which contains the single abstract method **double getMeasure();**.
- Create two classes named *Student* and *Item* that implements the interface *Measurable* such that:
  - For *Student* the **getMeasure()** returns the tution fees for a student.
  - For *Item* the **getMeasure()** returns the price of the item.
- In your *Main* class 
  - Create a list of **Student** objects and a list of **Item** objects with different tution fees and prices.
  - Add necessary constructors, instance varibles and setter/getter functions for your classes.
  - Define a method call **public static returnAverage(ArrayList<Measurable> list)** that returns the average of any list of objects that are *Measurable*.
  - Now calculate and print the average tution fees for a student and the average price of an item. 



