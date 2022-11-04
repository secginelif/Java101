import java.util.Scanner;

public class Main {
    static void plus() {
        Scanner sc = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + " number");
            number = sc.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Result: " + result);
    }

    static void minus() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers will you enter: ");
        int counter = sc.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + " number");
            number = sc.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Result:  " + result);
    }

    static void times() {
        Scanner sc = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + " number");
            number = sc.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Result: " + result);
    }

    static void divided() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers will you enter: ");
        int counter = sc.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + " number");
            number = sc.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("You can not enter the divisor 0.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Result: " + result);
    }

    static void power() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base value: ");
        int base = sc.nextInt();
        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result: " + result);
    }

    static void factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Result: " + result);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select;
        String menu = "1- addition\n"
                + "2- extraction\n"
                + "3- multiply\n"
                + "4- division\n"
                + "5- Exponential Calculation\n"
                + "6- Factorial Calculation\n\n"
                + "7- Mode Retrieval\n"
                + "8- Rectangular Area and Perimeter Calculation\n"
                + "0- Log out";

        do {
            System.out.println(menu);
            System.out.print("Select an action: ");
            select = sc.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Entered an incorrect value, try again.");
            }
        } while (select != 0);


    }
}
