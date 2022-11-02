import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a heat: ");
        heat = sc.nextInt();

        //if temperature < 5 suggest ski
        //if temperature in 5 to 15 suggest to go to cinema
        //if temperature in 10 to 25 suggest to go to picnic
        //if temperature high to 25 suggest to go to swimming

        if(heat<5){
            System.out.print("You can go on Skateboard");
        }else if(heat <= 25){
            if(heat< 15){
                System.out.print("You can go to the cinema");
            }
            if(heat >=10 ){
                System.out.print("You can go to the picnic");
            }
        }else{
            System.out.print("You can go to swimming");
        }
    }
}
