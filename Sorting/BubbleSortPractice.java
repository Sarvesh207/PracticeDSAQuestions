public class BubbleSortPractice {
    public static void main(String[] args) {
        int arr [] = {5, 1, 8, 9, 3};

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        for(int i=0; i<arr.length-1; i++){
            for(int j=0;  j<arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
        System.out.println();
          for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
