import java.util.Stack;

/**
 * Created by yangming on 17/9/16.
 */
public class ValidParentheses {
    /**
     * 20. Valid Parentheses
     * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
     * 思路：使用栈，当遇到一个符合条件的则push其反括号，否则pop栈中char，如果和当前char不相等，则返回false,push一次之后如果栈为空，则不满足条件，如果循环遍历整个字符串之后栈不为空，则返回false
     *
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        boolean result = false;
        if (s.length() == 0 || s.length() % 2 != 0) {
            return result;
        }
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(')');
            } else if (s.charAt(i) == '[') {
                stack.push(']');
            } else if (s.charAt(i) == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || stack.pop() != s.charAt(i)) {
                return result;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid(""));
        System.out.println(validParentheses.isValid("((({(([[[]]]]})))}{}23"));
        System.out.println(validParentheses.isValid("["));
        System.out.println(validParentheses.isValid("(("));
    }
}
