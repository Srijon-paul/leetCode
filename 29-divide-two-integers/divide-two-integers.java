class Solution {
    public int divide(long dividend, long divisor) {
        if(dividend / divisor == 0){
            return 0;
        }
        if(dividend/divisor <= 0){
            return (int)(Math.ceil((double) dividend /divisor));
        }
        if(dividend/divisor > 0){
            return (int)(Math.floor((double) dividend /divisor));
        }
        return 0;
    }
}