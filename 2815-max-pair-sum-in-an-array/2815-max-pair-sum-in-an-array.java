class Solution {
    public int maxSum(int[] nums) {
        int[] best = new int[10]; // best[d] = largest number whose max digit is d
        int ans = -1;

        for (int num : nums) {
            int maxDigit = 0;
            int temp = num;

            while (temp > 0) {
                maxDigit = Math.max(maxDigit, temp % 10);
                temp /= 10;
            }

            if (best[maxDigit] != 0) {
                ans = Math.max(ans, best[maxDigit] + num);
            }

            best[maxDigit] = Math.max(best[maxDigit], num);
        }

        return ans;
    }
}