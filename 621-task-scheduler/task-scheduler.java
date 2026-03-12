class Solution {
    public int leastInterval(char[] tasks, int n) {
        class Pair {
            int first;
            char second;

            Pair(int f, char s) {
                this.first = f;
                this.second = s;
            }
        }
        int length = tasks.length;
        HashMap<Character, Integer> freq = new HashMap<>();
        HashMap<Character, Integer> free = new HashMap<>();
        for (int i = 0; i < length; i++) {
            freq.put(tasks[i], freq.getOrDefault(tasks[i], 0) + 1);
            free.put(tasks[i], 1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> b.first - a.first
        );
        freq.forEach((key, value) -> {
            pq.add(new Pair(value, key));
        });
        int seat = 1;
        while (!pq.isEmpty()) {
            ArrayList<Pair> pulled = new ArrayList<>();
            while (!pq.isEmpty()) {
                Pair p = pq.peek();
                pq.poll();
                int fr = p.first;
                char child = p.second;
                if (free.get(child) <= seat) {
                    if (fr > 1) {
                        pq.add(new Pair(fr - 1, child));
                        free.put(child, seat + n + 1);
                    }
                    break;
                } else {
                    pulled.add(p);
                }
            }
            for (int i = 0; i < pulled.size(); i++) {
                pq.add(pulled.get(i));
            }
            seat++;
        }
        return seat - 1;
    }
}