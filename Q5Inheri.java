/*
5. Question:
 Create a base class Staff with a method incrementSalary().
For TeachingStaff, salary increases by 15%.
For NonTeachingStaff, salary increases by 10%.
 Print new salaries using method overriding.
Explanation:
 This tests inheritance with percentage-based calculations in subclasses.
*/

import java.util.*;

class Staff
{ String name ;
  double sal;
  
  Staff(String name,double sal)
  {
	this.name=name;
    this.sal=sal;
	
  }
  double incrementSalary()
  {
     return sal;
  }
  public void DisSal()
  {
    System.out.println("name "+ name + "  salary :"+ sal);
  }
}
class TeachingStaff extends Staff
{
  TeachingStaff(String name,double sal)
  {
    super(name,sal);
  }
  double incrementSalary()
  {
    return sal+(sal*0.15);
  }  
}
class NonTeachingStaff extends Staff
{
   NonTeachingStaff(String name,double sal)
  {
    super(name,sal);
  }
  double incrementSalary()
  {
    return sal+(sal*0.10);
  }  
}
public class Q5Inheri
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner (System.in);
	System.out.println("Enter the name ans sal of teaching staff");
	String name1=sc.next();
	Double sal1 =sc.nextDouble();
	
	System.out.println("Enter the name ans sal of non-teaching staff");
	String name2=sc.next();
	Double sal2 =sc.nextDouble();
	
	TeachingStaff ts=new TeachingStaff(name1,sal1);
	NonTeachingStaff nts=new NonTeachingStaff(name2,sal2);
	
	ts.DisSal();
	nts.DisSal();
  }
}