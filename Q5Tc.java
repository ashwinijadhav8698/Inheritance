/*
Q5. Create a class Remainder extending Value and overriding getResult() to return the remainder when x is divided by y.
Create a Compute class that accepts only a Remainder object and displays the result.

Input : Enter numbers: 17 5
Output : Remainder is 2
*/

class Value
{  int x,y;
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
class Remainder extends Value
{
  public int getResult()
   {
     return (x%y);
   }
}
class Compute 
{
  public void checkreminder( Remainder r)
  {
    int result=r.getResult();
	System.out.println("average ="+result);
  }
}
public class Q5Tc
{
  public static void main(String args[])
  {
    Remainder r=new Remainder();
	Compute c=new Compute ();
	
	r.setValue(17,5);
	c.checkreminder(r);
  }
}
