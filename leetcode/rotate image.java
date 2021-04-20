class Solution {
    public void rotate(int[][] matrix) {
        // transpose
            for(int i=0;i<matrix.length;i++) {
				for(int j=i;j<matrix[i].length;j++) {
					int temp = matrix[i][j];
					matrix[i][j] = matrix[j][i];
					matrix[j][i] = temp;
				}
			}
      // reverse columns
			for(int i = 0;i<matrix.length;i++) {
				int li = 0, ri = matrix[i].length-1;
				while(li<ri) {
					int temp = matrix[i][li];
					matrix[i][li] = matrix[i][ri];
					matrix[i][ri] = temp;
					li++;
					ri--;
				}
			}
    }
}
