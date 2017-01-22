/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int lowBound = 1;
        int highBound = n;
        int apiRslt = guess(lowBound + (highBound- lowBound)/2);
        while (apiRslt != 0) {
            if (apiRslt < 0) {
                highBound = lowBound + (highBound- lowBound)/2 -1;
            }
            if (apiRslt > 0) lowBound = lowBound + (highBound- lowBound)/2 +1;
            
            apiRslt = guess(lowBound + (highBound- lowBound)/2);
        }
        
        return lowBound + (highBound- lowBound)/2;
        
        
    }
}