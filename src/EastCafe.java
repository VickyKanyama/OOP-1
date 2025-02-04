public class EastCafe extends Cafe{//subclass
    public EastCafe(String cuisine, int block){//constructor
        super(cuisine,block);//variables inherited from the parent class
    }
    public void showMenu(){//abstract method
        System.out.println("Welcome to the "+cuisine+ " "+ "block" +block);
        System.out.println("1.Kosher meat");
        System.out.println("2.Pepperoni pizza");
        System.out.println("3.Pasta");
        System.out.println("4.Mussels");
    }
}