/*Q4. Create a class Average that extends Value and overrides getResult() to return the integer average of x and y.
Create a class Evaluate that accepts only an Average object and prints the result.

Input : Enter numbers: 20 30
Output : Average is 25
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
class Average extends Value
{
  public int getResult()
   {
     return (x+y)/2;
   }
}
class Evaluate 
{
  public void checkAvg( Average a)
  {
    int result=a.getResult();
	System.out.println("average ="+result);
  }
}
public class Q4Tc
{
  public static void main(String args[])
  {
    Average a=new Average();
	Evaluate e=new Evaluate ();
	
	a.setValue(10,20);
	e.checkAvg(a);
  }
}
