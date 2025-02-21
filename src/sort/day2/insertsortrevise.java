package sort.day2;

public class insertsortrevise {
    public static void main(String[] args) {
        int[] arr = {5,3,4,6,9,1};
        insertionSort(arr);
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
    public static void insertionSort(int[] arr){
        for(int i = 0; i < arr.length;i++){
            int j = i-1;
            int currentelem = arr[i];
            while(j >= 0 && arr[j] > currentelem){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = currentelem;
        }
    }
}
