class Solution {
    public boolean isBalanced(String num) {
        ArrayList<Integer> a=new ArrayList<>();
        for(char i:num.toCharArray())
        {
            a.add(Integer.valueOf(i-'0'));
        }
        int evensum=0;
        int oddsum=0;
        for(int i=0;i<a.size();i++)
        {
            if(i%2==0)
            {
                evensum+=a.get(i);
            }
            else
            {
                oddsum+=a.get(i);
            }
        }
        return evensum==oddsum?true:false;
    }
}