public class BinarySearch {

    public static void main(String[] args) {
    }

    public static int binarySearch(int[] list, int number) {
        int right = list.length - 1;
        int left = 0;
        int mid;

        while (left <= right) {
            mid = (left + right) / 2;
            if (number == list[mid]) {
                return mid;
            }
            if (number < list[mid]) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
