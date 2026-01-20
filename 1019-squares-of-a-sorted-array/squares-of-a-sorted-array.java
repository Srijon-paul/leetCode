class Solution {
    public int[] sortedSquares(int[] nums) {
        ArrayList<Integer> neg = new ArrayList<>();      
        ArrayList<Integer> pos = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= 0){
                pos.add(nums[i]);
            } else{
                neg.add(nums[i]);
            }
        }
        if(pos.size() == 0){
            for(int i = 0; i < nums.length; i++){
                nums[neg.size() - i - 1] = neg.get(i) * neg.get(i);
            }
            return nums;
        }
        else if(neg.size() == 0){
            for(int i = 0; i < nums.length; i++){
                nums[i] = nums[i] * nums[i]; 
            }
            return nums;
        } else{
            ArrayList<Integer> neg2 = new ArrayList<>(neg.size());
            for(int i = 0; i < pos.size(); i++){
                pos.set(i, pos.get(i) * pos.get(i));
            }
            for(int i = 0; i < neg.size() ; i++){
                neg2.add(i,  neg.get(neg.size() - i - 1) * neg.get(neg.size() - i - 1));
            }
            return merge(pos, neg2);
        }
    }

    public int[] merge(ArrayList<Integer> pos, ArrayList<Integer> neg2){
        int i = 0, j = 0 , k = 0;
        int[] res = new int[pos.size() + neg2.size()];
        while(i < neg2.size() && j < pos.size()){
            if(neg2.get(i) <= pos.get(j)){
                res[k] = neg2.get(i);
                i++; k++;
            } else{
                res[k] = pos.get(j);
                j++; k++;
            }
        }
        while(j < pos.size()){
            res[k] = pos.get(j);
            j++; k++;
        }
        while(i < neg2.size()){
            res[k] = neg2.get(i);
            i++; k++;
        }
        return res;
    }
}