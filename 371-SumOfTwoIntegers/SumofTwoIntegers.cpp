class Solution {
public:
    int getSum(int a, int b) {
        while(1){
            int nocarry=a^b;
            int carry=(a&b)<<1;
            if(carry==0)    return nocarry;
            return getSum(carry,nocarry);
        }
    }
};