package sort.day3;

public class partitionAlgo {
    public static void main(String[] args) {
        int[] arr = {1,6,2,0,-1};
        int r = arr.length-1;
        int m = partition(arr,0,r,2);
        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
        System.out.println(m);
    }
    public static int partition(int[] arr,int l ,int r,int p){
        int pi = arr[p];
        int m = l;
        swap(arr,pi,r);
        for(int i = l;i < r;i++){
            if(arr[i] < pi){
                swap(arr,i,m);
                m++;
            }
        }
        swap(arr,m,r);
        return m;
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
