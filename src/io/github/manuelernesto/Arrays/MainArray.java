package io.github.manuelernesto.Arrays;

public class MainArray {
    public static void main(String[] args) {
        int[] intArrays = new int[7];
        intArrays[0] = 20;
        intArrays[1] = 35;
        intArrays[2] = -15;
        intArrays[3] = 7;
        intArrays[4] = 55;
        intArrays[5] = 1;
        intArrays[6] = -22;

        int index = -1;
        for (int i = 0; i < intArrays.length; i++) {
            if (intArrays[i] == 7) {
                index = i;
                break;
            }
        }
        System.out.println("Index: " + index);
    }
}