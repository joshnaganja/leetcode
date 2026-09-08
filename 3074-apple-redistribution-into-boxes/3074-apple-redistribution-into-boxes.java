class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum=0;
        for(int i:apple)
        {
            sum+=i;
        }
        Arrays.sort(capacity);
        int s=0;
        int c=0;
        for(int i=capacity.length-1;i>=0;i--)
        {
            s+=capacity[i];
            c++;
            if(s>=sum)
            {
                return c;
            }
        }
        return 0;
    }
}