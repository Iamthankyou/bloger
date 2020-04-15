// duynotes.blogspot.com
class Solution {
    public String stringShift(String s, int[][] shift) {
        Deque<Character> dq = new LinkedList<>();
        
        for (int i=0; i<s.length();i++){
            dq.add(s.charAt(i));
        }
        
        for (int arr[]:shift){
            if (arr[0]==0){
                int count=0;
                while (count<arr[1]){
                    dq.add(dq.pollFirst());
                    count++;
                }
            }
            else{
                int count=0;
                while (count<arr[1]){
                    dq.addFirst(dq.pollLast());
                    count++;
                }
            }
        }
        String tmp = "";
        for (char c:dq){
            tmp = tmp + String.valueOf(c);
        }
        return tmp;
    }
}
