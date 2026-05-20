/*
Q2. Problem Statement:
Write a Java program to implement the concept of inheritance for different types of vehicles.
 The program must include four classes:
Vehicle – Superclass
Bus – Subclass of Vehicle
Truck – Subclass of Vehicle
Transport – Driver class containing the main() method


The goal is to demonstrate the concept of inheritance, constructor chaining, method overriding, and object-oriented encapsulation.
Detailed Description:
1. Class: Vehicle (Superclass)
Data Members:
String model – Vehicle model
String registrationNumber – Registration number of the vehicle
double speed – Vehicle speed in kilometers per hour
double fuelCapacity – Fuel tank capacity in liters
double fuelConsumption – Fuel consumption in kilometers per liter


Member Methods:
Parameterized Constructor


Initializes all data members with the given values.


Getters and Setters
Provide get and set methods for each data member.


fuelNeeded(double distance)
Accepts distance (in kilometers) as an argument.
Calculates and returns the amount of fuel required for that distance.


distanceCovered(double time)
Accepts time (in hours) as an argument.
Calculates and returns the distance covered based on the vehicle’s speed.
display()
Displays all details of the vehicle, including model, registration number, speed, fuel capacity, and fuel consumption.
2. Class: Truck (Subclass of Vehicle)
Additional Data Member:
double cargoWeightLimit – Cargo carrying capacity in kilograms.
Member Methods:
Parameterized Constructor
Initializes all data members, including those inherited from the Vehicle class (using super()), and cargoWeightLimit.


Overridden display() Method
Must call super.display() to display the base class details,
 and then display the cargo weight limit specific to the truck.
3. Class: Bus (Subclass of Vehicle)
Additional Data Member:
int numberOfPassengers – Total number of passengers the bus can carry.


Member Methods :
Parameterized Constructor


Initializes all data members, including those from the superclass (using super()).


Getters and Setters
Provide getter and setter methods for numberOfPassengers.


Overridden display() Method


Must call super.display() to display base class details,
 and then display the number of passengers specific to the bus.
4. Class: Transport (Driver Class)
Description:
 This class must contain the main() method to test inheritance and method overriding.
Steps to Perform in main() Method:
Create an object of Truck and initialize all its data members with valid values using the parameterized constructor.


Create an object of Bus and initialize all its data members with valid values using the parameterized constructor.


For both objects:


Call the fuelNeeded() method by passing a sample distance (e.g., 500 km).
Call the distanceCovered() method by passing a sample time (e.g., 5 hours).
Call the display() method to display all details.
Concepts Demonstrated:
Inheritance (Superclass → Subclasses)
Constructor Chaining using super()
Method Overriding (display() method)
Encapsulation (Private data members with getters/setters)
Polymorphism (Different display() methods for Bus and Truck)
*/

import java.util.*;

class Vehicle
{
  String model;
  String registrationNumber;
  double speed;
  double fuelCapacity ;
  double fuelConsumption;
  
  Vehicle( String model,String registrationNumber,double speed,double fuelCapacity,double fuelConsumption)
  {
      this.model=model;
	  this.registrationNumber=registrationNumber;
	  this.speed=speed;
	  this.fuelCapacity=fuelCapacity;
	  this.fuelConsumption=fuelConsumption;  
   }
   
   //setter and getter
   
   public void setmodel(String model)
   {
    this.model=model;
   }
   public String getmodel()
   {
      return model;
   }
   
   public void setregistrationNumber(String registrationNumber)
   {
    this.registrationNumber=registrationNumber;
   }
   public String getregistrationNumber()
   {
      return registrationNumber;
   }
   
   public void setspeed(double speed)
   {
    this.speed=speed;
   }
   public double getspeed()
   {
      return speed;
   }
   
   public void setfuelCapacity(double fuelCapacity)
   {
    this.fuelCapacity=fuelCapacity;
   }
   public double getfuelCapacity()
   {
      return fuelCapacity;
   }
   
    public void setfuelConsumption(double fuelConsumption)
   {
    this.fuelConsumption=fuelConsumption;
   }
   public double getfuelConsumption()
   {
      return fuelConsumption;
   }
   
   double fuelNeeded(double distance)
   {
     return distance/fuelConsumption;
   }
   
   double distanceCovered(double time)
   {
      return speed*time;
   }
   
   void display()
   {
      System.out.println("vehical model "+model);
	 System.out.println("vehical registration number "+registrationNumber);
     System.out.println("speed of vehical "+speed+"km/h");
     System.out.println("fuel capacity "+fuelCapacity);
     System.out.println("fuel consumption"+fuelConsumption);
   }
}
class Bus extends Vehicle
{  int numberOfPassengers;
  Bus(String model,String registrationNumber,double speed,double fuelCapacity,double fuelConsumption,int numberOfPassengers)
  {
    super(model,registrationNumber,speed,fuelCapacity,fuelConsumption);
	this.numberOfPassengers=numberOfPassengers;
  }
  public void setnumberOfPassengers(int numberOfPassengers)
  {
	  this.numberOfPassengers=numberOfPassengers;
  }
  
  public int getnumberOfPassengers()
  {
	 return numberOfPassengers;
  }
  void display()
  {
	super.display();
  System.out.println("number of passenger ="+numberOfPassengers);
  }
}
class Truck extends Vehicle
{
   double cargoWeightLimit;
   Truck(String model,String registrationNumber,double speed,double fuelCapacity,double fuelConsumption,double cargoWeightLimit)
   {
      super(model,registrationNumber,speed,fuelCapacity,fuelConsumption);
      this.cargoWeightLimit=cargoWeightLimit;
   }
   
   void display() {
        super.display();
        System.out.println("Cargo Weight Limit: " + cargoWeightLimit + " kg");
    }
   
}
public class Q2Transport
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);

    Bus B=new Bus("123","abc123",66.50,5,3,10);
	
	Truck t=new Truck("345","xyz987",89.40,10,6,34);
	
	System.out.println("===== TRUCK DETAILS =====");
        System.out.println("Fuel needed for 500 km: " + t.fuelNeeded(500));
        System.out.println("Distance covered in 5 hours: " + t.distanceCovered(5));
        t.display();

        System.out.println("\n===== BUS DETAILS =====");
        System.out.println("Fuel needed for 500 km: " + B.fuelNeeded(500));
        System.out.println("Distance covered in 5 hours: " + B.distanceCovered(5));
        B.display();
	
  }
}