package sort.day2;

public class inversioncount {
    public static int count = 0;
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        mergeSort(arr);
        for(int val:arr){
            System.out.print(val + " ");
        }
        System.out.println();
        System.out.println(count);
    }
    public static void mergeSort(int[] arr){
        f(arr,0,arr.length-1);
    }
    public static void f(int[] arr,int start,int end){
        if(start >= end) return;
        int mid = (start + end)/2;
        f(arr,start,mid);
        f(arr,mid+1,end);
        merge(arr,start,mid,end);
    }
    public static void merge(int arr[],int start,int mid,int end){
        int[] left = new int[mid - start + 1] ;
        int[] right = new int[end - mid];
        int k = 0;
        for(int i = start; i <= mid ; i++){
            left[k++] = arr[i];
        }
        k = 0;
        for(int j = mid+1; j <= end; j++){
            right[k++] = arr[j];
        }
        int[] result = sortedArray(left,right);
        k = 0;
        for(int i = start; i <= end; i++){
            arr[i] = result[k++];
        }
    }
    public static int[] sortedArray(int a[],int b[]){
        int n = a.length;
        int m = b.length;
        int[] result = new int[n+m];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n && j < m) {
            if(a[i] < b[j]){
                result[k++] = a[i++];
            }else{
                result[k++] = b[j++];
                count += (a.length - i);
            }
        }
        while(i < n){
            result[k++] = a[i++];
        }
        while(j < m){
            result[k++] = b[j++];
        }
        return result;
    }
}
