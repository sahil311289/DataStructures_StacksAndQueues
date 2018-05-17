import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class ExtendedBalancedParenthesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if (input.replaceAll("\\s+", "").length() % 2 != 0) {
            System.out.println(false);
            return;
        }
        System.out.println(checkBalancedParenthesis(input));
    }

    public static final boolean checkBalancedParenthesis(String input) {
        Map<Character, Character> defaults = new HashMap<>();
        defaults.put('(', ')');
        defaults.put('{', '}');
        defaults.put('[', ']');

        Stack<Character> characterStack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (defaults.containsKey(ch)) {
                characterStack.push(ch);
            } else if (defaults.containsValue(ch) && !characterStack.isEmpty() && defaults.get(characterStack.peek()) == ch) {
                characterStack.pop();
            } else {
                return false;
            }
        }

        return characterStack.isEmpty();
    }
}
