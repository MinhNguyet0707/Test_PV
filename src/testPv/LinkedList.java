package testPv;

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void append(int data) {
        Node new_node = new Node(data);
        if (this.head == null) {
            this.head = new_node;
            return;
        }
        Node current_node = this.head;
        while (current_node.next != null) {
            current_node = current_node.next;
        }
        current_node.next = new_node;
    }

    public void printList() {
        Node current_node = this.head;
        while (current_node != null) {
            System.out.println(current_node.data);
            current_node = current_node.next;
        }
    }
    
    public void deleteNodeByValue(int value) {
        Node current_node = this.head;
        Node previous_node = null;

        while (current_node != null && current_node.data == value) {
            this.head = current_node.next;
            current_node = this.head;
        }

        while (current_node != null) {
            if (current_node.data == value) {
                previous_node.next = current_node.next;
                current_node = previous_node.next;
            } else {
                previous_node = current_node;
                current_node = current_node.next;
            }
        }
    }
    public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.append(1);
		linkedList.append(3);
		linkedList.append(2);
		linkedList.append(5);
		linkedList.append(4);
		System.out.println("Danh sách ban đầu");
		linkedList.printList();
	

		linkedList.deleteNodeByValue(3);
		System.out.println("Danh sách sau khi xóa");
		linkedList.printList();
    }
    
}