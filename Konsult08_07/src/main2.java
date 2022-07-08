import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] dict = {"saass", "assa", "arrs", "wuze"};
        System.out.println("enter word");
        String n = sc.next();


        System.out.println("findet words");
        for (int i = 0; i < dict.length; i++){
            if(dict[i].startsWith(n)){                         // meklejam vienadus vardus masiva
                System.out.println(dict[i]);
            }
        }
    }
}
