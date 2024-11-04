package TwodArray;

public class basics {
    public static void main(String[] args) {
        int[][] a = new int[3][1];
        int[][] a1 = {
                {1,2},
                {2,2},
                {3,3},
        };
//        System.out.println(a1.length);
        for(int i = 0;i< a1.length;i++){
           for(int j = 0; j<a1[0].length;j++){
               System.out.print(a1[i][j] + " ");
           }
            System.out.println();
        }
        for(int[] val:a1){
           for(int ans:val){
               System.out.println(ans);
           }
        }
    }
}
