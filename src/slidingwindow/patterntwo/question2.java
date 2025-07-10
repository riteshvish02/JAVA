package slidingwindow.patterntwo;

import java.util.HashMap;

public class question2 {
    public static void main(String[] args) {
        //longest substring wothout repeating charac
        String str = "bbbbb";
        int left = 0;
        int right = 0;
        int n = str.length();
        int maxl = Integer.MIN_VALUE;
        HashMap<Character,Integer> mpp = new HashMap<>();
        while(right < str.length()){
            if(mpp.containsKey(str.charAt(right))){
                left = Math.max(mpp.get(str.charAt(right))+1,left);
            }
            maxl = Math.max(maxl,right-left+1);
            mpp.put(str.charAt(right),right);
            right++;
        }
        System.out.println(maxl);
    }
}
