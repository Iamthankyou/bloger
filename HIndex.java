class Solution {
    public int hIndex(int[] citations) {
        if (citations.length == 0){
            return 0;
        }
        
        if (citations.length == 1){
            return citations[0]==0?0:1;
        }
        
        int i = search(citations,0,citations.length-1);
        
        if (citations[i]>citations.length-i){
            return citations.length;
        }
        
        if (citations[i] == citations.length-i){
            return citations.length-i;
        }
        else{
            return citations.length-i-1;
        }
        
    }
    
    private int search(int[] citations, int begin, int end){
        System.out.println(begin+","+end);
        if (begin<end){
            int mid = begin + (end-begin+1)/2;
            if (citations[mid]>citations.length-mid){
                return search(citations,begin,mid-1);
            }
            else{
                return search(citations,mid,end);
            }
        }
        
        return begin;
    }
}
