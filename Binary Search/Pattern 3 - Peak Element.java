class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while(low < high){
            int mid = low + (high - low) /2;

            if(nums[mid] < nums[mid + 1]){
                low = mid + 1;
            }
            else{
                high = mid; // Peak is mid or on the left side
            }

        }
        return low; // When loop ends, low == high → peak index
    }
}

//Time Complexity - O(log n)
//Space Complexity - O(1)
