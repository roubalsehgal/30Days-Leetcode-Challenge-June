class Solution {
	public String getPermutation(int n, int k) {
		StringBuilder sb = new StringBuilder("");
		List < Integer > num = new ArrayList < Integer > ();
		for (int i = 1; i <= n; i++)
		num.add(i);
		int factorial = 1;
		for (int i = 1; i <= n - 1; i++)
		factorial *= i;
		k = k - 1;
		for (int i = 1; i < n; i++) {
			if (k == 0) break;
			int index = k / factorial;
			k %= factorial;
			factorial /= (n - i);
			sb.append(num.get(index));
			num.remove(index);
		}
		for (int i = 0; i < num.size(); i++)
		sb.append(num.get(i));
		return sb.toString();
	}
}