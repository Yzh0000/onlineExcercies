class Solution {
public:
    vector<int> getRow(int rowIndex) {
        vector<int> pre(rowIndex+1);
        vector<int> cur(rowIndex+1);
        if (rowIndex<0)  return cur;

        pre[0]=1;
        cur[0]=1;
        for(int i=1;i<=rowIndex;i++){
            cur[0]=1;
            cur[i]=1;
            for(int j=1;j<i;j++){
                cur[j]=pre[j-1]+pre[j];
            }
            pre=cur;
        }
        return cur;
    }
};