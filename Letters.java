package day17CollectionArrayList;
import java.util.*;

public class Letters {
	public static void main(String[] args) {
		String[] a=args[0].split(",");
		ArrayList<Character> letters=new ArrayList<>();
		letters.add(a[0].charAt(0));
		letters.add(a[1].charAt(0));
		letters.add(a[2].charAt(0));
		letters.add(a[3].charAt(0));
		for(int i=0 ; i<letters.size() ;i++) {
			System.out.println(letters.get(i));
			
		}
	}
}
