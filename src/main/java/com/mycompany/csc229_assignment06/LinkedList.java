package com.mycompany.csc229_assignment06;

/**
 *
 * @author johnf
 */
class Node {
    // creates node
    public int data;
    public Node next;
        
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
    
class LinkedList {
    private Node head;
    private Node tail;
    
    //creates linked list
    public LinkedList() {
        head = null;
        tail = null;
    }
    
    //prints linked list
    public void printList() {
      Node node = head;
      while (node != null) {
         System.out.print(node.data + " ");
         node = node.next;
      }
      System.out.println();
    }
    
    //appends to end of linked list
    public void append(Node newNode) {
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    
    // populates linked lists with prime nums
    public void getPrimes(LinkedList list, int n) {
        for(int i=2; i <= n; i++){
            boolean flag = false; 
            for(int j=2; j <= i/2; j++){ 
                  if(i%j==0){ 
                    flag=true;
                    break; 
                }
            }
      
            if (!flag){ 
               Node node = new Node(i);
               list.append(node);
            }
        }
    }
    
    // checks if num contains digit 3 
    public boolean hasThree(int data) {
        return String.valueOf(data).contains("3");
    }
    
    // populates linked list with digits that contain num 3
    public LinkedList getThrees(LinkedList list) {
        LinkedList tempList = new LinkedList();
        Node temp = list.head;
        
        while (temp != null) {
            if (hasThree(temp.data)) {
                Node newNode = new Node(temp.data);
                tempList.append(newNode);
            }
            temp = temp.next;
        }
        
        return tempList;
    }
    
    //calculates sum of all nodes in linked list
    public int getSum() {
        Node temp = this.head;
        int sum = 0;
        
        while (temp != null) {
            sum += temp.data;
            temp = temp.next;
        }
        
        return sum;
    }
}
