import java.util.Arrays;

//Implement a method that returns the new array that is the
// given array in reverse order{10, 3, 3, 5, -9} -> {-9, 5, 3, 3, 10}
public class FirstLevel2 {
    public static void main(String[] args) {
        int[] array = {10, 3, 3, 5, -9};

        System.out.println(Arrays.toString(ReturnRevOrd(array)));


    }
    private static int[] ReturnRevOrd(int[] array){
        int tmp;
        int n = array.length;
        for (int i = 0; i < n/2; i++){
            tmp = array[n-i-1];
            array[n-i-1] = array[i];
            array[i] = tmp;

        }



       return array;
    }


}
