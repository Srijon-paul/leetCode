/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1, high = n;
        int res = 1;
        while(low <= high){
            int guess = low + (high - low) / 2;
            if(isBadVersion(guess) == true){
                res = guess;
                high = guess - 1;
            }else{
                low = guess + 1;
            }
        }
        return res;
    }
}