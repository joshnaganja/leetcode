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
| [2739-total-distance-traveled](https://github.com/joshnaganja/leetcode/tree/master/2739-total-distance-traveled) |
| [2824-check-if-the-number-is-fascinating](https://github.com/joshnaganja/leetcode/tree/master/2824-check-if-the-number-is-fascinating) |
| [3371-harshad-number](https://github.com/joshnaganja/leetcode/tree/master/3371-harshad-number) |
| [3676-smallest-number-with-all-set-bits](https://github.com/joshnaganja/leetcode/tree/master/3676-smallest-number-with-all-set-bits) |
| [3726-remove-zeros-in-decimal-representation](https://github.com/joshnaganja/leetcode/tree/master/3726-remove-zeros-in-decimal-representation) |
| [3754-concatenate-non-zero-digits-and-multiply-by-sum-i](https://github.com/joshnaganja/leetcode/tree/master/3754-concatenate-non-zero-digits-and-multiply-by-sum-i) |
| [3783-mirror-distance-of-an-integer](https://github.com/joshnaganja/leetcode/tree/master/3783-mirror-distance-of-an-integer) |
| [3870-count-commas-in-range](https://github.com/joshnaganja/leetcode/tree/master/3870-count-commas-in-range) |
| [3894-traffic-signal-color](https://github.com/joshnaganja/leetcode/tree/master/3894-traffic-signal-color) |
| [3908-valid-digit-number](https://github.com/joshnaganja/leetcode/tree/master/3908-valid-digit-number) |
| [3914-check-if-any-element-has-prime-frequency](https://github.com/joshnaganja/leetcode/tree/master/3914-check-if-any-element-has-prime-frequency) |
| [3918-check-divisibility-by-digit-sum-and-product](https://github.com/joshnaganja/leetcode/tree/master/3918-check-divisibility-by-digit-sum-and-product) |
| [3995-gcd-of-odd-and-even-sums](https://github.com/joshnaganja/leetcode/tree/master/3995-gcd-of-odd-and-even-sums) |
## Array
|  |
| ------- |
| [2542-average-value-of-even-numbers-that-are-divisible-by-three](https://github.com/joshnaganja/leetcode/tree/master/2542-average-value-of-even-numbers-that-are-divisible-by-three) |
| [2644-find-the-maximum-divisibility-score](https://github.com/joshnaganja/leetcode/tree/master/2644-find-the-maximum-divisibility-score) |
| [3668-restore-finishing-order](https://github.com/joshnaganja/leetcode/tree/master/3668-restore-finishing-order) |
| [3678-smallest-absent-positive-greater-than-average](https://github.com/joshnaganja/leetcode/tree/master/3678-smallest-absent-positive-greater-than-average) |
| [3683-earliest-time-to-finish-one-task](https://github.com/joshnaganja/leetcode/tree/master/3683-earliest-time-to-finish-one-task) |
| [3712-sum-of-elements-with-frequency-divisible-by-k](https://github.com/joshnaganja/leetcode/tree/master/3712-sum-of-elements-with-frequency-divisible-by-k) |
| [3718-smallest-missing-multiple-of-k](https://github.com/joshnaganja/leetcode/tree/master/3718-smallest-missing-multiple-of-k) |
| [3774-absolute-difference-between-maximum-and-minimum-k-elements](https://github.com/joshnaganja/leetcode/tree/master/3774-absolute-difference-between-maximum-and-minimum-k-elements) |
| [3833-count-dominant-indices](https://github.com/joshnaganja/leetcode/tree/master/3833-count-dominant-indices) |
| [3842-toggle-light-bulbs](https://github.com/joshnaganja/leetcode/tree/master/3842-toggle-light-bulbs) |
| [3866-first-unique-even-element](https://github.com/joshnaganja/leetcode/tree/master/3866-first-unique-even-element) |
| [3914-check-if-any-element-has-prime-frequency](https://github.com/joshnaganja/leetcode/tree/master/3914-check-if-any-element-has-prime-frequency) |
| [3921-score-validator](https://github.com/joshnaganja/leetcode/tree/master/3921-score-validator) |
| [3925-concatenate-array-with-reverse](https://github.com/joshnaganja/leetcode/tree/master/3925-concatenate-array-with-reverse) |
## Hash Table
|  |
| ------- |
| [2824-check-if-the-number-is-fascinating](https://github.com/joshnaganja/leetcode/tree/master/2824-check-if-the-number-is-fascinating) |
| [3668-restore-finishing-order](https://github.com/joshnaganja/leetcode/tree/master/3668-restore-finishing-order) |
| [3678-smallest-absent-positive-greater-than-average](https://github.com/joshnaganja/leetcode/tree/master/3678-smallest-absent-positive-greater-than-average) |
| [3712-sum-of-elements-with-frequency-divisible-by-k](https://github.com/joshnaganja/leetcode/tree/master/3712-sum-of-elements-with-frequency-divisible-by-k) |
| [3718-smallest-missing-multiple-of-k](https://github.com/joshnaganja/leetcode/tree/master/3718-smallest-missing-multiple-of-k) |
| [3842-toggle-light-bulbs](https://github.com/joshnaganja/leetcode/tree/master/3842-toggle-light-bulbs) |
| [3866-first-unique-even-element](https://github.com/joshnaganja/leetcode/tree/master/3866-first-unique-even-element) |
| [3914-check-if-any-element-has-prime-frequency](https://github.com/joshnaganja/leetcode/tree/master/3914-check-if-any-element-has-prime-frequency) |
## Counting
|  |
| ------- |
| [3712-sum-of-elements-with-frequency-divisible-by-k](https://github.com/joshnaganja/leetcode/tree/master/3712-sum-of-elements-with-frequency-divisible-by-k) |
| [3866-first-unique-even-element](https://github.com/joshnaganja/leetcode/tree/master/3866-first-unique-even-element) |
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
| [3833-count-dominant-indices](https://github.com/joshnaganja/leetcode/tree/master/3833-count-dominant-indices) |
## Bit Manipulation
|  |
| ------- |
| [3676-smallest-number-with-all-set-bits](https://github.com/joshnaganja/leetcode/tree/master/3676-smallest-number-with-all-set-bits) |
## String
|  |
| ------- |
| [1903-largest-odd-number-in-string](https://github.com/joshnaganja/leetcode/tree/master/1903-largest-odd-number-in-string) |
| [3794-reverse-string-prefix](https://github.com/joshnaganja/leetcode/tree/master/3794-reverse-string-prefix) |
| [3813-vowel-consonant-score](https://github.com/joshnaganja/leetcode/tree/master/3813-vowel-consonant-score) |
| [3856-trim-trailing-vowels](https://github.com/joshnaganja/leetcode/tree/master/3856-trim-trailing-vowels) |
| [3884-first-matching-character-from-both-ends](https://github.com/joshnaganja/leetcode/tree/master/3884-first-matching-character-from-both-ends) |
| [3894-traffic-signal-color](https://github.com/joshnaganja/leetcode/tree/master/3894-traffic-signal-color) |
| [3921-score-validator](https://github.com/joshnaganja/leetcode/tree/master/3921-score-validator) |
| [3931-check-adjacent-digit-differences](https://github.com/joshnaganja/leetcode/tree/master/3931-check-adjacent-digit-differences) |
## Greedy
|  |
| ------- |
| [1903-largest-odd-number-in-string](https://github.com/joshnaganja/leetcode/tree/master/1903-largest-odd-number-in-string) |
## Database
|  |
| ------- |
| [0175-combine-two-tables](https://github.com/joshnaganja/leetcode/tree/master/0175-combine-two-tables) |
| [0182-duplicate-emails](https://github.com/joshnaganja/leetcode/tree/master/0182-duplicate-emails) |
## Simulation
|  |
| ------- |
| [2739-total-distance-traveled](https://github.com/joshnaganja/leetcode/tree/master/2739-total-distance-traveled) |
| [3726-remove-zeros-in-decimal-representation](https://github.com/joshnaganja/leetcode/tree/master/3726-remove-zeros-in-decimal-representation) |
| [3813-vowel-consonant-score](https://github.com/joshnaganja/leetcode/tree/master/3813-vowel-consonant-score) |
| [3842-toggle-light-bulbs](https://github.com/joshnaganja/leetcode/tree/master/3842-toggle-light-bulbs) |
| [3894-traffic-signal-color](https://github.com/joshnaganja/leetcode/tree/master/3894-traffic-signal-color) |
| [3921-score-validator](https://github.com/joshnaganja/leetcode/tree/master/3921-score-validator) |
| [3925-concatenate-array-with-reverse](https://github.com/joshnaganja/leetcode/tree/master/3925-concatenate-array-with-reverse) |
## Two Pointers
|  |
| ------- |
| [3794-reverse-string-prefix](https://github.com/joshnaganja/leetcode/tree/master/3794-reverse-string-prefix) |
| [3884-first-matching-character-from-both-ends](https://github.com/joshnaganja/leetcode/tree/master/3884-first-matching-character-from-both-ends) |
## Sorting
|  |
| ------- |
| [3774-absolute-difference-between-maximum-and-minimum-k-elements](https://github.com/joshnaganja/leetcode/tree/master/3774-absolute-difference-between-maximum-and-minimum-k-elements) |
| [3842-toggle-light-bulbs](https://github.com/joshnaganja/leetcode/tree/master/3842-toggle-light-bulbs) |
<!---LeetCode Topics End-->