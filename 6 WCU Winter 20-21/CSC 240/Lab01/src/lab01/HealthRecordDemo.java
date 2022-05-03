/*
Tyler Prehl
12/15/20
CSC 240-01
Lab 01
Create classes HealthRecord and HealthRecordDemo to take in and
display various information about any given person's health
records and personal information
*/
package lab01;
import java.util.Scanner;

class HealthRecord
{
   private long ssn; 
   private String firstName;
   private String lastName;
   private int age;
   private long phoneNumber;
   private String email;
   private double weight;
   private double height;
   
   Scanner kbd = new Scanner(System.in);
   
   private void setSSN()
   {
      try
      {
         System.out.print("Enter SSN[ex - 111002222]: ");
         ssn = kbd.nextLong();
         int length = String.valueOf(ssn).length();
         while (length!=9)
         {
            System.out.print("Entered SSN not valid, try again: ");
            ssn = kbd.nextLong();
            length = String.valueOf(ssn).length();
         }
      }
      catch (Exception e)
      {
         System.out.println("You did not enter a long.");
         kbd.nextLine();
         setSSN();
      }
   }
   private void setFirstName()
   {
      System.out.print("Enter first name: ");
      firstName = kbd.next();
   }
   private void setLastName()
   {
      System.out.print("Enter last name: ");
      lastName = kbd.next();
   }
   private void setAge()
   {
      try
      {
         System.out.print("Enter age: ");
         age = kbd.nextInt();
         while (age<1 || age>125)
         {
            System.out.print("Entered age not valid, try again: ");
            age = kbd.nextInt();
         }
      }
      catch (Exception e)
      {
         System.out.println("You did not enter an int.");
         kbd.nextLine();
         setAge();
      }
   }
   private void setPhoneNumber()
   {
      try
      {
         System.out.print("Enter phone #[ex - 6101112222]: ");
         phoneNumber = kbd.nextLong();
         int length = String.valueOf(phoneNumber).length();
         while (length!=10)
         {
            System.out.print("Entered phone # not valid, try again: ");
            phoneNumber = kbd.nextLong();
            length = String.valueOf(phoneNumber).length();
         }
      }
      catch (Exception e)
      {
         System.out.println("You did not enter a long.");
         kbd.nextLine();
         setPhoneNumber();
      }
   }
   private void setEmail()
   {
      System.out.print("Enter email: ");
      email = kbd.next();
   }
   private void setWeight()
   {
      try
      {
         System.out.print("Enter weight: ");
         weight = kbd.nextInt();
         while (weight<1 || weight>1400)
         {
            System.out.print("Entered weight not valid, try again: ");
            weight = kbd.nextInt();
         }
      }
      catch (Exception e)
      {
         System.out.println("You did not enter an int.");
         kbd.nextLine();
         setWeight();
      }
   }
   private void setHeight()
   {
      try
      {
         System.out.print("Enter height: ");
         height = kbd.nextInt();
         while (height<1 || height>108)
         {
            System.out.print("Entered height not valid, try again: ");
            height = kbd.nextInt();
         }
      }
      catch (Exception e)
      {
         System.out.println("You did not enter an int.");
         kbd.nextLine();
         setHeight();
      }
   }
   private long getSSN()
   {
      return ssn;
   }
   private String getFirstName()
   {
      return firstName;
   }
   private String getLastName()
   {
      return lastName;
   }
   private int getAge()
   {
      return age;
   }
   private long getPhoneNumber()
   {
      return phoneNumber;
   }
   private String getEmail()
   {
      return email;
   }
   private double getWeight()
   {
      return weight;
   }
   private double getHeight()
   {
      return height;
   }
   public void readInputs()
   {
      setSSN();
      setFirstName();
      setLastName();
      setAge();
      setPhoneNumber();
      setEmail();
      setWeight();
      setHeight();
   }
   private double calculateBMI()
   {
      double bmi = getWeight()/(getHeight()*getHeight())*703;
      return bmi;
   }
   public void display()
   {
      System.out.print("Patient Information:\n"+
                       "\tSSN: "+getSSN()+"\n"+
                       "\tFirst name: "+getFirstName()+"\n"+
                       "\tLast name: "+getLastName()+"\n"+
                       "\tAge: "+getAge()+"\n"+
                       "\tPhone #: "+getPhoneNumber()+"\n"+
                       "\tEmail: "+getEmail()+"\n"+
                       "\tWeight: "+getWeight()+"\n"+
                       "\tHeight: "+getHeight()+"\n"+
                       "\tBMI: "+calculateBMI()+"\n");
   }
}

public class HealthRecordDemo 
{
   public static void main(String[] args) 
   {
      System.out.println("Hi! This program will let you enter and "+
      "view patient information.");
      HealthRecord patient = new HealthRecord();
      patient.readInputs();
      patient.display();
      System.out.println("Thank you for using this program. "
      + "Have a nice day!");
   }
}

