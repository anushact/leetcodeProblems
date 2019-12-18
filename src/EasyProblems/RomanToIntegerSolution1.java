//Time complexity:O(n)

class Solution {
    public int romanToInt(String s){
        int length = s.length();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = map.get(s.charAt(length-1));
        for(int i=length-2;i>=0;i--){
            int current = map.get(s.charAt(i));
            int next = map.get(s.charAt(i+1));
            if(current<next){
                result-=current;
            }
            else
            {
                result+=current;
            }
        }
        return result;
    }
}