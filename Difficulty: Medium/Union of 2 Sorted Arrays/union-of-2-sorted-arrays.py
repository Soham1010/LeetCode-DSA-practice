class Solution:
    def findUnion(self, a, b):
        # code here 
        seta = set(a)
        setb = set(b)
        
        return sorted(list(seta | setb))
        