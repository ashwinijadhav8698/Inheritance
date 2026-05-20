/*
4. Question:
 Create a class Student with fields name and marks. Create subclass EngineeringStudent and MedicalStudent.
If marks >= 50, student passes. Otherwise fails.
 Display results for both types of students using an overridden method.
Explanation:
 This tests inheritance for common fields and customized result display logic.
*/

import java.util.*;
class Student 
{
  String name ;
  int marks;
  Student(String name,int marks)
  {
   this.name=name;
   this.marks=marks;
   
  }
  int  getMarks()
  {
    return marks;
  }
  public void disResult()
  {
    if(marks>=50)
	{
	  System.out.println(name + " pass in exam with marks :" +marks);
	}
	else
	{
	System.out.println(name + " fail in exam with marks :" +marks);
	}
  }
}
class EngineeringStudent extends Student
{
  EngineeringStudent (String name,int marks)
  {
    super(name,marks);
  }
  int getMarks()
  {
    return marks;
  }
}
class MedicalStudent extends Student
{
  MedicalStudent (String name,int marks)
  {
    super(name,marks);
  }
  int getMarks()
  {
    return marks;
  }
}
public class Q4Inheri
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name and marks of engg student");
	String ename=sc.next();
	int emarks=sc.nextInt();
	
	System.out.println("Enter the name and marks of medical student");
	String mname=sc.next();
	int mmarks=sc.nextInt();
	
	EngineeringStudent e=new EngineeringStudent(ename,emarks);
	MedicalStudent m=new MedicalStudent(mname,mmarks);
	
	e.disResult();
	m.disResult();
	
  }
}