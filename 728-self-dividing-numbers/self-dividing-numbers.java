class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        while(left <= right){
            boolean check = check(left);
            if(check){
                list.add(left);
            }
            left++;
        }
        return list;
    }
    public boolean check(int n){
        int num = n;
        while(n > 0){
            int r = n % 10;
            n = (n / 10);
            if(r == 0 || num % r != 0){
                return false;
            }
        }
        return true;
    }
}