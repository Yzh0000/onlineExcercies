public class Solution {
    public boolean isHappy(int n) {
        //use a set to judge if it falls into a cycle.
        Set<Integer> nums = new HashSet<>();
        
        int sqSum = squareSum(n);
        
        while (sqSum != 1) {
            if (!nums.add(sqSum)) return false;
            sqSum = squareSum(sqSum);
        }
        
        return true;

        
    }
    
    public int squareSum(int n) {
        // n > 0
        int rslt = 0;
        while ( n != 0) {
            int re = n % 10;
            rslt += re * re;
            n /= 10;
        }
        
        return rslt;
    }
}