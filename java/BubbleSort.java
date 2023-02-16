public class BubbleSort {
    public static void main(String[] args) {
        int arr [] = {435,13,767,3,6,0,0,1,23,5};
        
        for(int i = 0 ; i < arr.length; i++) {
            for(int j = 0; j < arr.length - i -1; j++) {
                if(arr[j] > arr[j+1]) {
                    swap(arr,j,j+1);
                }
            }
        }

        for(int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void swap(int [] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}