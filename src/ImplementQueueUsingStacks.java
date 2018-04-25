import java.util.Stack;

public class ImplementQueueUsingStacks {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        add(stack1, 1);
        add(stack1, 2);
        remove(stack1, stack2);
        add(stack1, 3);
        add(stack1, 4);
        add(stack1, 5);
        add(stack1, 6);
        remove(stack1, stack2);
        remove(stack1, stack2);
        add(stack1, 7);
    }

    public static void add(Stack<Integer> s1, int val) {
        s1.add(val);
        System.out.println();
        s1.forEach(v -> {
            System.out.print(v + " <- ");
        });
    }

    public static void remove(Stack<Integer> s1, Stack<Integer> s2) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s2.pop();
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        System.out.println();
        s1.forEach(v -> {
            System.out.print(v + " <- ");
        });
    }
}
