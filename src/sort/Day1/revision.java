package sort.Day1;

public class revision {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1,0};
        bubblesort(arr);
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
    public static void bubblesort(int []arr){
        Boolean isSwapped = false;
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    isSwapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(!isSwapped){
                return;
            }
        }
    }
}
