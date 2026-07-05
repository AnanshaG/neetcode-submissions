class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        for(int num: nums){
            q.add(num);
        }

        int i = 1;
        while(i < k){
            q.poll();
            i++;
        }

        return q.poll();

    }
}
