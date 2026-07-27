class Solution {
    public boolean hasDuplicate(int[] nums) {
        var set = new HashSet<Integer>();
        for(int i : nums) {
            if (!set.add(i)) return true;
        }
        return false;
    }
}