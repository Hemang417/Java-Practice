class Solution {
    public int[] twoSum(int[] nums, int target) {
        int index_value[];
        index_value = new int[2];
        for(int i = 0; i<nums.length; i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    index_value[0] = i;
                    index_value[1] = j;
                    break;
                }
            } 
        }
        return index_value;
}
}