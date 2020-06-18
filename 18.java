class Solution {
	public int hIndex(int[] citations) {
		int left = 0,
		right = citations.length - 1;
		int N = citations.length;
		while (left <= right) {
			int h = left + (right - left) / 2;
			if (citations[h] == N - h) return N - h;
			else if (citations[h] > N - h) right = h - 1;
			else left = h + 1;
		}
		return N - left;
	}
}