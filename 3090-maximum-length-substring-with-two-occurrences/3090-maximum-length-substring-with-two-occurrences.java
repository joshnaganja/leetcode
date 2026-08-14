class Solution {
    public int maximumLengthSubstring(String s) {
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String s1 = s.substring(i, j + 1);

                Map<Character, Integer> a = new HashMap<>();

                for (char k : s1.toCharArray()) {
                    a.put(k, a.getOrDefault(k, 0) + 1);
                }

                boolean valid = true;

                for (Map.Entry<Character, Integer> e : a.entrySet()) {
                    if (e.getValue() > 2) {
                        valid = false;
                        break;
                    }
                }

                if (valid) {
                    res = Math.max(res, s1.length());
                }
            }
        }

        return res;
    }
}