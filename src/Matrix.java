class Matrix {
	
    public int[][] updateMatrix(int[][] mat) {
        
        //dp
        int n = mat.length, m = mat[0].length;
        
        if(n == 0 || m == 0)
            return mat;
        
        int[][] dis = new int[n][m];
        int range = n * m;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                
                if(mat[i][j] == 0)
                    dis[i][j] = 0;
                else{
                    int up = (i > 0) ? dis[i - 1][j] : range;
                    int left = (j > 0) ? dis[i][j - 1] : range;
                    dis[i][j] = Math.min(up, left) + 1;
                }
            }
        }
        
        for(int i = n - 1; i >= 0; i--){
            for(int j = m - 1; j >= 0; j--){
                
                if(mat[i][j] == 0)
                    dis[i][j] = 0;
                else{
                    int down = (i < n - 1) ? dis[i+1][j] : range;
                    int right = (j < m - 1) ? dis[i][j+1] : range;
                    dis[i][j] = Math.min(Math.min(down, right) + 1, dis[i][j]);
                }
            }
        }
        
        return dis;
    }
}