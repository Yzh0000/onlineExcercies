public class Solution {
    public int[] plusOne(int[] digits) {
        int j = digits.length -1;
        while(j>=0 && digits[j] == 9) {
            digits[j] = 0;
            j--;
        }
        
        if (j == -1) {
            int[] rslt = new int[digits.length+1];
            rslt[0] =1;
            return rslt;
        } else {
            digits[j]++;
            return digits;
        }
    }
}