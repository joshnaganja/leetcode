class Solution {
    public boolean isFascinating(int n) {
        String s=Integer.toString(n);
        int x=2*n;
        int y=3*n;
        s+=Integer.toString(x);
        s+=Integer.toString(y);
        if(s.contains("0"))
        {
            return false;
        }
        Map<Character,Integer> a=new HashMap<>();
        for(char i:s.toCharArray())
        {
            a.put(i,a.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Character,Integer> e:a.entrySet())
        {
            if(e.getValue()!=1)
            {
                return false;
            }
        }
        if(a.size()!=9)
        {
            return false;
        }
        return true;
    }
}