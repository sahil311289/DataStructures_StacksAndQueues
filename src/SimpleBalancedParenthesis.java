import java.util.*;

public class SimpleBalancedParenthesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        if (input.length() % 2 != 0) {
            System.out.println(false);
            return;
        }
        System.out.println(isBalanced(input));
    }

    public static final boolean isBalanced(String input) {
        Stack<Character> characterStack = new Stack<>();

        char[] charAr = input.toCharArray();

        for (char ch : charAr) {
            characterStack.add(ch);
        }

        Map<Character, Character> brackets = new HashMap<>();
        brackets.put('{', '}');
        brackets.put('}', '{');
        brackets.put('(', ')');
        brackets.put(')', '(');
        brackets.put('[', ']');
        brackets.put(']', '[');

        for (char ch : charAr) {
            if (brackets.get(ch) == characterStack.pop()) {

            } else {
                return false;
            }
        }

        return true;
    }
}
