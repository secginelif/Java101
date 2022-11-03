import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, passWord;
        int balance = 50000, i = 3, select, nSelect = 0;
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Kullanıcı adınızı giriniz: ");
            userName = input.nextLine();
            System.out.print("Şifrenizi giriniz: ");
            passWord = input.nextLine();

            if (userName.equals("patika") && passWord.equals("java101")) {
                System.out.println("Giriş yaptınız.");
                do {
                    System.out.println("Yapmak istediğiniz işlemi seçiniz :");
                    System.out.println("1-Para Yatırma");
                    System.out.println("2-Para Çekme");
                    System.out.println("3-Bakiye Sorgulama");
                    System.out.println("4-Çıkış Yap");

                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.println("Yatırmak istediğiniz tutar : ");
                            int price = input.nextInt();
                            balance += price;
                            System.out.print("Bakiyeniz " + balance);
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz tutar : ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Yetersiz bakiye !");
                                break;
                            } else {
                                balance -= price;
                                System.out.println("Bakiyeniz : " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Mevcut Bakiyeniz : " + balance);
                            break;
                        case 4:
                            System.out.println("Güvenli çıkış yapıldı.");
                            nSelect++;
                            break;
                        default:
                            System.out.println("Hatalı tuşlama yaptınız. ");
                    }
                } while (select != 4);
            } else {
                i--;
                System.out.println("Hatalı giriş yaptınız");
                System.out.println("Tekrar deneyiniz");
                System.out.println("Kalan hakkınız : " + i);
                if (i == 0) {
                    System.out.print("Kartınız bloke olmuştur.");
                }
            }
        } while (i > 0 && nSelect != 1);
    }
}
