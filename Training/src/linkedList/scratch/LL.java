package linkedList.scratch;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size=0;
    }

    public void insertfirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail ==null){
            tail = head;
        }
        size +=1;
    }
    public void diaplay(){
        Node temp = head;
        while (temp!= null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("END");
    }
    public void insertLast(int value){
        if(tail== null){
            insertfirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size +=1;
    }

    public void insert(int value, int index){
        if(index == 0){
            insertfirst(value);
            return;
        }
        if(index == size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next = node;
        size +=1;
    }

    public void delete(int index){
        if(index == 0){
            deleteFirst();
            return;
        }
        if(index == size-1){
            deleteLast();
            return;
        }
        Node prev = get(index-1);
        prev.next = prev.next.next;
        size-=1;
    }

    public void deleteFirst(){
        head = head.next;
        size -=1;
    }

    public void deleteLast(){
        if(size <1){
            deleteFirst();
            return;
        }
        Node secondLast = get(size-2);
        tail = secondLast;
        secondLast.next = null;
        size -=1;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void reverse(){
        Node prev = null;
        Node current = head;
        Node next = current.next;

        while (current!=null){
           current.next =prev;
           prev = current;
           current = next;
           if(next!=null){
               next = next.next;
           }
        }
        head = prev;

    }

private class Node{
    private int value;
    private Node next;
    public Node(int value){
        this.value = value;
    }
    public Node(int value, Node next){
        this.value =value;
        this.next = next;
    }
}
}
