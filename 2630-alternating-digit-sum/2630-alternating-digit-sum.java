class Solution {
    public int alternateDigitSum(int n) {
        ArrayList<Integer> a=new ArrayList<>();
        int r=0;
        while(n!=0)
        {
            r=n%10;
            a.add(r);
            n=n/10;
        }
        Collections.reverse(a);
        int sum=0;
        for(int i=0;i<a.size();i++)
        {
            if(i%2==0)
            {
                sum+=a.get(i);
            }
            else
            {
                sum-=a.get(i);
            }
        }
        return sum;
    }
}