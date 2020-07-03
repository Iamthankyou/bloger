class Solution {
    public void duplicateZeros(int[] arr) {
        int c = 0;
        int l = arr.length-1;
        
        for (int i=0; i<=l-c; i++){
            if (arr[i] == 0){
                if (i == l-c){
                    arr[l] = 0;
                    l--;
                    break;
                }
                
                c++;
            }
        }
        
        int last = l-c;
        
        System.out.println(last+","+c);
        
        for (int i=last; i>=0; i--){
            if (arr[i] == 0){
                arr[i+c] = 0;
                arr[i+--c] = 0;
            }
            else{
                arr[i+c] = arr[i];
            }
            
        }
        
        return;
        
    }
}
