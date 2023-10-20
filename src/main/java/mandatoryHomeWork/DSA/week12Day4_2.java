package mandatoryHomeWork.DSA;

import java.util.Queue;
import java.util.LinkedList;


public class week12Day4_2 {
	
Queue<Integer> queue;
public week12Day4_2(){
	queue = new LinkedList<>();
}
public void push(int x) {
    queue.add(x);
    for(int i=1;i<queue.size();i++){
        queue.add(queue.poll());
    }
}

public int pop() {
    return queue.poll();
}

public int top() {
    return queue.peek();
}

public boolean empty() {
    return queue.isEmpty();
}

}
