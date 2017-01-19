public class Solution {
    public List<List<Integer>> generate(int numRows) {
        //ith row C(i-1,j), j =0,...,i-1.
        List<List<Integer>> rslt = new ArrayList<>();
        
        if (numRows == 0) return rslt;

        Integer[] rowOne = {1};
        //Arrays.asList()
        rslt.add(Arrays.asList(rowOne));
        for(int i = 1; i< numRows; i++) {
            Integer[] row = new Integer[i+1];
            row[0] = 1;
            row[1] = i;
            for (int j = 2; j< i+1; j++) {
                row[j] = row[j-1] * (i-j+1)/j;
            }
            rslt.add(Arrays.asList(row));

            
        }
        
        return rslt;
    }
}