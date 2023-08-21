public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 1, 6, 8, 99, 15, 7 };

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("after sorting");

        for (int i = 0; i < arr.length; i++) {
            int minpOS = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minpOS] > arr[j]) {
                    minpOS = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minpOS];
            arr[minpOS] = temp;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
