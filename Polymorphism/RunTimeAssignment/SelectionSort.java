public class SelectionSort {

    // Function to perform selection sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Loop through all elements
        for (int i = 0; i < n - 1; i++) {
            // Find the index of the smallest element in the unsorted portion
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the smallest element with the first element of the unsorted portion
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original Array:");
        printArray(numbers);

        selectionSort(numbers);

        System.out.println("Sorted Array:");
        printArray(numbers);
    }
}