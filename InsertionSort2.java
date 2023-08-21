public class InsertionSort2 {
    public static void main(String[] args) {
        int arr[] = { 11, 22, 88, 33, 99, 66 };

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("after sorting");

        for (int i = 0; i < arr.length; i++) {
            int j = i;

            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;

            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
