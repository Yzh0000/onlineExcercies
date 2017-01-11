public class Solution {
    public int getSum(int a, int b) {
        // a + b = 2* (a&b) + a^b
        // LHS -> RHS
        // If a&b = 0, then finished.
        // Else, number of 1 (in the binary representation) decreases strictly.
        if (a == 0 ) return b;
        // if (b == 0) return a;
        return getSum((a & b) << 1, a ^ b);
    }
}