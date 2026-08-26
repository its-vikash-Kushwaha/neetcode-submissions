class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet<String> set=new HashSet<>();

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.')continue;

                String row=board[i][j]+"row"+i;
                if(!set.add(row))return false;
                String col=board[i][j]+"col"+j;
                if(!set.add(col))return false;

                int b = (i / 3) * 3 + (j / 3);
                String box=board[i][j]+"box"+b;
                if(!set.add(box))return false;
            }

        }
        return true;
    }
}
