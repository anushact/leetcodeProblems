class Solution{
    public int getValue(char c){
        switch(c){
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
        }
        throw new IllegalArgumentException("unsupported character");
    }

    public int romanToInt(String s){
        int res =0;
        int len = s.length();
        for(int i=0;i<len-1;i++){
            int current = getValue(s.charAt(i));
            int next = getValue(s.charAt(i+1));
            if(current<next){
                res-=current;
            }
            else{
                res+=current;
            }
        }
        return res+getValue(s.charAt(len-1));
    }
}