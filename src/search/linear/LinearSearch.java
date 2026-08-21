package search.linear;

public class LinearSearch {

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    void main() {
        int[] numbers = {3, 5, 2124, 4125, 1241, 24125, 125125, 1251, 2512, 3125, 6213, 7};

        int target = 7;

        int result = linearSearch(numbers, target);

        System.out.println(result);
    }
}