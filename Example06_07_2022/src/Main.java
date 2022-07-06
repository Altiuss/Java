import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
        }


        int[][] table = new int[2][5];
        table[0][0] = 0;
        table[0][1] = 1;
        table[0][2] = 2;
        table[0][3] = 3;
        table[0][4] = 4;
        table[1][0] = 5;
        table[1][1] = 6;
        table[1][2] = 7;
        table[1][3] = 8;
        table[1][4] = 9;
        print2dArray(table);
        System.out.println();
        int[][] table2 = {{1, 2, 3}, {4, 5, 6}};
        print2dArray(table2);
        int [][] table3 = new int[5][5];
        System.out.println("------------------------------------------");
        print2dArray(table3);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        for (int i = 0; i < table3.length; i++){
            table3[i][i] = 1;
        }
        print2dArray(table3);
        System.out.println("---------------------------------------------");

        int[][] table4 = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("input array elem");
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table4[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < table4.length; i++) {
            for (int j = 0; j < table4[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static void print2dArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }
}