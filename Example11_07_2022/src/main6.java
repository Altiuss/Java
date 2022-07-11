import java.util.Locale;

public class main6 {
    public static void main(String[] args) {
        String a = "Hello Java!";
        String b = "Hello Java!";
        String s = "Hello Java!";
        s = s.toLowerCase();
        s = s.trim();
        System.out.println("\"" + s + "\"");

        StringBuffer sb = new StringBuffer();
        StringBuffer sb2 = new StringBuffer("Hallo Java");
        sb2.append("!");
        System.out.println(sb2);

        sb2.insert(5," Aigars");
        System.out.println(sb2);

        sb2.delete(2,5);
        System.out.println(sb2);
        sb2.reverse();


    }
}
