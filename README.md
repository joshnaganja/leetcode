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

<!---LeetCode Topics Start-->
# LeetCode Topics
## Math
|  |
| ------- |
| [1965-sum-of-digits-in-base-k](https://github.com/joshnaganja/leetcode/tree/master/1965-sum-of-digits-in-base-k) |
| [2630-alternating-digit-sum](https://github.com/joshnaganja/leetcode/tree/master/2630-alternating-digit-sum) |
| [3918-check-divisibility-by-digit-sum-and-product](https://github.com/joshnaganja/leetcode/tree/master/3918-check-divisibility-by-digit-sum-and-product) |
<!---LeetCode Topics End-->