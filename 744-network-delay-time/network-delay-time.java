class Solution {
    class Pair implements Comparable<Pair>{
        int first;
        int second;

        Pair(int f, int s) {
            this.first = f;
            this.second = s;
        }

        @Override
        public int compareTo(Pair other) {
            return Integer.compare(this.first, other.first);
        }
    }

    public int networkDelayTime(int[][] times, int n, int k) {
        int res = -1;
        List<List<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < times.length; i++) {
            int s = times[i][0];
            int d = times[i][1];
            int w = times[i][2];
            adj.get(s - 1).add(new Pair(d - 1, w));
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int[] dist = new int[n];
        for (int i = 0; i < dist.length; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[k - 1] = 0;
        pq.add(new Pair(0, k - 1));
        while (!pq.isEmpty()) {
            Pair p = pq.remove();
            int d = p.first;
            int node = p.second;
            if (d > dist[node]) {
                continue;
            }
            for (int j = 0; j < adj.get(node).size(); j++) {
                int neigh = adj.get(node).get(j).first;
                int weight = adj.get(node).get(j).second;
                if (d + weight < dist[neigh]) {
                    dist[neigh] = d + weight;
                    pq.add(new Pair(dist[neigh], neigh));
                }
            }
        }
        for (int i = 0; i < dist.length; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                return -1;
            } else {
                res = Math.max(res, dist[i]);
            }
        }
        return res;
    }
}