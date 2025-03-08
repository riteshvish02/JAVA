package backtrack;

public class ratproblem {
    public static void main(String[] args) {
        int [][]maze = {
                {1,0,0,0},
                {1,1,1,1},
                {1,1,0,0},
                {1,1,1,1}
        };
        backtrack(maze);
    }
    public static boolean backtrack(int[][] maze){
        int[][] sol = new int[maze.length][maze.length];
        if(findpath(maze,0,0,sol)){
            printpath(sol);
            return true;
        }else{
            return false;
        }
    }
    public static boolean findpath(int[][] maze,int row,int col,int[][] sol){
        if(row == maze.length-1 && col==maze.length-1){
            sol[row][col] = 1;
            return true;
        }
        if(isSafe(maze,row,col)){
            sol[row][col] = 1;
            if(findpath(maze,row,col+1,sol)){
                return true;
            }
            if(findpath(maze,row+1,col,sol)){
                return true;
            }
            sol[row][col] = 0;
            return false;
        }
        return false;

    }
    public static void printpath(int[][] sol){
        for(int i = 0;i < sol.length;i++){
            for(int j =0;j < sol[0].length;j++){
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(int[][] maze,int row,int col){
        if(row < maze.length && col < maze.length && maze[row][col] == 1) return true;
        return false;
    }
}
