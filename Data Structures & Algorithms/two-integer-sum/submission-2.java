class Solution {
    public int[] twoSum(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            var negMapValue = map.get(target - nums[i]);
            if (negMapValue != null) return new int[] {negMapValue, i};

            map.put(nums[i], i);
        }
        return new int[] {0, 0};
    }
}
