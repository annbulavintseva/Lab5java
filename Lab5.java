package Lab5;

import java.util.Arrays;

public class Lab5 {
    // Метод сортування Selection Sort
    public static void selectionSort(short[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Підміна елементів
            short temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }

    // Метод сортування Insertion Sort
    public static void insertionSort(short[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            short key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        short[] arr = {5, 2, 9, 1, 5, 6};

        System.out.println("Початковий масив: " + Arrays.toString(arr));

        // Виклик методу сортування Selection Sort
        selectionSort(arr);
        System.out.println("Після Selection Sort: " + Arrays.toString(arr));

        // Відновлення початкового масиву
        arr = new short[]{5, 2, 9, 1, 5, 6};

        // Виклик методу сортування Insertion Sort
        insertionSort(arr);
        System.out.println("Після Insertion Sort: " + Arrays.toString(arr));
    }
}



