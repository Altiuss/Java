import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        System.out.println("Input rows count:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Input column count:");
        int m = sc.nextInt();
        int[][] array = new int[n][m];

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] =1 + (int)(Math.random()*6);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
