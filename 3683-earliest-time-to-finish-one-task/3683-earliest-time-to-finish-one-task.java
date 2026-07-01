class Solution {
    public int earliestTime(int[][] tasks) {
        int m=Integer.MAX_VALUE;
        for(int i=0;i<tasks.length;i++)
        {
            int m1=tasks[i][0]+tasks[i][1];
            m=Math.min(m,m1);
        }
        return m;
    }
}