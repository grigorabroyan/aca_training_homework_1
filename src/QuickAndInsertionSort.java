public class QuickAndInsertionSort {


    public static void main(String[] args) {
        int[] array = new int[]{1, 8, 44, 88, 9, 3, 7, 1, 5, 6, 10, 74, 23};
        printArray(array);
        System.out.println("quick sort");
        quickSort(array, 0, array.length - 1);
        printArray(array);
        System.out.println("insertion sort");
        insertionSort(array);
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0)
            return;
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(arr, low, j);
        if (high > i)
            quickSort(arr, i, high);
    }


    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int currElem = arr[i];
            int prevKey = i - 1;
            while (prevKey >= 0 && arr[prevKey] > currElem) {
                arr[prevKey + 1] = arr[prevKey];
                arr[prevKey] = currElem;
                prevKey--;
            }
        }
    }
}