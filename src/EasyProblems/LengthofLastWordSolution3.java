class Solution{
    public int lengthOfLastWord(String s){
        int len = s.length();
        if(len==0){
            return 0;
        }

        int count =0;
        for(int i=len-1;i>=0;i--){
            if(s.charAt(i)!=' '){
            count++;
            }
            if(s.charAt(i)==' ' && count!=0){
                return count;
            }
        }
        return count;
    }
}