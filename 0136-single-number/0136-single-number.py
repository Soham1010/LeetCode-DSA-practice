from collections import defaultdict

class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        """
        Efficient Bit manupulation
        """
        result = 0
        for i in nums:
            result ^= i
        return result
            