import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //values
        String userName ="patika",password="java101",select,newpswrd;

        Scanner sc = new Scanner(System.in);

        System.out.print("Username: ");
        userName = sc.nextLine();

        System.out.print("Password: ");
        password = sc.nextLine();

        //password control
        if(userName.equals("patika") && password.equals("java101")){
            System.out.print("Successful Enter");
        }else {
            //changing password
            System.out.println("Wrong!");
            System.out.println("Change your password: ");
            System.out.println("yes, no");
            select = sc.nextLine();
            if(select.equals("no")){
                System.out.print("Login terminated");
            }else if(select.equals("yes")){
                System.out.print("Enter new password: ");
                newpswrd = sc.nextLine();
                if(newpswrd.equals("java101") || newpswrd.equals(password)){
                    System.out.println("Not same password");
                    System.out.print("Try again");
                }else{
                    System.out.print("your password has been successfully reset");
                }
            }else{
                System.out.print("Wrong select");
            }
        }
    }
}
