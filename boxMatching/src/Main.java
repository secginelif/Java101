public class Main {
    public static void main(String[] args) {

        //boxer properties
        Fighter f1 = new Fighter("Muhammed ALI",10,110,100,50);
        Fighter f2 = new Fighter("Mike TYSON",15,100,95,50);

        //match
        Ring ring = new Ring(f1,f2,90,100);
        ring.run();
    }
}
