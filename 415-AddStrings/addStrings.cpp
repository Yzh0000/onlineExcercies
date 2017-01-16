class Solution {
public:
    string addStrings(string num1, string num2) {
        string res;
        if(num1.size()<num2.size()) return addStrings(num2,num1);
        int carry=0,i=num1.size()-1;
        for(int j=num2.size()-1;j>=0;j--){
            int sum=num1[i]-'0'+num2[j]-'0'+carry;
            char digit='0'+sum%10;
            res=digit+res;
            carry=sum>=10?1:0;
            i--;
        }

        while(i>=0){
            int sum=num1[i]-'0'+carry;
            char digit='0'+sum%10;
            res=digit+res;
            carry=sum>=10?1:0;
            i--;
        }
        return carry?"1"+res:res;
    }
};