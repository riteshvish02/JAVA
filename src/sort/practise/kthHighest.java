package sort.practise;

public class kthHighest {
    public static void main(String[] args) {
        int[] arr = {12, 35 ,1 ,10 ,34 ,1};
        int highest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length;i++){
            if(arr[i]>highest){
                second = highest;
                highest = arr[i];
            }else if(arr[i] > second && arr[i] != highest){
                second = arr[i];
            }
        }
        System.out.println(second);
    }
}
