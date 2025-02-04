<ins>**ABSTRACT,INTERFACE and CONCRETE CLASSES**</ins>
**ABSTRACT CLASSES AND INTERFACE CLASSES**
They consist of an abstract class and abstract methods to prevent instantiation 
<ins>**ABSTRACT CLASSES AND FEATURES**</ins>
Cafe(Abstract class)

**Attributes: Variable attributes**
cuisine:Name of a cuisine
block: Number of the block location.

**ABSTRACT METHOD**
public abstract void showMenu();

**EASTCAFE class(Inherits from Cafe)**
**Attributes:**
Inherit attributes from Cafe class.
**Methods:**
Inherits all methods from Cafe.

<ins>**OTHER ABSTRACT CLSS**</ins>
**Salary class**
The Salary class is an abstract class that calculates the salary after tax deduction and provides an abstract method DisplaySalary() to be implemented by subclasses. The class includes a constructor to initialize the salary and a method to calculate the salary after tax.

The Employee class is a concrete subclass that extends the Salary class and provides an implementation for the abstract method DisplaySalary().

***Code Structure***
Salary Class
The Salary class is abstract, meaning it cannot be instantiated directly.
**The class has:**
A private field salary to store the employee's salary.
A constant tax set to 0.15 (15% tax).
A constructor to initialize the salary.
A method calcSalary(double amount) to calculate the salary after applying tax.
A method getSalary() to retrieve the salary.
An abstract method DisplaySalary(double amount) to be implemented by subclasses.
***Employee Class (Subclass)***
The Employee class is a concrete class that extends the abstract Salary class.
It provides an implementation of the DisplaySalary() method to display the salary after tax.

<ins>**INTERFACE CLASS AND FEATURES**</ins>
They consist of an abstract class and abstract methods to prevent instantiation
**Interface class: Book**
**Attributes: Constant/Final attributes**
name:Theories
chapters: 32.
**ABSTRACT METHOD**
public void Chapters();

**CHAPTERS class(Implements Book interface)**
It is responsible for providing the implementation for the Chapters() method that was defined in the Book interface.
The Chapters() method outputs the name of a chapter ("The Guest List") to the console.
Book Interface (assumed)
The Book interface (not included in the code snippet) is assumed to have an abstract method Chapters() that the implementing class must define.

**MAGAZINE class(Implements Book interface)**
 This class defines the concrete implementation for the abstract method Chapters() declared in the Book interface. The Magazine class outputs the name of a magazine ("Vogue magazine") when the Chapters() method is called.

<ins>**CONCRETE CLASS**</ins>
***BMI Calculator***
**How It Works**
Variables: The program uses three variables — weight, height, and BMI. The weight is in kilograms, and the height is in meters.

Constructor: The program uses a constructor to initialize the weight and height values when a BMI object is created.

BMI Calculation: The program calculates BMI using the formula:

𝐵
𝑀
𝐼
=
weight
height
2
BMI= 
height 
2
 
weight
​
 
The result is stored in the BMI variable.

Getter Methods: The program has getter methods to return the weight, height, and BMI values.

User Input: The user is prompted to input their weight (in kilograms) and height (in centimeters), and the program calculates and displays the BMI.

**Code Structure**
BMI Class
Instance Variables: weight, height, BMI — These store the weight, height, and calculated BMI.
Constructor: The constructor takes two arguments — weight and height — and calculates the BMI.
***Methods:***
calculateBMI() — Calculates BMI using the weight and height.
getBMI(), getWeight(), getHeight() — Return the BMI, weight, and height.
calculateHeight2() — Converts height from centimeters to meters (used for the BMI calculation).
