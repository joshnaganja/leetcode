class Solution {
    public boolean validDigit(int n, int x) {
        String n1=Integer.toString(n);
        String x1=Integer.toString(x);
        if(x1.charAt(0)==n1.charAt(0))
        {
            return false;
        }
        if(n1.contains(x1) && x1.charAt(0)!=n1.charAt(0))
        {
            return true;
        }
        return false;
    }
}