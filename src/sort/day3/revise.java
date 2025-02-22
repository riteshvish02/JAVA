package sort.day3;

public class revise {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        quicksort(arr);
        for(int val: arr){
            System.out.print(val +  " ");
        }
    }
    public static void quicksort(int[] arr){
       f(arr,0,arr.length-1);
    }
    public static int getRandompivot(int arr[],int l,int r){
        return (int) ((Math.random()*(r-l)) + l);
    }
    public static void f(int arr[],int l,int r){
        if(l > r) return;
        int pi = getRandompivot(arr,l,r);
        int m = partitionAlgo(arr,l,r,pi);
        f(arr,m+1,r);
        f(arr,l,m-1);
    }
    public static int partitionAlgo(int []arr,int l,int r,int pi){
        int m = l;
        int piv = arr[pi];
        swap(arr,r,pi);
        for(int i = l ;i < r; i++){
            if(arr[i] < piv){
                swap(arr,i,m);
                m++;
            }
        }
        swap(arr,r,m);
        return m;
    }
    public static void swap(int arr[],int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
