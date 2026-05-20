/*
Q1. Create a class Compare that extends a base class Value and overrides getResult() to return the greater of the two numbers.
Create another class Check that accepts only a Compare object and displays the result.
Demonstrate tight coupling by passing only Compare object to Check.

Input : Enter numbers: 12 7
Output : Greater number is 12
*/

class Value
{
   int x,y;
   public void setResult(int x,int y)
   {
     this.x=x;
	 this.y=y;
   }
   public int getResult()
   {
     return 0;
   }
}
class Compare extends Value
{
  public  int getResult()
   {
     if(x>y)
	    return x;
	 else
	    return y;
   }
}
class Addition extends Value
{
  public  int getResult()
   {
    return x+y;
   }
}  
class Check
{
  void checkResult(Compare c)
  {
     int result=c.getResult();
	 System.out.println("greater number is "+result);
  }
    void checkResult(Addition a)
  {
     int result=a.getResult();
	 System.out.println("addition number is "+result);
  }
}
public class Q1TitCoup
{
   public static void main (String args[])
   {
      Check ch=new Check();
	  Compare c=new Compare();
	  Addition a=new Addition();
	  a.setResult(1,2);
	  c.setResult(20,3);
	  ch.checkResult(c);
	  ch.checkResult(a);
	  
   }
}