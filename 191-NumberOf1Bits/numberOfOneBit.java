public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        // if (n == 0) return 0;
        
        int rslt = 0;
        while(n != 0 ) {
            rslt++;
            n &= (n-1);
        }
        return rslt;
        
    }
}