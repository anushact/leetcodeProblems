//if n is not divisible by 2 , directly returns false
//if n is divisible by 2, it further refines by dividing by 2


class Solution{
    public boolean isPowerOfTwo(int n){
        if(n<=0){
            return false
        }

        while(n > 1){
            if(n%2!=0){
                return false;
            }
            n=n/2;
        }
        return true;
    }
}