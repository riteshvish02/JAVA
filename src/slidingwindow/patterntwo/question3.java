package slidingwindow.patterntwo;

import java.util.HashMap;

public class question3 {
    public static void main(String[] args) {
        //fruit into baskets
        //length subArray with atmost two different number
        int[] arr = {1,2,3,4};
        int r = 0;
        int l = 0;
        int k = 2;
        int maxl = 0;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        while(r < arr.length){
            mpp.put(arr[r],mpp.getOrDefault(arr[r],0)+1);
            if(mpp.size() > k){
                mpp.put(arr[l],mpp.get(arr[l])-1);
                if(mpp.get(arr[l]) == 0){
                    mpp.remove(arr[l]);
                }
                l++;
            }
//            if(mpp.size() < k){
//            }
            maxl = Math.max(maxl,r-l+1);

            r++;
        }
        System.out.println(maxl);
    }
}
