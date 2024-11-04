package TwodArray;

public class Multi {
    public static void main(String[] args) {

        int[][] arr1 = {
                {1,2,3},
                {2,4,6}
        };
        int[][] arr2 = {
                {1,2},
                {2,6},
                {4,1}
        };

        if(arr1[0].length == arr2.length){
            int[][] ans = new int[arr1.length][arr2[0].length];
            for(int row = 0 ; row < ans.length;row++){
                for(int col = 0;col < ans[0].length;col++){
                    int sum = 0;
                    for(int k = 0; k < arr1[0].length;k++){
                        int temp = arr1[row][k] * arr2[k][col];
                        sum += temp;
                    }
                    ans[row][col] = sum;
                }
            }
            for(int i = 0;i< ans.length;i++){
                for(int j = 0; j<ans[0].length;j++){
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }


    }

}
