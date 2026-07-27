class Solution {
    public String greatestLetter(String s) {
        ArrayList<Integer> r = new ArrayList<>();
        HashSet<Character> a = new HashSet<>();

        for (char i : s.toCharArray()) {
            a.add(i);
        }

        ArrayList<Integer> v = new ArrayList<>();

        for (Character i : a) {
            v.add((int) i);
        }

        for (Integer i : v) {
            if (i >= 65 && i <= 90 && v.contains(i + 32)) {
                r.add(i);
            }
        }

        if (r.size() != 0) {
            int x = Collections.max(r);
            return String.valueOf((char) x);
        }

        return "";
    }
}