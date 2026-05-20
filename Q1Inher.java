/*1. Question:
 Create a base class Employee with fields name and salary. Create subclasses Manager and Developer.
The manager gets a 20% bonus on salary.


The developer gets a 10% bonus.
 Write a program to calculate and display the total salary (base + bonus) for each employee.
Explanation:
 This tests how to use inheritance to share fields/methods and override logic for bonus calculations.
 */
 
 import java.util.*;
 class Employee
 {
   String name;
   double sal;
   
   Employee(String name,double sal)
   {
     this.name=name;
	 this.sal=sal;
   }
   double calSal()
   {
    return sal;
   }
   public void displaySal()
   {
     System.out.println(name + ":earns "+calSal());
   }
   
 }
 class Manager extends Employee
 {
    Manager (String name,double sal)
    {
      super(name,sal);
    }
    double calSal()
   {
      return sal +(0.20*sal);
   }
 }
 class Devloper extends Employee
 {
   Devloper(String name,double sal)
   {
      super(name,sal);
   }
    double calSal()
   {
      return sal +(0.10*sal);
   }
 }
 
 public class Q1Inher
 {
    public static void main(String args[])
	{
	   Scanner sc=new Scanner (System.in);
	   System.out.println("Enter the name of manager");
	   String name1=sc.next();
	   System.out.println("Enter the salary of manager");
	   double sal1=sc.nextDouble();
	   System.out.println("Enter the name of developer");
	   String name2=sc.next();
	   System.out.println("Enter the salary of developer");
	   double sal2=sc.nextDouble();
	   
	   Manager m=new Manager(name1, sal1);
	   Devloper d=new Devloper(name2, sal2);
	   m.displaySal();
	   d.displaySal();
	}
 }
 