/*
2. Question:
 Create a class BankAccount with a method calculateInterest(). Create subclasses SavingsAccount (interest rate 5%) and CurrentAccount (interest rate 3%).
 Calculate interest for different account types and display it.
Explanation:
 This tests inheritance with customized implementations in child classes*/
 
 import java.util.*;
 class BankAccount
 {
   String accHolName;
   double balance;
   
   BankAccount(String accHolName,double balance)
   {
      this.accHolName=accHolName;
	  this.balance=balance;
   }
   double calculateInterest()
   {
      return balance;
   }
   public void display()
   {
      System.out.println("Accountholder name :  "+accHolName
	                      +"balance :  "+balance +
						  "interest  "+calculateInterest());
    }
   }
 class SavingsAccount extends BankAccount
 {
   SavingsAccount(String accHolName,double balance)
   {
      super(accHolName,balance);
   }
   double calculateInterest()
   {
      return balance+(balance*0.05);
   }
   
 }
 
 
 class CurrentAccount extends BankAccount
 {
    CurrentAccount(String accHolName,double balance)
   {
      super(accHolName,balance);
   }
   double calculateInterest()
   {
      return balance+(balance*0.03);
   }
 }
 public class Q2Inheri
 {
    public static void main(String args[])
	{ 
	  Scanner sc=new Scanner (System.in);
	  System.out.println("Enter the number of accaount holder");
	  int n=sc.nextInt();
	  
	  SavingsAccount sa[]=new SavingsAccount[n];//create arr of obj
	  for(int i=0;i<sa.length;i++)
	  {
	  
	  System.out.println("Enter the name of savacc holder");
	  String accHolName1=sc.next();
	  System.out.println("Enter the balance :");
	  double balance1=sc.nextDouble();

	  
	  sa[i]=new SavingsAccount(accHolName1,balance1);
	  
	  }
	  
	  CurrentAccount ca[]=new CurrentAccount[n];
	  for(int i=0;i<ca.length;i++)
	  {
	  
	  System.out.println("Enter the name of curracct holder");
	  String accHolName2=sc.next();
	  System.out.println("Enter the balance :");
	  double balance2=sc.nextDouble();

	  
	   ca[i]=new CurrentAccount(accHolName2,balance2);
	  
	  }
	  
	  for(int i=0;i<ca.length;i++)
	  {
		 sa[i].display();
	     ca[i].display();
	  }
	  
	  
	}
 }