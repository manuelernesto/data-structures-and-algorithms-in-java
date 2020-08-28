package io.github.manuelernesto.Sort;

public class ShellMain {
    public static void main(String[] args) {
        int[] intArrays = {20, 35, -15, 7, 55, 1, -22};

        //Before Sorted
        System.out.println("Before Sorted:");
        for (var intArray : intArrays) {
            System.out.println(intArray);
        }

        for (var gap = intArrays.length / 2; gap > 0; gap /= 2) {
            for (var i = gap; i < intArrays.length; i++) {
                var newElement = intArrays[i];
                var j = i;
                while (j >= gap && intArrays[j - gap] > newElement) {
                    intArrays[j] = intArrays[j - gap];
                    j -= gap;
                }
                intArrays[j] = newElement;
            }
        }

        //After Sorted
        System.out.println("After Sorted:");
        for (var intArray : intArrays) {
            System.out.println(intArray);
        }
    }
}
