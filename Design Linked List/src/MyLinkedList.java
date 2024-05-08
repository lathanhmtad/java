class MyLinkedList {
	
	public class ListNode {
		int value;
		ListNode next;
		ListNode(int value) {
			this.value = value;		
		}
	}
	
	ListNode headNode = null;
	int size = 0;
	
    public MyLinkedList() {
        
    }
    
    public int get(int index) {
    	if(index < 0 || index >= size || headNode == null) return -1;
    	ListNode pNode = headNode;
    	int i = 0;
    	while(pNode != null) {
    		if(i == index) return pNode.value;
    		pNode = pNode.next;
    		i++;
    	}
        return -1;
    }
    
    public void addAtHead(int val) {
    	size++;
        ListNode newNode = new ListNode(val);
        if(headNode == null) {
        	headNode = newNode;
        	return;
        }
        newNode.next = headNode;
        headNode = newNode;
    }
    
    public void addAtTail(int val) {
    	size++;
        ListNode newNode = new ListNode(val);
        if(headNode == null) {
        	headNode = newNode;
        	return;
        }
        ListNode pNode = headNode;
        while(pNode.next != null) {
        	pNode = pNode.next;
        }
        pNode.next = newNode;
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size) return;
        if(index == 0) {
        	this.addAtHead(val);
        }
        else if(index == size) {
        	this.addAtTail(val);
        }
        else {
        	size++;
        	int i = 0;
        	ListNode pNode = headNode;
        	ListNode prevNode = null;
        	ListNode newNode = new ListNode(val);
        	while(pNode != null) {
        		if(i == index) {
        			prevNode.next = newNode;
        			newNode.next = pNode;
        			return;
        		}
        		prevNode = pNode;
        		pNode = pNode.next;
        		i++;
        	}
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) return;
        size--;
        ListNode pNode = headNode;
        ListNode prevNode = null;
        int i = 0;
        while(pNode != null) {
        	if(index == 0) {
        		headNode = headNode.next;
        		return;
        	}
        	
        	if(index == i) {
        		prevNode.next = pNode.next;
        		return;
        	}
        	prevNode = pNode;
        	pNode = pNode.next;
        	i++;
        	
        }
    }
    
    public void printLinkedList() {
    	ListNode pNode = headNode;
    	while(pNode != null) {
    		System.out.print(pNode.value);
    		pNode = pNode.next;
    		if(pNode != null) {
    			System.out.print("->");
    		}
    	}
    	System.out.println(" size = " + size);
    }
}