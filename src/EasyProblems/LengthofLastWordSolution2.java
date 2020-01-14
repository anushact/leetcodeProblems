//using string TRIM method to remove starting and trailing zero'es


class Solution {
    public int lengthOfLastWord(String s){
        s = s.trim();
        int length = s.length();
        if(length ==0){
            return 0;
        }
        int count =0;
        for(int i=length-1;i>=0;i--){
            if(s.charAt(i)==''){
                break;
            }
            else{
                count++;
            }
        }
        return count;
    }
}