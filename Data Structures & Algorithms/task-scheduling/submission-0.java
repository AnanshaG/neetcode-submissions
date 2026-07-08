class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character, Integer> hash = new HashMap<>();

        for (Character task : tasks) {
            hash.put(task, hash.getOrDefault(task, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for (Integer num : hash.values()) {
            pq.add(num);
        }

        Queue<List<Integer>> q = new LinkedList<>();

        int time = 0;
        do {
            time++;
            System.out.println("time : " + time);
             System.out.println("q : " + q);
             System.out.println("pq : " + pq);
            if (pq.size() != 0) {
                int process = pq.poll();
                if (process > 1) {
                    q.add(Arrays.asList(process - 1, time + n));
                }
            }
            
            if (!q.isEmpty() && q.peek().get(1) == time) {
                pq.add(q.poll().get(0));
            }
            
        } while (q.size() > 0 || pq.size() > 0);

        return time;
    }
}
