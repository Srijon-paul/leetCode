class Solution {
    public int maximumSum(int[] arr) {
        if(arr.length == 1) return arr[0];
        int BE = arr[0], res = Integer.MIN_VALUE;
        int nodelete = arr[0];
        int onedelete = Integer.MIN_VALUE;
        for(int i = 1; i < arr.length; i++){
            int v2;
            int prevNodelete = nodelete;
            int prevOnedelete = onedelete;
            nodelete = Math.max(prevNodelete + arr[i], arr[i]);
            if(prevOnedelete == Integer.MIN_VALUE){
                prevOnedelete = arr[i];
                v2 = arr[i];
            }  else{
                v2 = prevOnedelete + arr[i];
            }
            onedelete = Math.max(v2, prevNodelete);
            res = Math.max(res, Math.max(nodelete, onedelete));
        }
        return res;
    }
}