package sort.Day4;

public class countsort {
    public static void main(String[] args) {
        int[] arr = {-2,-1,2,0,1,2,3,3,3};
        //not stable
        countSort(arr);
        for(int val:arr){
            System.out.print(val + " ");
        }
    }
    public static void countSort(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for (int num : arr) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        int count[] = new int[max-min+1];
        for(int i = 0;i < arr.length;i++){
            count[arr[i] - min]++;
        }
        int idx = 0;
        for(int j=0;j < count.length;j++){
            if(count[j] > 0){
                arr[idx++] = j+min;
                count[j]--;
            }
        }

    }
}
