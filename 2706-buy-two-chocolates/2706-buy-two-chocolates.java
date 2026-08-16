class Solution {
    public int buyChoco(int[] prices, int money) {
        ArrayList<Integer> a = new ArrayList<>();

        for (int i : prices) {
            a.add(i);
        }

        Collections.sort(a);

        int m = a.get(0) + a.get(1);

        if (money - m >= 0) {
            return money - m;
        }

        return money;
    }
}