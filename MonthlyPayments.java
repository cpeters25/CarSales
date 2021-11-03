import java.lang.Math;

public class MonthlyPayments {

   private double carCost;
   private int monthlyPaymentsDesired;
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
      int numberOfPaymentsInt = 12;
      double n = (double)numberOfPaymentsInt;
      double r = interestRate / 100;
      double formula = (r * carCost) / (1 - Math.pow((1 + r), (-1*n)));
      return formula;
   }
   
   public String toString() {
      String str = String.format("Monthly Payments %,.2f", getNumberOfPayments());
      return str;
   }
}     