/*
10. Question:
 Create base class Employee with method calculateBonus().
 PermanentEmployee bonus = 25% of salary.
 ContractEmployee bonus = 10% of salary.
 Print bonus using a common reference to demonstrate runtime polymorphism.
*/

class Employee
{
    double salary;

    Employee(double salary)
    {
        this.salary = salary;
    }

    // Method to be overridden
    double calculateBonus()
    {
        return 0;
    }
}

class PermanentEmployee extends Employee
{
    PermanentEmployee(double salary)
    {
        super(salary);
    }

    @Override
    double calculateBonus()
    {
        return salary * 0.25; // 25% bonus
    }
}

class ContractEmployee extends Employee
{
    ContractEmployee(double salary)
    {
        super(salary);
    }

  
    double calculateBonus()
    {
        return salary * 0.10; // 10% bonus
    }
}

public class Q10Inheri
{
    public static void main(String[] args)
    {
        // Parent reference, Child object → Runtime Polymorphism
        Employee e;

        e = new PermanentEmployee(40000);
        System.out.println("Permanent Employee Bonus: " + e.calculateBonus());

        e = new ContractEmployee(30000);
        System.out.println("Contract Employee Bonus: " + e.calculateBonus());
    }
}
