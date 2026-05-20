/*
Q2. Create a class Difference that extends Value and overrides getResult() to return the absolute difference between x and y.
Create a Processor class that accepts only Difference object and prints the result.

Input : Enter numbers: 25 10
Output : Difference is 15

*/
class Value
{
  int x,y;
  public void setValue(int x,int y)
  {
    this.x=x;
	this.y=y;
  }
  public int getResult()
  {
     return 0;
  }
}
class Difference extends Value
{
   public int getResult()
   {
      return x-y;
   }
}
class Processor
{
  public void GetResult(Difference d)
  { 
    int result =d.getResult();
	System.out.println(result);
  }
  
}
public class Q2TC
{
   public static void main(String args[])
   {
      Difference d=new Difference();
	  Processor p=new Processor();
	  
	  d.setValue(30,20);
	  p.GetResult(d);
	  
	  
   }
}