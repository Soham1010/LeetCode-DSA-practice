class Solution:
    def rearrangeArray(self, nums: List[int]) -> List[int]:
        pa = []
        na = []
        out = []

        p = 0
        n = 0
        for i in range(len(nums)):
            # +ve
            if (nums[i] >= 0):
                pa.append(nums[i])
            else:
                na.append(nums[i])
        
        for i in range(len(pa)):
            out.append(pa[i])
            out.append(na[i])
        return out
