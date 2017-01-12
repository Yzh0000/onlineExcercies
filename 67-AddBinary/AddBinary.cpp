class Solution {
public:
    string addBinary(string a, string b) {
        string s;
        int ia=a.size()-1;
        int ib=b.size()-1;
        int carry=0;
        while(ia>=0&&ib>=0){
            int sum=a[ia]-'0'+b[ib]-'0'+carry;
            s=char(sum%2+'0')+s;
            carry=sum<2?0:1;
            ia--;
            ib--;
        }
        while(ia>=0){
            int sum=a[ia]-'0'+carry;
            s=char(sum%2+'0')+s;
            carry=sum<2?0:1;
            ia--;
        }
        while(ib>=0){
            int sum=b[ib]-'0'+carry;
            s=char(sum%2+'0')+s;
            carry=sum<2?0:1;
            ib--;
        }
        if(carry)   s='1'+s;
        
        return s;
    }
};