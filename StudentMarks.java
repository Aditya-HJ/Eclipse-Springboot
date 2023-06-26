package day17CollectionArrayList;
import java.util.*;

public class StudentMarks {
	public static void main(String[] args) {
		ArrayList<Integer> sm=new ArrayList<>();
		sm.add(85);
		sm.add(90);
		sm.add(95);
		sm.add(95);
		sm.add(75);
		sm.add(80);
		sm.add(90);
		sm.add(86);
		sm.add(65);
		sm.add(78);
		System.out.println(sm);
//		int max=sm.get(0);
//		for (int i=0 ; i<sm.size() ; i++) {
//			if(max<sm.get(i)) {
//				max=sm.get(i);	
//			}
//		}
//		System.out.println(max);
		int max=0;
		for(Integer y: sm) {
			if(max<y) {
				max=y;
			}
		}
		System.out.println(max);
	}
}
