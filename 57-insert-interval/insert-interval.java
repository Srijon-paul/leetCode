class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] res = new int[intervals.length + 1][2];
        boolean insert = false;
        int index = 0;
        for(int i = 0; i < intervals.length; i++){
            int start = intervals[i][0];
            if(insert == false && start >= newInterval[0]){
                res[index++] = newInterval;
                insert = true;
            }
            res[index++] = intervals[i];
        }
        if(insert == false){
            res[index] = newInterval;
        }
        return mergeInterval(res);
    }
    public int[][] mergeInterval(int[][] intervals){
        ArrayList<int[]> list = new ArrayList<>();
        int start1 = intervals[0][0];
        int end1 = intervals[0][1];
        for(int i = 1; i < intervals.length; i++){
            int start2 = intervals[i][0];
            int end2 = intervals[i][1];
            if(end1 >= start2){
                end1 = Math.max(end1, end2);
                continue;
            }
            list.add(new int[]{start1, end1});
            start1 = start2;
            end1 = end2;
        }
        list.add(new int[]{start1, end1});
        int[][] resArr = new int[list.size()][2];
        for(int i = 0; i < list.size(); i++){
            resArr[i] = list.get(i);
        }
        return resArr;
    }
}