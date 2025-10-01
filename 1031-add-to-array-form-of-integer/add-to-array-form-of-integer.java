import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        StringBuilder n = new StringBuilder();
        for(int i : num){
            n.append(i);
        }
        String res = n.toString();
        BigInteger no = new BigInteger(res);
        no = no.add(BigInteger.valueOf(k));
        while (!no.equals(BigInteger.ZERO)) {
            BigInteger rem = no.mod(BigInteger.TEN);
            list.add(0, rem.intValue());
            no = no.divide(BigInteger.TEN);
        }
        return list;
    }
}