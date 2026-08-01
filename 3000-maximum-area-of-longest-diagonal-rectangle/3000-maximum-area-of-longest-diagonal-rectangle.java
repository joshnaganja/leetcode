class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        ArrayList<Double> a=new ArrayList<>();
        for(int i=0;i<dimensions.length;i++)
        {
            int length=dimensions[i][0];
            int width=dimensions[i][1];
            int l=length*length;
            int w=width*width;
            double d=Math.sqrt(l+w);
            a.add(d);
        }
        double md=Collections.max(a);
        ArrayList<Integer> r=new ArrayList<>();
        for(int i=0;i<a.size();i++)
        {
            if(md==a.get(i))
            {
                r.add(dimensions[i][0]*dimensions[i][1]);
            }
        }
        int res=Collections.max(r);
        return res;
    }
}