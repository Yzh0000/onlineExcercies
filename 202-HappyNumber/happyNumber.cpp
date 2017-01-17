class Solution {
public:
    int getSum(int n){
        int sum=0;
        while(n>0){
            sum+=pow(n%10,2);
            n/=10;
        }
        return sum;
    }

    bool isHappy(int n) {
        int fast=n;
        int slow=n;
        while(1){
            fast=getSum(getSum(fast));
            slow=getSum(slow);
            if(fast==1||slow==1)    return true;
            if(fast==slow)  return false;
        }
        return false;
    }
};