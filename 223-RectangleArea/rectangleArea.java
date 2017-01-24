public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        // (x1,y1):left-lower corner
        // (x2, y2): right-upper corner
        long x1 = Math.max(A,E);
        long y1 = Math.max(B,F);
        long x2 = Math.min(C,G);
        long y2 = Math.min(D,H);
        
        long intersection = 0;
        
        if(x1>x2 || y1>y2) {
            intersection = 0;
        } else {
            intersection = (x2-x1) * (y2-y1);
        }
        
        long area = ((long)C-A) * (D-B) + ((long)G-E)*(H-F) - intersection;
        return (int)area;
        
    }
}