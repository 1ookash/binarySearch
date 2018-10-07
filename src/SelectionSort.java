public class SelectionSort {

    public static void selectionSort (int[] array) {
        int smallestIndex;
        int tmp;

        for (int i = 0, k = 0; i < array.length; i ++, k ++) {
            smallestIndex = findSmallestIndex(array, k);
            tmp = array[i];
            array[i] = array[smallestIndex];
            array[smallestIndex] = tmp;
        }
    }

    private static int findSmallestIndex (int[] array, int initialIndex) {
        int smallest = array[initialIndex];
        int smallestIndex = initialIndex;

        for(int i = initialIndex; i < array.length; i ++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }
}
