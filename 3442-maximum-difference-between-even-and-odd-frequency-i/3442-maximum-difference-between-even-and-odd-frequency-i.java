class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> a=new HashMap<>();
        for(char i:s.toCharArray())
        {
            a.put(i,a.getOrDefault(i,0)+1);
        }
        System.out.println(a);
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        for(Map.Entry<Character,Integer> e:a.entrySet())
        {
            if(e.getValue()%2==0)
            {
                even.add(e.getValue());
            }
            else
            {
                odd.add(e.getValue());
            }
        }
        int em=Collections.min(even);
        int om=Collections.max(odd);
        return om-em;
    }
}