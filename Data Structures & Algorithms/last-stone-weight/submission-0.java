class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        for(int stone: stones){
            q.add(stone);
        }

        while(q.size() > 1){
            System.out.println(q);
            int stone1 = q.poll();
            int stone2 = q.poll();

            if(!(stone1 - stone2 == 0)){
                q.add(stone1 - stone2);
            }
            System.out.println(q + "after");
        
        }
        
        return q.size() == 0 ? 0 : q.poll();
        
    }
}
