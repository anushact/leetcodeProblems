//little lengthy

class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int length = s.length();
        if(length == 0){
            return 0;
        }
        int result=0;
        for(int i=length-1;i>=0;i--){
            if(s.contains(" ")== false){
                result = s.length();
                return result;
            }
            else if(s.charAt(i)==' '){
                String y = s.substring(i+1, length);
                System.out.println(y);
                result = y.length();
                return result;
            }
        }
        return result;

    }
}
