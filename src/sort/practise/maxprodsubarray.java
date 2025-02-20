package sort.practise;

public class maxprodsubarray {
    public static void main(String[] args) {
        int[] nums = {-2,3,-4};
        int maxprod = nums[0];
        int currprod = nums[0];
        for(int i = 1;i < nums.length;i++){
            currprod = Math.max(nums[i],currprod*nums[i]);
            maxprod = Math.max(currprod,maxprod);
        }
        System.out.println(maxprod);
    }
}
