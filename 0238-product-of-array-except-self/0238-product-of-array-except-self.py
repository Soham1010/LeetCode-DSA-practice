class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        out = [1] * n  # Initialize with 1s to make multiplication seamless

        # Step 1: Calculate Prefix Products
        # out[i] will store the product of all elements to the left of i
        prefix = 1
        for i in range(n):
            out[i] = prefix
            prefix *= nums[i]

        # Step 2: Calculate Postfix Products on the fly
        # Multiply out[i] by the product of all elements to the right of i
        postfix = 1
        for i in range(n - 1, -1, -1):
            out[i] *= postfix
            postfix *= nums[i]

        return out