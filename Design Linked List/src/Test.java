
public class Test {
	public static void main(String[] args) {
		MyLinkedList myLinkedList = new MyLinkedList();
		
		myLinkedList.addAtHead(1);
		myLinkedList.addAtTail(3);
		myLinkedList.addAtIndex(1, 2);
		
		
		myLinkedList.deleteAtIndex(1);
		myLinkedList.printLinkedList();
		
		System.out.println(myLinkedList.get(1));
	}
}
