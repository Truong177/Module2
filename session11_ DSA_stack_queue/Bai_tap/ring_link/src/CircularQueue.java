public class CircularQueue {
    private Node front;
    private Node rear;

    public CircularQueue() {
        this.front = null;
        this.rear = null;
    }
    public void enqueue(int data) {
        Node temp = new Node(data);
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }
        this.rear.link = temp;
        this.rear = temp;
    }
}
