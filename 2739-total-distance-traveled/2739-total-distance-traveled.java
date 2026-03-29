class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int c=mainTank;
        int q=0;
        while(mainTank>=5)
        {
            mainTank=mainTank-5+1;
            q++;
        }
        if(additionalTank>=q)
        {
            return (c+q)*10;
        }
        else
        {
            return (c+additionalTank)*10;
        }
    }
}