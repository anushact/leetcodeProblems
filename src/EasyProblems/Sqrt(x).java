//binary search implementation
//if mid is in points eg. 1.5
// consider the upper limit i.e. 2
//Time complexity: O(log n)
class Solution{
    public int mySqrt(int x){
        long start=1, end=x, ans=0;
        if(x==0 || x==1){
            return x;
        }
        while(start<=end){
            long mid = start +(end-start)/2;
            if(mid*mid==x){
                return (int) mid;
            }
            else if(mid*mid<x){
                start = mid+1;
                ans = mid;
            }
            else
                end =mid-1;

        }
        return int (ans);
    }
}