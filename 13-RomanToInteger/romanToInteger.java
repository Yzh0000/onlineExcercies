public class Solution {
    public int romanToInt(String s) {
        /*Roman numerals:
        1,5,10,50,100,500,1000
        I,V,X,L,C,D,M
        all cases that a small numeral appearing on the left: IV,IX, XL,XC, CD,CM
        */
        int rslt = 0;
        int[] nums = new int[s.length()];
        
        for (int i = 0; i< nums.length; i++) {
            switch (s.charAt(i)) {
                case 'I':
                    nums[i] = 1;
                    break;
                case 'V':
                    nums[i] = 5;
                    break;
                case 'X':
                    nums[i] = 10;
                    break;
                case 'L':
                    nums[i] = 50;
                    break;
                case 'C':
                    nums[i] = 100;
                    break;
                case 'D':
                    nums[i] = 500;
                    break;
                case 'M':
                    nums[i] = 1000;
                    break;
                
            }
        }
        
        for (int i = 0; i< nums.length -1; i++) {
            if (nums[i] < nums[i+1]) {
                rslt -= nums[i];
            } else {
                rslt += nums[i];
            }
        }
        
        return rslt + nums[nums.length -1];

            
    }
}