class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        while(fast != 1){
            slow = sum(slow);
            fast = sum(fast); fast = sum(fast);

            if(slow == fast && slow != 1){
                return false;
            }
        }
        return true;
    }
    public int sum(int n){
        int s = 0;
        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            s = s + (rem * rem);
        }
        return s;
    }
}