public class Sorting {

    public static void insertionSort(int [] array) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }
    //sorting by selection

    public static void selectionSort(int [] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[smallest])
                    smallest = j;
                swap(a, i, smallest);
            }
        }
    }

    public static void swap(int [] list, int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    public static void main(String[] args) {

        int[] arr1 = {9, 14, 3, 2, 43, 11, 58, 22};
        System.out.println("Before Insertion Sort");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        insertionSort(arr1);//sorting array using insertion sort
        System.out.println("After Insertion Sort");
        for (int i : arr1) {
            System.out.print(i + " ");
        }

    }
}