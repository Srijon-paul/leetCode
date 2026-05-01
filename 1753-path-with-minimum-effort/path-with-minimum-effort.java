class Solution {
    public int minimumEffortPath(int[][] heights) {
        class Pair implements Comparable<Pair>{
            int first, second, dist;
            Pair(int f, int s, int d){
                this.first = f;
                this.second = s;
                this.dist = d;
            }
            @Override
            public int compareTo(Pair other){
                return Integer.compare(this.dist, other.dist);
            }
        }
        int n = heights.length;
        int m = heights[0].length;
        int[][] res = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                res[i][j] = Integer.MAX_VALUE;
            }
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int[] x = {1, -1, 0, 0};
        int[] y = {0, 0, 1, -1};
        res[0][0] = 0;
        pq.add(new Pair(0, 0, 0));
        while(!pq.isEmpty()){
            Pair p = pq.remove();
            int dis = p.dist;
            int row = p.first;
            int col = p.second;
            if(dis > res[row][col]){
                continue;
            }
            for(int k = 0; k < 4; k++){
                int r = row + x[k];
                int c = col + y[k];
                if(!valid(r, c, n, m)){
                    continue;
                }
                int absdiff = Math.abs(heights[row][col] - heights[r][c]);
                int newwt = Math.max(absdiff, dis);
                if(newwt < res[r][c]){
                    res[r][c] = newwt;
                    pq.add(new Pair(r, c, newwt));
                }
            }
        }
        return res[n - 1][m - 1];
    }
    boolean valid(int i, int j, int n, int m){
        if(i < 0 || i >= n || j < 0 || j >= m){
            return false;
        }
        return true;
    }
}