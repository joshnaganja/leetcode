class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        ArrayList<Integer> r=new ArrayList<>();
        Map<Integer,Integer> a=new HashMap<>();
        for(Integer i:bulbs)
        {
            a.put(i,a.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> e:a.entrySet())
        {
            if(e.getValue()%2!=0)
            {
                r.add(e.getKey());
            }
        }
        Collections.sort(r);
        return r;
    }
}