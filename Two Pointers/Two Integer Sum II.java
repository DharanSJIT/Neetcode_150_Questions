class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int left=0;
        int right=n-1;
        while(left<right){
            int value=numbers[left]+numbers[right];
            if(value==target){
                return new int[]{left+1,right+1};
            }
            else if(value<target){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[]{0,0};
    }
}
