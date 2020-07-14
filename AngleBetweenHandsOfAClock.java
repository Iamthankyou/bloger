class Solution {
    public double angleClock(int hour, int minutes) {
        double res = Math.abs(0.5*(hour*60-11*minutes));
        return res > 180?360-res:res;       
    }
}
