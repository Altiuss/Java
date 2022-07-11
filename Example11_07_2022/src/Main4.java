public class Main4 {
    public static void main(String[] args) {
        int[][] table3 = new int[5][5];
        for (int i = 0; i < table3.length; i++) {
            for (int j = 0; j < table3[i].length; j++) {

                System.out.print(table3[i][j] + "  ");
            }
            System.out.println();

        }
        System.out.println();
for (int i = 0; i < table3.length; i++){
    table3[i][i] = 1;
table3[i][table3.length - i - 1] = 1;
    System.out.println();
        for (int j = 0; j < table3[i].length; j++){

            System.out.print(table3[i][j] + "  ");
        }


}
    }
}