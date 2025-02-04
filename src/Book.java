public interface Book {
    String name = "Theories";//constant variable
    int chapters = 32;//constant variable

    public void Chapters();//abstract method

    public static void main(String[]ars){
        Chapters chapter1 = new Chapters();
        Magazine mag = new Magazine();
        chapter1.Chapters();//calling abstract method implemented in the subclass
        mag.Chapters();//calling abstract method implemented in the subclass
    }
}

