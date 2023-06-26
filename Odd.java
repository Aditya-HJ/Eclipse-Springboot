package day17CollectionArrayList;
import java.util.*;

public class Odd {
	public static void main(String[] args) {
		ArrayList<Integer> o=new ArrayList<>();
		o.add(80);
		o.add(50);
		o.add(70);
		o.add(65);
		o.add(63);
		o.add(72);
		o.add(19);
		o.add(90);
		System.out.println(o);
		//o.forEach(a->System.out.println(a));
		for(int i=0 ; i<o.size() ; i++) {
			if(o.get(i)%2!=0) {
				System.out.println(o.get(i));
			}
		}
	}
}
