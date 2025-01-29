package sort.Day1;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr = {15,-1,3,8,26,6};
        selectionSort(arr);
        for(int val : arr){
            System.out.println(val);
        }
    }
    public static int getMinIndex(int arr[],int start){
        int minIndex = start;
        for(int i = start; i < arr.length;i++){
            if(arr[i] <=  arr[minIndex]){
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length;i++){
            int minIndex = getMinIndex(arr,i);
            if(i != minIndex){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
