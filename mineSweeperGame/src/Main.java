import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row,column;
        //Starting
        System.out.println("Welcome to Mine Swepeer game ! ");
        //row and column for the board
        System.out.print("Enter a row number: ");
        row = sc.nextInt();
        System.out.print("Enter a column number : ");
        column = sc.nextInt();
        Game mine = new Game(row,column);
        mine.run();

    }
}
