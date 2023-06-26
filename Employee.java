package day17CollectionArrayList;
import java.util.ArrayList;

public class Employee {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		a.add(70);
		a.add(80);
		a.add(90);
		a.add(100);
		a.add(110);
		a.add(120);
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.set(8,85));
		System.out.println(a.get(7));
		System.out.println(a.remove(5));
		System.out.println(a);
	}

}
