public class Employee extends Salary {//subclass of Salary
    public Employee(double salary){//constructor for inherited variables
        super(salary);
    }
    public void DisplaySalary(double amount){//abstract method
        System.out.println("Salary is set to " + calcSalary(amount));
    }
}
