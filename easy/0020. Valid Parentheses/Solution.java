import java.util.Stack;

class Solution {
    public static void main(String[] args) {
        String s = "()";
        String s1 = "(){[]()}[()]";
        String s2 = "([)]";

        System.out.println("Result: " + isValid(s));
        System.out.println("Result1: " + isValid(s1));
        System.out.println("Result2: " + isValid(s2));
    }

    public static boolean isValid(String s) { 
        Stack<Character> bracketsStack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{'){
                bracketsStack.push(c);
            }else{
                if(bracketsStack.isEmpty()){
                    return false;
                }

                char top = bracketsStack.pop();

                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return bracketsStack.isEmpty();
    }
}

