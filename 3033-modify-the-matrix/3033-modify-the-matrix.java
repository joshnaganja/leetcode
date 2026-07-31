class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        for(int j=0;j<matrix[0].length;j++)
        {
            ArrayList<Integer> a=new ArrayList<>();
            for(int i=0;i<matrix.length;i++)
            {
                a.add(matrix[i][j]);
            }
            for(int i=0;i<matrix.length;i++)
            {
                if(matrix[i][j]==-1)
                {
                    matrix[i][j]=Collections.max(a);
                }
            }
        }
        return matrix;
    }
}