class Solution {
    public int findKthPositive(int[] arr, int k) {
        int[] newarr = new int[k];
        int index = 0; int i = 0; int n = 1;
        while(index < k){
            if(i >= arr.length){
                newarr[index] = n;
                index++; n++;
            } else if(arr[i] !=n){
                newarr[index] = n;
                index++;
                n++;
            } else{
                i++;
                n++;
            }
        }
        return newarr[k - 1];
    }
}