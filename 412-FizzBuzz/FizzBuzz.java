public class Solution {
    // use % operation.
    public List<String> fizzBuzz(int n) {
        List<String> rslt = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                rslt.add("FizzBuzz");
            } else if (i % 5 == 0) {
                rslt.add("Buzz");
            } else if (i % 3 == 0) {
                rslt.add("Fizz");
            } else {
                rslt.add(""+i);
            }
        }
        
        return rslt;
        
    }
}