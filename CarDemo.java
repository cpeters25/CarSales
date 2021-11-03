import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class CarDemo {

   public static void main(String[] args) throws IOException {
   
      Scanner keyboard = new Scanner(System.in);
      
      double costOfCar;
      int monthlyPaymentDesired;
      double interestRate;
  
      System.out.println("Enter cost of car: ");
      costOfCar = keyboard.nextDouble();
      
      System.out.print("Enter the monthly payment amount desired: ");
      monthlyPaymentDesired = keyboard.nextInt();   

      System.out.println("Enter interest rate: ");
      interestRate = keyboard.nextDouble();   

      MonthlyPayments monthlyPayments = new MonthlyPayments(costOfCar, monthlyPaymentDesired, interestRate);
      
      System.out.println(monthlyPayments);
   }
   
}