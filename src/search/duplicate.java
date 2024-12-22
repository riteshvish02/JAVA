package search;

public class duplicate {
    public static void main(String[] args) {
        Boolean ans = false;
        int nums[] = {1,2,3,4};
        for(int i = 0;i<=nums.length-1;i++){
            for(int j = i+1;j<=nums.length-1;j++){
                if(nums[i] == nums[j]){
                    ans = true;
                }else{
                    ans = false;
                }

            }
        }

        System.out.println(ans);
    }
}
