import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy,endeks;
        int kilo;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = input.nextInt();

        endeks = kilo / (boy*boy);
        System.out.print("Vücut kitle endeksiniz: "+ endeks);
    }
}
