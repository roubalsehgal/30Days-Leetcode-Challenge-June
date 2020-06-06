class Solution {
	public int[][] reconstructQueue(int[][] people) {
		Arrays.sort(people, (a, b) ->a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);
		List < int[] > res = new ArrayList < >();
		for (int[] p: people) {
			res.add(p[1], p);
		}
		int n = people.length;
		return res.toArray(new int[n][2]);
	}
}