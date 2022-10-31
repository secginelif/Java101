import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //value
        int n1,n2,total,select;

        //inputs
        Scanner sc = new Scanner(System.in);

        System.out.print("First number: ");
        n1 = sc.nextInt();

        System.out.print("Second number: ");
        n2 = sc.nextInt();

        System.out.println("1-summer, 2-subtract, 3-multiply, 4-division");
        System.out.println("What action do you want to do: ");
        select = sc.nextInt();


        //Calculate
        switch (select){
            case 1:
                total = n1 + n2;
                System.out.println(total);
                break;
            case 2:
                total = n1 - n2;
                System.out.println(total);
                break;
            case 3:
                total = n1 * n2;
                System.out.println(total);
                break;
            case 4:
                if(n2!=0);
                total = n1 / n2;
                System.out.println(total);
                break;
            default:
                System.out.print("Wrong select");

        }
    }
}
