class Solution {
    public int kthFactor(int n, int k) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for(int i = 2; i <= n; i++){
            if(n % i == 0){
                list.add(i);
            }
        }
        if(list.size() < k){
            return -1;
        } else{
            return list.get(k - 1);
        }
    }
}