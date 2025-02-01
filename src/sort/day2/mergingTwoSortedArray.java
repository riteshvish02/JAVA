package sort.day2;

public class mergingTwoSortedArray {
    public static void main(String[] args) {
        int arr1[] = {2,5,6,8,9};
        int arr2[] = {1,3,6,9,10,11,47};
        int arr[] =  sortedArray(arr1,arr2);
        for(int val:arr){
            System.out.print(val + " ");
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
