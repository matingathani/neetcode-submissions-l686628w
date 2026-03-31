class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count frequency
        HashMap<Integer , Integer> mn = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            mn.put(nums[i], mn.getOrDefault(nums[i],0)+1);
        }
        // Step 2: Create max heap based on frequency
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b) -> mn.get(b) - mn.get(a)
        );
         // Step 3: Put all numbers from map into heap
        pq.addAll(mn.keySet());

        // Step 4: Take out top k elements
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll();
        }

        return result;
        
    }
}
