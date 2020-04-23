// duynotes.blogspot.com
class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        int carry = 0;
        while (n!=m){
            n>>=1;
            m>>=1;
            carry++;
        }
        return n<<carry;
    }
}
