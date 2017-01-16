class Solution {
public:
    bool isPowerOfThree(int n) {
        int maxpower3=1162261467;
        return n>0&&maxpower3%n==0;
    }
};