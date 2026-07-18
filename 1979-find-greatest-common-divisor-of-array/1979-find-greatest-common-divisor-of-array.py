class Solution:
    def findGCD(self, nums: List[int]) -> int:
        l1=[]
        l2=[]
        l3=[]
        a=max(nums)
        b=min(nums)
        for i in range(1,a+1):
            if a%i==0:
                l1.append(i)
        for i in range(1,b+1):
            if b%i==0:
                l2.append(i)
        for i in l1:
            if i in l2:
                l3.append(i)
        for i in l2:
            if i in l1:
                l3.append(i)
        return max(l3)