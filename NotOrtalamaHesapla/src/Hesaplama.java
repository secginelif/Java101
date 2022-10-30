import java.util.Scanner;

public class Hesaplama {
    public static void main(String[] args) {
        int mat,fiz,kim,turkce,tarih,muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notu: ");
        mat = inp.nextInt();

        System.out.print("Fizik Notu: ");
        fiz = inp.nextInt();

        System.out.print("Kimya Notu: ");
        kim = inp.nextInt();

        System.out.print("Türkçe Notu: ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notu: ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notu: ");
        muzik = inp.nextInt();

        int toplam = mat +fiz +kim +turkce +tarih +muzik;

        double ortalama = toplam / 6;

        System.out.print("Not Ortalaması:");
        System.out.println(ortalama);

        boolean gecti = ortalama> 60;
        boolean kaldi = ortalama <= 60;

        String sonuc =(gecti) ? "Sınıfı Geçti":"Sınıfı Geçemedi";
        System.out.print(sonuc);


    }
}
