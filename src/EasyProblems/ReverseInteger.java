//Get ones place: x%10
//Cut off ones place: x/10

//Time complexity: O(n);
//Space complexity: O(1)

class Solution {
    public int reverse(int x){
        int ans =0;
        while(x!=0) {
            int r = x % 10;
            if (ans > Integer.MAX_VALUE / 10 || ans < Integer.MIN_VALUE / 10)
                return 0;
            ans = ans*10+r;
            x=x/10;
        }
        return ans;

        }
    }
}


