class Solution {
    public String reorganizeString(String s) {
        class customPair {
            int first;
            char second;
            customPair(int f, char s){
                this.first = f;
                this.second = s;
            }
        }
        String res = "";
        int seat = 0;
        PriorityQueue<customPair> pq = new PriorityQueue<>(
            (a,b) -> {
                if(a.first != b.first){
                    return b.first - a.first;
                }
                return b.second - a.second;
            }
        );
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        map.forEach((key, value) -> {
            pq.add(new customPair(value, key));
        });

        while(!pq.isEmpty()){
            customPair p = pq.peek();
            pq.poll();
            if(seat == 0 || res.charAt(seat - 1) != p.second){
                res += p.second;
                seat++;
                p.first--;
                if(p.first > 0){
                    pq.add(p);
                }
            } else{
                if(pq.isEmpty()){
                    return "";
                }
                customPair p2 = pq.peek();
                pq.poll();
                res += p2.second;
                seat++; p2.first--;
                if(p2.first > 0){
                    pq.add(p2);
                }
                pq.add(p);
            }
        }
        return res;
    }
}