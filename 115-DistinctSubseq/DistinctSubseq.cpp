class Solution {
public:
    int numDistinct(string s, string t) {
        
        int m=s.size();
        int n=t.size();
        
        if(m==0||n>m)    return 0;
        if(n==0)    return 1;
        
        vector<vector<int>> dp(m+1,vector<int>(n+1,0));

        for(int i=0;i<=m;i++)    dp[i][0]=1;
        
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){

                if(s[i-1]!=t[j-1]){
                    dp[i][j]=dp[i-1][j];
                }
                
                if(s[i-1]==t[j-1]){
                    dp[i][j]=dp[i-1][j]+dp[i-1][j-1];
                }
            }
        }
        
        return dp[m][n];
    }
};