
public class UpdateMatrix {

	public int[][] updateMatrix(int[][] mat) {
	     
		int count = 0;
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[0].length; i++) {
				if(mat[i][j] == 1) {
					mat[i][j] = -1;
					count++;
				}
			}
		}
		
		int x = 0;
		
		while(count > 0) {
			for(int i = 0; i < mat.length; i++) {
				for(int j = 0; j < mat[0].length; j++) {
					if(mat[i][j] == x) {
						if(isValid(mat, i + 1, j) && mat[i+1][j] == -1) {
							mat[i+1][j] = x + 1;
							count--;
						}
						if(isValid(mat, i - 1, j) && mat[i-1][j] == -1) {
							mat[i-1][j] = x + 1;
							count--;
						}
						if(isValid(mat, i, j + 1) && mat[i][j+1] == -1) {
							mat[i][j+1] = x + 1;
							count--;
						}
						if(isValid(mat, i, j - 1) && mat[i][j-1] == -1) {
							mat[i][j-1] = x + 1;
							count--;
						}
					}
				}
			}
			
			x++;
		}
		
		return mat;
	}
	
	private boolean isValid(int[][] mat, int i, int j) {
		return (i >= 0 && i < mat.length && j >= 0 && j < mat[0].length);
	}
}
