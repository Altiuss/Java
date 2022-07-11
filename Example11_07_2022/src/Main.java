public class Main {
    public static void main(String[] args) {
        int maxIndex1 = (int) (Math.random() * 6);         //Randoms masiva garums
        int[] mas = new int[maxIndex1];                   // izveidojam masivu
        for (int i = 0; i < maxIndex1; i++) {             // aizpildam masivu
            mas[i] = (int) (Math.random() * 6);
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        System.out.println(" max = " + arrayMax(mas,0,mas.length));
    }

    /**
     *
     * @param mas
     * @param i
     * @param maxLength
     * @return
     */
    private static int arrayMax(int[]mas, int i, int maxLength){
        if (maxLength == 0){
            return mas[0];
        }
        return Math.max(mas[i], arrayMax(mas, i+1, maxLength-1));
    }
}
