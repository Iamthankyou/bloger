class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder res = new StringBuilder();
          
        for (int i=arr.length-1; i>=0; i--){
            if (res.length()!=0 && arr[i].trim().length()!=0){
                res.append(" ");                
            }
           
            res.append(arr[i].trim());
        }
        
        return res.toString();
    }
}
