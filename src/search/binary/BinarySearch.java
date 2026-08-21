package search.binary;

public class BinarySearch {

    static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    void main() {
        int[] numbers = {3, 5, 7, 1241, 1251, 2124, 2512, 3125, 4125, 6213, 24125, 125125};

        int target = 7;

        int result = binarySearch(numbers, target);

        System.out.println(result);
    }
}