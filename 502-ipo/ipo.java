class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        class Pair{
            int first;
            int second;

            Pair(int f, int s){
                this.first = f;
                this.second = s;
            }
        }
        int n = profits.length;
        ArrayList<Pair> projects = new ArrayList<>();
        int idx = 0;
        for(int i = 0; i < n; i++){
            projects.add(new Pair(capital[i], profits[i]));
        }
        projects.sort(Comparator.comparingInt(p -> p.first));
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        while(k > 0){
            while(idx < n){
                if(projects.get(idx).first > w){
                    break;
                }
                pq.add(projects.get(idx).second);
                idx++;
            }
            if(pq.isEmpty()) return w;
            w += pq.peek();
            pq.poll();
            k--;
        }
        return w;
    }
}