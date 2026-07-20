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
| [1742-maximum-number-of-balls-in-a-box](https://github.com/joshnaganja/leetcode/tree/master/1742-maximum-number-of-balls-in-a-box) |
| [1903-largest-odd-number-in-string](https://github.com/joshnaganja/leetcode/tree/master/1903-largest-odd-number-in-string) |
| [1965-sum-of-digits-in-base-k](https://github.com/joshnaganja/leetcode/tree/master/1965-sum-of-digits-in-base-k) |
| [1979-find-greatest-common-divisor-of-array](https://github.com/joshnaganja/leetcode/tree/master/1979-find-greatest-common-divisor-of-array) |
| [2083-three-divisors](https://github.com/joshnaganja/leetcode/tree/master/2083-three-divisors) |
| [2542-average-value-of-even-numbers-that-are-divisible-by-three](https://github.com/joshnaganja/leetcode/tree/master/2542-average-value-of-even-numbers-that-are-divisible-by-three) |
| [2630-alternating-digit-sum](https://github.com/joshnaganja/leetcode/tree/master/2630-alternating-digit-sum) |
| [2739-total-distance-traveled](https://github.com/joshnaganja/leetcode/tree/master/2739-total-distance-traveled) |
| [2824-check-if-the-number-is-fascinating](https://github.com/joshnaganja/leetcode/tree/master/2824-check-if-the-number-is-fascinating) |
| [3280-convert-date-to-binary](https://github.com/joshnaganja/leetcode/tree/master/3280-convert-date-to-binary) |
| [3300-minimum-element-after-replacement-with-digit-sum](https://github.com/joshnaganja/leetcode/tree/master/3300-minimum-element-after-replacement-with-digit-sum) |
| [3371-harshad-number](https://github.com/joshnaganja/leetcode/tree/master/3371-harshad-number) |
| [3492-maximum-containers-on-a-ship](https://github.com/joshnaganja/leetcode/tree/master/3492-maximum-containers-on-a-ship) |
| [3516-find-closest-person](https://github.com/joshnaganja/leetcode/tree/master/3516-find-closest-person) |
| [3536-maximum-product-of-two-digits](https://github.com/joshnaganja/leetcode/tree/master/3536-maximum-product-of-two-digits) |
| [3618-split-array-by-prime-indices](https://github.com/joshnaganja/leetcode/tree/master/3618-split-array-by-prime-indices) |
| [3663-find-the-least-frequent-digit](https://github.com/joshnaganja/leetcode/tree/master/3663-find-the-least-frequent-digit) |
| [3676-smallest-number-with-all-set-bits](https://github.com/joshnaganja/leetcode/tree/master/3676-smallest-number-with-all-set-bits) |
| [3697-compute-decimal-representation](https://github.com/joshnaganja/leetcode/tree/master/3697-compute-decimal-representation) |
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
| [1979-find-greatest-common-divisor-of-array](https://github.com/joshnaganja/leetcode/tree/master/1979-find-greatest-common-divisor-of-array) |
| [2542-average-value-of-even-numbers-that-are-divisible-by-three](https://github.com/joshnaganja/leetcode/tree/master/2542-average-value-of-even-numbers-that-are-divisible-by-three) |
| [2643-row-with-maximum-ones](https://github.com/joshnaganja/leetcode/tree/master/2643-row-with-maximum-ones) |
| [2644-find-the-maximum-divisibility-score](https://github.com/joshnaganja/leetcode/tree/master/2644-find-the-maximum-divisibility-score) |
| [3295-report-spam-message](https://github.com/joshnaganja/leetcode/tree/master/3295-report-spam-message) |
| [3300-minimum-element-after-replacement-with-digit-sum](https://github.com/joshnaganja/leetcode/tree/master/3300-minimum-element-after-replacement-with-digit-sum) |
| [3364-minimum-positive-sum-subarray](https://github.com/joshnaganja/leetcode/tree/master/3364-minimum-positive-sum-subarray) |
| [3618-split-array-by-prime-indices](https://github.com/joshnaganja/leetcode/tree/master/3618-split-array-by-prime-indices) |
| [3663-find-the-least-frequent-digit](https://github.com/joshnaganja/leetcode/tree/master/3663-find-the-least-frequent-digit) |
| [3668-restore-finishing-order](https://github.com/joshnaganja/leetcode/tree/master/3668-restore-finishing-order) |
| [3678-smallest-absent-positive-greater-than-average](https://github.com/joshnaganja/leetcode/tree/master/3678-smallest-absent-positive-greater-than-average) |
| [3683-earliest-time-to-finish-one-task](https://github.com/joshnaganja/leetcode/tree/master/3683-earliest-time-to-finish-one-task) |
| [3688-bitwise-or-of-even-numbers-in-an-array](https://github.com/joshnaganja/leetcode/tree/master/3688-bitwise-or-of-even-numbers-in-an-array) |
| [3697-compute-decimal-representation](https://github.com/joshnaganja/leetcode/tree/master/3697-compute-decimal-representation) |
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
| [1742-maximum-number-of-balls-in-a-box](https://github.com/joshnaganja/leetcode/tree/master/1742-maximum-number-of-balls-in-a-box) |
| [2824-check-if-the-number-is-fascinating](https://github.com/joshnaganja/leetcode/tree/master/2824-check-if-the-number-is-fascinating) |
| [3083-existence-of-a-substring-in-a-string-and-its-reverse](https://github.com/joshnaganja/leetcode/tree/master/3083-existence-of-a-substring-in-a-string-and-its-reverse) |
| [3295-report-spam-message](https://github.com/joshnaganja/leetcode/tree/master/3295-report-spam-message) |
| [3442-maximum-difference-between-even-and-odd-frequency-i](https://github.com/joshnaganja/leetcode/tree/master/3442-maximum-difference-between-even-and-odd-frequency-i) |
| [3541-find-most-frequent-vowel-and-consonant](https://github.com/joshnaganja/leetcode/tree/master/3541-find-most-frequent-vowel-and-consonant) |
| [3663-find-the-least-frequent-digit](https://github.com/joshnaganja/leetcode/tree/master/3663-find-the-least-frequent-digit) |
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
| [1742-maximum-number-of-balls-in-a-box](https://github.com/joshnaganja/leetcode/tree/master/1742-maximum-number-of-balls-in-a-box) |
| [3442-maximum-difference-between-even-and-odd-frequency-i](https://github.com/joshnaganja/leetcode/tree/master/3442-maximum-difference-between-even-and-odd-frequency-i) |
| [3541-find-most-frequent-vowel-and-consonant](https://github.com/joshnaganja/leetcode/tree/master/3541-find-most-frequent-vowel-and-consonant) |
| [3663-find-the-least-frequent-digit](https://github.com/joshnaganja/leetcode/tree/master/3663-find-the-least-frequent-digit) |
| [3712-sum-of-elements-with-frequency-divisible-by-k](https://github.com/joshnaganja/leetcode/tree/master/3712-sum-of-elements-with-frequency-divisible-by-k) |
| [3866-first-unique-even-element](https://github.com/joshnaganja/leetcode/tree/master/3866-first-unique-even-element) |
| [3914-check-if-any-element-has-prime-frequency](https://github.com/joshnaganja/leetcode/tree/master/3914-check-if-any-element-has-prime-frequency) |
## Number Theory
|  |
| ------- |
| [1979-find-greatest-common-divisor-of-array](https://github.com/joshnaganja/leetcode/tree/master/1979-find-greatest-common-divisor-of-array) |
| [2083-three-divisors](https://github.com/joshnaganja/leetcode/tree/master/2083-three-divisors) |
| [3618-split-array-by-prime-indices](https://github.com/joshnaganja/leetcode/tree/master/3618-split-array-by-prime-indices) |
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
| [3688-bitwise-or-of-even-numbers-in-an-array](https://github.com/joshnaganja/leetcode/tree/master/3688-bitwise-or-of-even-numbers-in-an-array) |
## String
|  |
| ------- |
| [0824-goat-latin](https://github.com/joshnaganja/leetcode/tree/master/0824-goat-latin) |
| [1903-largest-odd-number-in-string](https://github.com/joshnaganja/leetcode/tree/master/1903-largest-odd-number-in-string) |
| [3083-existence-of-a-substring-in-a-string-and-its-reverse](https://github.com/joshnaganja/leetcode/tree/master/3083-existence-of-a-substring-in-a-string-and-its-reverse) |
| [3280-convert-date-to-binary](https://github.com/joshnaganja/leetcode/tree/master/3280-convert-date-to-binary) |
| [3295-report-spam-message](https://github.com/joshnaganja/leetcode/tree/master/3295-report-spam-message) |
| [3340-check-balanced-string](https://github.com/joshnaganja/leetcode/tree/master/3340-check-balanced-string) |
| [3442-maximum-difference-between-even-and-odd-frequency-i](https://github.com/joshnaganja/leetcode/tree/master/3442-maximum-difference-between-even-and-odd-frequency-i) |
| [3498-reverse-degree-of-a-string](https://github.com/joshnaganja/leetcode/tree/master/3498-reverse-degree-of-a-string) |
| [3541-find-most-frequent-vowel-and-consonant](https://github.com/joshnaganja/leetcode/tree/master/3541-find-most-frequent-vowel-and-consonant) |
| [3582-generate-tag-for-video-caption](https://github.com/joshnaganja/leetcode/tree/master/3582-generate-tag-for-video-caption) |
| [3612-process-string-with-special-operations-i](https://github.com/joshnaganja/leetcode/tree/master/3612-process-string-with-special-operations-i) |
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
| [3498-reverse-degree-of-a-string](https://github.com/joshnaganja/leetcode/tree/master/3498-reverse-degree-of-a-string) |
| [3582-generate-tag-for-video-caption](https://github.com/joshnaganja/leetcode/tree/master/3582-generate-tag-for-video-caption) |
| [3612-process-string-with-special-operations-i](https://github.com/joshnaganja/leetcode/tree/master/3612-process-string-with-special-operations-i) |
| [3688-bitwise-or-of-even-numbers-in-an-array](https://github.com/joshnaganja/leetcode/tree/master/3688-bitwise-or-of-even-numbers-in-an-array) |
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
| [3536-maximum-product-of-two-digits](https://github.com/joshnaganja/leetcode/tree/master/3536-maximum-product-of-two-digits) |
| [3774-absolute-difference-between-maximum-and-minimum-k-elements](https://github.com/joshnaganja/leetcode/tree/master/3774-absolute-difference-between-maximum-and-minimum-k-elements) |
| [3842-toggle-light-bulbs](https://github.com/joshnaganja/leetcode/tree/master/3842-toggle-light-bulbs) |
## Matrix
|  |
| ------- |
| [2643-row-with-maximum-ones](https://github.com/joshnaganja/leetcode/tree/master/2643-row-with-maximum-ones) |
## Sliding Window
|  |
| ------- |
| [3364-minimum-positive-sum-subarray](https://github.com/joshnaganja/leetcode/tree/master/3364-minimum-positive-sum-subarray) |
## Prefix Sum
|  |
| ------- |
| [3364-minimum-positive-sum-subarray](https://github.com/joshnaganja/leetcode/tree/master/3364-minimum-positive-sum-subarray) |
<!---LeetCode Topics End-->