public class Solution {
    public String addStrings(String num1, String num2) {
        if (num1.length() < num2.length() ) return addStrings(num2, num1);
        
        char[] arr1 = num1.toCharArray();
        char[] arr2 = num2.toCharArray();
        int carry = 0;
        
        for (int i = 0; i< arr1.length; i++) {
            if (i < arr2.length) {
                int sum = (arr1[arr1.length -1-i] - '0') + (arr2[arr2.length -1-i] - '0') + carry;
                carry = sum / 10;
                arr1[arr1.length -1-i] = (char) ('0' + sum % 10);
            } else {
                int sum = (arr1[arr1.length -1-i] - '0') + carry;
                carry = sum / 10;
                arr1[arr1.length -1 -i] = (char) ('0' + sum % 10);
            }
        }
        String rslt = new String(arr1);
        return carry == 1? ('1'+rslt) : rslt;
        
        
    }
}