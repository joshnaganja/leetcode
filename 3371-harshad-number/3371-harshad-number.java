class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int n=x;
        int r=0;
        int sum=0;
        while(n!=0)
        {
            r=n%10;
            sum+=r;
            n=n/10;
        }
        if(x%sum==0)
        {
            return sum;
        }
        else
        {
            return -1;
        }
    }
}