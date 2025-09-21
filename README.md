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
| [2542-average-value-of-even-numbers-that-are-divisible-by-three](https://github.com/joshnaganja/leetcode/tree/master/2542-average-value-of-even-numbers-that-are-divisible-by-three) |
| [2630-alternating-digit-sum](https://github.com/joshnaganja/leetcode/tree/master/2630-alternating-digit-sum) |
| [3371-harshad-number](https://github.com/joshnaganja/leetcode/tree/master/3371-harshad-number) |
| [3914-check-if-any-element-has-prime-frequency](https://github.com/joshnaganja/leetcode/tree/master/3914-check-if-any-element-has-prime-frequency) |
| [3918-check-divisibility-by-digit-sum-and-product](https://github.com/joshnaganja/leetcode/tree/master/3918-check-divisibility-by-digit-sum-and-product) |
## Array
|  |
| ------- |
| [2542-average-value-of-even-numbers-that-are-divisible-by-three](https://github.com/joshnaganja/leetcode/tree/master/2542-average-value-of-even-numbers-that-are-divisible-by-three) |
| [3914-check-if-any-element-has-prime-frequency](https://github.com/joshnaganja/leetcode/tree/master/3914-check-if-any-element-has-prime-frequency) |
## Hash Table
|  |
| ------- |
| [3914-check-if-any-element-has-prime-frequency](https://github.com/joshnaganja/leetcode/tree/master/3914-check-if-any-element-has-prime-frequency) |
## Counting
|  |
| ------- |
| [3914-check-if-any-element-has-prime-frequency](https://github.com/joshnaganja/leetcode/tree/master/3914-check-if-any-element-has-prime-frequency) |
## Number Theory
|  |
| ------- |
| [3914-check-if-any-element-has-prime-frequency](https://github.com/joshnaganja/leetcode/tree/master/3914-check-if-any-element-has-prime-frequency) |
<!---LeetCode Topics End-->