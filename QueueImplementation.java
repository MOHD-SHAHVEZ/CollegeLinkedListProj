package Queue_By_YT;

public class QueueImplementation {

    public static class Queue{
        static int arr[]; 
        static int size; 
        static int rear = -1; 
        public Queue(int n) {
            arr = new int[n]; 
            size = n; 
        }

        public boolean isEmpty() {
            return rear == -1; 
        }

        //Enqueue: 
        public void add(int data) {
            if(rear == size-1) {
                System.out.println("Queue is Full! ");
            }
            rear++; // phela Rear++ kiya Q Ki rear -1 pe tha or ++ ka baad 0 pe aajaiga first time!
            arr[rear] = data; 
        }

        // deQueue: 
        public int remove() {
            if(isEmpty()) {
                System.out.println("Queue is Empty!");
                return -1; 
            }
            int front = arr[0]; 
            for(int i = 0; i < size -1; i++) { // shift all element on one next index of Queue: 
                arr[i] = arr[i + 1]; 
            }
            rear--; 
            return front; 
        }

        
        //peek()
        public int peek() {
            if(isEmpty()) {
                System.out.println("Queue is Empty! ");
                return -1; 
            }
            return arr[0]; 
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while(!q.isEmpty()) {
            System.out.print("-> " + q.peek());
            q.remove(); 
        }
    }
}
