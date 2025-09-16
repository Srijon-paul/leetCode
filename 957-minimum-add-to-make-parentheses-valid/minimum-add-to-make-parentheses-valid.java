class Solution {
    public int minAddToMakeValid(String s) {
        int sum = 0; int sum2 = 0;
        while(!s.isEmpty()){
            char ch = s.charAt(0);
            if(ch == '('){
                sum++;
            }
            else if(ch == ')' && sum > 0){
                sum--;
            } else{
                sum2++;
            }
            s = s.substring(1);
        }
        return Math.abs(sum + sum2);
    }
}