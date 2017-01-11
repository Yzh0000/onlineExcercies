public class Solution {
    public int addDigits(int num) {
        // 10 % 9 = 1
        //! Be careful for two following cases:
        // case 1: 0
        // case 2: 9, 18, 27, ...

        if (num == 0) return 0;
        int rslt = num % 9;
        if (rslt == 0) {
            return 9;
        } else {
            return rslt;
        }
        
    }
}