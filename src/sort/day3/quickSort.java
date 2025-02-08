package sort.day3;

public class quickSort {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        quicksort(arr);
        for(int val: arr){
            System.out.print(val +  " ");
        }
    }
    public static void quicksort(int[] arr){
        f(arr,0,arr.length-1);
    }
    public static int getRandomPivot(int[] arr,int l,int r){
        return (int) (Math.random()*(r-l) + l);
    }
    public static void f(int[] arr,int l, int r){
        if(l > r) return;
        int pi = getRandomPivot(arr,l,r);
        System.out.println(pi + "pii");
        int m = partition(arr,l,r,pi);
        f(arr,m+1,r);
        f(arr,l,m-1);

    }
    public static int partition(int[] arr,int l ,int r,int p){
        int pi = arr[p];
        int m = l;
        swap(arr,p,r);
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
