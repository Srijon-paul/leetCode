class Solution {
    public int largestAltitude(int[] gain) {
        int[] arr = new int[gain.length + 1];
        arr[0] = 0;
        for(int i = 1; i < arr.length; i++){
            arr[i] = gain[i -1] + arr[i - 1];
        }
        arr = Arrays.stream(arr).sorted().toArray();
        return arr[gain.length];
    }
}