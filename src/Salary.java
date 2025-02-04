import java.util.Scanner;
public abstract class Salary {
    private double salary;//a private
    final double tax= 0.15;

    public Salary(double salary){
        this.salary=salary;
    }

    public double calcSalary(double amount){
        salary=amount-(amount*tax);
        return salary;
    }
    public double getSalary(){
        return salary;
    }
    public abstract void DisplaySalary(double amount);

    public static void main(String[]args){
      Scanner in=new Scanner(System.in);
      System.out.println("Enter the amount before tax:");
      double amount=in.nextDouble();
      Employee myemployee=new Employee(amount);
      myemployee.DisplaySalary(amount);
    }
}
