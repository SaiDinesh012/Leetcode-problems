#User function Template for python3

class Solution:
    def subarraySum(self, a, n):
        # code here 
        ans=0
        for i in range(n):
            te=(i+1)*(n-i)*a[i]
            ans+=te
        return ans%1000000007
#{ 
 # Driver Code Starts
#Initial Template for Python 3

def main():
    T = int(input())
    while(T > 0):
        n = int(input())
        a = [int(x) for x in input().strip().split()]
        ob = Solution()
        print(ob.subarraySum(a, n))
        T -= 1
        
if __name__ == "__main__":
    main()



# } Driver Code Ends