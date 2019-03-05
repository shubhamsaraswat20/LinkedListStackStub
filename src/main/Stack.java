package main;

public class Stack {

  private static class Node {
    private int data;
    private Node next;

    public Node(int data, Node next) {
      this.data = data;
      this.next = next;
    }

    public int getData() {
      return data;
    }

    public void setData(int data) {
      this.data = data;
    }

    public Node getNext() {
      return next;
    }

    public void setNext(Node next) {
      this.next = next;
    }
  }

  private Node top = null;
  private int size = 0;

  // this method will push an item on to the top of the stack
  public void push(int data) {
    //  steps to push a data item on to the top
    //  create a copy of the top of the stack
    //
  }

  public static void main(String[] args) {
    Stack stack = new Stack();
    System.out.println(stack);
  }

}
