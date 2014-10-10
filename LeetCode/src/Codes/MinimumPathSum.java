package Codes;

public class MinimumPathSum {
	public static void main(String[] args) {
		MinimumPathSum m = new MinimumPathSum();
		int[][] grid = { { 2, 7, 3, 4 }, { 1, 6, 9, 2 }, { 4, 1, 2, 7 },
				{ 6, 6, 1, 4 } };
		System.out.println("the minimum path seems to be: "
				+ m.minPathSum(grid));
	}

	public int minPathSum(int[][] grid) {
		int row = grid.length;
		int col = grid[0].length;
		int[][] ans = new int[row][col];
		for (int i = 0; i < row; i++) {
			System.out.println("\n");
			for (int j = 0; j < col; j++) {
				if ((i - 1) >= 0 && (j - 1) >= 0) {
					ans[i][j] = grid[i][j]
							+ Math.min(ans[i - 1][j], ans[i][j - 1]);
					System.out.print("  [" + i + "]" + " [" + j + "] :"
							+ ans[i][j]);
				} else if ((i - 1) >= 0) {
					ans[i][j] = grid[i][j] + ans[i - 1][j];
					System.out.print("  [" + i + "]" + " [" + j + "] :"
							+ ans[i][j]);
				} else if ((j - 1) >= 0) {
					ans[i][j] = grid[i][j] + ans[i][j - 1];
					System.out.print("  [" + i + "]" + " [" + j + "] :"
							+ ans[i][j]);
				} else {
					ans[i][j] = grid[i][j];
					System.out.print("  [" + i + "]" + " [" + j + "] :"
							+ ans[i][j]);
				}
			}
		}
		System.out.println("\n");
		return ans[row - 1][col - 1];
	}
}
