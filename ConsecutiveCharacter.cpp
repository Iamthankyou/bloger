class Solution {
public:
    int maxPower(string s) {
        int res=0,l=0,i=0;
        
        for (; i<s.length(); i++){
            if (s[i]!=s[l]){
                res=max(res,i-l);
                l=i;
            }
        }
        
        return max(res,i-l);
    }
};
