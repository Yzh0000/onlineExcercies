public class Solution {
    public String countAndSay(int n) {
        String[] rslt = new String[n];
        // if (n == 0) return "";
        rslt[0] = "1";
        for (int i = 1; i < n; i++){
            rslt[i] = "";
            char[] arr = rslt[i-1].toCharArray();
            int j = 0;
            int k = 0;
            while (k < arr.length) {
                while (k < arr.length && arr[k] == arr[j]) k++;
                rslt[i] += (""+(k-j)+arr[j]);
                j = k;
               
            }
        }
        return rslt[n-1];
        
        
        
    }
}