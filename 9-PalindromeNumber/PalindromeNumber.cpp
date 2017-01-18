class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0) return false;
        
        long long int i=1;
        while(i*10<=x){i*=10;}

        while(x>0){
            int tail=x%10;
            int head=x/i;
            if(tail!=head)  return false;
            x=(x%i)/10;
            i/=100;
        }
        return true;
        
    }
};