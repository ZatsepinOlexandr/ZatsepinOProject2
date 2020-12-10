package ua.edu.npu.lab03.task04;


public class Application {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(85);

        arrayStack.push(5);
        arrayStack.push(74);
        arrayStack.isEmpty();
        arrayStack.pop();
        arrayStack.size();
        arrayStack.clear();
    }
}