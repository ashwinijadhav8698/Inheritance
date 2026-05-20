/*
8. Question:
 Create a base class Loan with fields amount and years.
HomeLoan has interest rate of 7%.
CarLoan has interest rate of 9%.
 Write a program to calculate and print EMI for both loans.
Explanation:
 Tests inheritance with customized formula calculations.
*/
/*
8. Question:
 Create a base class Loan with fields amount and years.
 HomeLoan has interest rate of 7%.
 CarLoan has interest rate of 9%.
 Write a program to calculate and print EMI for both loans.
*/

import java.util.*;

class Loan
{
    int amount;
    int years;

    Loan(int amount, int years)
    {
        this.amount = amount;
        this.years = years;
    }

    // Method overridden by child classes
    double getEMI()
    {
        return 0;  
    }
}

class HomeLoan extends Loan
{
    HomeLoan(int amount, int years)
    {
        super(amount, years);
    }

    public double getEMI()
    {
        double rate = 7; // 7% interest
        double r = rate / (12 * 100);   // monthly interest
        int n = years * 12;            // total months

        double emi = (amount * r * Math.pow(1+r, n)) / (Math.pow(1+r, n) - 1);
        return emi;
    }
}

class CarLoan extends Loan
{
    CarLoan(int amount, int years)
    {
        super(amount, years);
    }

    public double getEMI()
    {
        double rate = 9; // 9% interest
        double r = rate / (12 * 100);
        int n = years * 12;

        double emi = (amount * r * Math.pow(1+r, n)) / (Math.pow(1+r, n) - 1);
        return emi;
    }
}

public class Q8Inheri
{
    public static void main(String args[])
    {
        HomeLoan h = new HomeLoan(500000, 10);  // 5 lakh, 10 years
        CarLoan c = new CarLoan(800000, 5);     // 8 lakh, 5 years

        System.out.println("Home Loan EMI: " + h.getEMI());
        System.out.println("Car Loan EMI: " + c.getEMI());
    }
}
