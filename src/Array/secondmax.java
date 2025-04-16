package Array;

public class secondmax {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int val : arr){
            if(val > first){
                second = first;
                first = val;
            }else if(val > second){
                if(val != first){
                    second = val;
                }
            }
        }
        System.out.println(second);
    }
}
