class Solution {
    public int numberOfSpecialChars(String word) {
        int c=0;
        HashSet<Character> a=new HashSet<>();
        for(char i:word.toCharArray())
        {
            a.add(i);
        }
        ArrayList<Integer> v=new ArrayList<>();
        for(Character i:a)
        {
            v.add(i-'0');
        }
        for(Integer i:v)
        {
            if(v.contains(i+32))
            {
                c++;
            }
        }
        return c;
    }
}