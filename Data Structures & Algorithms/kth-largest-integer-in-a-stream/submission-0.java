class KthLargest {

    PriorityQueue<Integer> queue;
    int topK;

    public KthLargest(int k, int[] nums) {
        queue = new PriorityQueue<>();
        this.topK = k;
        for(int num: nums){
            queue.add(num);
        }
        while(queue.size() > topK){
            queue.poll();
        }
        
    }
    
    public int add(int val) {
        queue.add(val);
        if(queue.size() > topK){
            queue.poll();
        }
        return queue.peek();
        
    }
}
