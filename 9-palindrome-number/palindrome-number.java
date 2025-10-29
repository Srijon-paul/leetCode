class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int num = x;
        int sum = 0;
        int len = (int)Math.log10(num) + 1;
        while(x > 0){
            int rem = x % 10;
            sum = sum + rem * (int)Math.pow(10, len - 1);
            len--;
            x /= 10;
        }
        if(sum == num){
            return true;
        }
        return false;
    }
}