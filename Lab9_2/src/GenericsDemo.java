import java.util.ArrayList;
import java.util.Date;

public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> mylist = new ArrayList<String>();
		
		mylist.add("a");
		mylist.add("b");
		
		String str = (String)mylist.get(0);
		String str2 = (String)mylist.get(1);
		System.out.println(str+ ", " + str2);
		
		Comparable a = new String();
		Date mydate = new Date();
		a.compareTo(mydate); //�̷��� �ϸ� ������ ������ ������, ��Ÿ�ӿ����߻�. �񱳴���� �ƴѰ� ���ޱ� ����.
		
		GenericStack myStack = new GenericStack();
		
		myStack.push("frist");
		myStack.push("second");
		myStack.push("third");
		
		String get = (String)myStack.pop();
		System.out.println(get);
		
		String get2 = (String)myStack.pop();
		System.out.println(get2);
		
		
	}

}


class GenericStack<E> {
	ArrayList<E> list = new ArrayList();
	
	int getSize() {
		return list.size();
	}
	
	E pop() {
		E o = list.get(getSize() - 1);
		list.remove(getSize()-1);
		return o;
	}
	
	void push(E o) {
		list.add(o);
	}
	
	
}
