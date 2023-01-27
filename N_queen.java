package CP_package;

public class N_queen {
    public static boolean isSafePlace(int[][]board,int curr_row,int curr_cell_index){
        for (int row=0;row<curr_row;row++){
            if (board[row][curr_cell_index]==1){
                return false;
            }
        }
        int x=curr_row;
        int y=curr_cell_index;
        while (x>=0&&y>=0){
            if (board[x][y]==1){
                return false;
            }
            x--;
            y--;
        }
        x=curr_row;
        y=curr_cell_index;
        while (x>=0&&y<board.length){
            if (board[x][y]==1){
                return false;
            }
            x--;
            y++;
        }
        return true;
    }
    public static void printBoard(int[][]board){
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean place_queen(int[][] board,int row){
        if (row==board.length){
            printBoard(board);
            return true;
        }
        for (int curr_cell_index=0;curr_cell_index<board.length;curr_cell_index++){
            if (isSafePlace(board,row,curr_cell_index)){
                board[row][curr_cell_index]=1;
                boolean canPlaceQueens=place_queen(board,row+1);
                if (canPlaceQueens){
                    return true;
                }
                board[row][curr_cell_index]=0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int n=4;
        int[][] board=new int[4][4];
        place_queen(board,0);
    }
}
