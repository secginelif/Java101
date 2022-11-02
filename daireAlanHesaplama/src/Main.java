import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r, aci;
        double pi = 3.14, alan;

        Scanner input = new Scanner(System.in);

        System.out.print("Daire yarıçapını girin: ");
        r = input.nextInt();
        System.out.print("Daire dilim açısını girin: ");
        aci = input.nextInt();

        alan = (pi *(r*r)*aci)/360;

        System.out.print("Daire Alanı: "+alan);

    }
}
