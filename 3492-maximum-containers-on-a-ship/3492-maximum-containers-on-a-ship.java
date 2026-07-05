class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        for(int i=1;i<=n*n;i++)
        {
            int we=i*w;
            if(we>maxWeight)
            {
                return i-1;
            }
        }
        return n*n;
    }
}