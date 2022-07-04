//Implement a method that returns new array of int. Every element of the array is next power of two.
// The length of the array is given n (the max value of n is 30.
// Why do you think?)powerOfTwo (5) -> {1,2,4,8,16}


import java.util.Arrays;

public class FirstLevel1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(powerOfTwo(5)));

    }

    private static int[] powerOfTwo(int length) {
        int[] powers = new int[length];
        for (int i = 0; i < length; i++) {
            powers[i] = (int) Math.pow(2, i);
        }
        return powers;
    }
}
