// duynotes.blogspot.com
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        double x1 = coordinates[0][0];
        double y1 = coordinates[0][1];
        double x2 = coordinates[1][0];
        double y2 = coordinates[1][1];
        
        double m = (double)((y2-y1)/(x2-x1));
        for (int i=2; i<coordinates.length; i++){
            double x3 = coordinates[i][0];
            double y3 = coordinates[i][1];
            if (m!= (double)((y3-y1)/(x3-x1))){
                return false;
            }
        }
        return true;
    }
}
