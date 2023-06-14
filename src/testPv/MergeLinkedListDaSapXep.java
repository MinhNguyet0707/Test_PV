package testPv;

public class MergeLinkedListDaSapXep {
	
	public static LinkedList mergeLists(LinkedList linkedList1, LinkedList linkedList2) {
	    LinkedList mergedList = new LinkedList();
	    Node current1 = linkedList1.head;
	    Node current2 = linkedList2.head;

	    while (current1 != null && current2 != null) {
	        if (current1.data < current2.data) {
	            mergedList.append(current1.data);
	            current1 = current1.next;
	        } else {
	            mergedList.append(current2.data);
	            current2 = current2.next;
	        }
	    }

	    while (current1 != null) {
	        mergedList.append(current1.data);
	        current1 = current1.next;
	    }

	    while (current2 != null) {
	        mergedList.append(current2.data);
	        current2 = current2.next;
	    }

	    return mergedList;
	}
	public static void main(String[] args) {
				LinkedList linkedList1 = new LinkedList();
				linkedList1.append(1);
				linkedList1.append(3);
				linkedList1.append(5);
				linkedList1.append(7);
				System.out.println("Danh sách mảng thứ 1");
				linkedList1.printList();

				LinkedList linkedList2 = new LinkedList();
				linkedList2.append(2);
				linkedList2.append(4);
				linkedList2.append(6);
				linkedList2.append(8);
				System.out.println("Danh sách mảng thứ 2");
				linkedList2.printList();

				LinkedList mergedList = mergeLists(linkedList1, linkedList2);
				System.out.println("mảng sau khi sắp xếp");
				mergedList.printList();
				
	}

}
