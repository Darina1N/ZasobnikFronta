package sk.kosickaakademia.kolesarova.stack;

public class Main2 {
    public static void main(String[] args) {
        Stack <Integer>stack= new Stack<>(5);
        stack.push(12);
        stack.push(5);
        stack.push(9);
        stack.push(3);
        stack.push(18);
        stack.print();
        stack.push(6);
        stack.top();
        stack.getSize();
        stack.pop();
        stack.print();
    }
}
