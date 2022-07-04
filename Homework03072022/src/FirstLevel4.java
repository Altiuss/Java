//Assume that there are two arrays of numbers, each sorted in ascending order.
// Implement the method int[] merge(int[], int[]) that marge these arrays into a single sorted array.
// ({1,4,6,8},{3,7}) ->{1,3,4,6,7,8}({12,19},{3,7}) ->{3,7,12,19}

import java.util.Arrays;

public class FirstLevel4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(merge2(new int[]  {1, 4, 6, 8}, new int[] {3, 7})));
        System.out.println(Arrays.toString(merge1(new int[]  {1, 5, 6, 8}, new int[] {3, 11})));
    }

    private static int[] merge1(int[] array1, int[] array2) {
        int[] array = new int[array1.length + array2.length];
        int i = 0, j =0, k = 0;
        while (i < array1.length && j <array2.length){
            if (array1[i] < array2[j]){
                array[k++] = array1[i++];

            }else {
                array[k++] = array2[j++];
            }
        }
        while (i < array1.length) {
            array[k++] = array1[i++];

        }
        while (j < array2.length){
            array[k++] = array2[j++];
        }
        return array;
    }
//Saliek divus masivus un izskiro
    private static int[] merge2(int[] array1, int[] array2) {
        int[] array = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array[array1.length + i] = array2[i];
        }
        Arrays.sort(array);

        return array;
    }
}