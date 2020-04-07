// duynotes.blogspot.com
class Solution {
    public int countElements(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i:arr){
            set.add(i);
        }
        
        int res =0;
        for (int i:arr){
            if (set.contains(i+1)){
                res++;
            }
        }
        return res;
    }
}
