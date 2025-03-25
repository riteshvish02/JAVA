package sort.Day4;

public class kthlarge {
    public static void main(String[] args) {
        int[] arr = {5,4,4,2,1};
        int k = 3;
        int elem = countsort(arr,k);
        System.out.println(elem);
    }
    public static int countsort(int[] arr,int k){
        int min = arr[0];
        int max = arr[0];
        for(int num:arr){
            min = Math.min(min,num);
            max = Math.max(max,num);
        }
        int count[] = new int[max-min+1];
        for(int i=0;i < arr.length;i++){
            count[arr[i]-min]++;
        }
        int idx = 0;
        for(int i = count.length-1;i >= 0;i--){
            k -= count[i];
            if(k <= 0){
                return i+min;
            }
        }
        return -1;
    }
}
