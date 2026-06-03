class Solution {
    public int digitFrequencyScore(int n) {
        Map<Integer,Integer> a=new HashMap<>();
        String n1=Integer.toString(n);
        for(char i:n1.toCharArray())
        {
            a.put(Integer.valueOf(i-'0'),a.getOrDefault(Integer.valueOf(i-'0'),0)+1);
        }
        int c=0;
        for(Map.Entry<Integer,Integer> e:a.entrySet())
        {
            c+=e.getKey()*e.getValue();
        }
        System.out.println(a);
        return c;
    }
}