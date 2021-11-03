import java.lang.Math;

public class MonthlyPayments {

   private double carCost;
   private int monthlyPaymentDesired;
   private double interestRate;
   
   public MonthlyPayments (double carCost, int monthlyPaymentsDesired, double interestRate) {
      this.carCost = carCost;
      this.monthlyPaymentsDesired = monthlyPaymentsDesired;
      this.interestRate = interestRate;  
   }
   
   public MonthlyPayments () {
      carCost = 30000;
      monthlyPaymentsDesired = 400;
      interestRate = 0.035;
   }
   
   public MonthlyPayments (MonthlyPayments monthlyPay) {
      carCost = monthlyPay.carCost;
      monthlyPaymentsDesired = monthlyPay.monthlyPaymentsDesired;
      interestRate = monthlyPay.interestRate;
   }

   public double getCarCost() {
      return carCost;
   }
   
   public int getMonthlyPayments() {
      return monthlyPaymentsDesired;
   }
   
   public double getIinterestRate() {
      return interestRate;
   }
   
   public double getNumberOfPayments() {
      public int numberOfPaymentsInt = 12;
      public double n = (double)numberOfPaymentsInt;
      public double formula = (interestRate * carCost) / (1 - Math.pow((1 + rate), n));
      return formula;
   }
   
   public String toString() {
      String str = String.format("Monthly payments: %,.2f", ()getNumberOfPayments);
      return str;
}     