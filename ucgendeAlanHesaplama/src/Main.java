import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c,u;
        double alan;

        Scanner input = new Scanner(System.in);

        System.out.print("a kenarını giriniz: ");
        a = input.nextInt();

        System.out.print("b kenarını giriniz: ");
        b = input.nextInt();

        System.out.print("c kenarını giriniz: ");
        c = input.nextInt();

        u = (a+b+c) / 2 ;
        int cevre = 2*u;
        System.out.println("Üçgenin Çevresi:" +cevre);

        alan = Math.sqrt(u*(u-a) *(u-b) *(u-c));
        System.out.print("Üçgenin Alanı: " +alan);



    }
}
