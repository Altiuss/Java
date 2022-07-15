import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s1 = new String("HalloAigarsan");
       String s2 = "HalloAigarsan";
       String s3 = "HalloAigarsan";



        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);


        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word:");

        String str = sc.nextLine();
        if (str.startsWith("a")){
            if (str.length() > 4){
                System.out.println(str.substring(1,4));

            }else {
                System.out.println("error");
            }
        } else if (str.startsWith("b")) {
            System.out.println(str.charAt(str.length() -1));

        }else {
            System.out.println(str.toUpperCase());
        }







    }
}
