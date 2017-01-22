public class Solution {
    public int trailingZeroes(int n) {
        //check the power of 5 in the prime decompostion of n.
        if (n < 5) return 0;
        
        int rslt = 0;
        while (n >= 5) {
            n = n/5;
            rslt += n;
        }
        
        return rslt;
        
        
        
    }
}