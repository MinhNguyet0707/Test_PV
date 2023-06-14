package testPv;

public class MergLinkedList3 {
	public static LinkedList mergeLists(LinkedList[] lists) {
	    int n = lists.length;
	    while (n > 1) {
	        int k = (n + 1) / 2;
	        for (int i = 0; i < n / 2; i++) {
	            lists[i] = mergeTwoLists(lists[i], lists[i+k]);
	        }
	        n = k;
	    }
	    return lists[0];
	}

	private static LinkedList mergeTwoLists(LinkedList linkedList1, LinkedList linkedList2) {
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
		LinkedList[] lists = new LinkedList[32];
		for (int i = 0; i < 32; i++) {
		    lists[i] = new LinkedList();
		}

		lists[0].append(1);
		lists[0].append(3);
		lists[0].append(5);
		System.out.println("Danh sách mảng ở vị trí thứ 0");
		lists[0].printList();


		lists[31].append(2);
		lists[31].append(4);
		lists[31].append(6);
		System.out.println("Danh sách mảng thứ 31");
		lists[31].printList();

		LinkedList mergedList = mergeLists(lists);
		System.out.println("mảng sau khi sắp xếp");
		mergedList.printList();


	}
}
