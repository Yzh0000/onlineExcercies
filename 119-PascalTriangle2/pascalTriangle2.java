public class Solution {
    public List<Integer> getRow(int rowIndex) {

        Integer[] rslt = new Integer[rowIndex +1];
        rslt[0] = 1;
        for (int i = 1; i< rowIndex +1; i++) {
            //for factorial, use long to avoid possbile mistake!

            rslt[i] = (int)((long)rslt[i-1] * (rowIndex - i +1)/i);

        }
        return Arrays.asList(rslt);
        
    }
}