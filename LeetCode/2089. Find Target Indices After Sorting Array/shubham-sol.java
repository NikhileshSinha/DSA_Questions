class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int i, j, val;
        // sort the array
        for (i = 1; i < nums.length; i++) {
            val = nums[i];
            j = i - 1;
            while (j >= 0 && nums[j] > val)
                nums[j + 1] = nums[j--];
            nums[j + 1] = val;
        }
        // declare the resulting array
        List<Integer> res = new ArrayList<Integer>();
        // add index of matching elements
        for (i = 0; i  < nums.length; i++)
            if (nums[i] == target) res.add(i);

        return res;
    }
}