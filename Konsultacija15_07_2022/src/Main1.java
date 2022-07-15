public class Main1 {
    public static void main(String[] args) {
//        System.out.println("aaaa" + "bbbb" + "cccc" + "dddd");

        String s = "";
        for (int i = 0; i < 1000; i++) {
            s = s + i + ";";
        }
        System.out.println(s + ";");


        StringBuilder sb = new StringBuilder();

        sb.append("aaaa");
        sb.append("bbbb");
        sb.append("cccc");
        sb.append("dddd");
        System.out.println(sb);


//        StringBuffer sb;
    }
}
