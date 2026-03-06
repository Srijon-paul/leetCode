class Solution {
    public int findKthNumber(int m, int n, int k) {
        int low = 1, high = m * n;
        int res = -1;
        while(low <= high){
            int guess = (low + high) / 2;
            int ans = countGuess(m, n, guess);
            if(ans < k){
                low = guess + 1;
            } else{
                res = guess;
                high = guess - 1;
            }
        }
        return res;
    }
    int countGuess(int m, int n, int guess){
        int row = m, col = 1;
        int count = 0;
        while(row >= 1 && col <= n){
            if(row * col <= guess){
                count += row;
                col++;
            } else{
                row--;
            }
        }
        return count;
    }
}