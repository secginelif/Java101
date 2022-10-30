import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double yol,toplam, taksiMetre=2.2;
        int acilis = 10;

        Scanner input = new Scanner(System.in);

        System.out.print("Gidilecek km: ");
        yol = input.nextDouble();

        toplam = (yol*taksiMetre) + acilis;

        boolean tutar = (toplam<20);

        double odenecek = (tutar) ? 20 :toplam;
        System.out.print("Toplam tutar: "+ odenecek);




    }
}
