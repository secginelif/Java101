import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar , kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücreti Giriniz: ");

        tutar = input.nextDouble();
        boolean yuksekOran = (tutar>1000);

        double kdvOrani = (yuksekOran) ? 0.8 :0.18 ;

        kdvTutar = tutar * kdvOrani;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("Kdv Tutarı: " +kdvTutar);
        System.out.print("Kdvli Tutar: " +kdvliTutar);




    }
}
