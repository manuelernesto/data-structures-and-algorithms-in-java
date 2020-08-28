package io.github.manuelernesto.Sort;

public class InsertionMain {
    public static void main(String[] args) {

        int[] intArrays = {20, 35, -15, 7, 55, 1, -22};

        //Before Sorted
        System.out.println("Before Sorted:");
        for (var intArray : intArrays) {
            System.out.println(intArray);
        }

        for (var firstUnsortedIndex = 1; firstUnsortedIndex < intArrays.length; firstUnsortedIndex++) {
            var newElement = intArrays[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && intArrays[i - 1] > newElement; i--) {
                intArrays[i] = intArrays[i - 1];
            }
            intArrays[i] = newElement;
        }

        //After Sorted
        System.out.println("After Sorted:");
        for (var intArray : intArrays) {
            System.out.println(intArray);
        }
    }

}
