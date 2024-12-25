package search;

public class traprainwater {
    public static void main(String[] args) {
        int heights[] = {4,2,0,3,2,5};
        System.out.println(trappedwater(heights));
    }
    public static int trappedwater(int heights[]){
        if(heights.length < 3){
            return -1;
        }
        int n = heights.length;
        int leftMax[] = new int[n];
        leftMax[0] = heights[0];
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(heights[i],leftMax[i-1]);
        }
        int rightMax[] = new int[n];
        rightMax[n-1] = heights[n-1];
        for(int i = n-2;i >=0;i--){
            rightMax[i] = Math.max(heights[i],rightMax[i+1]);
        }
        int trappedwater = 0;
        for(int i = 0; i < n;i++){
            int maxheight = Math.min(rightMax[i],leftMax[i]);
             trappedwater +=  maxheight - heights[i];
        }
        return  trappedwater;
    }
}
