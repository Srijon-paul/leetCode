class Solution {
    class Pair {
        int first;
        int second;
        Pair(int f, int s){
            this.first = f;
            this.second = s;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b) -> {
                if(a.first != b.first) return a.first - b.first;
                return a.second - b.second;
            }
        );
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        map.forEach((key, value) -> {
            int element = key;
            int freq = value;
            Pair curr = new Pair(freq, element);
            if(pq.size() < k){
                pq.add(curr);
            } else{
                if(curr.first < pq.peek().first){
                    return;
                }
                pq.poll();
                pq.add(curr);
            }
        });
        int[] res = new int[k];
        int j = 0;
        while(!pq.isEmpty()){
            res[j] = pq.peek().second;
            pq.poll();
            j++;
        }
        return res;
    }
}