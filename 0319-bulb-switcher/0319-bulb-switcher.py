class Solution:
    def bulbSwitch(self, n: int) -> int:
        count = 0

        i = 1

        while (i*i<=n) :
            i+=1
            count+=1
        return count