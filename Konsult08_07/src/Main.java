import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter dictionary volume: ");
        int arraySize = sc.nextInt();
        String[] dictionary = new String[arraySize];
        for (int i = 0; i < dictionary.length; i++) {
            System.out.println("Enter word:");
            dictionary[i] = sc.next();
        }
        for (int i = 0; i < dictionary.length; i++) {
            System.out.println(" Enter wort;");
            String n = sc.next();
            if (dictionary[i] == n);
            System.out.println(dictionary[i]);

        }
        System.out.println(Arrays.toString(dictionary));
    }
}
