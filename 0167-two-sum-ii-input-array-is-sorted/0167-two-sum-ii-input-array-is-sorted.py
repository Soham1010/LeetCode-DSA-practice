class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        # Two Pointer
        # 9
        # l = 2, r = 15, 9-2 = 7, move right, 9-15 = -6, move left, 

        l, r = 0, len(numbers)-1

        while l<=r:
            sum = numbers[l] + numbers[r]

            if (sum<target) :
                l+=1
            elif (sum>target) :
                r-=1
            
            else :
                return [l+1, r+1]
            
        return []
