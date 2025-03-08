package backtrack;

public class nqueen {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        placeNqueen(board,0,0,0,board.length,"");
    }
    public static void placeNqueen(boolean[][] board,int row,int col,int qpsf,int tq,String output){
        if(tq == qpsf){
            System.out.println(output);
            return;
        }
        if(col == board[0].length){
            row++;
            col = 0;
            return;
        }
        if(row == board.length){
            return;
        }
        if(isSafetoPlace(board,row,col)){
            board[row][col] = true;
            placeNqueen(board,row+1,0,qpsf+1,tq,output + "{" + row + "-" + col + "}");
            board[row][col] = false;
        }
        placeNqueen(board,row,col+1,qpsf,tq,output);
    }
    public static boolean isSafetoPlace(boolean[][] board,int row,int col){
        //verticallyupward
        int r = row-1;
        int c = col;
        while(r >= 0){
            if(board[r][c]){
                return false;
            }
            r--;
        }
        //horizontally leftward
        int hr = row;
        int hc = col-1;
        while(hc >= 0){
            if(board[hr][hc]){
                return false;
            }
            hc--;
        }
        //diagonally lefward
        int dc = col-1;
        int dr = row-1;
        while(dc >= 0  && dr >= 0){
            if(board[dr][dc]){
                return false;
            }
            dc--;
            dr--;
        }
        //diagonally rightward
        int drc = col+1;
        int drr = row-1;
        while(drc <= board.length-1  && drr >= 0){
            if(board[drr][drc]){
                return false;
            }
            drc++;
            drr--;
        }
        return true;

    }
}
