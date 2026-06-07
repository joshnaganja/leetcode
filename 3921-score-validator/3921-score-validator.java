class Solution {
    public int[] scoreValidator(String[] events) {
        int s=0;
        int c=0;
        for(String i:events)
        {
            if(i.equals("W"))
            {
                c++;
            }
            else if(i.equals("WD"))
            {
                s++;
            }
            else if(i.equals("NB"))
            {
                s++;
            }
            else
            {
                s+=Integer.valueOf(i.charAt(0)-'0');
            }
            if(c>=10)
            {
                break;
            }
        }
        int[] res=new int[2];
        res[0]=s;
        res[1]=c;
        return res;
    }
}