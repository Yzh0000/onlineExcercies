class Solution {
public:
    string toHex(int num) {
        string mp="0123456789abcdef";
        long long n=num;
        if(n==0)  return "0";
        string res; 
        if(n<0) n=UINT_MAX+n+1;
        while(n!=0){
            res=mp[n%16]+res;
            n/=16;
        }
        return res;
    }
};