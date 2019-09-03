
import java.util.*;

public class BreathFirstSearch {
    private int start;
    private boolean[] checked;
    private Vector<Integer>[] array;

    BreathFirstSearch(int start, int capacity) {
        this.start = start;
        this.checked = new boolean[capacity];
        this.array = new Vector[capacity + 1];
        int i = 0;
        for (Vector<Integer> integers : array) {
            array[i] = new Vector<>();
            i++;
        }
    }

    private void search(){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        checked[start] = true;
        while(!queue.isEmpty()) {
            int x = queue.peek();
            queue.poll();
            System.out.printf("%d", x);
            for(int i = 0; i < array[x].size(); i++) {
                int y = array[x].get(i);
                if(!checked[y]) {
                    queue.add(y);
                    checked[y] = true;
                }
            }
        }
    }

    public void start() {
        array[1].add(2);
        array[2].add(1);

        array[1].add(3);
        array[3].add(1);

        array[2].add(3);
        array[3].add(2);

        array[2].add(4);
        array[4].add(2);

        array[2].add(5);
        array[5].add(2);

        array[3].add(6);
        array[6].add(3);

        array[3].add(7);
        array[7].add(3);

        array[4].add(5);
        array[5].add(4);

        array[6].add(7);
        array[7].add(6);

        search();
    }
}
