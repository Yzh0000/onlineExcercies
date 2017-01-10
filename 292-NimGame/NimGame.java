public class Solution {
    public boolean canWinNim(int n) {
        // By induction,
        // if n % 4 == 0, 1st mover will lose.
        // else, 1st mover will win.
        if (n % 4 == 0) {
            return false;
        } else {
            return true;
        }
        
    }
}