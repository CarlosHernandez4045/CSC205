package CustomDeque.DataStructureJavaQueue.src;

import java.util.Arrays;
import java.util.stream.Collectors;

import CustomDeque.DataStructureJavaQueue.JavaCoreQueue.src.BasicQueue;

public class CustomDeque<X> {
    private X[] data;
    private int tail;
    private int front;

    //A Deque supports removal/addition to either end of the data. We'll use the terms tail and front for these ends to differentiate our methods.

    public CustomDeque(int size) { 
        this.tail = -1;
        this.front = -1;
        data = (X[])new Object[size];
    }

    public int size() { 
        return tail == -1 && front == -1 ? 0 : front - tail + 1;
    }

    public void addToFront(X item) { 
        if ((front + 1) % data.length == tail) { 
            throw new IllegalStateException("Queue is full!");
        } else if (size() == 0) {
            tail++;
            front++;
            data[front] = item;
        } else {
            front++;
            data[front] = item;
        }
    }

    public void addToTail(X item) { 
        if ((front + 1) % data.length == tail) { 
            throw new IllegalStateException("Queue is full!");
        } else if (size() == 0) {
            tail++;
            front++;
            data[tail] = item;
        } else {
            tail++;
            data[tail] = item;
        }
    }

    
    public X removeFromTail() { 
        X item = null;

        if(size() == 0) { 
            throw new IllegalStateException("Can't remove anything because the Deque is empty!");
        } else if (tail == front) {  //last item in the Deque
            item = data[tail];
            data[tail] = null;
            tail = -1;
            front = -1;
        }
        else { 
            item = data[tail];
            data[tail] = null;
            tail++;
        }

        return item;
    }

    public X removeFromFront() { 
        X item = null;

        if(size() == 0) { 
            throw new IllegalStateException("Can't remove anything because the Deque is empty!");
        } else if (tail == front) {  //last item in the Deque
            item = data[tail];
            data[tail] = null;
            tail = -1;
            front = -1;
        }
        else { 
            item = data[front];
            data[front] = null;
            tail++;
        }

        return item;
    }

    @Override
    public String toString() {
        String s = Arrays.asList(data).stream().map(Object::toString).collect(Collectors.joining(", "));

        return s;
    }
}
