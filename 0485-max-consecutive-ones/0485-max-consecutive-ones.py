class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        ## 3c clarify, communicat, code.
        # 0,  1, 0, , , , 
        # , , , , , , 1 0 

        high, streak, = 0, 0
        for num in nums:
            if num == 1:
                streak += 1
            else:
                # We hit a 0, so record the streak if it's the highest, then reset
                high = max(high, streak)
                streak = 0
                
        # One last check in case the array ended on a streak of 1s
        return max(high, streak)                        





