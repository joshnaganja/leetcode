class Solution {
    public String largestOddNumber(String num) {
        String res="";
        int z=-1;
        for(int i=num.length()-1;i>=0;i--)
        {
            int k=Integer.parseInt(num.charAt(i)+"");
            if(k%2!=0)
            {
                z=i;
                break;
            }
        }
        for(int i=0;i<z+1;i++)
        {
            res+=num.charAt(i);
        }
        return res;
    }
}