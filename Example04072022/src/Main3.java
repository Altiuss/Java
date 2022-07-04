import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        int[] array = { 1, 4, 6, 8, 3, 7, 4};
        System.out.println(search(3,array));
        System.out.println(search(9,array));
     Arrays.sort(array);


    }
    private static int binarySearch(int element, int[] array){
        int middle =array.length / 2;
    }



    private static int search(int element, int[] array ){
        for (int i = 0; i < array.length; i++)
            if (array[i] == element){
                return i;
            }
        return -1;
    }

}
