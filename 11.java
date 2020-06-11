class Solution {
	public void sortColors(int[] nums) {
		int low = 0,
		mid = 0;
		int high = nums.length - 1;

		while (mid <= high) {
			if (nums[mid] == 0) {
				swap(nums, low++, mid++);
			} else if (nums[mid] == 2) {
				swap(nums, mid, high--);
			} else {
				mid++;
			}
		}
	}

	private void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}