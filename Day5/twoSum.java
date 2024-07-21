class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l=nums.length;
        for(int diff=1;diff<l;diff++)
        {
            for(int r=diff;r<l;r++){
                int l=r-diff;
                if(nums[l]+nums[r]==target)
                return new int[]{l,r};
            }
        }
    return new int[0];
    }
}
