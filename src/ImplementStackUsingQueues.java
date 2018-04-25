import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        push(q1, q2, 1);
        push(q1, q2, 2);
        pop(q1);
        push(q1, q2, 3);
        push(q1, q2, 4);
        push(q1, q2, 5);
        push(q1, q2, 6);
        pop(q1);
        pop(q1);
        push(q1, q2, 7);

    }

    public static void push(Queue<Integer> q1, Queue<Integer> q2, int value) {
        q2.add(value);
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        while (!q2.isEmpty()) {
            q1.add(q2.remove());
        }

        System.out.println();
        q1.forEach(val -> {
            System.out.print(val + " ->");
        });
    }

    public static void pop(Queue<Integer> q1) {
        q1.remove();
        System.out.println();
        q1.forEach(value -> {
            System.out.print(value + " ->");
        });
    }
}
