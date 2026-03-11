class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int largest = nums[0];
        int smallest = nums[0];
        for(int i=0; i<nums.length; i++){
            if(nums[i]>largest) largest = nums[i];
            if(nums[i]<smallest) smallest = nums[i];
        }
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums) set.add(ele);
        for(int i=smallest ; i<= largest; i++){
            if(!set.contains(i)) ans.add(i);
        }
        return ans;
    }
}