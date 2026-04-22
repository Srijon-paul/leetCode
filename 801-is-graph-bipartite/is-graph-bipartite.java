class Solution {
    boolean res = true;
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        List<Integer> colors = new ArrayList<>();
        for(int i = 0; i < n; i++){
            colors.add(0);
        }
        for(int i = 0; i < n; i++){
            if(colors.get(i) == 0){
                dfs(graph, i, 0, colors);
            }
        }
        return res;
    }
    void dfs(int[][] graph, int node, int c, List<Integer> colors){
        colors.set(node, c);
        for(int j = 0; j < graph[node].length; j++){
            int neigh = graph[node][j];
            if(colors.get(neigh) != 0 && colors.get(neigh) == c){
                res = false;
            }
            if(colors.get(neigh) == 0){
                dfs(graph, neigh, 1-c, colors);
            }
        }
    }
}