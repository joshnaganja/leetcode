class Solution {
    public int smallestNumber(int n) {
        int tb=Integer.toBinaryString(n).length();
        int sb=Integer.bitCount(n);
        while(tb!=sb)
        {
            n++;
            tb=Integer.toBinaryString(n).length();
            sb=Integer.bitCount(n);
        }
        return n;
    }
}