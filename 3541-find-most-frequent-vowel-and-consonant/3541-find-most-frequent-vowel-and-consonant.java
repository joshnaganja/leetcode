class Solution {
    public int maxFreqSum(String s) {
        Map<Character,Integer> v=new HashMap<>();
        Map<Character,Integer> c=new HashMap<>();
        for(char i:s.toCharArray())
        {
            if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u')
            {
                v.put(i,v.getOrDefault(i,0)+1);
            }
            else
            {
                c.put(i,c.getOrDefault(i,0)+1);
            }
        }
        ArrayList<Integer> av=new ArrayList<>();
        ArrayList<Integer> ac=new ArrayList<>();
        for(Map.Entry<Character,Integer> e:v.entrySet())
        {
            av.add(e.getValue());
        }
        for(Map.Entry<Character,Integer> e:c.entrySet())
        {
            ac.add(e.getValue());
        }
        int mv=0;
        if(av.size()!=0)
        {
            mv=Collections.max(av);
        }
        int mc=0;
        if(ac.size()!=0)
        {
            mc=Collections.max(ac);
        }
        System.out.println(av);
        System.out.println(ac);
        return mv+mc;
    }
}