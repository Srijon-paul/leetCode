class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] numCopy = Arrays.copyOf(nums1, m);
        int i = 0, j = 0, k = 0;
        while(i < m && j < n){
            if(numCopy[i] < nums2[j]){
                nums1[k] = numCopy[i];
                i++; k++;
            } else{
                nums1[k] = nums2[j];
                j++; k++;
            }
        }
        while(i < m){
            nums1[k] = numCopy[i];
            i++; k++; 
        }
        while(j < n){
            nums1[k] = nums2[j];
            j++; k++; 
        }
    }
}