class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 1;
        for(int i = 0; i < piles.length; i++){
            int temp = piles[i];
            high = Math.max(high, temp);
        }
        int res = -1;
        while(low <= high){
            int guess = low + (high - low) / 2;
            long hours = countHours(piles, guess);
            if(hours > h){
                low = guess + 1;
            }else{
                res = guess;
                high = guess - 1;
            }
        }
        return res;
    }
    long countHours(int[] piles, int speed){
        long h = 0;
        for(int i = 0; i < piles.length; i++){
            h = h + (piles[i] / speed);
            if(piles[i] % speed != 0){
                h++;
            }
        }
        return h;
    }
}