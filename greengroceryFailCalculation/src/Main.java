import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //value to kg
        double pear,apple,tom,ban,au,total;


        //inputs
        Scanner input = new Scanner(System.in);

        System.out.print("How many kilograms is a pear:");
        pear = input.nextDouble();

        System.out.print("How many kilograms is a apple:");
        apple = input.nextDouble();

        System.out.print("How many kilograms is a tomatoes:");
        tom = input.nextDouble();

        System.out.print("How many kilograms is a banana:");
        ban = input.nextDouble();

        System.out.print("How many kilograms is a aubergine:");
        au = input.nextDouble();


        //reason
        //prices- pear=2.14, apple=3.67,tomatoes=1.11, banana=0.95 ,aubergine=5
        total = (pear *2.14) +(apple *3.67) +(tom *1.11) +(ban *0.95) +(au *5);
        System.out.print("Your Total: "+total);
    }
}
