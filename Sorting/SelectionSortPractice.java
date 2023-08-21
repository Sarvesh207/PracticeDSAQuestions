public class SelectionSortPractice {
    public static void main(String[] args) {
        int arr [] = {10, 8, 4, 3, 1};

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        for(int i=0; i<arr.length; i++){
            int minpos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minpos]> arr[j]){
                    minpos = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minpos];
            arr[minpos] = temp;
        }
       
        System.out.println("After sorting");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        
    }
    
}
