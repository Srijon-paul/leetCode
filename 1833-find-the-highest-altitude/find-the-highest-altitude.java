class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int[] arr = new int[gain.length + 1];
        arr[0] = 0;
        for(int i = 1; i < arr.length; i++){
            arr[i] = gain[i -1] + arr[i - 1];
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}