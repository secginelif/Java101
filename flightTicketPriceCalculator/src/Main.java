import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //values
        int distance,age,select;
        double km=0.10,discount1=0.50, discount2=0.10, discount3=0.30, discount4=0.20,normalTotal,disTotal,price;

        //age<12 => discount1
        //12<age<24 => discount2
        //age>65 => discount3
        //round trip => discount4


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        System.out.print("Enter distance: ");
        distance = sc.nextInt();

        System.out.print("1=>one direction , 2=>round trip");
        System.out.print("Enter your select: ");
        select = sc.nextInt();

        normalTotal = distance * km;
        System.out.print(normalTotal);

        //calculating discounts

        if(age<12){
            disTotal = normalTotal * discount1;
            if (select == 2){
                price =disTotal * discount4;
            }
        }else if (12<age && age<24){
            disTotal = normalTotal * discount2;
            if (select == 2){
                price =disTotal * discount4;
                System.out.print("Your ticket price: ");
                System.out.print(price);
            }
        }else if (age>65){
            disTotal = normalTotal * discount3;
            if (select == 2){
                price =disTotal * discount4;
                System.out.print("Your ticket price: ");
                System.out.print(price);
            }

        }else {
            disTotal= normalTotal;
            if (select == 2){
                price =disTotal * discount4;
                System.out.print("Your ticket price: ");
                System.out.print(price);
            }


        }




    }
}
