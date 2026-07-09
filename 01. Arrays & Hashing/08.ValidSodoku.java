class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set set=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                int n=board[i][j];
                if(n!='.'){
                if(!set.add(n+"row"+i) || !set.add(n+"col"+j) || !set.add(n+"row"+i/3+"col"+j/3)) return false;}
            }
        }
        return true;
    }
}
