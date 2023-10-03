# leetcode
class Solution {
public:
    int countDigits(int num) {
        int t,c,r;
        t=num;
        c=0;
        while(num!=0)
        {
            r=num%10;
            if(r!=0 and t%r==0)
            {
                c=c+1;
            }
            else
            {
                c=c; 
            }
            num=num/10;
        }
        return c;
    }
};
