import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class BalancedPraenthesis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        input = input.replaceAll("\\s+", "");

        if (input.length() % 2 != 0) {
            System.out.println("Unbalanced");
            return;
        } else {
            Map<Character, Character> map = new HashMap<>();
            map.put('(', ')');
            map.put('{', '}');
            map.put('[', ']');

            Stack<Character> stack = new Stack<>();
            char[] chAr = input.toCharArray();
            for (char ch : chAr) {
                if (map.containsKey(ch)) {
                    stack.push(ch);
                } else if (map.containsValue(ch) && !map.isEmpty() && map.get(stack.peek()) == ch) {
                    stack.pop();
                } else {
                    System.out.println("Unbalanced");
                    return;
                }
            }
            if (stack.isEmpty()) {
                System.out.println("Balanced!");
            }
        }
    }
}
