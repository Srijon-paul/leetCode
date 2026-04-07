class Solution {
    int[] x = {-1, 1, 0, 0};
    int[] y = {0, 0, -1, 1};
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int res = 0;
        boolean[][] vis = new boolean[m][n];
        for(int i = 0; i < m; i++){
            for(int j =0; j < n; j++){
                if(grid[i][j] == '1' && vis[i][j] == false){
                    dfs(grid, i, j, m, n, vis);
                    res++;
                }
            }
        }
        return res;
    }
    void dfs(char[][] grid, int i, int j, int m, int n, boolean[][] vis){
        vis[i][j] = true;
        for(int k = 0; k < 4; k++){
            int row = i + x[k];
            int col = j + y[k];
            if(valid(row, col, m, n) && grid[row][col] == '1' && vis[row][col] == false){
                dfs(grid, row, col, m, n, vis);
            }
        }
    }
    boolean valid(int i, int j, int m, int n){
        if(i < 0 || i >= m || j < 0 || j >= n){
            return false;
        }
        return true;
    }
}