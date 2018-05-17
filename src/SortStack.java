import java.util.Scanner;
import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        Scanner scan = new Scanner(System.in);
        int val = scan.nextInt();
        s1.push(val);
        while (val != 0) {
            val = scan.nextInt();
            while (!s1.isEmpty() && s1.peek() > val) {
                s2.push(s1.pop());
            }
            s1.push(val);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }

            System.out.println("Stack is: ");
            s1.forEach(v -> {
                System.out.println(v);
            });
        }
    }
}
