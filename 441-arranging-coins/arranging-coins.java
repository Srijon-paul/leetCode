class Solution {
    public int arrangeCoins(long n) {
        return (int) Math.floor((double)(-0.5) + (Math.sqrt((double)(2 * n) + 0.25)));
    }
}