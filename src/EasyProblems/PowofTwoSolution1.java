//Any number which is a power of 2 will have only 0's in bit representation
//So -1 that number will get atleast one 1 in bit representation
//Both the number n, n-1 should be equal to 0 for the number to be power of 2


class Solution{
    public boolean isPowerOfTwo(int n){
        return n>0 &&(n&n-1)==0;
    }
}