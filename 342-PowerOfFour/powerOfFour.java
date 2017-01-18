public class Solution {
    public boolean isPowerOfFour(int num) {
        if (num <= 0) return false;
        //max signed int which is power of 2, 2^30.
        //operation order: &, ^, | less than ==, !=
        return 0x40000000 % num == 0 && (0x55555555 & num) != 0;
        
    }
}