
class Solution {
    public String removeOuterParentheses(String s) {
    Stack<Character> st = new Stack<>();
    String ans = "";

    for (char ch : s.toCharArray()) {
    if (ch == '(') {
        if (!st.empty()) ans += ch;
        st.push(ch);
    } else {
        st.pop();
        if (!st.empty()) ans += ch;
    }
}
    return ans;
    }
}