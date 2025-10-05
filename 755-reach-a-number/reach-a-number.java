class Solution {
    public int reachNumber(int target) {
        target = Math.abs(target);
        int m = 1;
        int p = target + 1;
        while(p % 2 != 0 || p / 2 < target){
            m += 1;
            p = target + (m * (m + 1))/2;
        }
        return m;
    }
}