// Forward declaration of guess API.
// @param num, your guess
// @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
int guess(int num);

class Solution {
public:
    int guessNumber(int n) {
        int L=1;
        int R=n;
        int x=L+(R-L)/2;
        int res=guess(x);
        
        while(res!=0)
        {
            if(res==1)  L=x+1;
            else R=x-1;
            x=L+(R-L)/2;
            res=guess(x);
        }
        return x;
    }

};