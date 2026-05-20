/*
3. Question:
 Create a base class Product with fields id, name, and price. Create subclasses Electronics (10% discount) and Clothing (20% discount).
 Write a program to calculate and print final prices after applying discounts.
Explanation:
 This tests constructor chaining and method overriding for price calculation.
*/
import java.util.*;

class Product
{
  int  id;
  double price;
  String name;
  Product(int id,double price,String name)
  {
    this.id=id;
	this.price=price;
	this.name=name;
	
  }  
  double getDiscount()
  {
     return price;
  }
  public void displayDis()
  {
    System.out.println("id of product: "+id+" price : "+price+" name: "+ name);
  }
  
}
class Electronics extends Product
{
  Electronics(int id,double price,String name)
  {
    super (id, price,name);
  }
  double getDiscount()
  {
    return price-(price*0.10);
  }
}
class Clothing extends Product
{
  Clothing(int id,double price,String name)
  {
    super(id, price,name);
  }
  double getDiscount()
  {
    return price-(price*0.20);
  }
}
public class Q3Inheri
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner (System.in);
	System.out.println("Enter the id , price and name of electronic product");
	int id1=sc.nextInt();
	double price1=sc.nextDouble();
	String name1=sc.next();
	
	Electronics e=new Electronics(id1,price1,name1);
	
	System.out.println("Enter the id , price and name of clothing product");
	int id2=sc.nextInt();
	double price2=sc.nextDouble();
	String name2=sc.next();
	
	Clothing c=new Clothing(id2,price2,name2);
	
	e.displayDis();
	c.displayDis();
	
  }
}