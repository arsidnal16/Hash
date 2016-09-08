package List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ReverseAList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		int i = 0;
		while(i < 10){
			list.add(i++);
		}
		System.out.println(list);
		
		reverseList(list);
		
		System.out.println(list);
	}

	private static void reverseList(List<Integer> list) {
		ListIterator<Integer> fwd = list.listIterator();
		ListIterator<Integer> reverse = list.listIterator(list.size());
		
		for(int i =0 ; i< list.size()/2;i++){
			int temp = (int) fwd.next();
			 fwd.set(reverse.previous());
			 reverse.set(temp);
		}
		
	}

}
