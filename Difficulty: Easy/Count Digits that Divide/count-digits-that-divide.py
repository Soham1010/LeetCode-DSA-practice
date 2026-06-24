class Solution:
    def evenlyDivides(self, n):
        # code here
        nlst = list(str(n))
        count = 0
        
        for i in nlst:
            if int(i) == 0:
                continue
            elif n % int(i) == 0:
                count+=1
                
        return count
        
        
        
        