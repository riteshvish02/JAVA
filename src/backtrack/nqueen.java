package backtrack;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class nqueen {
    public static void main(String[] args) {
        char[][] board = new char[4][4];
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        for(char[] row:board){
            Arrays.fill(row,'.');
        }
        placeNqueen(board,0,0,0,board.length,res);
        for (ArrayList<String> list : res) {  // Iterate over each inner list
            for (String str : list) {         // Iterate over each string in the inner list
                System.out.print(str + " ");
            }
            System.out.println();  // New line after each inner list
        }

    }
    public static boolean isSafetoPlace(char[][] board,int row,int col){
        //verticallyupward
        int r = row-1;
        int c = col;
        while(r >= 0){
            if(board[r][c] == 'Q'){
                return false;
            }
            r--;
        }
        //horizontally leftward
        int hr = row;
        int hc = col-1;
        while(hc >= 0){
            if(board[hr][hc] == 'Q'){
                return false;
            }
            hc--;
        }
        //diagonally lefward
        int dc = col-1;
        int dr = row-1;
        while(dc >= 0  && dr >= 0){
            if(board[dr][dc] == 'Q'){
                return false;
            }
            dc--;
            dr--;
        }
        //diagonally rightward
        int drc = col+1;
        int drr = row-1;
        while(drc <= board.length-1  && drr >= 0){
            if(board[drr][drc] == 'Q'){
                return false;
            }
            drc++;
            drr--;
        }
        return true;

    }

    public static void placeNqueen(char[][] board, int row, int col, int qpsf, int tq, ArrayList<ArrayList<String>> ans){
        if(tq == qpsf){
            ArrayList<String> res = Arrayconstructboard(board);
            ans.add(res);
            return;
        }
        if(col == board[0].length){
            row++;
            col = 0;
        }
        if(row == board.length){
            return;
        }
        if(isSafetoPlace(board,row,col)){
            board[row][col] = 'Q';
            placeNqueen(board, row + 1, 0, qpsf + 1, tq, ans);
            board[row][col] = '.';
        }
        placeNqueen(board,row,col+1,qpsf,tq,ans);
    }

    public static ArrayList<String> Arrayconstructboard(char[][] board) {
        ArrayList<String> arr = new ArrayList<>();
        for(char[] row:board){
            arr.add(new String(row));
        }
        return arr;
    }
}
