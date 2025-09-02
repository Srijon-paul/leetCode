class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        while(left <= right){
            int check = 0;
            int num= left; int n = left;
            while(n > 0){
                int r = n % 10;
                n = (n / 10);
                if(r == 0){
                    check = 1;
                    break;
                }
                if(num % r != 0){
                    check = 1;
                    break;
                }
            }
            if(check == 0){
                list.add(num);
            }
            left++;
        }
        return list;
    }
}