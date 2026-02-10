class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> res = new ArrayList<>();
        int start1 = intervals[0][0];
        int end1 = intervals[0][1];
        for(int i = 1; i < intervals.length; i++){
            int start2 = intervals[i][0];
            int end2 = intervals[i][1];
            if(end1 >= start2){
                end1 = Math.max(end1, end2);
                continue;
            }
            res.add(new int[]{start1, end1});
            start1 = start2;
            end1 = end2;
        }
        res.add(new int[]{start1, end1});
        int[][] arr = new int[res.size()][2];
        for(int i = 0; i < res.size(); i++){
            arr[i] = res.get(i);
        }
        return arr;
    }
}