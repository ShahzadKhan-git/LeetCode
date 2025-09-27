class Solution {
    public int missingNumber(int[] nums) {
        int Xor1=0;
        int Xor2=0;
        for(int i=0; i<nums.length; i++){
            Xor1 = Xor1 ^ nums[i];
            Xor2 = Xor2 ^ (i+1);
        }
       

        return (Xor1^Xor2);
    }
}