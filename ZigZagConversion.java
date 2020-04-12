//duynotes.blogspot.com
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1){
            return s;
        }
        String res = new String();
        int len = 2*numRows-2;
        int iter = 0;
        
        for (int i=0; i<numRows; i++){
            iter = i;
            while (iter<s.length()){
                res+=s.charAt(iter);
                iter+=len;
                if (i>0 && i<numRows-1 && (iter-2*i) < s.length()){
                    res+=s.charAt(iter-i*2);
                }
            }
        }
        return res;
    }
}
