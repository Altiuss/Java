import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println("Enter word:");
      int[] alpha = new int[123];

        char[] wordArray = word.toCharArray();   //skaitam cik daudz un kadus burtus ievadam masiva

        for (int i = 0; i < wordArray.length; i++ ){
            alpha[wordArray[i]]++;


        }
        for (int i = 0; i < alpha.length; i++ ){
            if (alpha[i] > 0)
            System.out.println((char) i + " " + alpha[i]);
        }

    }
}