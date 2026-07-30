class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        String vowels = "aeiou";
        int n = words.length;

        // Prefix sum array
        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {
            String word = words[i];
            char first = word.charAt(0);
            char last = word.charAt(word.length() - 1);

            prefix[i + 1] = prefix[i];
            if (vowels.indexOf(first) != -1 && vowels.indexOf(last) != -1) {
                prefix[i + 1]++;
            }
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            ans[i] = prefix[r + 1] - prefix[l];
        }

        return ans;
    }
}