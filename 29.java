class Solution {
	public int uniquePaths(int m, int n) {
		int grid[][] = new int[m][n];
		int[][] dp = new int[m][n];

		for (int x = 0; x < m; x++) {
			for (int y = 0; y < n; y++) {
				if (x == 0 || y == 0) dp[x][y] = 1;
				else dp[x][y] = dp[x - 1][y] + dp[x][y - 1];
			}
		}
		return dp[m - 1][n - 1];
	}
}