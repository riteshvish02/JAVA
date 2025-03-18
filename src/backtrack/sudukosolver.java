package backtrack;

public class sudukosolver {
    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        solveSuduko(board,board.length);
        for(char[] ch:board){
            System.out.print(new String(ch));
            System.out.println();
        }
    }
    public static boolean solveSuduko(char[][] board,int n){
        for(int r = 0;r < n;r++){
            for(int c = 0;c < n;c++){
                if(board[r][c] == '.'){
                    for(char ch = '1'; ch <= '9';ch++){
                        if(isSafe(board,r,c,ch)){
                            board[r][c] = ch;
                            if(solveSuduko(board,n))
                                return true;
                            else
                                board[r][c] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isSafe(char[][] board,int r,int c,char ch){
        for(int i = 0;i < 9;i++){
            if(board[i][c] == ch)
                return false;
            if(board[r][i] == ch)
                return false;

        }
        int row = r/3;
        int col = c/3;
        for(int i = row*3; i < 3;i++){
            for(int j = col*3;j < 3;j++){
                if(board[i][j] == ch)
                    return false;
            }
        }
        return true;
    }
}
