class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] r=new int[2];
        int m=Integer.MIN_VALUE;
        for(int i=0;i<mat.length;i++)
        {
            int c=0;
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[i][j]==1)
                {
                    c++;
                }
            }
            m=Math.max(m,c);
        }
        for(int i=0;i<mat.length;i++)
        {
            int c=0;
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[i][j]==1)
                {
                    c++;
                }
            }
            if(c==m)
            {
                r[0]=i;
                break;
            }
        }
        r[1]=m;
        return r;
    }
}