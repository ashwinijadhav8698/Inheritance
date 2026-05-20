/*
7. Question:
 Create a class Ticket with method calculatePrice().
MovieTicket has 18% GST.
BusTicket has 5% GST.
 Print ticket price including tax using overridden methods.
Explanation:
 Tests method overriding with percentage-based calculations.
*/
import java.util.*;
class Ticket
{  double price;
   Ticket(double price)
   {
     this.price=price;
   }
   
   double getcalculatePrice()
   {
     return price;
	 
   }
   
}
class MovieTicket extends Ticket
{
    MovieTicket(double price)
	{
	   super(price);
	}
	double getcalculatePrice()
	{return (price*0.18)/100;
	}
}
class BusTicket extends Ticket
{
    BusTicket(double price)
	{
	   super(price);
	}
	double getcalculatePrice()
	{return (price*0.5)/100;
	}
}
public class Q7Inheri
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner (System.in);
	System.out.println("Enter the price of movie ticket");
	int mt=sc.nextInt();
	
	MovieTicket m =new MovieTicket(mt);
	
	System.out.println("Enter the price of bus ticket");
	int bt=sc.nextInt();
	
	BusTicket b=new BusTicket(bt);
	
	System.out.println(m.getcalculatePrice());
	System.out.println(b.getcalculatePrice());
  }
}