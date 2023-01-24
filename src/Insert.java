public class Insert {
    private static void insert(char[] arr) {

        int n = arr.length;

        for (int j = 1; j < n; j++) {

            char key = arr[j];

            int i = j - 1;

            while ((i > -1) && (arr[i] > key)) {

                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = key;
        }
    }

    public static void main(String[] args) {

        char[] arr = {'g', 'p', 'a', 'y', 'b', 'c'};

        for (char c : arr) {

            System.out.print(" " + c);
        }
        System.out.println();
        insert(arr);

        for (char c : arr) {
            System.out.print(" " + c);
        }

    }
}