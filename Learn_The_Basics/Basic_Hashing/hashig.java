class Solution {
    public List<List<Integer>> countFrequencies(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();  

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1); 
        }

        List<List<Integer>> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            result.add(Arrays.asList(entry.getKey(), entry.getValue())); 
        }

       
        return result;
    }
}