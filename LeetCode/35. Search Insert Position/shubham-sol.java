class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int start, end, mid, res = 0;
        start = 0;
        end = nums.length - 1;
        
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target) {
                start = mid + 1;
                res = mid + 1;
            }
            else {
                end = mid - 1;
                res = mid;
            }
        }
        return res;
    }
}