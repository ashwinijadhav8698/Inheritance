/*
2. Question:
 Create a class BankAccount with a method calculateInterest(). Create subclasses SavingsAccount (interest rate 5%) and CurrentAccount (interest rate 3%).
 Calculate interest for different account types and display it.
Explanation:
 This tests inheritance with customized implementations in child classes.
*/

class BankAccount
{ 
   double balance;
   public void setBalance (double balance)
   {
      this.balance=balance;
   }
  public double calculateInterest( )
  {
    return 0;
  }
}
class SavingsAccount extends BankAccount
{
  
  public double calculateInterest()
  {
    return balance*0.05;
  }
}
class CurrentAccount extends BankAccount
{
  public double calculateInterest()
  {
    return balance*0.03;
  }
}
class checkBalance
{
   void checkInterest(SavingsAccount sa)
   {
     double result=sa.calculateInterest();
     System.out.println("total balace of Saving account "+result);	 
   }
   void checkInterest(CurrentAccount ca)
   {
     double result=ca.calculateInterest();
     System.out.println("total balace of Saving account "+result);	 
   }
}
public class Q2TighCoupling
{
  public static void main (String args[])
  {
    checkBalance ba=new checkBalance();
	
	SavingsAccount sa=new SavingsAccount();
	CurrentAccount ca=new CurrentAccount();
	
	sa.setBalance(5000.0);
	ca.setBalance(6000.0);
	
	ba.checkInterest(sa);
	ba.checkInterest(ca);
  }
}