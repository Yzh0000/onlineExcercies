class Solution {
public:
    int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        long int overx=(long int) min(C,G) - (long int) max(A,E);
        if(overx<0) overx=0;
        
        long int overy=(long int) min(D,H) - (long int) max(B,F);
        if(overy<0) overy=0;
        
        return (D-B)*(C-A)-overx*overy+(G-E)*(H-F);
    }
};