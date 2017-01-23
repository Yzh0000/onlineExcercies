class Solution {
public:
    int trailingZeroes(int n) {
        long int i=5;
        int res=0;
        while(i<=n){
            res+=n/i;
            i*=5;
        }
        return res;
    }
};