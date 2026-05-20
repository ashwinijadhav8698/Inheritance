/*
Q3. Create a class SquareSum extending Value and overriding getResult() to return (x + y) * (x + y) (square of sum).
Create a Display class that accepts only a SquareSum object.

Input : Enter values: 3 2
Output : Square of sum is 25
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
class SquareSum extends Value
{
  public int getResult()
  {
    return ((x+y)*(x+y));
  }
}
class Display
{
   public void checkSqrSum(SquareSum d)
   {
     int result=d.getResult();
	 System.out.println("SquareSum="+result);
   }
}
public class Q3Tc
{
  public static void main(String args[])
  {
    SquareSum s=new SquareSum();
	Display  d=new Display();
	
	s.setValue(2,3);
	d.checkSqrSum(s);
  }
}
