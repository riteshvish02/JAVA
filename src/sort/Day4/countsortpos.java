package sort.Day4;

public class countsortpos {
    public static void main(String[] args) {
        int arr[] = {2,1,2,1,1,5,3,4};
        int[] output = countsort(arr);
        for(int val:output){
            System.out.print(val + " ");
        }
    }
    public static int[] countsort(int[] arr){
        int[] res = new int[arr.length];
        int max = Integer.MIN_VALUE;
        for(int num : arr){
            max = Math.max(max,num);
        }
        int[] freq = new int[max+1];
        for(int i = 0; i < arr.length;i++){
            int elem = arr[i];
            freq[elem]++;
        }
        for(int k = 1; k < freq.length;k++){
            freq[k] = freq[k] + freq[k-1];
        }
        for(int j = arr.length-1;j >= 0;j--){
            res[freq[arr[j]]-1] = arr[j];
            freq[arr[j]]--;
        }
        return res;
    }
}
