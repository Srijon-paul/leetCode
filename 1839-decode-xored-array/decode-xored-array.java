class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length + 1];
        arr[0] = first;
        for(int i = 1; i < encoded.length + 1; i++){
            arr[i] = encoded[i - 1] ^ arr[i - 1];
        }
        return arr;
    }
}