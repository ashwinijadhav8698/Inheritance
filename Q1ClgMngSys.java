/*Q1. Problem Statement :
Write a Java program to design a College Management System using the concept of inheritance.
The system should maintain and process details of both Students and Faculty members.
Use one parent class and two child classes, and perform ten sequential operations related to student and faculty management.
Class Structure:
Parent Class – Person
Data Members:
 int id, String name, String address, String contactNo
Member Methods:
addDetails() – Accept and store basic person details.
displayDetails() – Display details of a person.
updateAddress() – Update the address of a person.
deleteContact() – Update contact number.
showBasicInfo() – Display ID, name, and contact number.

Child Class 1 – Student extends Person
Additional Data Members:
String courseName, int marks[3], double percentage
Additional Methods:
    6. enterMarks() – Accept marks of three subjects.
    7. calculatePercentage() – Calculate and store percentage based on marks.
Child Class 2 – Faculty extends Person
Additional Data Members:
String subject, double salary, int experience
Additional Methods:
   8. assignSubject() – Assign subject to faculty.
   9. calculateIncrement() – Increase salary by 10% if experience is greater than 5 years.
  10. displayFacultyInfo() – Display faculty’s subject, salary, and experience.


Operations to Perform (Sequentially):
Add student details using addDetails() method.
Enter marks for three subjects using enterMarks().
Calculate and store the student’s percentage using calculatePercentage().
Update the student’s contact number using updateContact().
Display all details of the student using displayDetails().
Add faculty details using the addDetails() method.
Assign subject to faculty using assignSubject().
Calculate salary increment for the faculty using calculateIncrement().
Delete the faculty’s address using deleteAddress().
Display complete faculty information using displayFacultyInfo().
Instructions:
Use constructors in all classes for initialization.
Use the super keyword to call parent constructors in child classes.
Apply method overriding for displayDetails() to show specific outputs for each child class.
Perform all 10 operations sequentially in the main() method.
Do not use collections; use arrays or primitive variables only.
*/

/* College Management System using Inheritance */

import java.util.*;

class Person
{
    int id;
    String name;
    String address;
    String contactNo;

    Person(int id, String name, String address, String contactNo)
    {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contactNo = contactNo;
    }

    void addDetails(int id, String name, String address, String contactNo)
    {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contactNo = contactNo;
    }

    void displayDetails()
    {
        System.out.println("ID: " + id);
        System.out.println("NAME: " + name);
        System.out.println("ADDRESS: " + address);
        System.out.println("CONTACT NO: " + contactNo);
    }

    void updateAddress(String newAddress)
    {
        this.address = newAddress;
    }

    void updateContact(String newContact)
    {
        this.contactNo = newContact;
    }

    void deleteContact()
    {
        this.contactNo = "N/A";
    }

    void showBasicInfo()
    {
        System.out.println("ID: " + id + ", Name: " + name + ", Contact: " + contactNo);
    }
}


class Student extends Person
{
    String courseName;
    int marks[] = new int[3];
    double percentage;

    Student(int id, String name, String address, String contactNo, String courseName)
    {
        super(id, name, address, contactNo);
        this.courseName = courseName;
    }

    void enterMarks(int m1, int m2, int m3)
    {
        marks[0] = m1;
        marks[1] = m2;
        marks[2] = m3;
    }

    void calculatePercentage()
    {
        int total = marks[0] + marks[1] + marks[2];
        percentage = total / 3.0;
    }

  
    void displayDetails()
    {
        super.displayDetails();
        System.out.println("COURSE: " + courseName);
        System.out.println("PERCENTAGE: " + percentage);
    }
}



class Faculty extends Person
{
    String subject;
    double salary;
    int experience;

    Faculty(int id, String name, String address, String contactNo, double salary, int experience)
    {
        super(id, name, address, contactNo);
        this.salary = salary;
        this.experience = experience;
    }

    void assignSubject(String subject)
    {
        this.subject = subject;
    }

    void calculateIncrement()
    {
        if (experience > 5)
        {
            salary = salary + (salary * 0.10);
        }
    }

    void displayFacultyInfo()
    {
        super.displayDetails();
        System.out.println("SUBJECT: " + subject);
        System.out.println("SALARY: " + salary);
        System.out.println("EXPERIENCE: " + experience);
    }
}



public class Q1ClgMngSys
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student id, name, address, contactNo, courseName:");
        int id = sc.nextInt();
        String name = sc.next();
        String address = sc.next();
        String contactNo = sc.next();
        String courseName = sc.next();

        Student s = new Student(id, name, address, contactNo, courseName);

        
        System.out.println("Enter 3 subject marks:");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        s.enterMarks(m1, m2, m3);

        
        s.calculatePercentage();

        
        System.out.println("Enter new contact number:");
        String newContact = sc.next();
        s.updateContact(newContact);

        
        System.out.println("\n-------- STUDENT DETAILS --------");
        s.displayDetails();

      
        System.out.println("\nEnter faculty id, name, address, contactNo, salary, experience:");
        int fid = sc.nextInt();
        String fname = sc.next();
        String faddress = sc.next();
        String fcontact = sc.next();
        double salary = sc.nextDouble();
        int exp = sc.nextInt();

        Faculty f = new Faculty(fid, fname, faddress, fcontact, salary, exp);

        
        System.out.println("Enter subject assigned to faculty:");
        String subject = sc.next();
        f.assignSubject(subject);

        
        f.calculateIncrement();

 
        f.updateAddress("N/A");

        
        System.out.println("\n-------- FACULTY DETAILS --------");
        f.displayFacultyInfo();
    }
}
