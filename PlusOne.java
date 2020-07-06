class Solution {
    public int[] plusOne(int[] digits) {
        Stack<Integer> stk = new Stack<>();
        Stack<Integer> res = new Stack<>();
        
        for (int i:digits){
            stk.push(i);
        }
        
        int carry = 0;
        
        if (stk.peek()+1+carry>=10){
                res.push(0);
                carry = 1;
        }
        else{
                res.push(stk.peek()+carry+1);
                carry = 0;
        }
        
        stk.pop();
        
        while (!stk.isEmpty()){
            if (stk.peek()+carry>=10){
                res.push(0);
                carry = 1;
            }
            else{
                res.push(stk.peek()+carry);
                carry = 0;
            }
            
            stk.pop();
        }
        
        if (carry!=0){
            res.push(1);
        }
        
        int arr[] = new int[res.size()];
        
        for (int i=0; i<arr.length; i++){
            arr[i] = res.pop();
        }
        
        return arr;   
    }
}
