public class Main {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.addLast(11);
    list.addLast(22);
    list.addLast(6);
    list.addLast(89);
    list.addLast(99);

    System.out.println("Original list: " + list);

    // Insert 50 at position 2 (third element)
    list.addAtIndex(2, 50);
    System.out.println("After inserting 50 at position 2: " + list);

    // Delete the 2nd element
    list.removeAtIndex(1);
    System.out.println("After deleting element at position 1: " + list);

    // Delete the 1st element
    list.removeFirst();
    System.out.println("After deleting first element: " + list);

    // Delete the last element
    list.removeLast();
    System.out.println("After deleting last element: " + list);
  }
}

class LinkedNode {
  int data;
  LinkedNode next;
  LinkedNode prev; // For doubly linked list

  public LinkedNode(int data) {
    this.data = data;
    this.next = null;
    this.prev = null;
  }
}

class LinkedList {
  private LinkedNode head;
  private LinkedNode tail;
  private int size;

  public LinkedList() {
    this.head = null;
    this.tail = null;
    this.size = 0;
  }

  public void addFirst(int data) {
    LinkedNode newNode = new LinkedNode(data);
    if (head == null) {
      head = newNode;
      tail = newNode;
    } else {
      newNode.next = head;
      head.prev = newNode;
      head = newNode;
    }
    size++;
  }

  public void addLast(int data) {
    LinkedNode newNode = new LinkedNode(data);
    if (tail == null) {
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      newNode.prev = tail;
      tail = newNode;
    }
    size++;
  }

  public boolean addAtIndex(int index, int data) {
    if (index < 0 || index > size) {
      return false;
    }

    if (index == 0) {
      addFirst(data);
      return true;
    }

    if (index == size) {
      addLast(data);
      return true;
    }

    LinkedNode current = getNodeAtIndex(index);
    LinkedNode newNode = new LinkedNode(data);

    newNode.prev = current.prev;
    newNode.next = current;
    current.prev.next = newNode;
    current.prev = newNode;

    size++;
    return true;
  }

  public Integer removeFirst() {
    if (head == null) {
      return null;
    }

    int removedData = head.data;

    if (head == tail) {
      head = null;
      tail = null;
    } else {
      head = head.next;
      head.prev = null;
    }
    size--;
    return removedData;
  }

  public Integer removeLast() {
    if (tail == null) {
      return null;
    }

    int removedData = tail.data;

    if (head == tail) {
      head = null;
      tail = null;
    } else {
      tail = tail.prev;
      tail.next = null;
    }
    size--;
    return removedData;
  }

  public Integer removeAtIndex(int index) {
    if (index < 0 || index >= size) {
      return null;
    }

    if (index == 0) {
      return removeFirst();
    }

    if (index == size - 1) {
      return removeLast();
    }

    LinkedNode nodeToRemove = getNodeAtIndex(index);
    int removedData = nodeToRemove.data;

    nodeToRemove.prev.next = nodeToRemove.next;
    nodeToRemove.next.prev = nodeToRemove.prev;

    nodeToRemove.prev = null;
    nodeToRemove.next = null;

    size--;
    return removedData;
  }

  private LinkedNode getNodeAtIndex(int index) {
    if (index < 0 || index >= size) {
      return null;
    }

    LinkedNode current;

    if (index < size / 2) {
      current = head;
      for (int i = 0; i < index; i++) {
        current = current.next;
      }
    } else {
      current = tail;
      for (int i = size - 1; i > index; i--) {
        current = current.prev;
      }
    }

    return current;
  }

  public String toString() {
    if (head == null) {
      return "[]";
    }

    StringBuilder sb = new StringBuilder("[");
    LinkedNode current = head;
    while (current != null) {
      sb.append(current.data);
      if (current.next != null) {
        sb.append(", ");
      }
      current = current.next;
    }
    sb.append("]");
    return sb.toString();
  }
}
