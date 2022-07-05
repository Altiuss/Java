//Попробовать самостоятельно придумать и реализовать алгоритм сортировки одномерного массива.
// Допускается изучить известные методы и реализовать один из них.
public class SecondLevel {
    public static void main(String[] args) {
        int a = (int)(Math.random()*6);
        int[] mas1 = new int[a];
        int[] mas2 = new int[a];
        for (int i = 0; i < a; i++){
            mas1[i] = (int)(Math.random()*6);
            mas2[i] = (int)(Math.random()*6);
            System.out.print(mas1[i]);
            System.out.println();
            System.out.print(mas2[i]);
        }

//        System.out.println(a);
    }
}
