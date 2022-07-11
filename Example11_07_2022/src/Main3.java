//Implement the method that takes int[][] array and row number
// and checks that the average of the elements in a row is greater than 0

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineNumber = sc.nextInt();





    }
    private static boolean isGreater(int[][] array, int lineNumber){
        int length = array[0].length;
        double sum = 0.0;
        for (int i = 0; i < array[0].length;i++){
            sum += array[lineNumber][i];
        }
        return sum / length > 0;

    }
}
