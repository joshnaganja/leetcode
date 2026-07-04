class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> a=new ArrayList<>();
        int t=n;
        int r=0;
        while(t!=0)
        {
            r=t%10;
            a.add(r);
            t=t/10;
        }
        Collections.sort(a);
        System.out.println(a);
        return a.get(a.size()-1)*a.get(a.size()-2);
    }
}