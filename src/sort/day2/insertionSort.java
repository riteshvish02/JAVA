package sort.day2;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        insertionSort(arr);
        for(int val : arr){
            System.out.print( val + " ");
        }
    }
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n;i++){
            int j = i-1;
            int currentElem = arr[i];
            while(j >= 0 && arr[j] > currentElem){ //keep remember
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = currentElem;
        }
    }
}
