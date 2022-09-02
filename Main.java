import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        //double ended queue (deque)
        //huge 1D arrays O(1)

        //FIFO
       /*
         Deque<Integer> queue = new ArrayDeque<>();

        queue.offer(1);
        queue.offer(10);
        queue.offer(100);
        queue.offer(1000);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        */

        Deque<Integer> stack = new ArrayDeque<>();

        //LIFO
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
}