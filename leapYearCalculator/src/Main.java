import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //value
        int year;

        //Scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        year = sc.nextInt();

        //year/100=0 and year/400=0 => its leap year
        //year/4 = 0 => its leap year
        if(year/100==0){
            if(year%400==0){
                System.out.print(year +": Leap year");
            }
        }else if(year%4==0){
            System.out.print(year +": Leap year");
        }else {
            System.out.print(year +" Not leap year");
        }
    }
}
