import java.util.Scanner;
public class BMI {//create a java class

    //defining variables
    public double weight;
    public double height;
    public double BMI;

    //initialize a constructor
    public BMI(double weight,double height) {
        this.weight = weight;
        this.height = height;
        this.BMI= calculateBMI();
    }
    //calculate BMI
    public double calculateBMI() {
        BMI=weight/(height*height);
        return BMI;
    }
    //Getter methods
    public double getBMI(){
        return BMI;
    }
    public double getWeight(){
        return weight;
    }
    public double getHeight(){
        return height;
    }
    public double calculateHeight2() {
        return height/100;
    }

    //creating a main class for execution
    public static void main(String[]args){
        Scanner calc=new Scanner(System.in);
        System.out.println("Enter your weight:");
        double weight=calc.nextDouble();
        System.out.println("Enter your height in centimeters:");
        double height=calc.nextDouble();

        BMI bmi=new BMI(weight,height);
        System.out.println("Your BMI is:"+bmi.calculateBMI());
    }
}
