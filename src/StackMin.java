import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

// Implement a stack in which push, pop are implemented and also, minimum element is available at O(1)
public class StackMin {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        Stack<Integer> min = new Stack<>();

        // push operation
        String input = scan.nextLine();
        String[] ar = input.split(" ");

        for (String str : ar) {
            int value = Integer.parseInt(str.replaceAll("\\s+", ""));
            list.add(value);
            if (min.isEmpty()) {
                min.push(value);
            } else {
                if (value < min.peek()) {
                    min.push(value);
                }
            }
        }

        System.out.println("Stack is: ");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
        System.out.println("Minimum value is: " + min.peek());

        // pop operation
        while (list.size() > 0) {
            int element = list.remove(list.size() - 1);
            System.out.println(element + "  is removed.");
            if (min.peek() == element) {
                System.out.println(min.pop() + "  is removed.");
            }
        }
    }
}
