public abstract class Cafe{
    String cuisine;// variable
    int block;//variable


    public Cafe(String cuisine, int block) {//constructor
        this.cuisine = cuisine;
        this.block = block;
    }

    public abstract void showMenu();//abstract method

    public static void main(String[]args){
        EastCafe myCafe=new EastCafe("Italian",5);
        myCafe.showMenu();
    }
}
