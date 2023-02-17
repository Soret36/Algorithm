public class QuickSort {

    static int [] array = {3,6,7,3,46,34,53,3,34,67};

    public static void main(String[] args) {
        printArray(array);
        sort(array, 0, array.length-1);
        printArray(array);
    }

    public static void printArray(int [] array) {
        for(int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    public static void sort (int [] array, int lo, int hi) {
        if(lo >= hi) {
            return ;
        }
        int pivot = partition(array, lo, hi);
        sort(array, lo, pivot -1);
        sort(array, pivot +1 , hi);
    }

    public static int partition(int [] array, int left, int right) {
        int lo = left;
        int hi = right;
        int pivot = array[left];
        
        while(lo < hi) {
            while(array[hi] > pivot && lo < hi) {
                hi--;
            }
            while(array[lo] <= pivot && lo < hi) {
                lo++;
            }
            
            swap(array,lo,hi);
        }
        swap(array, left, lo);
        return lo;
    }

    public static void swap(int [] array, int i ,int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
     }
}
