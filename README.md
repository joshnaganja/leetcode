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
| [1903-largest-odd-number-in-string](https://github.com/joshnaganja/leetcode/tree/master/1903-largest-odd-number-in-string) |
| [1965-sum-of-digits-in-base-k](https://github.com/joshnaganja/leetcode/tree/master/1965-sum-of-digits-in-base-k) |
| [2083-three-divisors](https://github.com/joshnaganja/leetcode/tree/master/2083-three-divisors) |
| [2542-average-value-of-even-numbers-that-are-divisible-by-three](https://github.com/joshnaganja/leetcode/tree/master/2542-average-value-of-even-numbers-that-are-divisible-by-three) |
| [2630-alternating-digit-sum](https://github.com/joshnaganja/leetcode/tree/master/2630-alternating-digit-sum) |
| [2824-check-if-the-number-is-fascinating](https://github.com/joshnaganja/leetcode/tree/master/2824-check-if-the-number-is-fascinating) |
| [3371-harshad-number](https://github.com/joshnaganja/leetcode/tree/master/3371-harshad-number) |
| [3676-smallest-number-with-all-set-bits](https://github.com/joshnaganja/leetcode/tree/master/3676-smallest-number-with-all-set-bits) |
| [3914-check-if-any-element-has-prime-frequency](https://github.com/joshnaganja/leetcode/tree/master/3914-check-if-any-element-has-prime-frequency) |
| [3918-check-divisibility-by-digit-sum-and-product](https://github.com/joshnaganja/leetcode/tree/master/3918-check-divisibility-by-digit-sum-and-product) |
| [3995-gcd-of-odd-and-even-sums](https://github.com/joshnaganja/leetcode/tree/master/3995-gcd-of-odd-and-even-sums) |
## Array
|  |
| ------- |
| [2542-average-value-of-even-numbers-that-are-divisible-by-three](https://github.com/joshnaganja/leetcode/tree/master/2542-average-value-of-even-numbers-that-are-divisible-by-three) |
| [3914-check-if-any-element-has-prime-frequency](https://github.com/joshnaganja/leetcode/tree/master/3914-check-if-any-element-has-prime-frequency) |
## Hash Table
|  |
| ------- |
| [2824-check-if-the-number-is-fascinating](https://github.com/joshnaganja/leetcode/tree/master/2824-check-if-the-number-is-fascinating) |
| [3914-check-if-any-element-has-prime-frequency](https://github.com/joshnaganja/leetcode/tree/master/3914-check-if-any-element-has-prime-frequency) |
## Counting
|  |
| ------- |
| [3914-check-if-any-element-has-prime-frequency](https://github.com/joshnaganja/leetcode/tree/master/3914-check-if-any-element-has-prime-frequency) |
## Number Theory
|  |
| ------- |
| [2083-three-divisors](https://github.com/joshnaganja/leetcode/tree/master/2083-three-divisors) |
| [3914-check-if-any-element-has-prime-frequency](https://github.com/joshnaganja/leetcode/tree/master/3914-check-if-any-element-has-prime-frequency) |
| [3995-gcd-of-odd-and-even-sums](https://github.com/joshnaganja/leetcode/tree/master/3995-gcd-of-odd-and-even-sums) |
## Enumeration
|  |
| ------- |
| [2083-three-divisors](https://github.com/joshnaganja/leetcode/tree/master/2083-three-divisors) |
## Bit Manipulation
|  |
| ------- |
| [3676-smallest-number-with-all-set-bits](https://github.com/joshnaganja/leetcode/tree/master/3676-smallest-number-with-all-set-bits) |
## String
|  |
| ------- |
| [1903-largest-odd-number-in-string](https://github.com/joshnaganja/leetcode/tree/master/1903-largest-odd-number-in-string) |
## Greedy
|  |
| ------- |
| [1903-largest-odd-number-in-string](https://github.com/joshnaganja/leetcode/tree/master/1903-largest-odd-number-in-string) |
## Database
|  |
| ------- |
| [0175-combine-two-tables](https://github.com/joshnaganja/leetcode/tree/master/0175-combine-two-tables) |
<!---LeetCode Topics End-->