package sort.merge;

public class MergeSort {

    static void main(String[] args) {
        int[] arr = {3,35,25,25,32,52,3,62,73,5845,83,47235};

        sort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }


    public static void sort(int[] arr) {
        if (arr.length < 2) {
            return;
        }

        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int[] temp, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSort(arr, temp, left, mid);
        mergeSort(arr, temp, mid + 1, right);

        merge(arr, temp, left, mid, right);
    }

    private static void merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (int index = left; index <= right; index++) {
            arr[index] = temp[index];
        }
    }




//    public static void sort(int[] arr) {
//        if (arr.length < 2) {
//            return;
//        }
//
//        int mid = arr.length / 2;
//
//        int[] left = new int[mid];
//        int[] right = new int[arr.length - mid];
//
//        for (int i = 0; i < mid; i++) {
//            left[i] = arr[i];
//        }
//
//        for (int i = mid; i < arr.length; i++) {
//            right[i - mid] = arr[i];
//        }
//
//        sort(left);
//        sort(right);
//
//        merge(arr, left, right);
//    }
//
//    private static void merge(int[] arr, int[] left, int[] right) {
//        int i = 0;
//        int j = 0;
//        int k = 0;
//
//        while (i < left.length && j < right.length) {
//            if (left[i] <= right[j]) {
//                arr[k++] = left[i++];
//            } else {
//                arr[k++] = right[j++];
//            }
//        }
//
//        while (i < left.length) {
//            arr[k++] = left[i++];
//        }
//
//        while (j < right.length) {
//            arr[k++] = right[j++];
//        }
//    }
}