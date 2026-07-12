class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n = len(nums)

        actualSum = (n*(n+1))/2
        expectedSum = 0

        for i in range(n):
            expectedSum+=nums[i]

        return int(actualSum-expectedSum)
