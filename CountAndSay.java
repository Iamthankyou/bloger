class Solution {
    public String countAndSay(int n) {
        if (n==1){
            return "1";
        }   
        String res = "1";
        
        for (int i=1; i<n; i++){
            res = process(res);    
            System.out.println(res);
        }    
        
        return res;
    }
    
    private String process(String s){
        int arr[] = new int[10];
        int c = 1;
        StringBuilder res = new StringBuilder();
        
        for (int i=1; i<s.length(); i++){
            if (s.charAt(i)==s.charAt(i-1)){
                System.out.println(i);
                c++;
            }
            else{
                res.append(Integer.toString(c));
                res.append(s.charAt(i-1));
                c=1;
            }
        }
        
        res.append(Integer.toString(c));
        res.append(s.charAt(s.length()-1));
        
        return res.toString();
    }
}
