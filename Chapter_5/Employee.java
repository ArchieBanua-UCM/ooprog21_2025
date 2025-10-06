public class Employee {
    private int employeeNum;
    private double payRate;

    public Employee(int employeeNum, double payRate) {
        this.employeeNum = employeeNum;
        this.payRate = payRate;
    }
    public double calculateRegularPay(int hoursWorked) {
   
        if (hoursWorked <= 40) {
            return hoursWorked * payRate;
        } else {
            return 40 * payRate;
        }
    }
    public double calculateOvertimePay(int hoursWorked) {

        if (hoursWorked > 40) {
            int overtimeHours = hoursWorked - 40;
            return overtimeHours * payRate * 1.5;
        } else {
            return 0.0;
        }
    }
}
