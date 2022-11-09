import java.util.Scanner;

public class Main {
    static boolean isPalindrome(String word) {
        int i = 0, j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = "";
        //loop
        while (!word.equals("0")) {
            System.out.print("Enter your word: ");
            word = sc.nextLine();
            //A palindrome is a word, number, phrase, or other sequence of symbols that reads the same backwards as forwards
            if (isPalindrome(word) && !word.equals("0")) {
                System.out.println(word + " is palindrome");
            } else if (!isPalindrome(word) && !word.equals("0")) {
                System.out.println( word + " is not palindrome");
            }

            System.out.println(); // line
        }

        System.out.println("Log out!");
    }

}
