package sort.bubble;

public class BubbleSort {

    static void main(String[] args) {
        int[] arr = {3,35,25,25,32,52,3,62,73,5845,83,47235};

        sort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }


    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
