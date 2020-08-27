package io.github.manuelernesto.Sort;

public class BubbleMain {
    public static void main(String[] args) {
        int[] intArrays = {20, 35, -15, 7, 55, 1, -22};

        //Before Sorted
        for (int intArray : intArrays) {
            System.out.println("" + intArray);
        }

        for (int lastUnsortedIndex = intArrays.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArrays[i] > intArrays[i + 1])
                    swap(intArrays, i, i + 1);
            }

        }

        System.out.println("++++++++++++++++++++++");
        //After Sorted
        for (int intArray : intArrays) {
            System.out.println("" + intArray);
        }
    }

    static void swap(int[] array, int i, int j) {
        if (i == j) return;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
