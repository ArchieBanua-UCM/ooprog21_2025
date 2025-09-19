public class DemoGrossPay {
   
   public static double calculateGross(double hoursWorked){
         double hourlyRate = 22.75;
         return hoursWorked * hourlyRate;
   }
   
   public static void main(String [] args){
      double[] hours = {10.0, 25.0, 37.5};
      
      for (double h : hours) {
            double grossPay = calculateGross(h);
            System.out.println(h + "Hours at $22.75 per hour is $" + grossPay);
      }
   }
}