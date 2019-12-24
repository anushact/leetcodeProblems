class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (map.keySet().contains(current)) {
                st.push(current);
            } else if (map.values().contains(current)) {
                if (!st.empty() && map.get(st.peek()) == current) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.empty();
    }
}