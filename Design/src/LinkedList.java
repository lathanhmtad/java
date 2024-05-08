
public class LinkedList<T> {
	Node<T> head;
	int size;
	
	public LinkedList(Node<T> head, int size) {
		super();
		this.head = head;
		this.size = size;
	}

	public LinkedList() {
		super();
	}
	
	public void add(T data) {
		Node<T> newNode = new Node<T>(data);
		if(this.head == null)
		{
			this.head = newNode;
		}
		else 
		{
			// 1 2 3 
			Node<T> p = this.head;
			while(p.next != null)
			{
				p = p.next;
			}
			p.next = newNode;
		}
		this.size++;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public void print()
	{
		Node<T> temp = this.head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}
