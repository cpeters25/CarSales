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
      double n = 1;
      double r = interestRate / 100;
      double m = 12;
      double formula = ((r/n) * carCost) / (1 - Math.pow((1 + (r/m)), (-1*n*m)));
      
      while (formula > monthlyPaymentsDesired) {
         n += 0.5;
         formula = ((r/n) * carCost) / (1 - Math.pow((1 + (r/m)), (-1*n*m)));
      }
      return n * m;
   }
   
   public double preciseRate() {
      double payments = getNumberOfPayments();
      double m = 12;
      double n = payments / 12;
      double r = interestRate / 100;
      double formula = ((r/n) * carCost) / (1 - Math.pow((1 + (r/m)), (-1*n*m)));
      
      while (formula < monthlyPaymentsDesired) {
         r += 0.000001;
         formula = ((r/n) * carCost) / (1 - Math.pow((1 + (r/m)), (-1*n*m))); 
      }
      return r * 100;
   }
           
   public String toString() {
      String str = String.format("Monthly Payments %,.2f\nInterest: %.5f", getNumberOfPayments(), preciseRate());
      
      return str;
   }
}     