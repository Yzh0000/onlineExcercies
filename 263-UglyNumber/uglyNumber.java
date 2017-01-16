public class Solution {
    public boolean isUgly(int num) {
        if (num <= 0) return false;
        if (num == 1) return true;
        
        while ( num % 5 == 0) {
            num /= 5;
        }
        
        while (num % 3 == 0) {
            num /= 3;
        }
        return (num & (num-1)) == 0;
        
    }
}