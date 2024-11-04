package TwodArray;

import java.util.ArrayList;

public class leetcode {
    public static void main(String[] args) {
    {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int n = matrix[0].length;
        int m = matrix.length;
        int sr = 0;
        int ec = n-1;
        int er = m-1;
        int sc = 0;
        ArrayList<Integer> res = new ArrayList<>();
        int count = n*m;
        System.out.println(count);
        while(count>0)
        {
            for(int i = sc;i<=ec;i++){
                int ans = matrix[sr][i];
                res.add(ans);
                count--;
            }
            sr++;
            System.out.println(sr + "sr count ki val" + count);
            for(int i = sr;i<=er;i++){
                int ans = matrix[ec][i];
                res.add(ans);
                count--;
            }
            ec--;
            System.out.println(ec + "ec count ki val" + count);
            for(int i = ec;i>=sc;i--){
                int ans = matrix[er][i];
                res.add(ans);
                count--;
            }
            er--;
            System.out.println(er + "er count ki val" + count);

            for(int i = er;i >= sr;i--){
                System.out.println("ok");
                int ans = matrix[sc][i];
                res.add(ans);
                count--;
            }
            sc++;
            System.out.println(sc + "sc count ki val" + count);
        }
       }
    }
}
