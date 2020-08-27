package io.github.manuelernesto.Sort;

public class BubbleMain {
    public static void main(String[] args) {
        int[] intArrays = {20, 35, -15, 7, 55, 1, -22};

        //Before Sorted
        for (var intArray : intArrays) {
            System.out.println(intArray);
        }

        for (var lastUnsortedIndex = intArrays.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            for (var i = 0; i < lastUnsortedIndex; i++) {
                if (intArrays[i] > intArrays[i + 1])
                    swap(intArrays, i, i + 1);
            }

        }

        System.out.println("++++++++++++++++++++++");
        //After Sorted
        for (var intArray : intArrays) {
            System.out.println(intArray);
        }
    }

    static void swap(int[] array, int i, int j) {
        if (i == j) return;

        var temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
