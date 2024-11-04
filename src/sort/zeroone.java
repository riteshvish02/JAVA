package sort;

public class zeroone {
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,1,1,1,0,0,1,0};
        int i = 0;
        int j = arr.length - 1;
        while(i <= j){
            System.out.println("work" + i);
            System.out.println(arr[i]);
            if (arr[i] == 0) {
                i++;
                System.out.println("yes");
            }else{
                swap(arr,i,j);
            }
        }
        display(arr);

    }
    public static void swap(int[] arr, int i, int j){
           int temp =  arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
    }
    public static void display(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

}
