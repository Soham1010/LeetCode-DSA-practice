class Solution:
    def maxProfit(self, nums):
        # code here
        """
        Var to track::
        lowest val,              than all 
        diff b/w low & high val
        """
        
        l = 0
        
        max_sum = 0
        
        for i in range(len(nums)):
            # Left condition
            if nums[i] < nums[l]:
                l = i
            
            # right condition sum
            curr_sum = nums[i] - nums[l] 
            if curr_sum > max_sum:
                max_sum = curr_sum
                
        return max_sum
                
            
                