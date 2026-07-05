class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        nums.sort()
        length = len(nums)

        if (nums[0] != 0):
            return 0
        if (nums[length-1] != length):
            return length

        for i in range(1, length):
            if nums[i] - nums[i-1] == 1:
                continue
            else:
                return nums[i]-1
