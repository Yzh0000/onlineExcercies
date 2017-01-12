public class Solution {
    public int titleToNumber(String s) {
        //power function: Math.pow(base, exponent)
        int rslt = 0;
         char[] arr = s.toCharArray();
         
         for (int i = 0; i< arr.length; i++){
             rslt += (arr[i] - 'A' + 1) * Math.pow(26, arr.length - i -1); 
         }
         return rslt;
        
    }
}