class Solution {

	int[] r;
	int max;
	Random random = new Random();

	public Solution(int[] w) {

		r = new int[w.length];

		int prev = 0;
		for (int i = 0; i < w.length; i++) {

			r[i] = prev + w[i];
			prev = r[i];
		}

		max = prev;
	}

	public int pickIndex() {

		int low = 0;
		int high = this.r.length - 1;
		int target = random.nextInt(this.max) + 1;

		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (this.r[mid] == target) {
				return mid;
			} else if (this.r[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return low;
	}

}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */
