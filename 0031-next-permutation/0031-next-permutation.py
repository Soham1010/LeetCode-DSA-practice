class Solution(object):
    def nextPermutation(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """

        pivot = -float('inf')
        i, j = (len(nums)-1), (len(nums)-1)
        target = -float('inf')


        while i>0:
            if nums[i-1] < nums[i]:
                target = i-1
                # found target, find pivot
                while j>=0:
                    if nums[j] > nums[target]:
                        pivot = j
                        break
                    j-=1
                break
            i-=1
        if target == -float('inf') or pivot == -float('inf'):
            nums.reverse()
        else:
            nums[pivot], nums[target] = nums[target], nums[pivot]

            # MINIMAL ADDITION: Reverse everything after target
            left, right = target + 1, len(nums) - 1
            while left < right:
                nums[left], nums[right] = nums[right], nums[left]
                left += 1
                right -= 1