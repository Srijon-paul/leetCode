class Solution {
    public int fib(int n) {
        // retur iterative(n);
        return recursive(n);
    }
    int iterative(int n){
        int n0 = 0;
        int n1 = 1;
        int sum = 0;
        if(n == 1){
            return 1;
        } else if(n == 0) {
            return 0;
        } else{
            for(int i = 0; i < n - 1; i++){
                sum = n0 + n1;
                n0 = n1;
                n1 = sum;
            }
            return sum;
        }
    }

    int recursive(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        int ans = recursive(n - 1) + recursive(n - 2);
        return ans;
    }
}