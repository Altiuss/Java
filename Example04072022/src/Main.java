public class Main {
    public static void main(String[] args) {
        int[] array = {6, 10, 9, -6, 4, 2};
        SelectSort(array);
    }
//    Minimala masiva elementa index
    private static void SelectSort(int[] array){
      int imin = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[imin]) {
                    imin = i;

                }

            }
            System.out.println(imin);
        }
    }

