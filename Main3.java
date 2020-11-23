package sk.kosickaakademia.kolesarova.queue;

public class Main3 {
    public static void main(String[] args) {
        Queue queue=new Queue(5);
        queue.enqueue(4);
        queue.enqueue(13);
        queue.enqueue(8);
        queue.enqueue(6);
        queue.enqueue(15);
        queue.print();
        queue.dequeue();
        queue.print();
        queue.dequeue();
        queue.print();
    }
}
