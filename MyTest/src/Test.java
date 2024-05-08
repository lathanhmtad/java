import java.util.ArrayList;
import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		MyLinkedList mll = new MyLinkedList();
		
		mll.test();
		mll.thu();
		
		
		
		MyLink ml = new MyLinkedList();
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		
//		Iterator<Integer> it = list.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		
//		for (Integer print : list) {
//			System.out.println(print);
//		}
//		
		for(int i= 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
	
	}
}
