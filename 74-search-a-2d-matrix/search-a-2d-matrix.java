class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return twoSearch(matrix, target);
    }
    boolean twoSearch(int[][] matrix, int target){
        int low = 0, high = matrix.length - 1;
        int res = 0;
        while(low <= high){
            int guess = (low + high) / 2;
            if(matrix[guess][0] <= target){
                res = guess;
                low = guess + 1;
            } else{
                high = guess - 1;
            }
        }
        low = 0; high = matrix[0].length - 1;
        while(low <= high){
            int guess = (low + high) / 2;
            if(matrix[res][guess] == target){
                return true;
            }
            if(matrix[res][guess] <= target){
                low = guess + 1;
            } else{
                high = guess - 1;
            }
        }
        return false;
    }
}