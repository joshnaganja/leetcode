class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        ArrayList<Integer> a=new ArrayList<>();
        for(char i:s.toCharArray())
        {
            a.add(Integer.valueOf(i-'0'));
        }
        System.out.println(a);
        for(int i=0;i<a.size()-1;i++)
        {
            if(Math.abs(a.get(i)-a.get(i+1))>2)
            {
                return false;
            }
        }
        return true;
    }
}