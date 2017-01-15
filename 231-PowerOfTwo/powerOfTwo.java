public class Solution {
    public boolean isPowerOfTwo(int n) {
        //1st version
        // if (n <= 0) return false;
        
        // return (0x40000000 % n) == 0;
        //2nd version
        return (n > 0) && ((n & (n-1)) == 0);

    }
}