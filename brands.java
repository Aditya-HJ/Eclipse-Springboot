package day17CollectionArrayList;
import java.util.*;

public class brands {
	public static void main(String[] args) {
		ArrayList<String> brand=new ArrayList<>();
		brand.add("Hyundai");
		brand.add("Audi");
		brand.add("Honda");
		brand.add("kia");
		brand.add("mg");
		brand.add("Ford");
		brand.add("toyota");
		
		int max1=brand.get(0).length();
		String max=" ";
		for(String str:brand) {
			if(max1<=str.length()) {
				max=str;
			}
	}
		System.out.println(max);
	}
}
