class Solution {
public:
    int totalNQueens(int n) {
        int res=0;
        vector<vector<bool>> board(n,vector<bool>(n));
        myfun(res,0,board,n);
        return res;
    }
    
    bool isValid(int row,int col,vector<vector<bool>>& board,int n){
        for(int i=0;i<row;i++){
            if(board[i][col])   return false;
            if(col-row+i>=0&&col-row+i<n&&board[i][col-row+i])  return false;
            if(col+row-i>=0&&col+row-i<n&&board[i][col+row-i])  return false;
        }
        return true;
    }
    
    void myfun(int& res,int row,vector<vector<bool>>& board,int n){
        if(row==n)  res++;
        for(int col=0;col<n;col++){
            if(isValid(row,col,board,n)){
                board[row][col]=true;
                myfun(res,row+1,board,n);
                board[row][col]=false;
            }
        }
    }
};