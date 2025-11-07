class Solution {
    public int climbStairs(int n) {
        int n0 = 1;
        int n1 = 2;
        int sum = 0;
        if(n == 2){
            return 2;
        } else if(n == 1) {
            return 1;
        } else{
            for(int i = 1; i < n - 1; i++){
                sum = n0 + n1;
                n0 = n1;
                n1 = sum;
            }
            return sum;
        }
    }
}