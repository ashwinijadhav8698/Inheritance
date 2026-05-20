/*
9. Question:
 Create base class Product with fields id, name, and basePrice.
LuxuryProduct adds 20% tax.
EssentialProduct adds 5% tax.
 Write a program to print final price using polymorphism.
Explanation:
 Tests inheritance where logic changes depending on product type.
*/

import java.util.*;

class Product 
{
  int id;
  double basePrice;
  String name;
   Product(int id,double basePrice,String name)
   {
      this.id=id;
	  this.basePrice=basePrice;
	  this.name=name;
   }
   public double getBasePrice()
   {
      return 0;
   }
}
class LuxuryProduct extends Product
{
   LuxuryProduct( int id,double basePrice,String name)
    {
	   super( id, basePrice, name);
    }
    public double getBasePrice()
    {
	  return basePrice +(0.20*basePrice);
    }	
}
class EssentialProduct extends Product
{
   EssentialProduct( int id,double basePrice,String name)
    {
	   super( id, basePrice, name);
    }
	public double getBasePrice()
    {
	   return basePrice +(0.05*basePrice);
    }
}
class Q9Inheri
{
  public static void main (String args[])
  {
     Scanner sc=new Scanner (System.in);
	 System.out.println("Enter the id ,price and name of an product");
	 int id=sc.nextInt();
	 double price=sc.nextDouble();
	 String name=sc.next();
	 
	 LuxuryProduct lp=new LuxuryProduct(id, price, name);
	 EssentialProduct ep=new EssentialProduct(id, price, name);
	 
	 System.out.println("LuxuryProduct price  "+lp.getBasePrice());
	 System.out.println("EssentialProduct price  "+ep.getBasePrice());
	 
  }
}