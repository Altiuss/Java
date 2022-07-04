import java.util.Arrays;

//Implement a method that returns the new array that is the given array in reverse order{10, 3, 3, 5, -9} -> {-9, 5, 3, 3, 10}
public class FirstLevel2 {
    public static void main(String[] args) {
        int[] array = {10, 3, 3, 5, -9};

        System.out.println(Arrays.toString(ReturnRevOrd(array)));

    }
    private static int[] ReturnRevOrd(int[] array){
        for (int i = array.length -1; i >= 0; i--){
            System.out.print(array[i] +" ");
//        int[] array2 = new int[array.length];
//        array2 = array;
//        return array2;
        }

       return array;
    }


}
