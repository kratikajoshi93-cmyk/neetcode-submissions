class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length; i++) {
            set.add(nums[i]);
        }
        int maxLength = 0;

        for(int n : set) {
            if(!set.contains(n-1)) {
                int length = 1;
                while(set.contains(n+1)) {
                    length++;
                    n++;
                }
                maxLength = Math.max(maxLength, length);
            }

        }
        return maxLength;
    }
}
