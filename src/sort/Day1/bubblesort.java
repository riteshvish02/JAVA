package sort.Day1;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        bubbleSort(arr);
        for(int val : arr){
            System.out.println(val);
        }
    }
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n;i++){
            boolean isSwapped = false;
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                return;
            }
        }

    }
}
