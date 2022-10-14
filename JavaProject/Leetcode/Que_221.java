class Solution {
    public int maximalSquare(char[][] matrix) {
        int maxSide = 0;
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return maxSide;
            int rows = matrix.length, columns = matrix[0].length;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    if (matrix[i][j] == '1') {

                        maxSide = Math.max(maxSide, i);
                        int currentMaxSide = Math.min(rows - i, columns - j);
                        for (int k = 1; k < currentMaxSide; k++) {
                            boolean flag = false;
                        }
                        if (matrix[i + k][j + k] == '0') {
                            break;
                        }
                    }
                }
            }
        }

    }
}