class Solution {
    public int totalFruit(int[] fruits) {
        int low = 0;
        int high = 0;
        int res = 0;
        HashMap<Integer, Integer> tree = new HashMap<>();
        while (high < fruits.length) {
            int fruitHigh = fruits[high];
            tree.put(fruitHigh, tree.getOrDefault(fruitHigh, 0) + 1);
            while (tree.size() > 2) {
                tree.put(fruits[low], tree.get(fruits[low]) - 1);
                if (tree.get(fruits[low]) == 0) {
                    tree.remove(fruits[low]);
                }
                low++;
            }
            int len = high - low + 1;
            res = Math.max(res, len);
            high++;
        }
        return res;
    }
}