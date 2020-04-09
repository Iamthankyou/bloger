// duynotes.blogspot.com
class Solution {
    public boolean backspaceCompare(String S, String T) {
        int pointerS = S.length()-1;
        int pointerT = T.length()-1;
        
        int skipS=0;
        int skipT=0;
        
        while(pointerS>=0 || pointerT>=0){
            while (pointerS>=0){
                if (S.charAt(pointerS)=='#'){
                    skipS++;
                    pointerS--;
                }
                else if (skipS>0){
                    skipS--;
                    pointerS--;
                }
                else{
                    break;
                }
            }
            
            while (pointerT>=0){
                if (T.charAt(pointerT)=='#'){
                    skipT++;
                    pointerT--;
                }
                else if (skipT>0){
                    skipT--;
                    pointerT--;
                }
                else{
                    break;
                }
            }
            
            if (pointerS>=0 && pointerT>=0 && T.charAt(pointerT)!= S.charAt(pointerS)){
                return false;
            }
            
            if ((pointerS>=0) != (pointerT>=0)){
                return false;
            }
            
            pointerS--;
            pointerT--;
        }
         return true;
    }
}
