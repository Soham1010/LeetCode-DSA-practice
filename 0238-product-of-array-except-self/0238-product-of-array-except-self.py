class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        out = [0] * n

        prod = 1
        post = nums[n-1]
        # presum
        for i in range(n):
            if i == 0:
                out[0] = nums[0]
            else:
                out[i] = out[i-1] * nums[i]
        
        # postsum
        for i in range(n-1, -1, -1):
            # Extremes pe 1
            # else index, prefix-1, postfix+1
            if (i==0) :
                out[0] = 1 * post
            elif (i==n-1) :
                out[n-1] = out[i-1] * 1 
            else:
                # Normally
                out[i] = out[i-1] * post
                post *= nums[i]
        
        return out
                