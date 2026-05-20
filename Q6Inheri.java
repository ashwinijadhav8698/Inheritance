/*6. Question:
 Create a base class Order with fields orderId and amount.
Subclass CODOrder adds a fixed delivery charge of ₹50.
Subclass OnlinePaymentOrder adds no delivery charge but gives 5% cashback.
 Write a program to calculate the final bill amount using overridden methods.
Explanation:
 Tests overriding with additional logic and conditional calculations in subclasses.
*/
/*
import java.util.*;

class Order
{
  int ordid,amt;
  Order(int ordid,int amt)
  {
    this.ordid=ordid;
	this.amt=amt;
  }
  int getamt()
  {
    return 0;
  }

  
}
class CODOrder extends Order
{
  CODOrder(int ordid,int amt)
  {
    super(ordid,amt);
  }
  int getamt()
  {
     return amt+50;
  }
}
class OnlinePaymentOrder extends Order
{
   OnlinePaymentOrder(int ordid,int amt)
  {
    super(ordid,amt);
  }
  int getamt()
  {
     return amt+((amt*5)/100);
  }
}
public class Q6Inheri
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the oredrid and amount of CODOrder:");
	int ordid1=sc.nextInt();
	int amt1=sc.nextInt();
	
	System.out.println("Enter the oredrid and amount of OnlinePaymentOrder:");
	int ordid2=sc.nextInt();
	int amt2=sc.nextInt();
	
	CODOrder co=new CODOrder(ordid1,amt1);
	OnlinePaymentOrder op=new OnlinePaymentOrder(ordid2,amt2);
	
	System.out.println(co.getamt());
	System.out.println(op.getamt());
  }
}*/
import java.util.*;

class Order
{
  int ordid,amt;
  Order(int ordid,int amt)
  {
    this.ordid=ordid;
	this.amt=amt;
  }
  int getamt()
  {
    return amt;
  }
  public void displayAmt()
  {
	System.out.println("amt after dilivery"+getamt());
  }

  
}
class CODOrder extends Order
{
  CODOrder(int ordid,int amt)
  {
    super(ordid,amt);
  }
  int getamt()
  {
     return amt+50;
  }
}
class OnlinePaymentOrder extends Order
{
   OnlinePaymentOrder(int ordid,int amt)
  {
    super(ordid,amt);
  }
  int getamt()
  {
     return amt+((amt*5)/100);
  }
}
public class Q6Inheri
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the oredrid and amount of CODOrder:");
	int ordid1=sc.nextInt();
	int amt1=sc.nextInt();
	
	System.out.println("Enter the oredrid and amount of OnlinePaymentOrder:");
	int ordid2=sc.nextInt();
	int amt2=sc.nextInt();
	
	CODOrder co=new CODOrder(ordid1,amt1);
	OnlinePaymentOrder op=new OnlinePaymentOrder(ordid2,amt2);
	
	co.displayAmt();
	op.displayAmt();
  }
}