class Solution {
public:
    long int makePalindrome(int n){
        string tmp=to_string(n);
        reverse(tmp.begin(),tmp.end());
        return stol(to_string(n)+tmp);
    }

    int largestPalindrome(int n) {
        if(n==1)    return 9;
        
        int upp=pow(10,n)-1;
        int low=pow(10,n-1);
        
        for(int i=upp;i>=low;i--){
            long int palind=makePalindrome(i);
            
            for(int j=upp;j>=low&&palind/j<=upp;j--){
                if(palind%j==0) return palind%1337;
            }
        }
        
        return -1;
    }
};