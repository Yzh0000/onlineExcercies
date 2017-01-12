class Solution {
public:
    int minCut(string s) {
        int n=s.size();
        if(n<=1) return 0;
        vector<int> numCut(n,n-1);
        for(int i=0,n=s.size();i<n;i++){
            for(int j=0;i-j>=0&&i+j<n&&s[i-j]==s[i+j];j++){
                if(i==j)    numCut[i+j]=0;
                else    numCut[i+j]=min(numCut[i+j],numCut[i-j-1]+1);
            }
            for(int j=0,iprev=i-1;iprev-j>=0&&i+j<=n&&s[iprev-j]==s[i+j];j++){
                if(iprev==j)    numCut[i+j]=0;
                else    numCut[i+j]=min(numCut[i+j],numCut[iprev-j-1]+1);
            }
        }
        return numCut[n-1];
    }
};