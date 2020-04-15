class Solution {
    public String stringShift(String s, int[][] shift) {
        int subLen =0;
        for (int[] arr:shift){
            subLen += arr[0]==0 ? arr[1] : (-1)*arr[1];
        }
        
        String res = null;
        if (subLen > 0){
            subLen %= s.length();
            String first = s.substring(0,subLen);
            String second = s.substring(subLen);
            res = second + first;
        }
        else{
            subLen = Math.abs(subLen % s.length());
            int len = s.length();
            String first = s.substring(0,len-subLen);
            String second = s.substring(len-subLen);
            res = second + first;
        }
        return res;
    }
}
