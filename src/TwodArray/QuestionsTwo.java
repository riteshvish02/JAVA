package TwodArray;

public class QuestionsTwo {
    //transpose
    public static void main(String[] args) {
        int [][] a = {
                {1,2},
                {6,28},
                {14,2}
        };
        int[][] arr = new int[a[0].length][a.length];
        for(int i = 0; i< arr.length;i++){
            for(int j = 0; j< arr[0].length;j++){
                arr[i][j] = a[j][i];
            }
        }
        for(int i = 0;i< arr.length;i++){
            for(int j = 0; j<arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
