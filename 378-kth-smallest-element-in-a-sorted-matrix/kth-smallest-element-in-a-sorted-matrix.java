class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int low = matrix[0][0], high = matrix[m - 1][n - 1];
        int res = 0;
        while(low <= high){
            int guess = (low + high) / 2;
            int ans = countGuess(matrix, guess);
            if(ans < k){
                low = guess + 1;
            }else{
                res = guess;
                high = guess - 1;
            }
        }
        return res;
    }

    int countGuess(int[][] matrix, int guess){
        int row = matrix.length - 1;
        int col = 0;
        int count = 0;
        while(row >= 0 && col < matrix[0].length){
            if(matrix[row][col] <= guess){
                col++;
                count += row + 1;
            } else{
                row--;
            }
        }
        return count;
    }
}