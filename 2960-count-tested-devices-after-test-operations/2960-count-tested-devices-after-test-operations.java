class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int n=batteryPercentages.length;
        int test=0;
        for(int i=0;i<n;i++)
        {
            if(batteryPercentages[i]>0)
            {
                test++;
                for(int j=i;j<n;j++)
                {
                    batteryPercentages[j]=batteryPercentages[j]-1;
                }
            }
        }
        return test;
    }
}