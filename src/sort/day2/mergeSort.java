package sort.day2;

public class mergeSort {
    public static void main(String[] args) {
        int arr[] = {5,3,2,1};
        mergesort(arr);
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
    public static void mergesort(int[] arr){
        f(arr,0,arr.length-1);
    }
    public static void f(int[] arr,int start,int end){
        if(end <= start) return;
        int mid = (start+end)/2;
        f(arr,start,mid);
        f(arr,mid+1,end);
        merge(arr,start,mid,end);
    }
    public static void merge(int[] arr,int start,int mid,int end){
        int left[] = new int[mid - start + 1];
        int right[] = new int[end - mid];
        int k = 0;
        for(int i = start; i <= mid ;i++){
            left[k++] = arr[i];
        }
        k = 0;
        for(int i = mid+1; i <= end;i++){
            right[k++] = arr[i];
        }
        int result[] = mergetwoArray(left,right);
        k = 0;
        for(int i = start; i <= end;i++){
            arr[i] = result[k++];
        }
    }

    public static int[] mergetwoArray(int a[],int b[]){
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
