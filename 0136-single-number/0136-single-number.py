from collections import defaultdict

class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        """
        1. Create a H.Map
        2. Store elements -> occurances
        3. Another pass to check occurances
        """

        hmap = defaultdict(int)
        length = len(nums)

        for i in nums:
            hmap[i] += 1

        for i in nums:
            if hmap[i] <2:
                return i
        return -1

        