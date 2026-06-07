class Solution {
    public int minEatingSpeed(int[] piles, int h) {

		int max = Arrays.stream(piles).max().getAsInt();

		int left = 1;
		int right = max;
		int res = max;

		while (left <= right) {

			int mid = (left + right) / 2;

			int hours_taken = Arrays.stream(piles).map(a -> calculateHours(mid, a)).sum();

			if (hours_taken > h) {
				left = mid + 1;
			}

			else if (hours_taken <= h) {
				res = mid;
				right = mid - 1;
			}
		}

		return res;

	}

	public static int calculateHours(int mid, int number) {
		return (number + mid - 1)/mid;
	}

}

