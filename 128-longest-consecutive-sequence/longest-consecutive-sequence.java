class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();

        // Step 1: Add all numbers into HashSet
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        // Step 2: Check every number
        for (int num : set) {

            // Step 3: Find starting number
            if (!set.contains(num - 1)) {

                int current = num;
                int count = 1;

                // Step 4: Find consecutive numbers
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                // Step 5: Store maximum length
                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}