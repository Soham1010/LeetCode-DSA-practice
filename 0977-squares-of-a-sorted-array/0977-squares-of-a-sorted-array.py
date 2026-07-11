class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        n = len(nums)
        # Pre-allocate the list to avoid reversing it later
        res = [0] * n  
        
        l, r = 0, n - 1
        # Fill the result array from back to front (largest to smallest)
        for i in range(n - 1, -1, -1):
            if abs(nums[l]) > abs(nums[r]):
                res[i] = nums[l] ** 2
                l += 1
            else:
                res[i] = nums[r] ** 2
                r -= 1
                
        return res