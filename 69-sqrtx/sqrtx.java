class Solution {
    public int mySqrt(int x) {
        int start = 1;
        int end = x;
        if(start == end){
            return 1;
        }
        while(start <= end){
            int mid = (start + end) / 2;
            if(x / mid == mid){
                return mid;
            }
            if(mid > x / mid){
                end = mid - 1;
            }
            if(mid < x / mid){
                start = mid + 1;
            }
        }
        return start - 1;
    }
}