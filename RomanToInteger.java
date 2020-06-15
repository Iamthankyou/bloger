class Solution {
    public int romanToInt(String s) {
        int res = 0;
        char prev = '.';
        
        if (s.length() == 0){
            return 0;
        }
        
        for (char i:s.toCharArray()){
            if (i == 'V' || i == 'X'){
                if (prev == 'I'){
                    res = res - 2;
                }
            }    
            
            if (i=='L' || i=='C'){
                if (prev == 'X'){
                    res = res - 20;
                }
            }
            
            if (i=='D' || i=='M'){
                if (prev == 'C'){
                    res = res - 200;
                }
            }
            
            res += roman(i);
            
            prev = i;
        }
        
        return res;
    }
    
    private int roman(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
                    
        }
        
        return 0;
    }
}
