package main;

public class Stack {

  private static class Node {
    private int data;
    private Node next;

    public Node(int data, Node next) {
      this.data = data;
      this.next = next;
    }
  }

}
